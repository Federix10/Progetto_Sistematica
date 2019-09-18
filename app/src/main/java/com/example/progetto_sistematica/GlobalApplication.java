package com.example.progetto_sistematica;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;

public class GlobalApplication extends Application {

    private static Context appContext;
    private static BluetoothSocket socket;
    private static BluetoothDevice device;
    private static BluetoothSocket serverSocket;
    private static int setAT = 0;
    private static int setCT = 0;
    private static String message;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }

    public static Context getAppContext() {
        return appContext;
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