package com.example.progetto_sistematica;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 1;

    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            // Device doesn't support Bluetooth
        }

        if (!bluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
            controllo();
        }
    } //fine on create

     public void controllo(){
        //super.onStart();
         if (bluetoothAdapter.isEnabled()) {
             System.out.println("vado a dormire");
             try {Thread.sleep(5000); }
             catch (Exception e){ e.printStackTrace(); }
             System.out.println("mi sveglio");
         }
         Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
         String deviceName="",deviceHardwareAddress="";
         List<String> s = new ArrayList<String>();
         List<String> c = new ArrayList<String>();
         if (pairedDevices.size() > 0) {
             // There are paired devices. Get the name and address of each paired device.
             for (BluetoothDevice device : pairedDevices) {
                 s.add(device.getName());
             }
             for (BluetoothDevice mac : pairedDevices){
                 c.add(mac.getAddress());
             }
         }
         for(int i=0;i<s.size();i++) {
             System.out.println("NOME DEVICE: " + s.get(i));
             System.out.println("INDIRIZZO MAC: " + c.get(i));
         }
     }//fine onStart
}