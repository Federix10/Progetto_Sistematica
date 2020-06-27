package com.example.progetto_sistematica;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ChangeCardView extends AppCompatActivity {

    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6;
    int checkedItem = 0, command1=-1, command2=-1, command3=-1, command4=-1, command5=-1, command6=-1;
    ArrayList<String> comandi = new ArrayList<>();
    ArrayList<String> arrayComandi = new ArrayList<>();
    String[] command = null;
    String commandRead="", numberRead="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_card_view);
        comandi.add("Comando1");
        comandi.add("Comando2");
        comandi.add("Comando3");
        for (int i=0;i<comandi.size();i++)
        {
            arrayComandi.add(comandi.get(i));
        }
        commandRead=Read();
        if (commandRead.isEmpty())
        {
            Toast.makeText(this, "Devi assegnare dei comandi", Toast.LENGTH_SHORT).show();
        }
        else
        {
            for (int i=0;i<commandRead.length();i++)
            {
                char c = commandRead.charAt(i);
                numberRead+=c;
                if (c==',')
                {
                    numberRead="";
                    break;
                }
                else if (c=='-')
                {
                    break;
                }
                else
                {
                    if (command1<0)
                        command1=Integer.parseInt(numberRead);
                    else if (command2<0)
                        command2=Integer.parseInt(numberRead);
                    else if (command3<0)
                        command3=Integer.parseInt(numberRead);
                    else if (command4<0)
                        command4=Integer.parseInt(numberRead);
                    else if (command5<0)
                        command5=Integer.parseInt(numberRead);
                    else if (command6<0)
                        command6=Integer.parseInt(numberRead);
                }
            }
        }
        Toast.makeText(this, commandRead+" value: "+String.valueOf(command1+","+command2+","+command3+","+command4+","+command5+","+command6), Toast.LENGTH_LONG).show();

        if (command1 > 0)
            comandi.remove(command1);
        if (command2 > 0)
            comandi.remove(command2);
        if (command3 > 0)
            comandi.remove(command3);
        if (command4 > 0)
            comandi.remove(command4);
        if (command5 > 0)
            comandi.remove(command5);
        if (command6 > 0)
            comandi.remove(command6);

        cardView1 = findViewById(R.id.CardView1);
        cardView2 = findViewById(R.id.CardView2);
        cardView3 = findViewById(R.id.CardView3);
        cardView4 = findViewById(R.id.CardView4);
        cardView5 = findViewById(R.id.CardView5);
        cardView6 = findViewById(R.id.CardView6);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // setup the alert builder
                checkArray();
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangeCardView.this);
                builder.setTitle("Scegli un comando da eseguire");
// add a radio button list
                builder.setSingleChoiceItems(command, command1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        /*if (which==command1 || which==command2 || which==command3 || which==command4 || which==command5 || which==command6)
                        {
                            Toast.makeText(ChangeCardView.this, "Hai già selezionato questo comando", Toast.LENGTH_SHORT).show();
                        }
                        else*/
                            command1 = which;
                    }
                });

// add OK and Cancel buttons
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ChangeCardView.this, "Selezionato: " + command[checkedItem], Toast.LENGTH_SHORT).show();
                        comandi.remove(command1);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

// create and show the alert dialog
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // setup the alert builder
                checkArray();
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangeCardView.this);
                builder.setTitle("Scegli un comando da eseguire");
// add a radio button list
                builder.setSingleChoiceItems(command, command2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        /*if (which==command1 || which==command2 || which==command3 || which==command4 || which==command5 || which==command6)
                        {
                            Toast.makeText(ChangeCardView.this, "Hai già selezionato questo comando", Toast.LENGTH_SHORT).show();
                        }
                        else*/
                            command2 = which;
                    }
                });

// add OK and Cancel buttons
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ChangeCardView.this, "Selezionato: " + command[checkedItem], Toast.LENGTH_SHORT).show();
                        comandi.remove(command2);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

// create and show the alert dialog
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }

    public void checkArray()
    {
        command = new String[comandi.size()];
        for (int i=0;i<comandi.size();i++)
        {
            command[i] = comandi.get(i);
        }
    }

    public void cancella(View view)
    {
        command1=-1;
        command2=-1;
        command3=-1;
        command4=-1;
        command5=-1;
        command6=-1;
        String vuoto=command1+","+command2+","+command3+","+command4+","+command5+","+command6;
        Write(vuoto);
        comandi = new ArrayList<>();
        for (int i=0;i<arrayComandi.size();i++)
        {
            comandi.add(arrayComandi.get(i));
        }
        Toast.makeText(this, "Effettuato correttamente", Toast.LENGTH_SHORT).show();
    }

    public void salva(View view)
    {
        String dati = command1+","+command2+","+command3+","+command4+","+command5+","+command6;
        Write(dati);
    }

    public void Write(String data)
    {
        try {
            FileOutputStream fOut = openFileOutput("command.txt", MODE_PRIVATE);
            fOut.write(data.getBytes());
            fOut.close();
            //Toast.makeText(getBaseContext(),"file saved",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String Read()
    {
        String temp="";
        try {
            FileInputStream fin = openFileInput("command.txt");
            int c;
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
            //Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
        }
        return temp;
    }
}