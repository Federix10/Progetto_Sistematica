package com.example.progetto_sistematica;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.pires.obd.commands.protocol.EchoOffCommand;
import com.github.pires.obd.commands.protocol.LineFeedOffCommand;
import com.github.pires.obd.commands.protocol.SelectProtocolCommand;
import com.github.pires.obd.commands.protocol.TimeoutCommand;
import com.github.pires.obd.commands.temperature.AmbientAirTemperatureCommand;
import com.github.pires.obd.enums.ObdProtocols;

import java.util.UUID;

public class OBDActivity extends AppCompatActivity {
    private BluetoothSocket socket;
    private BluetoothDevice device;
    UUID MY_UUID=UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obd);
    }
    public void getRisorse(BluetoothDevice btdevice, BluetoothSocket btsocket)
    {
        socket=btsocket;
        device=btdevice;
        comandi();
    }
    public void comandi()
    {
        try {
            new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
            new LineFeedOffCommand().run(socket.getInputStream(), socket.getOutputStream());
            new TimeoutCommand(125).run(socket.getInputStream(), socket.getOutputStream());
            new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
            AmbientAirTemperatureCommand air = new AmbientAirTemperatureCommand();
            air.run(socket.getInputStream(), socket.getOutputStream());
            //new AmbientAirTemperatureCommand().run(socket.getInputStream(), socket.getOutputStream());
        } catch (Exception e) {
            // handle errors
        }
    }

}
