package com.example.progetto_sistematica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MessageActivity extends AppCompatActivity {

    Button btnWrite;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public void scrivi(View view) {
        if (GlobalApplication.getAT()==1 && GlobalApplication.getCT()==0)
        {
            if (GlobalApplication.getServerSocket() != null) {
                System.out.println("Device: " + GlobalApplication.getDevice() + " Socket: " + GlobalApplication.getServerSocket());
                MyBluetoothService.ConnectedThread myBluetoothServiceThread = new MyBluetoothService.ConnectedThread(GlobalApplication.getServerSocket());
                byte[] bytes = editText.getText().toString().getBytes();
                myBluetoothServiceThread.write(bytes);
                String string = String.valueOf(editText.getText());
                textView.setText(string);
                editText.setText("");
            } else {
                System.out.println("Non va");
            }
        }
        else if (GlobalApplication.getCT()==1 && GlobalApplication.getAT()==0)
        {
            if (GlobalApplication.getSocket() != null) {
                System.out.println("Device: " + GlobalApplication.getDevice() + " Socket: " + GlobalApplication.getSocket());
                MyBluetoothService.ConnectedThread myBluetoothServiceThread = new MyBluetoothService.ConnectedThread(GlobalApplication.getSocket());
                byte[] bytes = editText.getText().toString().getBytes();
                myBluetoothServiceThread.write(bytes);
                String string = String.valueOf(editText.getText());
                textView.setText(string);
                editText.setText("");
            } else {
                System.out.println("Non va");
            }
        }
    }
    @Override
    public void onStart()
    {
        super.onStart();
        btnWrite = findViewById(R.id.btnScrivi);
        editText = findViewById(R.id.scriviTesto);
        textView = findViewById(R.id.mostraTesto);
        //MyBluetoothService.ConnectedThread myBluetoothServiceThread = new MyBluetoothService.ConnectedThread(GlobalApplication.getSocket());
        //myBluetoothServiceThread.start();
    }
        //connectedThread.write(bytes);
        //byte[] bytes = editText.getText().toString().getBytes(Charset.defaultCharset());

        //System.out.println("Bytes: "+bytes);
        //String string = String.valueOf(scriviTesto.getText());
        //String string=String.valueOf(editText.getText());
        //mmOutStream.write(string.getBytes());

    }
