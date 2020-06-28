package com.example.progetto_sistematica;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ChangeCardView extends AppCompatActivity {

    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6;
    CircularProgressBar progressBar;
    int command1=-1, command2=-1, command3=-1, command4=-1, command5=-1, command6=-1, commandProgressBar=0;
    ArrayList<String> comandi;
    ArrayList<String> progressBarComandi;
    String[] command = null;
    String[] progressBarCommand = null;
    String commandRead="", numberRead="", sComandoCustom="";
    EditText customCommand;
    TextView t1c1, t1c2,t1c3,t1c4,t1c5,t1c6,tProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_card_view);
        comandi = new ArrayList<>();
        progressBarComandi = new ArrayList<>();
        comandi = GlobalApplication.getComandi();
        progressBarComandi = GlobalApplication.getProgressBarComandi();
        commandRead=Read();
        if (commandRead.isEmpty())
        {
            Toast.makeText(this, "Devi assegnare dei comandi", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String commandRead2 = commandRead;

            int index = commandRead2.indexOf(",");
            String stringa = commandRead2.substring(0,index);
            command1 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command2 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command3 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command4 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command5 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            index = commandRead2.indexOf(",");
            stringa = commandRead2.substring(0,index);
            command6 = Integer.parseInt(stringa);
            commandRead2 = commandRead2.substring(index+1);

            commandProgressBar = Integer.parseInt(commandRead2);
        }
        //Toast.makeText(this, commandRead+" value: "+String.valueOf(command1+","+command2+","+command3+","+command4+","+command5+","+command6+","+commandProgressBar), Toast.LENGTH_LONG).show();
        checkArray();

        cardView1 = findViewById(R.id.CardView1Change);
        cardView2 = findViewById(R.id.CardView2Change);
        cardView3 = findViewById(R.id.CardView3Change);
        cardView4 = findViewById(R.id.CardView4Change);
        cardView5 = findViewById(R.id.CardView5Change);
        cardView6 = findViewById(R.id.CardView6Change);
        progressBar = findViewById(R.id.progressBar);

        t1c1 = findViewById(R.id.txt1Card1Change);
        t1c2 = findViewById(R.id.txt1Card2Change);
        t1c3 = findViewById(R.id.txt1Card3Change);
        t1c4 = findViewById(R.id.txt1Card4Change);
        t1c5 = findViewById(R.id.txt1Card5Change);
        t1c6 = findViewById(R.id.txt1Card6Change);
        tProgressBar = findViewById(R.id.rpmProgressChange);

        t1c1.setText(command[command1]);
        t1c2.setText(command[command2]);
        t1c3.setText(command[command3]);
        t1c4.setText(command[command4]);
        t1c5.setText(command[command5]);
        t1c6.setText(command[command6]);
        tProgressBar.setText(progressBarCommand[commandProgressBar]);

        customCommand = findViewById(R.id.comandoCustom);
        sComandoCustom = ReadCustomCommand();
        customCommand.setText(sComandoCustom);

        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangeCardView.this);
                builder.setTitle("Scegli un comando da eseguire");
                builder.setSingleChoiceItems(progressBarCommand, commandProgressBar, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        commandProgressBar = which;
                    }
                });
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ChangeCardView.this, "Selezionato: " + progressBarCommand[commandProgressBar], Toast.LENGTH_SHORT).show();
                        tProgressBar.setText(progressBarCommand[commandProgressBar]);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangeCardView.this);
                builder.setTitle("Scegli un comando da eseguire");
                builder.setSingleChoiceItems(command, command1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        command1 = which;
                    }
                });
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ChangeCardView.this, "Selezionato: " + command[command1], Toast.LENGTH_SHORT).show();
                        t1c1.setText(command[command1]);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangeCardView.this);
                builder.setTitle("Scegli un comando da eseguire");
                builder.setSingleChoiceItems(command, command2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        command2 = which;
                    }
                });
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ChangeCardView.this, "Selezionato: " + command[command2], Toast.LENGTH_SHORT).show();
                        t1c2.setText(command[command2]);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangeCardView.this);
                builder.setTitle("Scegli un comando da eseguire");
                builder.setSingleChoiceItems(command, command3, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        command3 = which;
                    }
                });
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ChangeCardView.this, "Selezionato: " + command[command3], Toast.LENGTH_SHORT).show();
                        t1c3.setText(command[command3]);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangeCardView.this);
                builder.setTitle("Scegli un comando da eseguire");
                builder.setSingleChoiceItems(command, command4, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        command4 = which;
                    }
                });
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ChangeCardView.this, "Selezionato: " + command[command4], Toast.LENGTH_SHORT).show();
                        t1c4.setText(command[command4]);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangeCardView.this);
                builder.setTitle("Scegli un comando da eseguire");
                builder.setSingleChoiceItems(command, command5, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        command5 = which;
                    }
                });
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ChangeCardView.this, "Selezionato: " + command[command5], Toast.LENGTH_SHORT).show();
                        t1c5.setText(command[command5]);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ChangeCardView.this);
                builder.setTitle("Scegli un comando da eseguire");
                builder.setSingleChoiceItems(command, command6, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        command6 = which;
                    }
                });
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ChangeCardView.this, "Selezionato: " + command[command6], Toast.LENGTH_SHORT).show();
                        t1c6.setText(command[command6]);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }

    public void setCustomCommand (View view)
    {
        Editable editable=customCommand.getText();
        sComandoCustom = editable.toString();
        Toast.makeText(this, "Comando custom salvato: "+sComandoCustom, Toast.LENGTH_SHORT).show();
        WriteCustomCommand(sComandoCustom);
        ListaComandi.setCustomCommand(sComandoCustom);
    }

    public void checkArray()
    {
        command = new String[comandi.size()];
        for (int i=0;i<comandi.size();i++)
        {
            command[i] = comandi.get(i);
        }
        progressBarCommand = new String[progressBarComandi.size()];
        for (int i=0;i<progressBarComandi.size();i++)
        {
            progressBarCommand[i] = progressBarComandi.get(i);
        }
    }


    public void cancella(View view)
    {
        command1=0;
        command2=1;
        command3=2;
        command4=3;
        command5=4;
        command6=5;
        commandProgressBar=0;
        String vuoto=command1+","+command2+","+command3+","+command4+","+command5+","+command6+","+commandProgressBar;
        Write(vuoto);
        Toast.makeText(this, "Cancellato correttamente", Toast.LENGTH_SHORT).show();
    }

    public void salva(View view)
    {
        if (command1>=0 && command2>=0 && command3>=0 && command4>=0 && command5>=0 && command6>=0)
        {
            String dati = command1+","+command2+","+command3+","+command4+","+command5+","+command6+","+commandProgressBar;
            Write(dati);
            Toast.makeText(this, "Salvato correttamente", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Devi selezionare 6 comandi", Toast.LENGTH_SHORT).show();
    }

    public void Write(String data)
    {
        try {
            FileOutputStream fOut = openFileOutput("command.txt", MODE_PRIVATE);
            fOut.write(data.getBytes());
            fOut.close();
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
        }
        catch(Exception e){
        }
        return temp;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            ChangeCardView.this.finish();
            Intent startNewActivity = new Intent (this, OBDActivity.class);
            startActivity(startNewActivity);
        }
        return super.onKeyDown(keyCode, event);
    }

    public void WriteCustomCommand(String data)
    {
        try {
            FileOutputStream fOut = openFileOutput("customcommand.txt", MODE_PRIVATE);
            fOut.write(data.getBytes());
            fOut.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String ReadCustomCommand()
    {
        String temp="";
        try {
            FileInputStream fin = openFileInput("customcommand.txt");
            int c;
            while( (c = fin.read()) != -1){
                temp = temp + Character.toString((char)c);
            }
        }
        catch(Exception e){
        }
        return temp;
    }

}