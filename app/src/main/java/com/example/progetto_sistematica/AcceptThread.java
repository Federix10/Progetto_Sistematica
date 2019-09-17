package com.example.progetto_sistematica;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;

import java.io.IOException;
import java.util.UUID;


public class AcceptThread extends Thread {
    public final BluetoothServerSocket mmServerSocket;
    String NAME="Progetto_Sistematica";
    UUID MY_UUID=UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");

    public AcceptThread(BluetoothAdapter bluetoothAdapter) {

        // Use a temporary object that is later assigned to mmServerSocket
        // because mmServerSocket is final.
        BluetoothServerSocket tmp = null;
        try {
            // MY_UUID is the app's UUID string, also used by the client code.
            tmp = bluetoothAdapter.listenUsingRfcommWithServiceRecord(NAME, MY_UUID);
        } catch (IOException e) {
            System.out.println("Socket's listen() method failed");
        }
        mmServerSocket = tmp;
        GlobalApplication.setServerSocket(mmServerSocket);
    }

    public void run() {
        BluetoothSocket socket = null;
        // Keep listening until exception occurs or a socket is returned.
        while (true) {
            try {
                socket = mmServerSocket.accept();
            } catch (IOException e) {
                System.out.println("Socket's accept() method failed");
                break;
            }

            if (socket != null) {
                // A connection was accepted. Perform work associated with
                // the connection in a separate thread.
                manageMyConnectedSocket(socket);
                try {
                    mmServerSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public void manageMyConnectedSocket(BluetoothSocket socket) {
        System.out.println("Connesso con client");
        Context context2 = GlobalApplication.getAppContext();
        LayoutInflater inflater = (LayoutInflater) context2
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_message, null);
        Intent intent = new Intent(context2, MessageActivity.class);
        context2.startActivity(intent);
        MyBluetoothService.ConnectedThread myBluetoothServiceThread2 = new MyBluetoothService.ConnectedThread(GlobalApplication.getSocket());
        myBluetoothServiceThread2.start();
    }

    // Closes the connect socket and causes the thread to finish.
    public void cancel() {
        try {
            mmServerSocket.close();
        } catch (IOException e) {
            System.out.println("Could not close the connect socket");
        }
    }
}