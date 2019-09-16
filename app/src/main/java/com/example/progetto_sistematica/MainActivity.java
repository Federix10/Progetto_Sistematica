package com.example.progetto_sistematica;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import utils.Device;



public class MainActivity extends AppCompatActivity {
    public static final int MESSAGE_READ = 0;
    public static final int MESSAGE_WRITE = 1;
    public static final int MESSAGE_TOAST = 2;
    private static final int REQUEST_ENABLE_BT = 1;
    BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    private int CT=0;
    public TextView textView;
    public BluetoothSocket socket;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.checkConnect);
        //impostaDisconnesso();
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
        List<Device> list2 = new ArrayList<Device>();
        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
        if (pairedDevices.size() > 0) {
            for (BluetoothDevice device : pairedDevices) {
                Device d = new Device(device.getName(), device.getAddress());
                list2.add(d);
            }
        }
        //setContentView(R.layout.activity_main);
        ListView mylistView = (ListView)findViewById(R.id.listadevice);
        BluetoothDeviceListAdapter2 listAdapter2 = new BluetoothDeviceListAdapter2(getApplicationContext(), R.layout.listitem, list2);
        mylistView.setAdapter(listAdapter2);
        AcceptThread Server=new AcceptThread(bluetoothAdapter);
        Server.start();
        //MyBluetoothService mbs = new MyBluetoothService();
        //mbs.start();
    } //fine on creates
    public void impostaDisconnesso()
    {
        //textView.setText("Disconnesso"); //set text for text view
        textView.setText(R.string.Disconnesso); //leave this line to assign a string resource
    }
    public void impostaConnesso()
    {
        //textView.setText("Connesso"); //set text for text view
    }
    public void changeActivity(View view)
    {
        Intent startNewActivity = new Intent (this, MessageActivity.class);
        startActivity(startNewActivity);
    }
    public void changeText(View view)
    {
        //textView.setText("Connesso"); //set text for text view
        textView.setText(R.string.Connesso);
    }
    /*public void scrivi(View view) {
        connectedThread = new ConnectedThread(socket);
        setContentView(R.layout.activity_message);
        EditText editText = (EditText) findViewById(R.id.scriviTesto);
        TextView textViews = (TextView) findViewById(R.id.mostraTesto);
        String string = String.valueOf(editText.getText());
        textViews.setText(string);
        byte[] bytes = editText.getText().toString().getBytes();
        connectedThread.write(bytes);
        //byte[] bytes = editText.getText().toString().getBytes(Charset.defaultCharset());
        //mmOutStream.write(bytes);
        //System.out.println("Bytes: "+bytes);
        //String string = String.valueOf(scriviTesto.getText());
        //String string=String.valueOf(editText.getText());
        //mmOutStream.write(string.getBytes());

    }*/
}//fine MainActivity