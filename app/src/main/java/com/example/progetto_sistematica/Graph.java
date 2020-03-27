package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.io.IOException;
import java.util.ArrayList;

import br.ufrn.imd.obd.commands.engine.SpeedCommand;

public class Graph extends AppCompatActivity {
    GraphView graph;
    ArrayList speed;
    int delay = 1000; //milliseconds
    int size=0,velocita=0;
    Dati dati;
    private static BluetoothSocket socket = GlobalApplication.getSocket();
    ComandiOBD comandiOBD;
    SpeedCommand speedCommand;
    Boolean ciclo=true;
    EditText editText;
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
        dati = new Dati();
        dati.inizializzaDati();
        dati.start();
    }

    public void setTimeoutSpeedGraph (View view)
    {
        Editable editable=editText.getText();
        String str_delay = editable.toString();
        delay=Integer.valueOf(str_delay);
    }

    public void riprovaGraph (View view)
    {
        ciclo=false;
        Graph.this.finish();
        Intent startNewActivity = new Intent (this, Graph.class);
        startActivity(startNewActivity);
    }

    public class Dati extends Thread {

        public void inizializzaDati()
        {
            speed = new ArrayList<>();
            comandiOBD = new ComandiOBD();
            speedCommand = new SpeedCommand();//velocità
            editText=findViewById(R.id.editTextGraphDelay);
        }
        public void run()
        {
            comandiOBD.speed();
            while (velocita<100)
            {
                if (ciclo == false)
                {
                    break;
                }
                if (velocita!=0)
                {
                    speed.add(velocita);
                }
                comandiOBD.speed();
                try {
                    Thread.sleep(delay);
                    comandiOBD.speed();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            /*if ((int)speed.get(0)>0)
                speed.add(0,0);*/
            speed.add(100);
            size=speed.size();
            Graph.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(Graph.this, "Size: "+String.valueOf(size), Toast.LENGTH_SHORT).show();
                    LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(impostaDataPoint());
                    graph.addSeries(series);
                }
            });
        }

        public DataPoint[] impostaDataPoint ()
        {
            DataPoint[] dataPoints = new DataPoint[size];
            for (int i=0;i<size;i++)
            {
                dataPoints[i] = new DataPoint(i,(int)speed.get(i));
            }
            return dataPoints;
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
    }
}
