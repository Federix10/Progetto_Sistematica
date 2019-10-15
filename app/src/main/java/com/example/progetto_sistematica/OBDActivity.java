package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

import br.ufrn.imd.obd.commands.control.VinCommand;
import br.ufrn.imd.obd.commands.engine.RPMCommand;
import br.ufrn.imd.obd.commands.engine.SpeedCommand;
import br.ufrn.imd.obd.commands.fuel.FindFuelTypeCommand;
import br.ufrn.imd.obd.commands.fuel.FuelLevelCommand;
import br.ufrn.imd.obd.commands.protocol.EchoOffCommand;
import br.ufrn.imd.obd.commands.protocol.LineFeedOffCommand;
import br.ufrn.imd.obd.commands.protocol.SelectProtocolCommand;
import br.ufrn.imd.obd.commands.protocol.TimeoutCommand;
import br.ufrn.imd.obd.commands.temperature.AmbientAirTemperatureCommand;
import br.ufrn.imd.obd.commands.temperature.EngineCoolantTemperatureCommand;
import br.ufrn.imd.obd.enums.ObdProtocols;

public class OBDActivity extends AppCompatActivity {

    private static BluetoothSocket socket = GlobalApplication.getSocket();
    DataOBD dataOBD = new DataOBD();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obd_activity);
    }

    @Override
    public void onStart() {
        super.onStart();
        dataOBD.inizializzaOBD();
        dataOBD.start();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //GlobalApplication.setSetCT(0);
            OBDActivity.this.finish();
            Context context = GlobalApplication.getAppContext();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(R.layout.activity_main, null);
            Intent intent = new Intent(context, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void dtcactivity (View view)
    {
        Context context = GlobalApplication.getAppContext();
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_dtc, null);
        Intent intent = new Intent(context, DTC.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public class DataOBD extends Thread {
        RPMCommand rpmCommand;
        VinCommand vinCommand;
        SpeedCommand speedCommand;
        AmbientAirTemperatureCommand ambientAirTemperatureCommand;
        FindFuelTypeCommand findFuelTypeCommand;
        EngineCoolantTemperatureCommand engineCoolantTemperatureCommand;
        FuelLevelCommand fuelLevelCommand;
        int i;
        TextView textViewRpm, textViewSpeed, textViewAmbieAirTemperature, textViewVin, textViewengineCoolantTemperature, textViewFindFuelType, textViewDtcNumber, textViewfuelLevel, textViewConsumoMedio;

        public void inizializzaOBD ()
        {
            i=0;
            fuelLevelCommand = new FuelLevelCommand(); //fuel level
            textViewfuelLevel = findViewById(R.id.carburante2);
            findFuelTypeCommand = new FindFuelTypeCommand(); //find fuel type
            textViewFindFuelType = findViewById(R.id.carburante);
            engineCoolantTemperatureCommand = new EngineCoolantTemperatureCommand();//temp regrigerante
            textViewengineCoolantTemperature = findViewById(R.id.tempRefrigeranteDegrees);
            rpmCommand = new RPMCommand(); //giri motore
            textViewRpm = findViewById(R.id.rpm);
            speedCommand = new SpeedCommand();//velocità
            textViewSpeed = findViewById(R.id.speed);
            ambientAirTemperatureCommand = new AmbientAirTemperatureCommand();//temp ambientale
            textViewAmbieAirTemperature = findViewById(R.id.tempOut);
            vinCommand = new VinCommand();//comando vin auto
            textViewVin = findViewById(R.id.vin);
            textViewConsumoMedio = findViewById(R.id.consumoMedioLT);
            try {
                new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(100);
                new LineFeedOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(100);
                new TimeoutCommand(125).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(100);
                new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(100);
                //new AmbientAirTemperatureCommand().run(socket.getInputStream(), socket.getOutputStream());
                //Thread.sleep(200);
            } catch (Exception e) {
                // handle errors
            }
        }
        public void run()
        {
            /*try {
                findFuelTypeCommand.run(socket.getInputStream(), socket.getOutputStream());
                textViewFindFuelType.setText(findFuelTypeCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }*/
            try {
                vinCommand.run(socket.getInputStream(), socket.getOutputStream());//vin
                textViewVin.setText(vinCommand.getFormattedResult());
                info();
            } catch (IOException | InterruptedException e) {
               e.printStackTrace();
            }
            /*try
            {
                findFuelTypeCommand.run(socket.getInputStream(), socket.getOutputStream());
                textViewFindFuelType.setText(findFuelTypeCommand.getFormattedResult());
            } catch (InterruptedException | IOException e) {
                textViewFindFuelType.setText("Errore");
                continue;
                e.printStackTrace();
            }*/
            while (true)
            {
                if (i!=25)
                {
                    try {
                        rpmCommand.run(socket.getInputStream(), socket.getOutputStream()); //rpm
                        textViewRpm.setText(rpmCommand.getFormattedResult());
                        speedCommand.run(socket.getInputStream(), socket.getOutputStream()); //velocità
                        textViewSpeed.setText(speedCommand.getFormattedResult());
                        i++;
                        //Thread.sleep(300);
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
                ambientAirTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());//temperatura ambientale
                textViewAmbieAirTemperature.setText(ambientAirTemperatureCommand.getFormattedResult());
                engineCoolantTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());//temp refrigerante
                textViewengineCoolantTemperature.setText(engineCoolantTemperatureCommand.getFormattedResult());
                fuelLevelCommand.run(socket.getInputStream(), socket.getOutputStream());//livello carburante
                textViewfuelLevel.setText(fuelLevelCommand.getFormattedResult());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}