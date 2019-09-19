package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.pires.obd.commands.SpeedCommand;
import com.github.pires.obd.commands.control.DtcNumberCommand;
import com.github.pires.obd.commands.engine.MassAirFlowCommand;
import com.github.pires.obd.commands.engine.RPMCommand;
import com.github.pires.obd.commands.fuel.FindFuelTypeCommand;
import com.github.pires.obd.commands.fuel.FuelLevelCommand;
import com.github.pires.obd.commands.protocol.EchoOffCommand;
import com.github.pires.obd.commands.protocol.LineFeedOffCommand;
import com.github.pires.obd.commands.protocol.ObdResetCommand;
import com.github.pires.obd.commands.protocol.SelectProtocolCommand;
import com.github.pires.obd.commands.protocol.SpacesOffCommand;
import com.github.pires.obd.commands.protocol.TimeoutCommand;
import com.github.pires.obd.commands.temperature.AmbientAirTemperatureCommand;
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
        MassAirFlowCommand massAirFlowCommand;
        RPMCommand rpmCommand;
        SpeedCommand speedCommand;
        AmbientAirTemperatureCommand ambientAirTemperatureCommand;
        FindFuelTypeCommand findFuelTypeCommand;
        FuelLevelCommand fuelLevelCommand;
        DtcNumberCommand dtcNumberCommand;
        TextView textViewRpm,textViewSpeed,textViewAmbieAirTemperature, textViewFindFuelType, textViewMassAirFlow, textViewDtcNumber, textViewfuelLevel;
        public DatiOBD ()
        {
            rpmCommand = new RPMCommand(); //giri motore
            speedCommand = new SpeedCommand();//velocità
            fuelLevelCommand = new FuelLevelCommand();
            ambientAirTemperatureCommand = new AmbientAirTemperatureCommand();
            dtcNumberCommand = new DtcNumberCommand();
            //findFuelTypeCommand = new FindFuelTypeCommand();
            //massAirFlowCommand = new MassAirFlowCommand();
            textViewRpm = findViewById(R.id.rpm);
            textViewSpeed = findViewById(R.id.speed);
            textViewAmbieAirTemperature = findViewById(R.id.tempOut);
            textViewDtcNumber = findViewById(R.id.DTC);
            //textViewFindFuelType = findViewById(R.id.carburante);
            //textViewMassAirFlow = findViewById(R.id.percBatteria2);
            textViewfuelLevel = findViewById(R.id.carburante2);
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
                    ambientAirTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //massAirFlowCommand.run(socket.getInputStream(), socket.getOutputStream());
                    dtcNumberCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //findFuelTypeCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //fuelLevelCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //setText
                    textViewSpeed.setText(speedCommand.getFormattedResult());
                    textViewRpm.setText(rpmCommand.getFormattedResult());
                    textViewAmbieAirTemperature.setText(ambientAirTemperatureCommand.getFormattedResult());
                    textViewDtcNumber.setText(dtcNumberCommand.getFormattedResult());
                    //textViewMassAirFlow.setText(massAirFlowCommand.getFormattedResult());
                    //textViewAmbieAirTemperature.setText(findFuelTypeCommand.getFormattedResult());
                    //textViewfuelLevel.setText(fuelLevelCommand.getFormattedResult());
                    //Thread.sleep(200);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}