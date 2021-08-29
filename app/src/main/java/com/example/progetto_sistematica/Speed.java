package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.anastr.speedviewlib.SpeedView;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
    private Boolean ciclo;
    private Speed.DataOBD dataOBD;
    private Speed.Comandi comandi;
    private RPMCommand rpmCommand;
    private SpeedCommand speedCommand;
    private TextView textViewRpm;
    private CircularProgressBar circularProgressBar;
    private SpeedView speedometer;
    private int delay,progress, progressMAX, speedMAX, tickNumber=0, limit1=2000, limit2=3000, limit3=4000,hour=0, rpm=0, speed=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hour = GlobalApplication.getHour();
        if ((hour>20 || hour<7) && GlobalApplication.getBooleanPreferences("nightMode")==true)
        {
            setTheme(R.style.DarkTheme);
        }
        else
        {
            setTheme(R.style.LightTheme);
        }
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
            progressMAX=7000;
            speedMAX=200;
            speedometer = findViewById(R.id.speedView);
            speedometer.setMaxSpeed(speedMAX);
            speedometer.setTicks(0,20,40,60,80,100,120,140,160,180,200);
            speedometer.setWithTremble(false);
            if ((hour>20 || hour<7) && GlobalApplication.getBooleanPreferences("nightMode")==true)
            {
                speedometer.setTextColor(Color.WHITE);
                speedometer.setSpeedTextColor(Color.WHITE);
                speedometer.setUnitTextColor(Color.WHITE);
            }
            else
            {
                speedometer.setTextColor(Color.BLACK);
                speedometer.setSpeedTextColor(Color.BLACK);
                speedometer.setUnitTextColor(Color.BLACK);
            }

            circularProgressBar = findViewById(R.id.progressBar2);
            circularProgressBar.setProgressMax(progressMAX);
            circularProgressBar.setProgressBarColorStart(Color.RED);
            circularProgressBar.setProgressBarColorEnd(Color.BLUE);
            circularProgressBar.setProgressBarWidth(10f);
            circularProgressBar.setProgressBarColorDirection(CircularProgressBar.GradientDirection.LEFT_TO_RIGHT);
            delay=Integer.parseInt(GlobalApplication.getValuePreferences("delaySpeed"));
            progress=Integer.parseInt(GlobalApplication.getValuePreferences("delaySpeedCircleBar"));
            comandi = new Speed.Comandi();
            rpmCommand = new RPMCommand();
            textViewRpm = findViewById(R.id.rpm3);
            speedCommand = new SpeedCommand();
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
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (rpm>progressMAX)
                            {
                                progressMAX=rpm+1000;
                                circularProgressBar.setProgressMax(progressMAX);
                            }
                            textViewRpm.setText(rpmCommand.getFormattedResult());
                            circularProgressBar.setProgressWithAnimation(rpm, (long) progress);
                            if (speed>speedMAX)
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
                            speedometer.speedTo(speed,500);
                        }
                    });
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private class Comandi
    {
        private void rpm() {
            try {
                rpmCommand.run(socket.getInputStream(), socket.getOutputStream());
                rpm=Integer.parseInt(rpmCommand.getCalculatedResult());
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

        private void speed() {
            try {
                speedCommand.run(socket.getInputStream(), socket.getOutputStream());
                speed = Integer.parseInt(speedCommand.getCalculatedResult());
            }
            catch (IOException | InterruptedException e) {}
        }
    }
}
