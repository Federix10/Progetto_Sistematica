package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import br.ufrn.imd.obd.commands.control.DtcNumberCommand;

public class DTC extends AppCompatActivity {

    Method dtc;
    ListaComandi listaComandi;
    String sDTC="";
    TextView dtcNumber;
    ArrayList<String> codiciErorre = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtc);
        listaComandi = new ListaComandi(GlobalApplication.getSocket());
        try {
            dtc = ListaComandi.class.getMethod("troublecode");
            sDTC = String.valueOf(dtc.invoke(listaComandi));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        dtcNumber = findViewById(R.id.dtcView);

        String commandRead2 = sDTC;
        commandRead2 = commandRead2.substring(1,commandRead2.length()-1);
        //dtcNumber.setText(commandRead2);
        int index = commandRead2.indexOf(",");
        while (true)
        {
            if(index>0)
            {
                String s = commandRead2.substring(0,index);
                codiciErorre.add(s);
                commandRead2 = commandRead2.substring(index+1);
                index = commandRead2.indexOf(",");
            }
            else
            {
                codiciErorre.add(commandRead2);
                break;
            }
        }
        for (int i=0;i<codiciErorre.size();i++)
        {
            String error = ErrorCodeOBD.getError(codiciErorre.get(i));
            dtcNumber.append(error+"\n");
        }

    }



    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            DTC.this.finish();
            Intent startNewActivity = new Intent (this, OBDActivity.class);
            startActivity(startNewActivity);
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
