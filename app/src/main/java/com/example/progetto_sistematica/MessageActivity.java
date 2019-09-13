package com.example.progetto_sistematica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MyBluetoothService btService = new MyBluetoothService();
        btService.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        configurebtnScrivi();
    }

    private void configurebtnScrivi()
    {
        Button btnScrivi = (Button) findViewById(R.id.btnScrivi);
        btnScrivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}
