package com.example.progetto_sistematica;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class GlobalApplication extends Application {

    private static Context appContext;
    private static BluetoothSocket socket;
    private static BluetoothDevice device;
    private static BluetoothSocket serverSocket;
    private static int setAT = 0;
    private static int setCT = 0;
    private static String message;
    private static ConnectThread connectThread;
    private static int rpm=0;
    private static int speed=0;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
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

    public synchronized void Write()
    {
        String data = "ADDRESS PROVA";
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

    public synchronized String Read()
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

    public static Context getAppContext() {
        return appContext;
    }


    public static synchronized ConnectThread getClient(){
        return connectThread;
    }

    public static synchronized void setClient(ConnectThread connectThread1){
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