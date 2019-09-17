package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MessageActivity extends AppCompatActivity {

    private BluetoothSocket mmSocket;
    public static final int MESSAGE_READ = 0;
    public static final int MESSAGE_WRITE = 1;
    public static final int MESSAG_TOAST = 2;
    ConnectedThread connectedThread;
    BluetoothSocket socket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public void scrivi(View view) {

        connectedThread = new ConnectedThread(socket);
        EditText editText = (EditText) findViewById(R.id.scriviTesto);
        TextView textView = (TextView) findViewById(R.id.mostraTesto);
        String string = String.valueOf(editText.getText());
        editText.setText("");
        textView.setText(string);
        byte[] bytes = editText.getText().toString().getBytes();
        connectedThread.write(bytes);
        //connectedThread.write(bytes);
        //byte[] bytes = editText.getText().toString().getBytes(Charset.defaultCharset());

        //System.out.println("Bytes: "+bytes);
        //String string = String.valueOf(scriviTesto.getText());
        //String string=String.valueOf(editText.getText());
        //mmOutStream.write(string.getBytes());

    }
    public void getRisorse(BluetoothSocket btsocket)
    {
        socket=btsocket;
    }
}
