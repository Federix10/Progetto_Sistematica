package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import br.ufrn.imd.obd.commands.engine.RPMCommand;
import br.ufrn.imd.obd.commands.engine.SpeedCommand;
import br.ufrn.imd.obd.commands.fuel.FuelLevelCommand;
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
    int delay,progress;
    RPMCommand rpmCommand;
    SpeedCommand speedCommand;
    FuelLevelCommand fuelLevelCommand;
    TextView textViewRpm;
    CircularProgressBar circularProgressBar;
    SpeedView speedometer;
    int progressMAX, speedMAX;
    EditText editText;
    int tickNumber=0, limit1=2000, limit2=3000, limit3=4000;

    Method speed, rpm;
    String sSpeed="", sRpm="";
    ListaComandi listaComandi;

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
        listaComandi = new ListaComandi(socket);
        try {
            speed = ListaComandi.class.getMethod("speed");
            rpm = ListaComandi.class.getMethod("rpm");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
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
            ciclo=false;
            Speed.this.finish();
            Intent startNewActivity = new Intent (this, OBDActivity.class);
            startActivity(startNewActivity);
        }
        return super.onKeyDown(keyCode, event);
    }

    public class DataOBD extends Thread {

        public void inizializzaOBD ()
        {
            editText=findViewById(R.id.editTextDelayActivitySpeed);
            progressMAX=7000;
            speedMAX=200;
            speedometer = findViewById(R.id.speedView);
            speedometer.setMaxSpeed(speedMAX);
            speedometer.setTicks(0,20,40,60,80,100,120,140,160,180,200);
            speedometer.setWithTremble(false);

            circularProgressBar = findViewById(R.id.progressBar2);
            circularProgressBar.setProgressMax(progressMAX);
            delay=100;
            progress=200;
            setspeed = findViewById(R.id.btnSpeed);
            settimeout = findViewById(R.id.btnDTC);
            comandi = new Speed.Comandi();
            rpmCommand = new RPMCommand(); //giri motore
            fuelLevelCommand = new FuelLevelCommand(); //livello carburante
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
            speedometer.setHighSpeedColor(Color.GREEN);
            speedometer.setMediumSpeedColor(Color.GREEN);
            while (true) {
                try {
                    if (ciclo == false)
                    {
                        break;
                    }
                    comandi.rpm();
                    comandi.speed();
                    /*try {
                        sSpeed = (String) speed.invoke(listaComandi);
                        sRpm = (String) rpm.invoke(listaComandi);
                        GlobalApplication.setSpeed(Integer.parseInt(sSpeed));
                        GlobalApplication.setRPM(Integer.parseInt(sRpm));
                        textViewRpm.setText(sRpm);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }*/
                    Speed.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (GlobalApplication.getRPM()>progressMAX)
                            {
                                progressMAX=GlobalApplication.getRPM()+1000;
                                circularProgressBar.setProgressMax(progressMAX);
                            }
                            circularProgressBar.setProgressWithAnimation(GlobalApplication.getRPM(), progress);
                            if (GlobalApplication.getRPM()<limit1)
                                circularProgressBar.setColor(Color.BLUE);
                            else if (GlobalApplication.getRPM()>limit1 && GlobalApplication.getRPM()<limit2)
                                circularProgressBar.setColor(Color.rgb(135,206,250));
                            else if (GlobalApplication.getRPM()>=limit2 && GlobalApplication.getRPM()<limit3)
                                circularProgressBar.setColor(Color.rgb(255,165,0));
                            else if (GlobalApplication.getRPM()>=limit3)
                                circularProgressBar.setColor(Color.RED);

                            if (GlobalApplication.getSpeed()>speedMAX)
                            {
                                speedMAX+=20;
                                speedometer.setMaxSpeed(speedMAX);
                                if (tickNumber==0)
                                    speedometer.setTicks(0,20,40,60,80,100,120,140,160,180,200,220);
                                if (tickNumber==1)
                                    speedometer.setTicks(0,20,40,60,80,100,120,140,160,180,200,220,240);
                                if (tickNumber==2)
                                    speedometer.setTicks(0,20,40,60,80,100,120,140,160,180,200,220,240,260);
                                if (tickNumber==3)
                                    speedometer.setTicks(0,20,40,60,80,100,120,140,160,180,200,220,240,260,280);
                                if (tickNumber==4)
                                    speedometer.setTicks(0,20,40,60,80,100,120,140,160,180,200,220,240,260,280,300);
                                tickNumber++;
                            }
                            speedometer.speedTo(GlobalApplication.getSpeed(),500);
                        }
                    });
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setOBD(View view)
    {
        ciclo=false;
        Speed.this.finish();
        Intent startNewActivity = new Intent (this, OBDActivity.class);
        startActivity(startNewActivity);
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
