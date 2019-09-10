package com.example.progetto_sistematica;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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
        if (bluetoothAdapter == null) { //se il dispositivo non supporta il bluetooth viene mostrato un alert di errore
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Il dispositivo non supporta il bluetooth")
                    .setTitle("ERRORE");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {}
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        if (!bluetoothAdapter.isEnabled()) { //se il bluetooth è disattivato viene mostrata una finestra che permette di attivarlo
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }
        while(!bluetoothAdapter.isEnabled());
        controllo();
    } //fine on create

     public void controllo(){ //gestione dei dispositivi associati

         //TextView textView = (TextView)findViewById(R.id.NOMETEXTVIEW);
         Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
         List<String> s = new ArrayList<String>();
         List<String> c = new ArrayList<String>();
         if (pairedDevices.size() > 0) {
             for (BluetoothDevice device : pairedDevices) {
                 s.add(device.getName());
             }
             for (BluetoothDevice mac : pairedDevices){
                 c.add(mac.getAddress());
             }
         }
         for(int i=0;i<s.size();i++) {
             //textView.setText(s.get(i));
             System.out.println("NOME DEVICE: " + s.get(i));
             System.out.println("INDIRIZZO MAC: " + c.get(i));
       }
     }//fine controllo
}