package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.anastr.speedviewlib.SpeedView;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import br.ufrn.imd.obd.commands.engine.RPMCommand;
import br.ufrn.imd.obd.commands.engine.SpeedCommand;
import br.ufrn.imd.obd.commands.protocol.EchoOffCommand;
import br.ufrn.imd.obd.commands.protocol.LineFeedOffCommand;
import br.ufrn.imd.obd.commands.protocol.SelectProtocolCommand;
import br.ufrn.imd.obd.commands.protocol.TimeoutCommand;
import br.ufrn.imd.obd.enums.ObdProtocols;

public class Speed extends AppCompatActivity {

    private static BluetoothSocket socket = GlobalApplication.getSocket();
    Button setspeed, settimeout;
    Boolean ciclo;
    Speed.DataOBD dataOBD;
    Speed.Comandi comandi;
    int delay,i=0,progress;
    RPMCommand rpmCommand;
    SpeedCommand speedCommand;
    TextView textViewRpm;
    private Handler handler;
    CircularProgressBar circularProgressBar;
    SpeedView speedometer;
    int progressMAX, speedMAX;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        ciclo = true;
        if (Read() == "")
        {
            Write();
            dataOBD = new Speed.DataOBD();
            dataOBD.inizializzaOBD();
            dataOBD.start();
        }
        else if (Read() != "")
        {
            dataOBD = new Speed.DataOBD();
            dataOBD.inizializzaOBD();
            dataOBD.start();
        }

    }

    public void Write()
    {
        String data = GlobalApplication.getDevice().getAddress();
        try {
            FileOutputStream fOut = openFileOutput("address.txt", MODE_PRIVATE);
            fOut.write(data.getBytes());
            fOut.close();
            Toast.makeText(getBaseContext(),"file saved",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String Read()
    {
        String temp="";
        try {
            FileInputStream fin = openFileInput("address.txt");
            int c;
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
            Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
        }
        return temp;
    }

    public void setTimeoutSpeed (View view)
    {
        Editable editable=editText.getText();
        String str_delay = editable.toString();
        delay=Integer.valueOf(str_delay);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            System.exit(1);
        }
        return super.onKeyDown(keyCode, event);
    }

    public class DataOBD extends Thread {

        public void inizializzaOBD ()
        {
            editText=findViewById(R.id.editTextDelayActivitySpeed);
            handler = new Handler();
            progressMAX=7000;
            speedMAX=200;
            speedometer = findViewById(R.id.speedView);
            speedometer.setMaxSpeed(speedMAX);
            circularProgressBar = findViewById(R.id.progressBar2);
            circularProgressBar.setProgressMax(progressMAX);
            delay=100;
            progress=500;
            setspeed = findViewById(R.id.btnSpeed);
            settimeout = findViewById(R.id.btnDTC);
            comandi = new Speed.Comandi();
            rpmCommand = new RPMCommand(); //giri motore
            textViewRpm = findViewById(R.id.rpm3);
            speedCommand = new SpeedCommand();//velocità
            try {
                new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new LineFeedOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new TimeoutCommand(125).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
            } catch (Exception e) {
                // handle errors
            }
        }
        public void run() {
            while (true) {
                try {
                    if (ciclo == false)
                    {
                        break;
                    }
                    comandi.rpm();
                    comandi.speed();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (GlobalApplication.getRPM()>progressMAX)
                            {
                                progressMAX=GlobalApplication.getRPM()+1000;
                                circularProgressBar.setProgressMax(progressMAX);
                            }
                            circularProgressBar.setProgressWithAnimation(GlobalApplication.getRPM(), progress);
                            if (GlobalApplication.getRPM()<2000)
                                circularProgressBar.setColor(Color.BLUE);
                            else if (GlobalApplication.getRPM()>2000 && GlobalApplication.getRPM()<3000)
                                circularProgressBar.setColor(Color.rgb(135,206,250));
                            else if (GlobalApplication.getRPM()>3000 && GlobalApplication.getRPM()<5000)
                                circularProgressBar.setColor(Color.rgb(255,165,0));
                            else if (GlobalApplication.getRPM()>5000)
                                circularProgressBar.setColor(Color.RED);
                            if (GlobalApplication.getSpeed()>speedMAX)
                            {
                                speedMAX=GlobalApplication.getSpeed()+20;
                                speedometer.setMaxSpeed(speedMAX);
                            }
                            if (GlobalApplication.getSpeed()==0)
                                speedometer.setWithTremble(true);
                            else
                                speedometer.setWithTremble(false);
                            speedometer.speedTo(GlobalApplication.getSpeed(),500);
                        }
                    });
                    i++;
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void WriteOBD(int obd)
    {
        String data = String.valueOf(obd);
        try {
            FileOutputStream fOut = openFileOutput("obd.txt", MODE_PRIVATE);
            fOut.write(data.getBytes());
            fOut.close();
            Toast.makeText(getBaseContext(),"file saved",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setOBD(View view)
    {
        GlobalApplication.setOBD(0);
        WriteOBD(0);
    }

    private class Comandi
    {

        public void rpm() {
            try {
                rpmCommand.run(socket.getInputStream(), socket.getOutputStream()); //rpm
                GlobalApplication.setRPM(Integer.parseInt(rpmCommand.getCalculatedResult()));
                textViewRpm.setText(rpmCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (textViewRpm.getText()=="") {
                    textViewRpm.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void speed() {
            try {
                speedCommand.run(socket.getInputStream(), socket.getOutputStream()); //velocità
                GlobalApplication.setSpeed(Integer.parseInt(speedCommand.getCalculatedResult()));
                //textViewSpeed.setText(speedCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            /*finally {
                if (textViewSpeed.getText()=="") {
                    //textViewSpeed.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }*/
        }
    }
}
