package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class MessageActivity extends AppCompatActivity {

    private BluetoothSocket mmSocket;
    public static final int MESSAGE_READ = 0;
    public static final int MESSAGE_WRITE = 1;
    public static final int MESSAGE_TOAST = 2;
    OutputStream mmOutStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public void scrivi(View view) {
        EditText editText = (EditText) findViewById(R.id.scriviTesto);
        TextView textView = (TextView) findViewById(R.id.mostraTesto);
        String string = String.valueOf(editText.getText());
        textView.setText(string);
        //byte[] bytes = editText.getText().toString().getBytes();
        //connectedThread.write(bytes);
        //byte[] bytes = editText.getText().toString().getBytes(Charset.defaultCharset());
        //mmOutStream.write(bytes);
        //System.out.println("Bytes: "+bytes);
        //String string = String.valueOf(scriviTesto.getText());
        //String string=String.valueOf(editText.getText());
        //mmOutStream.write(string.getBytes());

    }
}
