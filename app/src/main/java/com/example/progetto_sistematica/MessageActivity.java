package com.example.progetto_sistematica;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MessageActivity extends AppCompatActivity {

    Button btnWrite;
    EditText editText;
    TextView textView;

    @SuppressLint("HandlerLeak")
    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Bundle bundle = msg.getData();
            String string = bundle.getString(editText.toString());
            final TextView myTextView = (TextView) findViewById(R.id.scriviTesto);
            myTextView.setText(string);
        }
    };

    private final Runnable mMessageSender = new Runnable() {
        public void run() {
            Toast.makeText(GlobalApplication.getAppContext(), "mMessageSender", Toast.LENGTH_SHORT).show();
            Message msg = mHandler.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putString(editText.toString(), getCurrentTime());
            msg.setData(bundle);
            mHandler.sendMessage(msg);
        }
    };

    private String getCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy", Locale.US);
        return dateFormat.format(new Date());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        final Button button = (Button) findViewById(R.id.btnScrivi);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                scrivi(view);
            }
        });
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
                new Thread(mMessageSender).start();
            } else {
                System.out.println("Non va");
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
                new Thread(mMessageSender).start();
            } else {
                Toast.makeText(GlobalApplication.getAppContext(), "Non  va", Toast.LENGTH_SHORT).show();
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
