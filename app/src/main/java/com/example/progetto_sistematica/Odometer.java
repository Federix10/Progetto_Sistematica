package com.example.progetto_sistematica;

import br.ufrn.imd.obd.commands.ObdCommand;
import br.ufrn.imd.obd.enums.AvailableCommand;

public class Odometer extends ObdCommand {

    double km=0.0f;
    public Odometer(String command) {
        super(AvailableCommand.CustomCommand.rawCommand(command));
    }
    @Override
    protected void performCalculations() {
        km = buffer.get(2) * Math.pow(2,24) + buffer.get(3) * Math.pow(2,16) + buffer.get(4) * Math.pow(2,8) + buffer.get(5);
        km = km / 10;
    }

    @Override
    public String getFormattedResult() {
        return String.valueOf(km) + " km";
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(km);
    }

    public double getKm()
    {
        return km;
    }
}
