package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

import br.ufrn.imd.obd.commands.engine.MassAirFlowCommand;
import br.ufrn.imd.obd.commands.engine.RPMCommand;
import br.ufrn.imd.obd.commands.engine.SpeedCommand;
import br.ufrn.imd.obd.commands.engine.ThrottlePositionCommand;
import br.ufrn.imd.obd.commands.fuel.FindFuelTypeCommand;
import br.ufrn.imd.obd.commands.fuel.FuelLevelCommand;
import br.ufrn.imd.obd.commands.protocol.EchoOffCommand;
import br.ufrn.imd.obd.commands.protocol.LineFeedOffCommand;
import br.ufrn.imd.obd.commands.protocol.ObdRawCommand;
import br.ufrn.imd.obd.commands.protocol.SelectProtocolCommand;
import br.ufrn.imd.obd.commands.protocol.TimeoutCommand;
import br.ufrn.imd.obd.commands.temperature.AmbientAirTemperatureCommand;
import br.ufrn.imd.obd.commands.temperature.EngineCoolantTemperatureCommand;
import br.ufrn.imd.obd.enums.ObdProtocols;

public class OBDActivity extends AppCompatActivity {

    private static BluetoothSocket socket = GlobalApplication.getSocket();
    DataOBD dataOBD = new DataOBD();
    Comandi comandi;
    EditText editText;
    int delay=150;
    String scomando=null;
    String comandoresult =null;
    Character dec1 =null;
    Character dec2= null;
    RPMCommand rpmCommand;
    ObdRawCommand comando;
    SpeedCommand speedCommand;
    FindFuelTypeCommand findFuelTypeCommand;
    AmbientAirTemperatureCommand ambientAirTemperatureCommand;
    EngineCoolantTemperatureCommand engineCoolantTemperatureCommand;
    FuelLevelCommand fuelLevelCommand;
    MassAirFlowCommand massAirFlowCommand;
    ThrottlePositionCommand throttlePositionCommand;
    int i;
    TextView maf,utilizzo1;
    TextView textViewRpm, textViewPosizioneAcceleratore, textViewSpeed, textViewAmbieAirTemperature, textViewengineCoolantTemperature, textViewFindFuelType, textViewDtcNumber, textViewfuelLevel, textViewConsumoMedio;

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
        OBDActivity.this.finish();
        Context context = GlobalApplication.getAppContext();
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_dtc, null);
        Intent intent = new Intent(context, DTC.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public void setTimeout (View view)
    {
        Editable editable=editText.getText();
        String str_delay = editable.toString();
        delay=Integer.valueOf(str_delay);
    }
    public class DataOBD extends Thread {

        public void inizializzaOBD ()
        {
            i=0;
            comandi = new Comandi();
            throttlePositionCommand = new ThrottlePositionCommand();
            utilizzo1 = findViewById(R.id.utilizzo);
            maf = findViewById(R.id.pressioneGommeBar);
            massAirFlowCommand = new MassAirFlowCommand();
            editText = findViewById(R.id.delayms);
            fuelLevelCommand = new FuelLevelCommand(); //fuel level
            textViewfuelLevel = findViewById(R.id.carburante2);
            comando = new ObdRawCommand("01 11");
            textViewPosizioneAcceleratore= findViewById(R.id.posizioneAcceleratore);
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
            textViewConsumoMedio = findViewById(R.id.consumoMedioLT);
            try {
                new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new LineFeedOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new TimeoutCommand(125).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
            } catch (Exception e) {
                // handle errors
            }
        }
        public void run() {
            comandi.findfuel();
            comandi.fuellevel();
            comandi.ambientair();
            comandi.comandocustomAcceleratore();
            comandi.enginecoolant();
            while (true) {
                if (i != 25) {
                    try {
                        comandi.rpm();
                        comandi.speed();
                        comandi.comandocustomAcceleratore();
                        comandi.maf();
                        comandi.throttleposition();
                        i++;
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (i == 25) {
                    i = 0;
                    comandi.fuellevel();
                    comandi.enginecoolant();
                }
            }
        }
    }

    private class Comandi
    {

        public void rpm() {
            try {
                rpmCommand.run(socket.getInputStream(), socket.getOutputStream()); //rpm
                textViewRpm.setText(rpmCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (textViewRpm.getText()=="") {
                    textViewRpm.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void speed() {
            try {
                speedCommand.run(socket.getInputStream(), socket.getOutputStream()); //velocità
                textViewSpeed.setText(speedCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (textViewSpeed.getText()=="") {
                    textViewSpeed.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void fuellevel() {
            try {
                fuelLevelCommand.run(socket.getInputStream(), socket.getOutputStream());//livello carburante
                textViewfuelLevel.setText(fuelLevelCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (textViewfuelLevel.getText()=="") {
                    textViewfuelLevel.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void enginecoolant() {
            try {
                engineCoolantTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());//temp refrigerante
                textViewengineCoolantTemperature.setText(engineCoolantTemperatureCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (textViewengineCoolantTemperature.getText()=="") {
                    textViewengineCoolantTemperature.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void findfuel() {
            try {
                findFuelTypeCommand.run(socket.getInputStream(), socket.getOutputStream());//find fuel
                textViewFindFuelType.setText(findFuelTypeCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (textViewFindFuelType.getText()=="") {
                    textViewFindFuelType.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void ambientair() {
            try {
                ambientAirTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream());//temperatura ambientale
                textViewAmbieAirTemperature.setText(ambientAirTemperatureCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (textViewAmbieAirTemperature.getText()=="") {
                    textViewAmbieAirTemperature.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void maf() {
            try {
                massAirFlowCommand.run(socket.getInputStream(), socket.getOutputStream());//maf
                maf.setText(massAirFlowCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (maf.getText()=="") {
                    maf.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void throttleposition() {
            try {
                throttlePositionCommand.run(socket.getInputStream(), socket.getOutputStream());//maf
                utilizzo1.setText(throttlePositionCommand.getFormattedResult());
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (utilizzo1.getText()=="") {
                    utilizzo1.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }

        public void comandocustomAcceleratore() {
            try {
                comando.run(socket.getInputStream(), socket.getOutputStream());//posizione acceleratore
                scomando=comando.getFormattedResult();
                dec1 = scomando.charAt(scomando.length() - 2);
                dec2 = scomando.charAt(scomando.length() - 1);
                comandoresult= new StringBuilder().append(dec1).append(dec2).toString();
                int dec = Integer.parseInt(comandoresult, 16);
                scomando = Integer.toString(dec);
                textViewPosizioneAcceleratore.setText(scomando);
            }
            catch (IOException | InterruptedException e) {}
            finally {
                if (textViewPosizioneAcceleratore.getText()=="") {
                    textViewPosizioneAcceleratore.setText("Parametro non corretto");
                    return;
                }
                else{
                    return;
                }
            }
        }
    }
}