/*package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.widget.TextView;

import com.github.pires.obd.commands.SpeedCommand;
import com.github.pires.obd.commands.engine.RPMCommand;

import java.io.IOException;

public class DatiOBD extends Thread {
    BluetoothSocket socket;
    RPMCommand rpmCommand;
    SpeedCommand speedCommand;
    TextView textViewRpm;
    TextView textViewSpeed;
    public DatiOBD (BluetoothSocket btsocket)
    {
        socket=btsocket;
        rpmCommand = new RPMCommand(); //giri motore
        speedCommand = new SpeedCommand();//velocità
        textViewRpm = findViewById(R.id.rpm);
        textViewSpeed = findViewById(R.id.speed);
    }
    public void run()
    {
        while (true)
        {
            try {
                rpmCommand.run(socket.getInputStream(), socket.getOutputStream());
                speedCommand.run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(1000);
                System.out.println("Speed: "+speedCommand.getFormattedResult());
                System.out.println("RPM: "+rpmCommand.getFormattedResult());
                textViewSpeed.setText(speedCommand.getFormattedResult());
                textViewRpm.setText(rpmCommand.getFormattedResult());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
*/