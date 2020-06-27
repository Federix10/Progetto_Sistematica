package com.example.progetto_sistematica;

import android.app.AlertDialog;
import android.bluetooth.BluetoothSocket;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.github.anastr.speedviewlib.SpeedView;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.*;
import java.util.ArrayList;

import br.ufrn.imd.obd.commands.control.DtcNumberCommand;
import br.ufrn.imd.obd.commands.engine.MassAirFlowCommand;
import br.ufrn.imd.obd.commands.engine.RPMCommand;
import br.ufrn.imd.obd.commands.engine.SpeedCommand;
import br.ufrn.imd.obd.commands.engine.ThrottlePositionCommand;
import br.ufrn.imd.obd.commands.fuel.ConsumptionRateCommand;
import br.ufrn.imd.obd.commands.fuel.FindFuelTypeCommand;
import br.ufrn.imd.obd.commands.fuel.FuelLevelCommand;
import br.ufrn.imd.obd.commands.protocol.DescribeProtocolCommand;
import br.ufrn.imd.obd.commands.protocol.EchoOffCommand;
import br.ufrn.imd.obd.commands.protocol.LineFeedOffCommand;
import br.ufrn.imd.obd.commands.protocol.ObdRawCommand;
import br.ufrn.imd.obd.commands.protocol.SelectProtocolCommand;
import br.ufrn.imd.obd.commands.protocol.TimeoutCommand;
import br.ufrn.imd.obd.commands.temperature.AmbientAirTemperatureCommand;
import br.ufrn.imd.obd.commands.temperature.EngineCoolantTemperatureCommand;
import br.ufrn.imd.obd.enums.ObdProtocols;

public class OBDActivity extends AppCompatActivity {

    private static BluetoothSocket socket = GlobalApplication.getSocket();
    Button setspeed, settimeout;
    Boolean ciclo;
    DataOBD dataOBD;
    Comandi comandi;
    EditText editText,editText2;
    int delay,progress;
    String scomando=null;
    String comandoresult =null;
    Character dec1 =null;
    Character dec2= null;
    RPMCommand rpmCommand;
    ObdRawCommand comando;
    SpeedCommand speedCommand;
    CircularProgressBar circularProgressBar;
    SpeedView speedometer;
    int progressMAX, speedMAX;
    ObdRawCommand customFuel;

