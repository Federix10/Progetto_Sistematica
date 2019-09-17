package com.example.progetto_sistematica;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;

public class GlobalApplication extends Application {

    private static Context appContext;
    private static BluetoothSocket socket;
    private static BluetoothDevice device;

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
}