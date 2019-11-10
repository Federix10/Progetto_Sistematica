package com.example.progetto_sistematica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.anastr.speedviewlib.SpeedView;

public class Speed extends AppCompatActivity {
    SpeedView speedometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        speedometer = findViewById(R.id.speedView);
        speedometer.speedTo(50);
    }
}
