package com.example.progetto_sistematica;

import android.content.Intent;
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
    public static final int MESSAGE_READ = 0;
    public static final int MESSAGE_WRITE = 1;
    public static final int MESSAGE_TOAST = 2;
    OutputStream mmOutStream;
    Button btnScrivi = (Button) findViewById(R.id.btnScrivi);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        EditText editText = (EditText) findViewById(R.id.scriviTesto);
        TextView showText = (TextView)findViewById(R.id.mostraTesto);
    }
    public void scrivi(View view)
    {
        btnScrivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byte[] bytes = btnScrivi.getText().toString().getBytes(Charset.defaultCharset());
                try {
                    mmOutStream.write(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
