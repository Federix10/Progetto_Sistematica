package com.example.progetto_sistematica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MessageActivity extends AppCompatActivity {

    Button btnWrite;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        final Button button = (Button) findViewById(R.id.btnScrivi);
    }

    public void scrivi(View view) {
        if (GlobalApplication.getAT()==1 && GlobalApplication.getCT()==0)
        {
            if (GlobalApplication.getServerSocket() != null) {
                //System.out.println("Device: " + GlobalApplication.getDevice() + " Socket: " + GlobalApplication.getServerSocket());
                MyBluetoothService.ConnectedThread myBluetoothServiceThread = new MyBluetoothService.ConnectedThread(GlobalApplication.getServerSocket());
                byte[] bytes = editText.getText().toString().getBytes();
                myBluetoothServiceThread.write(bytes);
                String string = String.valueOf(editText.getText());
                textView.setText(string);
                editText.setText("");
            } else {
                Toast.makeText(GlobalApplication.getAppContext(), "Non  va", Toast.LENGTH_SHORT).show();
            }
        }
        else if (GlobalApplication.getCT()==1 && GlobalApplication.getAT()==0)
        {
            if (GlobalApplication.getSocket() != null) {
                //System.out.println("Device: " + GlobalApplication.getDevice() + " Socket: " + GlobalApplication.getSocket());
                MyBluetoothService.ConnectedThread myBluetoothServiceThread = new MyBluetoothService.ConnectedThread(GlobalApplication.getSocket());
                byte[] bytes = editText.getText().toString().getBytes();
                myBluetoothServiceThread.write(bytes);
                String string = String.valueOf(editText.getText());
                textView.setText(string);
                editText.setText("");
            } else {
                Toast.makeText(GlobalApplication.getAppContext(), "Non  va", Toast.LENGTH_SHORT).show();
            }
        }
        else if (GlobalApplication.getCT()==0 && GlobalApplication.getAT()==0)
        {
            Toast.makeText(GlobalApplication.getAppContext(), "Non sei connesso a nessun dipossitivo", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onStart()
    {
        super.onStart();
        btnWrite = findViewById(R.id.btnScrivi);
        editText = findViewById(R.id.scriviTesto);
        textView = findViewById(R.id.mostraTesto);
    }
}