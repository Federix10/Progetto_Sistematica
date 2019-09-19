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

    private static BluetoothSocket socket = GlobalApplication.getSocket();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obd_activity);

    }

    @Override
    public void onStart() {
        super.onStart();
        DataOBD dataOBD = new DataOBD();
        dataOBD.inizializzaOBD();
        dataOBD.start();
    }

    public class DataOBD extends Thread {
        //MassAirFlowCommand massAirFlowCommand;
        RPMCommand rpmCommand;
        SpeedCommand speedCommand;
        //AmbientAirTemperatureCommand ambientAirTemperatureCommand;
        //FindFuelTypeCommand findFuelTypeCommand;
        //EngineCoolantTemperatureCommand engineCoolantTemperatureCommand;
        //FuelLevelCommand fuelLevelCommand;
        //DtcNumberCommand dtcNumberCommand;

        TextView textViewRpm,textViewSpeed;
        //TextView textViewAmbieAirTemperature, textViewFindFuelType, textViewMassAirFlow, textViewDtcNumber, textViewfuelLevel, textViewengineCoolantTemperature;
        public DataOBD()
        {
            rpmCommand = new RPMCommand(); //giri motore
            speedCommand = new SpeedCommand();//velocità
            //fuelLevelCommand = new FuelLevelCommand();
            //ambientAirTemperatureCommand = new AmbientAirTemperatureCommand();
            //dtcNumberCommand = new DtcNumberCommand();
            //engineCoolantTemperatureCommand = new EngineCoolantTemperatureCommand();
            //findFuelTypeCommand = new FindFuelTypeCommand();
            //massAirFlowCommand = new MassAirFlowCommand();
            textViewRpm = findViewById(R.id.rpm);
            textViewSpeed = findViewById(R.id.speed);
            //textViewAmbieAirTemperature = findViewById(R.id.tempOut);
            //textViewDtcNumber = findViewById(R.id.DTC);
            //textViewFindFuelType = findViewById(R.id.carburante);
            //textViewMassAirFlow = findViewById(R.id.percBatteria2);
            //textViewfuelLevel = findViewById(R.id.carburante2);
            //textViewengineCoolantTemperature = findViewById(R.id.tempRefrigeranteDegrees2);
        }

        public void inizializzaOBD ()
        {
            try {
                new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                new LineFeedOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                new TimeoutCommand(125).run(socket.getInputStream(), socket.getOutputStream());
                new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
                new AmbientAirTemperatureCommand().run(socket.getInputStream(), socket.getOutputStream());
            } catch (Exception e) {
                // handle errors
            }
        }
        public void run()
        {
            /*try {
                findFuelTypeCommand.run(socket.getInputStream(), socket.getOutputStream());
                textViewFindFuelType.setText(findFuelTypeCommand.getFormattedResult());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            while (true)
            {
                try {
                    rpmCommand.run(socket.getInputStream(), socket.getOutputStream());
                    speedCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //ambientAirTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //massAirFlowCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //dtcNumberCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //engineCoolantTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //fuelLevelCommand.run(socket.getInputStream(), socket.getOutputStream());
                    //setText
                    textViewSpeed.setText(speedCommand.getFormattedResult());
                    textViewRpm.setText(rpmCommand.getFormattedResult());
                    //textViewAmbieAirTemperature.setText(ambientAirTemperatureCommand.getFormattedResult());
                    //textViewDtcNumber.setText(dtcNumberCommand.getFormattedResult());
                    //textViewMassAirFlow.setText(massAirFlowCommand.getFormattedResult());
                    //textViewAmbieAirTemperature.setText(findFuelTypeCommand.getFormattedResult());
                    //textViewfuelLevel.setText(fuelLevelCommand.getFormattedResult());
                    //textViewengineCoolantTemperature.setText(engineCoolantTemperatureCommand.getFormattedResult());
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