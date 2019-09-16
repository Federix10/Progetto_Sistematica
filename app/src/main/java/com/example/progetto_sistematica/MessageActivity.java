package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    //Button btnScrivi = (Button) findViewById(R.id.btnScrivi);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        //TextView textView = (TextView) findViewById(R.id.persona1);
        //textView.setText("Disconnesso"); //set text for text view
    }

    /*public void leggi()
    {
        TextView showText = (TextView)findViewById(R.id.mostraTesto);
    }*/
}
