package com.example.progetto_sistematica;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import utils.Device;



public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 1;
    BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    public TextView textView;
    Switch aSwitch;
    TextView switchBtn_txtView;
    TextView switchBtnChat_txtView;
    TextView checkConnect;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.checkConnect);
        aSwitch = findViewById(R.id.chatobd);
        switchBtn_txtView = findViewById(R.id.chatobd);
        switchBtnChat_txtView = findViewById(R.id.btnChat);
        checkConnect = findViewById(R.id.checkConnect);
        switchBtn_txtView.setText("CHAT");

        //textView.setText("Disconnesso");

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
        ListView mylistView = findViewById(R.id.listadevice);
        BluetoothDeviceListAdapter2 listAdapter2 = new BluetoothDeviceListAdapter2(getApplicationContext(), R.layout.listitem, list2);
        mylistView.setAdapter(listAdapter2);
        AcceptThread server = new AcceptThread(bluetoothAdapter);
        server.start();

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    switchBtn_txtView.setText("OBD");
                    switchBtnChat_txtView.setText("OBD");
                }
                else {
                    switchBtn_txtView.setText("CHAT");
                    switchBtnChat_txtView.setText("CHAT");
                }
            }
        });
    } //fine on creates

    public void changeActivity(View view)
    {
        if (aSwitch.isChecked()==true)
        {
            Intent startNewActivity = new Intent (this, OBDActivity.class);
            startActivity(startNewActivity);
        }
        else
        {
            Intent startNewActivity = new Intent (this, MessageActivity.class);
            startActivity(startNewActivity);
        }
    }

}//fine MainActivity