package com.example.progetto_sistematica;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class DTC extends AppCompatActivity {

    private Method dtc;
    private String sDTC="";
    private TextView dtcNumber;
    private ArrayList<String> codiciErorre = new ArrayList<>();
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtc);
        toolbar = (Toolbar) findViewById(R.id.toolbarDTC);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        try {
            dtc = ListaComandi.class.getMethod("troublecode");
            sDTC = String.valueOf(dtc.invoke(OBDActivity.listaComandi));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        dtcNumber = findViewById(R.id.dtcView);

        String commandRead2 = sDTC;
        commandRead2 = commandRead2.substring(1,commandRead2.length()-1);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            DTC.this.finish();
            Intent startNewActivity = new Intent (this, OBDActivity.class);
            startActivity(startNewActivity);
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            DTC.this.finish();
            Intent startNewActivity = new Intent (this, OBDActivity.class);
            startActivity(startNewActivity);
        }
        return super.onKeyDown(keyCode, event);
    }
}
