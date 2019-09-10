package com.example.progetto_sistematica;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import utils.BluetoothDeviceListAdapter2;
import utils.Device;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 1;

    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) { //se il dispositivo non supporta il bluetooth viene mostrato un alert di errore
            /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Il dispositivo non supporta il bluetooth")
                    .setTitle("ERRORE");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {}
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();*/
        }

        if (!bluetoothAdapter.isEnabled()) { //se il bluetooth è disattivato viene mostrata una finestra che permette di attivarlo
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }
        //while(!bluetoothAdapter.isEnabled());
        List<Device> list2 = new ArrayList<Device>();
        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
        if (pairedDevices.size() > 0) {
            for (BluetoothDevice device : pairedDevices) {
                Device d = new Device(device.getName(), device.getAddress());
                //System.out.println("D: "+d);
                //System.out.println("Dispositivo: "+device.getName() + " " + device.getAddress());
                list2.add(d);
                System.out.println("List2: "+list2);
            }
        }
        //setContentView(R.layout.activity_main);
        ListView mylistView = (ListView)findViewById(R.id.lista);
        BluetoothDeviceListAdapter2 listAdapter2 = new BluetoothDeviceListAdapter2(getApplicationContext(), R.layout.listitem, list2);
        //mylistView.setAdapter(listAdapter2);
    } //fine on create

     public void controllo(){ //gestione dei dispositivi associati

         List<Device> list2 = new ArrayList<Device>();
         Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
         if (pairedDevices.size() > 0) {
             for (BluetoothDevice device : pairedDevices) {
                 Device d = new Device(device.getName(), device.getAddress());
                list2.add(d);
             }
         }
         setContentView(R.layout.activity_main);
         ListView mylistView = (ListView)findViewById(R.id.lista);
         BluetoothDeviceListAdapter2 listAdapter2 = new BluetoothDeviceListAdapter2(getApplicationContext(), R.layout.listitem, list2);
         mylistView.setAdapter(listAdapter2);

         /*List<String> s = new ArrayList<String>(); //nomi
         List<String> c = new ArrayList<String>(); //indirizzi

         for(int i=0;i<s.size();i++) {
             System.out.println("NOME DEVICE: " + s.get(i));
             System.out.println("INDIRIZZO MAC: " + c.get(i));
       }*/
     }//fine controllo
}