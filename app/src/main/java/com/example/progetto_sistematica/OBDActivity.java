package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
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
import java.util.Arrays;

import br.ufrn.imd.obd.commands.ObdCommand;
import br.ufrn.imd.obd.commands.control.DtcNumberCommand;
import br.ufrn.imd.obd.commands.control.EquivalentRatioCommand;
import br.ufrn.imd.obd.commands.control.IgnitionMonitorCommand;
import br.ufrn.imd.obd.commands.control.ModuleVoltageCommand;
import br.ufrn.imd.obd.commands.control.TroubleCodesCommand;
import br.ufrn.imd.obd.commands.control.VinCommand;
import br.ufrn.imd.obd.commands.engine.LoadCommand;
import br.ufrn.imd.obd.commands.engine.MassAirFlowCommand;
import br.ufrn.imd.obd.commands.engine.OilTempCommand;
import br.ufrn.imd.obd.commands.engine.RPMCommand;
import br.ufrn.imd.obd.commands.engine.RuntimeCommand;
import br.ufrn.imd.obd.commands.engine.SpeedCommand;
import br.ufrn.imd.obd.commands.engine.ThrottlePositionCommand;
import br.ufrn.imd.obd.commands.fuel.AirFuelRatioCommand;
import br.ufrn.imd.obd.commands.fuel.ConsumptionRateCommand;
import br.ufrn.imd.obd.commands.fuel.FindFuelTypeCommand;
import br.ufrn.imd.obd.commands.fuel.FuelLevelCommand;
import br.ufrn.imd.obd.commands.fuel.FuelTrimCommand;
import br.ufrn.imd.obd.commands.pressure.BarometricPressureCommand;
import br.ufrn.imd.obd.commands.pressure.FuelPressureCommand;
import br.ufrn.imd.obd.commands.protocol.EchoOffCommand;
import br.ufrn.imd.obd.commands.protocol.LineFeedOffCommand;
import br.ufrn.imd.obd.commands.protocol.ObdRawCommand;
import br.ufrn.imd.obd.commands.protocol.ObdWarmStartCommand;
import br.ufrn.imd.obd.commands.protocol.SelectProtocolCommand;
import br.ufrn.imd.obd.commands.protocol.TimeoutCommand;
import br.ufrn.imd.obd.commands.temperature.AirIntakeTemperatureCommand;
import br.ufrn.imd.obd.commands.temperature.AmbientAirTemperatureCommand;
import br.ufrn.imd.obd.commands.temperature.EngineCoolantTemperatureCommand;
import br.ufrn.imd.obd.enums.ObdProtocols;

public class OBDActivity extends AppCompatActivity {

    private static BluetoothSocket socket = GlobalApplication.getSocket();
    private Boolean ciclo;
    private static DataOBD dataOBD;
    private RPMCommand rpmCommand;
    private ObdRawCommand comando;
    private SpeedCommand speedCommand;
    private CircularProgressBar circularProgressBar;
    private SpeedView speedometer;
    private ObdRawCommand customFuel;

