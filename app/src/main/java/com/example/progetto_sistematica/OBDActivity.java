package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.github.anastr.speedviewlib.SpeedView;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import br.ufrn.imd.obd.commands.ObdCommand;
import br.ufrn.imd.obd.commands.engine.MassAirFlowCommand;
import br.ufrn.imd.obd.commands.engine.RPMCommand;
import br.ufrn.imd.obd.commands.engine.SpeedCommand;
import br.ufrn.imd.obd.commands.protocol.EchoOffCommand;
import br.ufrn.imd.obd.commands.protocol.LineFeedOffCommand;
import br.ufrn.imd.obd.commands.protocol.ObdRawCommand;
import br.ufrn.imd.obd.commands.protocol.SelectProtocolCommand;
import br.ufrn.imd.obd.commands.protocol.TimeoutCommand;
import br.ufrn.imd.obd.enums.ObdProtocols;

public class OBDActivity extends AppCompatActivity {

    private static BluetoothSocket socket = GlobalApplication.getSocket();
    Boolean ciclo;
    static DataOBD dataOBD;
    Comandi comandi;
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

    String commandRead="";
    int command1=-1, command2=-1, command3=-1, command4=-1, command5=-1, command6=-1, commandProgressBar=-1,count=0;
    static ListaComandi listaComandi;
    Method card1, card2, card3, card4, card5, card6,circleBar;
    String sCard1="", sCard2="", sCard3="", sCard4="", sCard5="", sCard6="",sCircleBar="";
    double iCircleBar=0.0;
    TextView textViewRpm;
    TextView t1c1, t1c2,t1c3,t1c4,t1c5,t1c6;
    TextView t2c1,t2c2,t2c3,t2c4,t2c5,t2c6;
    int limit1=2000, limit2=3000, limit3=4000, tickNumber=0, hour=0;
    Toolbar toolbar;
    Boolean c1=false,c2=false,c3=false,c4=false,c5=false,c6=false;

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
        setContentView(R.layout.obd_activity);
        checkComandi();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        ciclo = true;
        if (Read() == "")
        {
            Write(GlobalApplication.getDevice().getAddress());
            dataOBD = new DataOBD();
            dataOBD.inizializzaOBD();
            Thread thread = new Thread(dataOBD);
            thread.start();
        }
        else if (Read() != "")
        {
            dataOBD = new DataOBD();
            dataOBD.inizializzaOBD();
            Thread thread = new Thread(dataOBD);
            thread.start();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.impostazioni) {
            ciclo=false;
            OBDActivity.this.finish();
            Intent startNewActivity = new Intent (this, SettingsActivity.class);
            startActivity(startNewActivity);
            return true;
        }
        else if (id == R.id.speedactivity) {
            ciclo=false;
            OBDActivity.this.finish();
            Intent startNewActivity = new Intent (this, Speed.class);
            startActivity(startNewActivity);
            return true;
        }
        else if (id == R.id.grafico) {
            ciclo=false;
            OBDActivity.this.finish();
            Intent startNewActivity = new Intent (this, Graph.class);
            startActivity(startNewActivity);
            return true;
        }
        else if (id == R.id.cambiaComandi) {
            ciclo=false;
            OBDActivity.this.finish();
            Intent startNewActivity = new Intent (this, ChangeCardView.class);
            startActivity(startNewActivity);
            return true;
        }
        if (item.getItemId() == android.R.id.home) {
            ciclo=false;
            GlobalApplication.getClient().cancel();
            Write("");
            OBDActivity.this.finish();
            Intent startNewActivity = new Intent (this, MainActivity.class);
            startActivity(startNewActivity);
            System.exit(1);
            Toast.makeText(this, "Connessione chiusa", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.dtc) {
            //ciclo=false;
            //OBDActivity.this.finish();
            Intent startNewActivity = new Intent (this, DTC.class);
            startActivity(startNewActivity);
            return true;
        }
        else if (id == R.id.allcommand)
        {
            ciclo=false;
            OBDActivity.this.finish();
            Intent startNewActivity = new Intent (this, AllCommand.class);
            startActivity(startNewActivity);
            return true;
        }

        return super.onOptionsItemSelected(item);
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

    public void Write(String s)
    {
        String data = s;
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
            OBDActivity.this.finish();
            System.exit(1);
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    public class DataOBD implements Runnable {

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


            textViewRpm = findViewById(R.id.rpm);


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
            speedometer.setTicks(0,20,40,60,80,100,120,140,160,180,200);
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

            delay=Integer.parseInt(GlobalApplication.getValuePreferences("delayCommand"));
            progress=Integer.parseInt(GlobalApplication.getValuePreferences("delayCircleBar"));

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

            /*  Remove class.getMethod per ottimizzare chiamata metodi e velocità applicazione
            OBDActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ArrayList<ObdCommand> obdCommandArrayList = new ArrayList<>();
                        obdCommandArrayList.add(new SpeedCommand()); //aggiungere i vari comandi selezionati dall'utente
                        for(int i=0;i<obdCommandArrayList.size();i++) //da mettere in un metodo con return String
                        {
                            try {
                                obdCommandArrayList.get(i).run(socket.getInputStream(), socket.getOutputStream()); //velocità
                            } catch (IOException | InterruptedException e) {
                            }
                            finally {
                                if (obdCommandArrayList.get(i).getCalculatedResult()=="") {
                                    return "Parametro non corretto";
                                    //Toast.makeText(OBDActivity.this, "Parametro non corretto", Toast.LENGTH_SHORT).show();
                                }
                                else{
                                    return obdCommandArrayList.get(i).getFormattedResult();
                                    //Toast.makeText(OBDActivity.this, obdCommandArrayList.get(i).getFormattedResult(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    }
                });
            */

            try {
                checkForOnce();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
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
                                speedMAX+=20;
                                speedometer.setMaxSpeed(speedMAX);
                                if (tickNumber==0)
                                    speedometer.setTicks(0,20,40,60,80,100,120,140,160,180,200,220);
                                if (tickNumber==1)
                                    speedometer.setTicks(0,30,60,90,120,150,180,210,240);
                                if (tickNumber==2)
                                    speedometer.setTicks(0,30,60,90,120,150,180,210,240,260);
                                if (tickNumber==3)
                                    speedometer.setTicks(0,30,60,90,120,150,180,210,240,260,280);
                                if (tickNumber==4)
                                    speedometer.setTicks(0,30,60,90,120,150,180,210,240,270,300);
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
            } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public void checkForOnce() throws InvocationTargetException, IllegalAccessException {

        if (GlobalApplication.getExecutionTime(command1)==1)
        {
            sCard1 = (String) card1.invoke(listaComandi);
            t2c1.setText(sCard1);
            c1=true;
        }
        if (GlobalApplication.getExecutionTime(command2)==1)
        {
            sCard2 = (String) card2.invoke(listaComandi);
            t2c2.setText(sCard2);
            c2=true;
        }
        if (GlobalApplication.getExecutionTime(command3)==1)
        {
            sCard3 = (String) card3.invoke(listaComandi);
            t2c3.setText(sCard3);
            c3=true;
        }
        if (GlobalApplication.getExecutionTime(command4)==1)
        {
            sCard4 = (String) card4.invoke(listaComandi);
            t2c4.setText(sCard4);
            c4=true;
        }
        if (GlobalApplication.getExecutionTime(command5)==1)
        {
            sCard5 = (String) card5.invoke(listaComandi);
            t2c5.setText(sCard5);
            c5=true;
        }
        if (GlobalApplication.getExecutionTime(command6)==1)
        {
            sCard6 = (String) card6.invoke(listaComandi);
            t2c6.setText(sCard6);
            c6=true;
        }
    }

    public void setValueCard()
    {
        try {
            if (c1==false)
            {
                sCard1 = (String) card1.invoke(listaComandi);
                t2c1.setText(sCard1);
            }
            if (c2==false)
            {
                sCard2 = (String) card2.invoke(listaComandi);
                t2c2.setText(sCard2);
            }
            if (c3==false)
            {
                sCard3 = (String) card3.invoke(listaComandi);
                t2c3.setText(sCard3);
            }
            if (c4==false)
            {
                sCard4 = (String) card4.invoke(listaComandi);
                t2c4.setText(sCard4);
            }
            if (c5==false)
            {
                sCard5 = (String) card5.invoke(listaComandi);
                t2c5.setText(sCard5);
            }
            if (c6==false)
            {
                sCard6 = (String) card6.invoke(listaComandi);
                t2c6.setText(sCard6);
            }
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

    private class Comandi
    {
        /*public void rpm() {
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
        }*/

        public void speed() {
            try {
                speedCommand.run(socket.getInputStream(), socket.getOutputStream()); //velocità
                GlobalApplication.setSpeed(Integer.parseInt(speedCommand.getCalculatedResult()));
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