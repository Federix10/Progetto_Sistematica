package com.example.progetto_sistematica;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import utils.Device;


public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 1;
    BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    public static Switch aSwitch;
    TextView switchBtn_txtView;
    TextView switchBtnChat_txtView;
    BluetoothManager bluetoothManager;
    BluetoothDevice btdevice;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkFirstRun();
        GlobalApplication.aggiungiComandi();
        GlobalApplication.aggiungiCommand();
        GlobalApplication.aggiungiProgressBarComandi();
        GlobalApplication.aggiungiProgressBarCommand();
        if (ReadOBD()=="")
        {
            GlobalApplication.setOBD(0);
        }
        else if (ReadOBD()!="")
        {
            GlobalApplication.setOBD(Integer.parseInt(ReadOBD()));
        }

        if (Read() == "")
        {
            setContentView(R.layout.activity_main);
            aSwitch = findViewById(R.id.chatobd);
            switchBtn_txtView = findViewById(R.id.chatobd);
            switchBtnChat_txtView = findViewById(R.id.btnChat);
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
            aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        switchBtn_txtView.setText("OBD");
                        switchBtnChat_txtView.setText("OBD");
                    }
                    else {
                        switchBtn_txtView.setText("OBD2");
                        switchBtnChat_txtView.setText("OBD2");
                    }
                }
            });
        }
        else if (Read() != "")
        {
            bluetoothManager = (BluetoothManager)getSystemService(Context.BLUETOOTH_SERVICE);
            btdevice = bluetoothManager.getAdapter().getRemoteDevice(Read());
            do {
                Toast.makeText(MainActivity.this, "Connessione a: "+ btdevice.getName() + " " + btdevice.getAddress(), Toast.LENGTH_LONG).show();
                ConnectThread client = new ConnectThread(btdevice);
                client.start();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (GlobalApplication.getCT()==0)
                    Toast.makeText(MainActivity.this, "Riconnessione in corso a :"+ btdevice.getName() + " " + btdevice.getAddress(), Toast.LENGTH_LONG).show();
            }
            while (GlobalApplication.getCT()!=1);
            MainActivity.this.finish();
        }

    } //fine on creates

    public void changeActivity(View view)
    {
        if (GlobalApplication.getCT()==0 && GlobalApplication.getAT()==0)
        {
        Toast.makeText(GlobalApplication.getAppContext(), "Non sei connesso a nessun dipossitivo", Toast.LENGTH_SHORT).show();
        }
        else if (aSwitch.isChecked())
        {
            MainActivity.this.finish();
            Intent startNewActivity = new Intent (this, Speed.class);
            startActivity(startNewActivity);
        }
        else
        {
            MainActivity.this.finish();
            Intent startNewActivity = new Intent (this, OBDActivity.class);
            startActivity(startNewActivity);
        }
    }

    public String Read()
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

    public String ReadOBD()
    {
        String obd="";
        try {
            FileInputStream fin = openFileInput("obd.txt");
            int c;
            while( (c = fin.read()) != -1){
                obd = obd + Character.toString((char)c);
            }
            Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
        }
        return obd;
    }

    public void checkFirstRun()
    {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
                boolean isFirstStart = getPrefs.getBoolean("firstStart", true);
                if (isFirstStart) {
                    SharedPreferences.Editor e = getPrefs.edit();
                    e.putBoolean("firstStart", false);
                    WriteNewComandi();
                    e.apply();
                }
            }
        });
        t.start();
        Toast.makeText(MainActivity.this, "FirstRun", Toast.LENGTH_SHORT).show();
    }

    public void WriteNewComandi()
    {
        String data = "0,1,2,3,4,5,0";
        try {
            FileOutputStream fOut = openFileOutput("command.txt", MODE_PRIVATE);
            fOut.write(data.getBytes());
            fOut.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        data="";
        try {
            FileOutputStream fOut = openFileOutput("customcommand.txt", MODE_PRIVATE);
            fOut.write(data.getBytes());
            fOut.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}//fine MainActivity