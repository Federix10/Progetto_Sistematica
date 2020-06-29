package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;

import java.io.IOException;

import br.ufrn.imd.obd.commands.control.DtcNumberCommand;
import br.ufrn.imd.obd.commands.control.EquivalentRatioCommand;
import br.ufrn.imd.obd.commands.control.IgnitionMonitorCommand;
import br.ufrn.imd.obd.commands.control.ModuleVoltageCommand;
import br.ufrn.imd.obd.commands.control.TroubleCodesCommand;
import br.ufrn.imd.obd.commands.control.VinCommand;
import br.ufrn.imd.obd.commands.engine.LoadCommand;
import br.ufrn.imd.obd.commands.engine.MassAirFlowCommand;
import br.ufrn.imd.obd.commands.engine.OilTempCommand;
import br.ufrn.imd.obd.commands.engine.RPMCommand;
import br.ufrn.imd.obd.commands.engine.RuntimeCommand;
import br.ufrn.imd.obd.commands.engine.SpeedCommand;
import br.ufrn.imd.obd.commands.engine.ThrottlePositionCommand;
import br.ufrn.imd.obd.commands.fuel.AirFuelRatioCommand;
import br.ufrn.imd.obd.commands.fuel.ConsumptionRateCommand;
import br.ufrn.imd.obd.commands.fuel.FindFuelTypeCommand;
import br.ufrn.imd.obd.commands.fuel.FuelLevelCommand;
import br.ufrn.imd.obd.commands.fuel.FuelTrimCommand;
import br.ufrn.imd.obd.commands.protocol.ObdRawCommand;
import br.ufrn.imd.obd.commands.protocol.ObdWarmStartCommand;
import br.ufrn.imd.obd.commands.temperature.AirIntakeTemperatureCommand;
import br.ufrn.imd.obd.commands.temperature.AmbientAirTemperatureCommand;
import br.ufrn.imd.obd.commands.temperature.EngineCoolantTemperatureCommand;

public class ListaComandi {

    MassAirFlowCommand massAirFlowCommand = new MassAirFlowCommand();
    ConsumptionRateCommand consumptionRateCommand = new ConsumptionRateCommand();
    FuelLevelCommand fuelLevelCommand = new FuelLevelCommand();
    FindFuelTypeCommand findFuelTypeCommand = new FindFuelTypeCommand();
    EngineCoolantTemperatureCommand engineCoolantTemperatureCommand = new EngineCoolantTemperatureCommand();
    ThrottlePositionCommand throttlePositionCommand = new ThrottlePositionCommand();
    SpeedCommand speedCommand = new SpeedCommand();
    RPMCommand rpmCommand = new RPMCommand();
    AmbientAirTemperatureCommand ambientAirTemperatureCommand = new AmbientAirTemperatureCommand();
    DtcNumberCommand dtcNumberCommand = new DtcNumberCommand();
    ModuleVoltageCommand moduleVoltageCommand = new ModuleVoltageCommand();
    LoadCommand loadCommand = new LoadCommand();
    TroubleCodesCommand troubleCodesCommand = new TroubleCodesCommand();
    EquivalentRatioCommand equivalentRatioCommand = new EquivalentRatioCommand();
    VinCommand vinCommand = new VinCommand();
    AirFuelRatioCommand airFuelRatioCommand = new AirFuelRatioCommand();
    IgnitionMonitorCommand ignitionMonitorCommand = new IgnitionMonitorCommand();
    FuelTrimCommand fuelTrimCommand = new FuelTrimCommand();
    AirIntakeTemperatureCommand airIntakeTemperatureCommand = new AirIntakeTemperatureCommand();
    RuntimeCommand runtimeCommand = new RuntimeCommand();
    OilTempCommand oilTempCommand = new OilTempCommand();
    ObdWarmStartCommand obdWarmStartCommand = new ObdWarmStartCommand();

    String sCustomCommand=GlobalApplication.getValuePreferences("customCommand");
    ObdRawCommand customCommand = new ObdRawCommand(sCustomCommand);
    BluetoothSocket socket;

    public ListaComandi(BluetoothSocket socket)
    {
        this.socket=socket;
    }

    public String maf()
    {
        try {
            massAirFlowCommand.run(socket.getInputStream(), socket.getOutputStream()); //maf
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (massAirFlowCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return massAirFlowCommand.getFormattedResult();
            }
        }
    }

    public String consumo()
    {
        try {
            consumptionRateCommand.run(socket.getInputStream(), socket.getOutputStream()); //consumo L/H
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (consumptionRateCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return consumptionRateCommand.getFormattedResult();
            }
        }
    }

    public String fuellevel()
    {
        try {
            fuelLevelCommand.run(socket.getInputStream(), socket.getOutputStream()); //livello carburante
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (fuelLevelCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return fuelLevelCommand.getFormattedResult();
            }
        }
    }

    public String fuellevelcirclebar()
    {
        try {
            fuelLevelCommand.run(socket.getInputStream(), socket.getOutputStream()); //livello carburante
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (fuelLevelCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return fuelLevelCommand.getFormattedResult();
            }
        }
    }

