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

import br.ufrn.imd.obd.commands.control.DtcNumberCommand;

public class DTC extends AppCompatActivity {

    private static BluetoothSocket socket = GlobalApplication.getSocket();
    DtcNumberCommand dtcNumberCommand;
    TextView dtcNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtc);
        dtcNumberCommand = new DtcNumberCommand();
        dtcNumber = findViewById(R.id.dtcView);
    }
    public void dtc (View view)
    {
        try {
            dtcNumberCommand.run(socket.getInputStream(), socket.getOutputStream());
            dtcNumber.setText(dtcNumberCommand.getFormattedResult());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            DTC.this.finish();
            Context context = GlobalApplication.getAppContext();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(R.layout.obd_activity, null);
            Intent intent = new Intent(context, OBDActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