    String commandRead="", numberRead="";
    int command1=-1, command2=-1, command3=-1, command4=-1, command5=-1, command6=-1, commandProgressBar=-1,count=0;
    ListaComandi listaComandi;
    Method card1, card2, card3, card4, card5, card6,circleBar,ambientAir;
    String sCard1="", sCard2="", sCard3="", sCard4="", sCard5="", sCard6="",sCircleBar="",sAmbientAir="";
    double iCircleBar=0.0;
    TextView textViewRpm,textViewAmbientAir;
    TextView t1c1, t1c2,t1c3,t1c4,t1c5,t1c6;
    TextView t2c1,t2c2,t2c3,t2c4,t2c5,t2c6;
    int limit1=2000, limit2=3000, limit3=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obd_activity);
        checkComandi();
        ciclo = true;
        if (Read() == "")
        {
            Write();
            dataOBD = new DataOBD();
            dataOBD.inizializzaOBD();
            dataOBD.start();
        }
        else if (Read() != "")
        {
            dataOBD = new DataOBD();
            dataOBD.inizializzaOBD();
            dataOBD.start();
        }
    }

    public void checkComandi()
    {
        commandRead=ReadComandi();

        if (commandRead.isEmpty())
        {
            Toast.makeText(this, "Devi assegnare dei comandi", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String commandRead2 = commandRead;

            int index = commandRead2.indexOf(",");
            String stringa = commandRead2.substring(0,index);
            command1 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command2 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command3 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command4 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command5 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command6 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            commandProgressBar = Integer.parseInt(commandRead2);
        }

        //Toast.makeText(this, commandRead+" value: "+String.valueOf(command1+","+command2+","+command3+","+command4+","+command5+","+command6+","+commandProgressBar), Toast.LENGTH_LONG).show();

    }

    public String ReadComandi()
    {
        String temp="";
        try {
            FileInputStream fin = openFileInput("command.txt");
            int c;
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
        }
        catch(Exception e){
        }
        return temp;
    }

    public void Write()
    {
        String data = GlobalApplication.getDevice().getAddress();
        try {
            FileOutputStream fOut = openFileOutput("address.txt", MODE_PRIVATE);
            fOut.write(data.getBytes());
            fOut.close();
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
        }
        catch(Exception e){
        }
        return temp;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            ciclo = false;
            //OBDActivity.this.finish();
            System.exit(1);
            //return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    public class DataOBD extends Thread {

        public void inizializzaOBD ()
        {
            comandi = new Comandi();

            listaComandi = new ListaComandi(socket);

            t1c1 = findViewById(R.id.txt1Card1);
            t1c2 = findViewById(R.id.txt1Card2);
            t1c3 = findViewById(R.id.txt1Card3);
            t1c4 = findViewById(R.id.txt1Card4);
            t1c5 = findViewById(R.id.txt1Card5);
            t1c6 = findViewById(R.id.txt1Card6);

            t2c1 = findViewById(R.id.txt2Card1);
            t2c2 = findViewById(R.id.txt2Card2);
            t2c3 = findViewById(R.id.txt2Card3);
            t2c4 = findViewById(R.id.txt2Card4);
            t2c5 = findViewById(R.id.txt2Card5);
            t2c6 = findViewById(R.id.txt2Card6);

            setspeed = findViewById(R.id.btnSpeed);
            settimeout = findViewById(R.id.btnDTC);

            textViewRpm = findViewById(R.id.rpm);
            textViewAmbientAir = findViewById(R.id.tempOut);

            editText = findViewById(R.id.delayms);

            circularProgressBar = findViewById(R.id.progressBar);

            setCard();

            customFuel = new ObdRawCommand("01 81");
            comando = new ObdRawCommand("01 46");

            if (commandProgressBar==0)
                progressMAX=7000;
            else if (commandProgressBar==1)
                progressMAX=1000;
            else if (commandProgressBar==2)
                progressMAX=150;

            circularProgressBar.setProgressMax(progressMAX);

            speedMAX=200;
            speedometer = findViewById(R.id.speedView2);
            speedometer.setMaxSpeed(speedMAX);
            speedometer.setWithTremble(false);
            speedometer.setHighSpeedColor(Color.GREEN);
            speedometer.setMediumSpeedColor(Color.GREEN);
            speedometer.setTickNumber(11);
            editText2=findViewById(R.id.delayms2);
            delay=150;
            progress=200;

            rpmCommand = new RPMCommand(); //giri motore
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
            }
        }

        public void run() {
            while (true) {
                try {
                    if (ciclo == false)
                    {
                        break;
                    }
                    //comandi.rpm();
                    comandi.speed();
                    setValueCard();
                    OBDActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (GlobalApplication.getRPM()>progressMAX && commandProgressBar == 0)
                            {
                                progressMAX+=1000;
                                limit1+=1000;
                                limit2+=1000;
                                limit3+=1000;
                                circularProgressBar.setProgressMax(progressMAX);
                            }

                            if (commandProgressBar==0)
                            {
                                circularProgressBar.setProgressWithAnimation((float) iCircleBar, progress);
                                if (iCircleBar<limit1)
                                    circularProgressBar.setColor(Color.BLUE);
                                else if (iCircleBar>limit1 && iCircleBar<limit2)
                                    circularProgressBar.setColor(Color.rgb(135,206,250));
                                else if (iCircleBar>=limit2 && iCircleBar<limit3)
                                    circularProgressBar.setColor(Color.rgb(255,165,0));
                                else if (iCircleBar>=limit3)
                                    circularProgressBar.setColor(Color.RED);
                            }
                            else if (commandProgressBar==1)
                                circularProgressBar.setProgress((int) iCircleBar);
                            else if (commandProgressBar==2)
                                circularProgressBar.setProgress((float) iCircleBar);

                            if (GlobalApplication.getSpeed()>speedMAX)
                            {
                                speedMAX=GlobalApplication.getSpeed()+20;
                                speedometer.setMaxSpeed(speedMAX);
                                speedometer.setTickNumber(11);
                            }
                            speedometer.speedTo(GlobalApplication.getSpeed(),500);
                        }
                    });
                    Thread.sleep(delay);
                    count++;
                    if (count==50)
                    {
                        setAmbientAir();
                        count=0;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setAmbientAir()
    {
        try {
            textViewAmbientAir.setText((String) ambientAir.invoke(listaComandi));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void setCard(){
        try {
            card1 = ListaComandi.class.getMethod(GlobalApplication.getCommand(command1));
            t1c1.setText(GlobalApplication.getComando(command1));
            card2 = ListaComandi.class.getMethod(GlobalApplication.getCommand(command2));
            t1c2.setText(GlobalApplication.getComando(command2));
            card3 = ListaComandi.class.getMethod(GlobalApplication.getCommand(command3));
            t1c3.setText(GlobalApplication.getComando(command3));
            card4 = ListaComandi.class.getMethod(GlobalApplication.getCommand(command4));
            t1c4.setText(GlobalApplication.getComando(command4));
            card5 = ListaComandi.class.getMethod(GlobalApplication.getCommand(command5));
            t1c5.setText(GlobalApplication.getComando(command5));
            card6 = ListaComandi.class.getMethod(GlobalApplication.getCommand(command6));
            t1c6.setText(GlobalApplication.getComando(command6));
            circleBar = ListaComandi.class.getMethod(GlobalApplication.getProgressBarCommand(commandProgressBar));
            ambientAir = ListaComandi.class.getMethod("ambientair");
            } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public void setValueCard()
    {
        try {
            sCard1 = (String) card1.invoke(listaComandi);
            t2c1.setText(sCard1);
            sCard2 = (String) card2.invoke(listaComandi);
            t2c2.setText(sCard2);
            sCard3 = (String) card3.invoke(listaComandi);
            t2c3.setText(sCard3);
            sCard4 = (String) card4.invoke(listaComandi);
            t2c4.setText(sCard4);
            sCard5 = (String) card5.invoke(listaComandi);
            t2c5.setText(sCard5);
            sCard6 = (String) card6.invoke(listaComandi);
            t2c6.setText(sCard6);
            sCircleBar = (String) circleBar.invoke(listaComandi);
            if (isNumeric(sCircleBar.replaceAll("[^0-9]", "")))
            {
                iCircleBar = Double.parseDouble(sCircleBar.replaceAll("[^0-9]", ""));
                textViewRpm.setText(sCircleBar);
            }
            else
                textViewRpm.setText("Parametro non corretto");
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static boolean isNumeric(String strNum)
    {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public void graphActivity (View view)
    {
        ciclo=false;
        OBDActivity.this.finish();
        Intent startNewActivity = new Intent (this, Graph.class);
        startActivity(startNewActivity);
    }

    public void speedactivity (View view)
    {
        ciclo=false;
        OBDActivity.this.finish();
        Intent startNewActivity = new Intent (this, Speed.class);
        startActivity(startNewActivity);
    }

    public void setting (View view)
    {
        ciclo=false;
        OBDActivity.this.finish();
        Intent startNewActivity = new Intent (this, Setting.class);
        startActivity(startNewActivity);
    }

    public void setTimeout (View view)
    {
        Editable editable=editText.getText();
        String str_delay = editable.toString();
        delay=Integer.valueOf(str_delay);
    }

    public void setTimeoutProgress (View view)
    {
        Editable editable=editText2.getText();
        String str_delay = editable.toString();
        progress=Integer.valueOf(str_delay);
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
        }

        /*public void comandocustomAcceleratore() {
            try {
                comando.run(socket.getInputStream(), socket.getOutputStream());//posizione acceleratore custom
                scomando=comando.getFormattedResult();
                dec1 = scomando.charAt(scomando.length() - 2);
                dec2 = scomando.charAt(scomando.length() - 1);
                comandoresult= new StringBuilder().append(dec1).append(dec2).toString();
                int dec = Integer.parseInt(comandoresult, 16);
                scomando = Integer.toString(dec);
                textViewFindFuelType.setText(scomando);
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (textViewFindFuelType.getText()=="") {
                    textViewFindFuelType.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void comandocustomFuelType()
        {
            try {
                customFuel.run(socket.getInputStream(), socket.getOutputStream());
                textViewFindFuelType.append(" "+customFuel.getFormattedResult());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                if (textViewFindFuelType.getText()=="") {
                    textViewFindFuelType.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }*/
    }
}