    public String enginetemp()
    {
        try {
            engineCoolantTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream()); //temp motore
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (engineCoolantTemperatureCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return engineCoolantTemperatureCommand.getFormattedResult();
            }
        }
    }

    public String enginetempcirclebar()
    {
        try {
            engineCoolantTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream()); //temp motore circle bar
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (engineCoolantTemperatureCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return engineCoolantTemperatureCommand.getFormattedResult();
            }
        }
    }

    public String throttleposition()
    {
        try {
            throttlePositionCommand.run(socket.getInputStream(), socket.getOutputStream()); //posizione accelleratore
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (throttlePositionCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return throttlePositionCommand.getFormattedResult();
            }
        }
    }

    public String ambientair()
    {
        try {
            ambientAirTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream()); //posizione accelleratore
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (ambientAirTemperatureCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return ambientAirTemperatureCommand.getFormattedResult();
            }
        }
    }

    public String speed()
    {
        try {
            speedCommand.run(socket.getInputStream(), socket.getOutputStream()); //velocità
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (speedCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return speedCommand.getFormattedResult();
            }
        }
    }

    public String rpm()
    {
        try {
            rpmCommand.run(socket.getInputStream(), socket.getOutputStream()); //rpm
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (rpmCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return rpmCommand.getFormattedResult();
            }
        }
    }

    public String rpmcirclebar()
    {
        try {
            rpmCommand.run(socket.getInputStream(), socket.getOutputStream()); //rpm circle bar
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (rpmCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return rpmCommand.getFormattedResult();
            }
        }
    }

    public String dtc()
    {
        try {
            dtcNumberCommand.run(socket.getInputStream(), socket.getOutputStream()); //codice errore (DTC)
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (dtcNumberCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return dtcNumberCommand.getFormattedResult();
            }
        }
    }

    public String volt()
    {
        try {
            moduleVoltageCommand.run(socket.getInputStream(), socket.getOutputStream()); //volt batteria
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (moduleVoltageCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return moduleVoltageCommand.getFormattedResult();
            }
        }
    }

    public String fueltype()
    {
        try {
            findFuelTypeCommand.run(socket.getInputStream(), socket.getOutputStream()); //tipo carburante
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (findFuelTypeCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return findFuelTypeCommand.getFormattedResult();
            }
        }
    }

    public String engineload()
    {
        try {
            loadCommand.run(socket.getInputStream(), socket.getOutputStream()); //carico del motore
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (loadCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return loadCommand.getFormattedResult();
            }
        }
    }

    public String troublecode()
    {
        try {
            troubleCodesCommand.run(socket.getInputStream(), socket.getOutputStream()); //codice di errore
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (troubleCodesCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return troubleCodesCommand.getFormattedResult();
            }
        }
    }

    public String equivratio()
    {
        try {
            equivalentRatioCommand.run(socket.getInputStream(), socket.getOutputStream()); //rapporto aria/benzina
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (equivalentRatioCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return equivalentRatioCommand.getFormattedResult();
            }
        }
    }

    public String vin()
    {
        try {
            vinCommand.run(socket.getInputStream(), socket.getOutputStream()); //codice identificatore veicolo
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (vinCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return vinCommand.getFormattedResult();
            }
        }
    }

    public String airfuelratio()
    {
        try {
            airFuelRatioCommand.run(socket.getInputStream(), socket.getOutputStream()); //rapporto aria/benzina
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (airFuelRatioCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return airFuelRatioCommand.getFormattedResult();
            }
        }
    }

    public String ignitionmonitor()
    {
        try {
            ignitionMonitorCommand.run(socket.getInputStream(), socket.getOutputStream()); //controllo motore avviamento
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (ignitionMonitorCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return ignitionMonitorCommand.getFormattedResult();
            }
        }
    }

    public String fueltrim()
    {
        try {
            fuelTrimCommand.run(socket.getInputStream(), socket.getOutputStream()); //carburante bruciato
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (fuelTrimCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return fuelTrimCommand.getFormattedResult();
            }
        }
    }

    public String intakeair()
    {
        try {
            airIntakeTemperatureCommand.run(socket.getInputStream(), socket.getOutputStream()); //temp aria aspirata
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (airIntakeTemperatureCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return airIntakeTemperatureCommand.getFormattedResult();
            }
        }
    }

    public String engineruntime()
    {
        try {
            runtimeCommand.run(socket.getInputStream(), socket.getOutputStream()); //autonomia motore
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (runtimeCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return runtimeCommand.getFormattedResult();
            }
        }
    }

    public String oiltemp()
    {
        try {
            oilTempCommand.run(socket.getInputStream(), socket.getOutputStream()); //temp olio motore
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (oilTempCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return oilTempCommand.getFormattedResult();
            }
        }
    }

    public String warmstart()
    {
        try {
            obdWarmStartCommand.run(socket.getInputStream(), socket.getOutputStream()); //warm start
        } catch (IOException | InterruptedException e) {
        }
        finally {
            if (obdWarmStartCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return obdWarmStartCommand.getFormattedResult();
            }
        }
    }

    public String customcommand()
    {
        try {
            customCommand.run(socket.getInputStream(), socket.getOutputStream());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            if (customCommand.getCalculatedResult()=="") {
                return "Parametro non corretto";
            }
            else{
                return customCommand.getFormattedResult();
            }
        }
    }

}