    private ArrayList<Integer> command;
    static ListaComandi listaComandi;
    private Method circleBar;
    private ArrayList<String> sCard;
    private String sCircleBar="", commandRead="";
    private double iCircleBar=0.0;
    private ArrayList<TextView> t2;
    private TextView t1c1, t1c2,t1c3,t1c4,t1c5,t1c6, textViewRpm, t2c1,t2c2,t2c3,t2c4,t2c5,t2c6;
    private int tickNumber=0, hour=0, commandProgressBar=-1, progressMAX, speedMAX, delay,progress;
    private Toolbar toolbar;
    private ArrayList<Boolean> c;
    private ArrayList<ObdCommand> obdCommandArrayList, obdCommands;
    private Thread thread;

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
            thread = new Thread(dataOBD);
            thread.start();
        }
        else if (Read() != "")
        {
            dataOBD = new DataOBD();
            dataOBD.inizializzaOBD();
            thread = new Thread(dataOBD);
            thread.start();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        ciclo=true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        ciclo=false;
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
            startActivity(new Intent (this, SettingsActivity.class));
            return true;
        }
        else if (id == R.id.speedactivity) {
            startActivity(new Intent (this, Speed.class));
            return true;
        }
        else if (id == R.id.grafico) {
            startActivity(new Intent (this, Graph.class));
            return true;
        }
        else if (id == R.id.cambiaComandi) {
            OBDActivity.this.finish();
            startActivity(new Intent (this, ChangeCardView.class));
            return true;
        }
        if (item.getItemId() == android.R.id.home) {
            GlobalApplication.getClient().cancel();
            Write("");
            OBDActivity.this.finish();
            startActivity(new Intent (this, MainActivity.class));
            System.exit(1);
            Toast.makeText(this, "Connessione chiusa", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.dtc) {
            startActivity(new Intent (this, DTC.class));
            return true;
        }
        else if (id == R.id.allcommand)
        {
            startActivity(new Intent (this, AllCommand.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void checkComandi()
    {
        commandRead=ReadComandi();

        if (commandRead.isEmpty())
            Toast.makeText(this, "Devi assegnare dei comandi", Toast.LENGTH_SHORT).show();
        else
        {
            command = new ArrayList<>();
            String commandRead2 = commandRead, stringa;
            int index;

            for(int i=0;i<6;i++)
            {
                index = commandRead2.indexOf(",");
                stringa = commandRead2.substring(0,index);
                command.add(Integer.parseInt(stringa));
                commandRead2 = commandRead2.substring(index+1);
            }
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
            obdCommandArrayList = new ArrayList<>();
            obdCommands = new ArrayList<>();
            t2 = new ArrayList<>();

            sCard = new ArrayList<>();
            sCard.addAll(Arrays.asList("","","","","",""));

            c = new ArrayList<>();
            c.addAll(Arrays.asList(false,false,false,false,false,false));

            obdCommandArrayList.add(new MassAirFlowCommand());
            obdCommandArrayList.add(new ConsumptionRateCommand());
            obdCommandArrayList.add(new FuelLevelCommand());
            obdCommandArrayList.add(new EngineCoolantTemperatureCommand());
            obdCommandArrayList.add(new ThrottlePositionCommand());
            obdCommandArrayList.add(new SpeedCommand());
            obdCommandArrayList.add(new RPMCommand());
            obdCommandArrayList.add(new AmbientAirTemperatureCommand());
            obdCommandArrayList.add(new DtcNumberCommand());
            obdCommandArrayList.add(new ModuleVoltageCommand());
            obdCommandArrayList.add(new FindFuelTypeCommand());
            obdCommandArrayList.add(new LoadCommand());
            obdCommandArrayList.add(new TroubleCodesCommand());
            obdCommandArrayList.add(new EquivalentRatioCommand());
            obdCommandArrayList.add(new VinCommand());
            obdCommandArrayList.add(new AirFuelRatioCommand());
            obdCommandArrayList.add(new IgnitionMonitorCommand());
            obdCommandArrayList.add(new FuelTrimCommand());
            obdCommandArrayList.add(new AirIntakeTemperatureCommand());
            obdCommandArrayList.add(new RuntimeCommand());
            obdCommandArrayList.add(new OilTempCommand());
            obdCommandArrayList.add(new ObdWarmStartCommand());
            obdCommandArrayList.add(new BarometricPressureCommand());
            obdCommandArrayList.add(new FuelPressureCommand());

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

            t2.addAll(Arrays.asList(t2c1, t2c2, t2c3, t2c4, t2c5, t2c6));

            textViewRpm = findViewById(R.id.rpm);

            circularProgressBar = findViewById(R.id.progressBar);
            circularProgressBar.setProgressBarColorStart(Color.RED);
            circularProgressBar.setProgressBarColorEnd(Color.BLUE);
            circularProgressBar.setProgressBarWidth(10f);
            circularProgressBar.setProgressBarColorDirection(CircularProgressBar.GradientDirection.LEFT_TO_RIGHT);

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
            try {
                checkForOnce();
            } catch (Exception e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    if(ciclo)
                    {
                        speed();
                        setValueCard();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                setGraphics();
                            }
                        });
                        Thread.sleep(delay);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private String executeCommand(int i)
    {
        try {
            obdCommands.get(i).run(socket.getInputStream(), socket.getOutputStream());
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (obdCommands.get(i).getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return obdCommands.get(i).getFormattedResult();
            }
        }
    }

    private void setCard(){
        try {
            obdCommands.add(obdCommandArrayList.get(command.get(0)));
            obdCommands.add(obdCommandArrayList.get(command.get(1)));
            obdCommands.add(obdCommandArrayList.get(command.get(2)));
            obdCommands.add(obdCommandArrayList.get(command.get(3)));
            obdCommands.add(obdCommandArrayList.get(command.get(4)));
            obdCommands.add(obdCommandArrayList.get(command.get(5)));

            t1c1.setText(GlobalApplication.getComando(command.get(0)));
            t1c2.setText(GlobalApplication.getComando(command.get(1)));
            t1c3.setText(GlobalApplication.getComando(command.get(2)));
            t1c4.setText(GlobalApplication.getComando(command.get(3)));
            t1c5.setText(GlobalApplication.getComando(command.get(4)));
            t1c6.setText(GlobalApplication.getComando(command.get(5)));

            circleBar = ListaComandi.class.getMethod(GlobalApplication.getProgressBarCommand(commandProgressBar));
            } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public void checkForOnce(){
        for (int i=0;i<obdCommands.size();i++)
        {
            if (GlobalApplication.getExecutionTime(command.get(i))==1)
            {
                sCard.set(i,executeCommand(i));
                t2.get(i).setText(sCard.get(i));
                c.set(i,true);
            }
        }
    }

    private void setValueCard()
    {
        try {
            for (int i=0;i<obdCommands.size();i++)
            {
                try {
                    if (c.get(i)==false)
                    {
                        sCard.set(i,executeCommand(i));
                        t2.get(i).setText(sCard.get(i));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    t2.get(i).setText("Error");
                }
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

    private void setGraphics()
    {
        if (GlobalApplication.getRPM()>progressMAX && commandProgressBar == 0)
        {
            progressMAX+=1000;
            circularProgressBar.setProgressMax(progressMAX);
        }
        circularProgressBar.setProgressWithAnimation((float) iCircleBar, (long) progress);
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

    public void speed() {
        try {
            speedCommand.run(socket.getInputStream(), socket.getOutputStream());
            GlobalApplication.setSpeed(Integer.parseInt(speedCommand.getCalculatedResult()));
        }
        catch (IOException | InterruptedException e) {}
    }
}