package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.pires.obd.commands.SpeedCommand;
import com.github.pires.obd.commands.control.VinCommand;
import com.github.pires.obd.commands.engine.RPMCommand;
import com.github.pires.obd.commands.fuel.FindFuelTypeCommand;
import com.github.pires.obd.commands.fuel.FuelLevelCommand;
import com.github.pires.obd.commands.protocol.EchoOffCommand;
import com.github.pires.obd.commands.protocol.LineFeedOffCommand;
import com.github.pires.obd.commands.protocol.SelectProtocolCommand;
import com.github.pires.obd.commands.protocol.TimeoutCommand;
import com.github.pires.obd.commands.temperature.AmbientAirTemperatureCommand;
import com.github.pires.obd.commands.temperature.EngineCoolantTemperatureCommand;
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
        VinCommand vinCommand;
        SpeedCommand speedCommand;
        AmbientAirTemperatureCommand ambientAirTemperatureCommand;
        FindFuelTypeCommand findFuelTypeCommand;
        EngineCoolantTemperatureCommand engineCoolantTemperatureCommand;
        FuelLevelCommand fuelLevelCommand;
        //DtcNumberCommand dtcNumberCommand;
        int i;
        TextView textViewRpm, textViewSpeed, textViewAmbieAirTemperature, textViewVin, textViewengineCoolantTemperature;
        TextView textViewFindFuelType, textViewDtcNumber, textViewfuelLevel;
        //textViewMassAirFlow;
        TextView textViewTempMotore;

        public void inizializzaOBD ()
        {
            i=0;
            fuelLevelCommand = new FuelLevelCommand();
            //dtcNumberCommand = new DtcNumberCommand();
            findFuelTypeCommand = new FindFuelTypeCommand();
            //textViewDtcNumber = findViewById(R.id.DTC);
            textViewTempMotore = findViewById(R.id.tempMotoreDegress);
            textViewFindFuelType = findViewById(R.id.carburante);
            textViewfuelLevel = findViewById(R.id.carburante2);
            //massAirFlowCommand = new MassAirFlowCommand();//
            //textViewMassAirFlow = findViewById(R.id.massAirFlowg_s);
            engineCoolantTemperatureCommand = new EngineCoolantTemperatureCommand();//temp regrigerante
            textViewengineCoolantTemperature = findViewById(R.id.tempRefrigeranteDegrees);
            rpmCommand = new RPMCommand(); //giri motore
            textViewRpm = findViewById(R.id.rpm);
            speedCommand = new SpeedCommand();//velocità
            textViewSpeed = findViewById(R.id.speed);
            ambientAirTemperatureCommand = new AmbientAirTemperatureCommand();//temp ambientale
            textViewAmbieAirTemperature = findViewById(R.id.tempOut);
            vinCommand = new VinCommand();//comando vin auto
            textViewVin = findViewById(R.id.tempMotoreDegress);
            try {
                new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(1000);
                new LineFeedOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(500);
                new TimeoutCommand(125).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(500);
                new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(500);
                new AmbientAirTemperatureCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(500);
            } catch (Exception e) {
                // handle errors
            }
        }
        public void run()
        {
            try {
                vinCommand.run(socket.getInputStream(), socket.getOutputStream());
                textViewVin.setText(vinCommand.getFormattedResult());
                engineCoolantTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());
                textViewengineCoolantTemperature.setText(engineCoolantTemperatureCommand.getFormattedResult());
                fuelLevelCommand.run(socket.getInputStream(), socket.getOutputStream());
                textViewfuelLevel.setText(fuelLevelCommand.getFormattedResult());
                //findFuelTypeCommand.run(socket.getInputStream(), socket.getOutputStream());
                //textViewFindFuelType.setText(findFuelTypeCommand.getFormattedResult());

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (true)
            {
                if (i!=25)
                {
                    try {
                        rpmCommand.run(socket.getInputStream(), socket.getOutputStream());
                        speedCommand.run(socket.getInputStream(), socket.getOutputStream());

                        //massAirFlowCommand.run(socket.getInputStream(), socket.getOutputStream());
                        //dtcNumberCommand.run(socket.getInputStream(), socket.getOutputStream());

                        textViewRpm.setText(rpmCommand.getFormattedResult());
                        textViewSpeed.setText(speedCommand.getFormattedResult());
                        //textViewMassAirFlow.setText(massAirFlowCommand.getFormattedResult());
                        //textViewDtcNumber.setText(dtcNumberCommand.getFormattedResult());
                        i++;
                        Thread.sleep(300);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (i==25)
                {
                    i=0;
                    info();
                }
            }
        }

        public void info ()
        {
            try {
                //ambientAirTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());
                //textViewAmbieAirTemperature.setText(ambientAirTemperatureCommand.getFormattedResult());
                engineCoolantTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());
                textViewengineCoolantTemperature.setText(engineCoolantTemperatureCommand.getFormattedResult());
                fuelLevelCommand.run(socket.getInputStream(), socket.getOutputStream());
                textViewfuelLevel.setText(fuelLevelCommand.getFormattedResult());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}