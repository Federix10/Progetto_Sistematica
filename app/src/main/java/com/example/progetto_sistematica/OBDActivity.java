package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.pires.obd.commands.SpeedCommand;
import com.github.pires.obd.commands.engine.RPMCommand;
import com.github.pires.obd.commands.protocol.EchoOffCommand;
import com.github.pires.obd.commands.protocol.LineFeedOffCommand;
import com.github.pires.obd.commands.protocol.SelectProtocolCommand;
import com.github.pires.obd.commands.protocol.TimeoutCommand;
import com.github.pires.obd.commands.temperature.AmbientAirTemperatureCommand;
import com.github.pires.obd.enums.ObdProtocols;

import java.io.IOException;

public class OBDActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obd);
    }
    @Override
    public void onStart()
    {
        super.onStart();
        BluetoothSocket socket=GlobalApplication.getSocket();
        try {
            new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
            new LineFeedOffCommand().run(socket.getInputStream(), socket.getOutputStream());
            new TimeoutCommand(125).run(socket.getInputStream(), socket.getOutputStream());
            new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
            new AmbientAirTemperatureCommand().run(socket.getInputStream(), socket.getOutputStream());
        } catch (Exception e) {
            // handle errors
        }
        RPMCommand rpmCommand = new RPMCommand(); //giri motore
        SpeedCommand speedCommand = new SpeedCommand();//velocità
        while (!Thread.currentThread().isInterrupted())
        {
            try {
                rpmCommand.run(socket.getInputStream(), socket.getOutputStream());
                speedCommand.run(socket.getInputStream(), socket.getOutputStream());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            TextView textViewSpeed = findViewById(R.id.speed);
            TextView textViewRpm = findViewById(R.id.rpm);
            textViewSpeed.setText(speedCommand.getFormattedResult()+" Km/h");
            textViewRpm.setText(rpmCommand.getFormattedResult()+" rpm");
        }
    }

}
