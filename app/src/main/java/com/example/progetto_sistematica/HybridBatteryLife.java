package com.example.progetto_sistematica;

import br.ufrn.imd.obd.commands.ObdCommand;
import br.ufrn.imd.obd.enums.AvailableCommand;

public class HybridBatteryLife extends ObdCommand {

    float life=0.0f;
    public HybridBatteryLife(String command) {
        super(AvailableCommand.CustomCommand.rawCommand(command));
    }

    @Override
    protected void performCalculations() {
        life = (buffer.get(2) * 100f) / 255f;
    }

    @Override
    public String getFormattedResult() {
        return String.valueOf(life)+ " %";
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(life);
    }

    public Integer getLife()
    {
        return Integer.parseInt(String.valueOf(life));
    }
}
