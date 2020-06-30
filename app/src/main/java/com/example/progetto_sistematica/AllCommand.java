package com.example.progetto_sistematica;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import br.ufrn.imd.obd.commands.protocol.EchoOffCommand;
import br.ufrn.imd.obd.commands.protocol.LineFeedOffCommand;
import br.ufrn.imd.obd.commands.protocol.SelectProtocolCommand;
import br.ufrn.imd.obd.commands.protocol.TimeoutCommand;
import br.ufrn.imd.obd.enums.ObdProtocols;

public class AllCommand extends AppCompatActivity {

    private static BluetoothSocket socket = GlobalApplication.getSocket();
    ListView list;
    String[] maintitle = new String[GlobalApplication.getComandi().size()];
    Method method;
    ArrayList<String> command = new ArrayList<>();
    ListaComandi listaComandi = new ListaComandi(GlobalApplication.getSocket());
    String[] subtitle = new String[GlobalApplication.getComandi().size()];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_command);
        for (int i=0;i<maintitle.length;i++)
        {
            maintitle[i]=GlobalApplication.getComando(i);
            subtitle[i]=GlobalApplication.getCommand(i);
        }
        AllCommandData allCommandData = new AllCommandData();
        allCommandData.inizializza();
        allCommandData.run();

        MyListAdapter adapter=new MyListAdapter(this, maintitle, command);
        list=(ListView)findViewById(R.id.listAllCommand);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(AllCommand.this, "Item: "+position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            AllCommand.this.finish();
            Intent startNewActivity = new Intent (this, OBDActivity.class);
            startActivity(startNewActivity);
        }
        return super.onKeyDown(keyCode, event);
    }

    class AllCommandData extends Thread
    {
        public void inizializza()
        {
            try {
                new EchoOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new LineFeedOffCommand().run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new TimeoutCommand(125).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
                new SelectProtocolCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }

        public void run()
        {
            for (int i=0;i<maintitle.length;i++)
            {
                try {
                    method = ListaComandi.class.getMethod(subtitle[i]);
                    command.add((String) method.invoke(listaComandi));
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}