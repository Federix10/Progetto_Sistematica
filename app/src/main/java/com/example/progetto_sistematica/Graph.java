package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import br.ufrn.imd.obd.commands.engine.RPMCommand;
import br.ufrn.imd.obd.commands.engine.SpeedCommand;

public class Graph extends AppCompatActivity {
    private GraphView graph;
    private ArrayList speed,rpm;
    private int size=0,velocita=0,giriMotore=0;
    private Dati dati;
    private private static BluetoothSocket socket = GlobalApplication.getSocket();
    private ComandiOBD comandiOBD;
    private SpeedCommand speedCommand;
    private RPMCommand rpmCommand;
    private Boolean ciclo=true, letto=false;
    private TextView textView0100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        graph = (GraphView) findViewById(R.id.graph);
        graph.getViewport().setScalableY(true);
        // set manual Y bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(100);
        graph.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        dati = new Dati();
        dati.inizializzaDati();
        dati.start();
    }

    public void saveSpeedGraph (View view)
    {
        dati.Write();
    }

    public void loadSpeedGraph (View view)
    {
        letto=true;
        ciclo=false;
    }

    public void riprovaGraph (View view)
    {
        ciclo=false;
        Graph.this.finish();
        Intent startNewActivity = new Intent (this, Graph.class);
        startActivity(startNewActivity);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            ciclo=false;
            Graph.this.finish();
            Intent startNewActivity = new Intent (this, OBDActivity.class);
            startActivity(startNewActivity);
        }
        return super.onKeyDown(keyCode, event);
    }

    public class Dati extends Thread {
        boolean checkStart=false;
        long startTime=0;
        long elapsedTime=0;
        public void inizializzaDati()
        {
            speed = new ArrayList<>();
            rpm = new ArrayList<>();
            comandiOBD = new ComandiOBD();
            speedCommand = new SpeedCommand();//velocità
            rpmCommand = new RPMCommand();//rpm
            textView0100 = findViewById(R.id.textView0100s);
        }
        public void run()
        {
            speed.add(0);
            while (true)
            {
                if (ciclo == false)
                {
                    break;
                }
                comandiOBD.speed();
                //comandiOBD.rpm();
                if (velocita==100)
                {
                    break;
                }
                else if (velocita!=0)
                {
                    speed.add(velocita);
                    //rpm.add(giriMotore);
                    if (checkStart==false)
                    {
                        startTime = System.currentTimeMillis();
                        checkStart=true;
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            long stopTime = System.currentTimeMillis();
            elapsedTime = stopTime - startTime;
            if (letto==false)
            {
                speed.add(100);
                size=speed.size();
                Graph.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        double tempo = elapsedTime / 1000.0;
                        textView0100.setText(String.valueOf(tempo)+" s");
                        Toast.makeText(Graph.this, "Size: "+String.valueOf(size), Toast.LENGTH_SHORT).show();
                        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(impostaDataPoint());
                        graph.addSeries(series);
                    }
                });
            }
            else if (letto==true)
            {
                Graph.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        int speedSize=speed.size();
                        for (int i=0;i<speedSize;i++)
                            speed.remove(i);
                        String read = Read();
                        String readFor="";
                        for (int i=0;i<read.length();i++)
                        {
                            readFor+=read.charAt(i);
                            if (read.charAt(i)==',')
                            {
                                readFor = readFor.substring(0,readFor.length()-1);
                                speed.add(readFor);
                                readFor = "";
                            }
                            else if (read.charAt(i)=='/')
                            {
                                readFor = readFor.substring(0,readFor.length()-1);
                                elapsedTime = Integer.parseInt(readFor);
                                readFor = "";
                            }
                            else if (read.charAt(i)=='-')
                            {
                                readFor = readFor.substring(0,readFor.length()-1);
                                size = Integer.parseInt(readFor);
                                readFor = "";
                            }
                        }
                        double tempo = elapsedTime / 1000.0;
                        textView0100.setText(String.valueOf(tempo)+" s");
                        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(impostaDataPoint());
                        graph.addSeries(series);
                    }
                });
            }
        }

        public DataPoint[] impostaDataPoint ()
        {
            DataPoint[] dataPoints = new DataPoint[size];
            for (int i=0;i<size;i++)
            {
                dataPoints[i] = new DataPoint(i,Integer.parseInt(String.valueOf(speed.get(i))));
            }
            return dataPoints;
        }

        public void Write()
        {
            String data = "";
            for (int i=0;i<size;i++)
            {
                String s = String.valueOf(speed.get(i));
                data = data+s+",";
            }
            String time = String.valueOf(elapsedTime)+"/";
            data = data+time;
            String sSize = String.valueOf(size)+"-";
            data = data + sSize;
            try {
                FileOutputStream fOut = openFileOutput("tempo.txt", MODE_PRIVATE);
                fOut.write(data.getBytes());
                fOut.close();
                Toast.makeText(getBaseContext(),"file saved",Toast.LENGTH_SHORT).show();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String Read()
        {
            String temp="";
            try {
                FileInputStream fin = openFileInput("tempo.txt");
                int c;
                while( (c = fin.read()) != -1){
                    temp = temp + Character.toString((char)c);
                }
                Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();
            }
            catch(Exception e){
            }
            return temp;
        }
    }

    private class ComandiOBD
    {
        public void speed() {
            try {
                speedCommand.run(socket.getInputStream(), socket.getOutputStream()); //velocità
                velocita = Integer.parseInt(speedCommand.getCalculatedResult());
            }
            catch (IOException | InterruptedException e) {}
        }
        public void rpm() {
            try {
                rpmCommand.run(socket.getInputStream(), socket.getOutputStream()); //rpm
                giriMotore = Integer.parseInt(rpmCommand.getCalculatedResult());
            }
            catch (IOException | InterruptedException e) {}
        }
    }
}
