package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    private static final long DELAY_TWO_SECOND = 2000;

    BluetoothSocket socket = GlobalApplication.getSocket();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obd);

    }

    @Override
    public void onStart() {
        super.onStart();
        DatiOBD datiOBD = new DatiOBD();
        datiOBD.inizializzaOBD();
        datiOBD.start();
    }

    public class DatiOBD extends Thread {
        RPMCommand rpmCommand;
        SpeedCommand speedCommand;
        TextView textViewRpm;
        TextView textViewSpeed;
        public DatiOBD ()
        {
            rpmCommand = new RPMCommand(); //giri motore
            speedCommand = new SpeedCommand();//velocità
            textViewRpm = findViewById(R.id.rpm);
            textViewSpeed = findViewById(R.id.speed);
        }

        public void inizializzaOBD ()
        {
            try {
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
                Thread.sleep(200);
                new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
            } catch (Exception e) { }
        }
        public void run()
        {
            while (true)
            {
                try {
                    rpmCommand.run(socket.getInputStream(), socket.getOutputStream());
                    speedCommand.run(socket.getInputStream(), socket.getOutputStream());
                    textViewSpeed.setText(speedCommand.getFormattedResult());
                    textViewRpm.setText(rpmCommand.getFormattedResult());
                    Thread.sleep(500);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}