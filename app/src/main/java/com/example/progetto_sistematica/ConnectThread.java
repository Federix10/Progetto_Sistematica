package com.example.progetto_sistematica;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;

import java.io.IOException;
import java.util.UUID;

public class ConnectThread extends Thread {
    public final BluetoothSocket mmSocket;
    public final BluetoothDevice mmDevice;
    UUID MY_UUID=UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
    private BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    public int CT=0;
    MessageActivity messageActivity;

    public ConnectThread(BluetoothDevice device) {
        // Use a temporary object that is later assigned to mmSocket
        // because mmSocket is final.
        BluetoothSocket tmp = null;
        mmDevice = device;

        OBDActivity  obdActivity = new OBDActivity();
        messageActivity = new MessageActivity();

        try {
            // Get a BluetoothSocket to connect with the given BluetoothDevice.
            // MY_UUID is the app's UUID string, also used in the server code.
            tmp = device.createRfcommSocketToServiceRecord(MY_UUID);
        } catch (IOException e) {
            System.out.println("Socket's create() method failed");
        }
        mmSocket = tmp;
        //obdActivity.getRisorse(mmDevice, mmSocket);
        GlobalApplication.setSocket(mmSocket);
    }

    public void run() {
        // Cancel discovery because it otherwise slows down the connection.
        bluetoothAdapter.cancelDiscovery();

        try {
            // Connect to the remote device through the socket. This call blocks
            // until it succeeds or throws an exception.
            mmSocket.connect();
        } catch (IOException connectException) {
            // Unable to connect; close the socket and return.
            try {
                mmSocket.close();
            } catch (IOException closeException) {
                System.out.println("Could not close the client socket");
            }
            return;
        }

        // The connection attempt succeeded. Perform work associated with
        // the connection in a separate thread.
        manageMyConnectedSocket(mmSocket);
    }
    private void manageMyConnectedSocket(BluetoothSocket mmSocket) {
        System.out.println("Connesso con server");
        Context context = GlobalApplication.getAppContext();
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_message, null);
        Intent intent = new Intent(context, MessageActivity.class);
        context.startActivity(intent);
        MyBluetoothService.ConnectedThread myBluetoothServiceThread = new MyBluetoothService.ConnectedThread(GlobalApplication.getSocket());
        myBluetoothServiceThread.start();
    }

    // Closes the client socket and causes the thread to finish.
    public void cancel() {
        try {
            mmSocket.close();
        } catch (IOException e) {
            System.out.println("Could not close the client socket");
        }
    }
}
