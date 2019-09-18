package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.github.pires.obd.commands.SpeedCommand;
import com.github.pires.obd.commands.engine.RPMCommand;
import com.github.pires.obd.commands.protocol.EchoOffCommand;
import com.github.pires.obd.commands.protocol.LineFeedOffCommand;
import com.github.pires.obd.commands.protocol.ObdResetCommand;
import com.github.pires.obd.commands.protocol.SelectProtocolCommand;
import com.github.pires.obd.commands.protocol.SpacesOffCommand;
import com.github.pires.obd.commands.protocol.TimeoutCommand;
import com.github.pires.obd.enums.ObdProtocols;

import java.io.IOException;

public class OBDActivity extends AppCompatActivity {
    private static final long DELAY_FIFTEEN_SECOND = 15000;
    private static final long DELAY_TWO_SECOND = 2000;
    RPMCommand rpmCommand;
    SpeedCommand speedCommand;
    BluetoothSocket socket = GlobalApplication.getSocket();
    TextView textViewSpeed;
    TextView textViewRpm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obd);
    }

    @Override
    public void onStart() {
        super.onStart();
        textViewSpeed = findViewById(R.id.speed);
        textViewRpm = findViewById(R.id.rpm);
    }

    public void inizializza(View view) {
        try {
            Thread.sleep(DELAY_TWO_SECOND);
            final Thread newThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        // this thread is required because in Headunit command.run method block infinitly ,
                        // therefore this thread life is maximum 15 second so that block can be handled.
                        new ObdResetCommand().run(socket.getInputStream(), socket.getOutputStream());
                        Thread.sleep(1000);
                        new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                        Thread.sleep(200);
                        new LineFeedOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                        Thread.sleep(200);
                        new SpacesOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                        Thread.sleep(200);
                        new SpacesOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                        Thread.sleep(200);
                        new TimeoutCommand(125).run(socket.getInputStream(), socket.getOutputStream());
                        //  updateNotification(getString(R.string.searching_protocol));
                        Thread.sleep(200);
                        new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
                        Thread.sleep(200);
                        new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                        //  updateNotification(getString(R.string.searching_supported_sensor));
                        Thread.sleep(200);
                        // checkPid0To20(true);

                    } catch (Exception e) {
                    }

                }
            });

            newThread.start();
            newThread.join(DELAY_FIFTEEN_SECOND);

        } catch (Exception e) {
        }
    }


    public void informazioni(View view) {
        rpmCommand = new RPMCommand(); //giri motore
        speedCommand = new SpeedCommand();//velocità
            try {
                rpmCommand.run(socket.getInputStream(), socket.getOutputStream());
                speedCommand.run(socket.getInputStream(), socket.getOutputStream());
                textViewSpeed.setText(speedCommand.getFormattedResult());
                textViewRpm.setText(rpmCommand.getFormattedResult());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}