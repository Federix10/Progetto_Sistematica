package com.example.progetto_sistematica;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class GlobalApplication extends Application {

    private static Context appContext;
    private static BluetoothSocket socket;
    private static BluetoothDevice device;
    private static BluetoothSocket serverSocket;
    private static int setAT = 0;
    private static int setCT = 0;
    private static String message;
    private static MainActivity.ConnectThread connectThread;
    private static int rpm=0;
    private static int speed=0;
    private static int obd=0;
    private static ArrayList<String> arrayComandi = new ArrayList<>();
    private static ArrayList<String> arrayCommand = new ArrayList<>();
    private static ArrayList<String> progressBarArrayComandi = new ArrayList<>();
    private static ArrayList<String> progressBarArrayCommand = new ArrayList<>();
    private static ArrayList<Integer> executionTime = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }

    public static String getValuePreferences(String name)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(appContext);
        String s = preferences.getString(name,"");
        return s;
    }

    public static boolean getBooleanPreferences(String name)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(GlobalApplication.getAppContext());
        boolean s = preferences.getBoolean(name,false);
        return s;
    }

    public static Integer getHour()
    {
        Date dt = new Date();  // current time
        return dt.getHours();
    }

    public static synchronized void aggiungiExecutionTime()
    {
        executionTime.add(0);//maf
        executionTime.add(0);//l/h
        executionTime.add(0);//liv carburante
        executionTime.add(0);//temp motore
        executionTime.add(0);//pos acceleratore
        executionTime.add(0);//speed
        executionTime.add(0);//rpm
        executionTime.add(0);//temp ambientale
        executionTime.add(1);//diagnostica errori
        executionTime.add(1);//volt
        executionTime.add(1);//tipo carburante
        executionTime.add(0);//carico motore
        executionTime.add(1);//code error
        executionTime.add(0);//rapporto combustione
        executionTime.add(1);//vin
        executionTime.add(0);//rapporto aria/carburante
        executionTime.add(1);//check motore avviamento
        executionTime.add(0);//regolazione carburante
        executionTime.add(0);//temp aria aspirata
        executionTime.add(1);//autonomia motore
        executionTime.add(0);//temp olio motore
        executionTime.add(1);//tipo OBD
        executionTime.add(0);//pressione barometrica
        executionTime.add(1);//vita batteria auto ibrida
        executionTime.add(1);//emissioni
        executionTime.add(0);//marcia
        executionTime.add(0);//cylinderfuelrate
        executionTime.add(0);//CUSTOMHYBRID
        executionTime.add(1);//ODOMETER
    }

    public static Integer getExecutionTime(int i)
    {
        return executionTime.get(i);
    }

    public static synchronized void aggiungiProgressBarComandi()
    {
        progressBarArrayComandi.add("Giri motore");
        progressBarArrayComandi.add("Livello carburante");
        progressBarArrayComandi.add("Temperatura motore");
    }

    public static synchronized void aggiungiProgressBarCommand()
    {
        progressBarArrayCommand.add("rpmcirclebar");
        progressBarArrayCommand.add("fuellevelcirclebar");
        progressBarArrayCommand.add("enginetempcirclebar");
    }

    public static ArrayList getProgressBarComandi()
    {
        return progressBarArrayComandi;
    }

    public static String getProgressBarCommand(int i) {return progressBarArrayCommand.get(i);}

    public static synchronized void aggiungiComandi()
    {
        arrayComandi.add("Mass Air Flow");
        arrayComandi.add("Consumo L/H");
        arrayComandi.add("Livello carburante");
        arrayComandi.add("Temperatura motore");
        arrayComandi.add("Posizione Acceleratore");
        arrayComandi.add("Velocità");
        arrayComandi.add("Giri motore");
        arrayComandi.add("Temperatura ambiente");
        arrayComandi.add("Diagnostica errori");
        arrayComandi.add("Voltaggio batteria");
        arrayComandi.add("Tipo carburante");
        arrayComandi.add("Carico del motore");
        arrayComandi.add("Codici di errore");
        arrayComandi.add("Rapporto di combustione");
        arrayComandi.add("Codice identificativo auto");
        arrayComandi.add("Rapporto aria/carburante");
        arrayComandi.add("Check motorino avviamento");
        arrayComandi.add("Regolazione Carburante");
        arrayComandi.add("Temperatura aria aspirata");
        arrayComandi.add("Autonomia Motore");
        arrayComandi.add("Temperatura Olio Motore");
        arrayComandi.add("Tipo Adattatore OBD");
        arrayComandi.add("Pressione barometrica");
        arrayComandi.add("Vita rimanente batteria ibride");
        arrayComandi.add("Emissioni");
        arrayComandi.add("Marcia");
        arrayComandi.add("Quantità carburante cilindro");
        arrayComandi.add("Custom Hybrid");
        arrayComandi.add("Odometer");
    }

    public static synchronized void aggiungiCommand()
    {
        arrayCommand.add("maf");
        arrayCommand.add("consumo");
        arrayCommand.add("fuellevel");
        arrayCommand.add("enginetemp");
        arrayCommand.add("throttleposition");
        arrayCommand.add("speed");
        arrayCommand.add("rpm");
        arrayCommand.add("ambientair");
        arrayCommand.add("dtc");
        arrayCommand.add("volt");
        arrayCommand.add("fueltype");
        arrayCommand.add("engineload");
        arrayCommand.add("troublecode");
        arrayCommand.add("equivratio");
        arrayCommand.add("vin");
        arrayCommand.add("airfuelratio");
        arrayCommand.add("ignitionmonitor");
        arrayCommand.add("fueltrim");
        arrayCommand.add("intakeair");
        arrayCommand.add("engineruntime");
        arrayCommand.add("oiltemp");
        arrayCommand.add("warmstart");
        arrayCommand.add("barometricpressure");
        arrayCommand.add("hybridbatterybemainingLbife");
        arrayCommand.add("emission");
        arrayCommand.add("gear");
        arrayCommand.add("cilynderfuelrate");
        arrayCommand.add("customHybrid");
        arrayCommand.add("odometer");
    }

    public static ArrayList getComandi()
    {
        return arrayComandi;
    }

    public static String getComando(int i)
    {
        return arrayComandi.get(i);
    }

    public static String getCommand(int i)
    {
        return arrayCommand.get(i);
    }

    public static synchronized void setOBD(int obd2){
        obd = obd2;
    }

    public static int getOBD()
    {
        return obd;
    }

    public static synchronized void setRPM(int rpm2){
        rpm = rpm2;
    }

    public static int getRPM()
    {
        return rpm;
    }

    public static synchronized void setSpeed(int speed2){
        speed = speed2;
    }

    public static int getSpeed()
    {
        return speed;
    }

    public static Context getAppContext() {
        return appContext;
    }


    public static synchronized MainActivity.ConnectThread getClient(){
        return connectThread;
    }

    public static synchronized void setClient(MainActivity.ConnectThread connectThread1){
        connectThread = connectThread1;
    }


    public static synchronized BluetoothSocket getSocket(){
        return socket;
    }

    public static synchronized void setSocket(BluetoothSocket socket2){
        socket = socket2;
    }

    public static BluetoothDevice getDevice()
    {
        return device;
    }

    public static void setDevice (BluetoothDevice btdevice)
    {
        device=btdevice;
    }

    public static synchronized  void setServerSocket (BluetoothSocket btserverSocket)
    {
        serverSocket=btserverSocket;
    }

    public static BluetoothSocket getServerSocket()
    {
        return serverSocket;
    }

    public static void setSetAT (int at)
    {
        setAT=at;
    }
    public static synchronized int getAT()
    {
        return setAT;
    }
    public static void setSetCT (int ct)
    {
        setCT=ct;
    }
    public static synchronized int getCT()
    {
        return setCT;
    }
    public static void setMessage(String btmessage)
    {
        message=btmessage;
    }
    public static synchronized String getMessage()
    {
        return message;
    }

}