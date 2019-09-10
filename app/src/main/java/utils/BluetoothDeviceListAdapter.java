package utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

public class BluetoothDeviceListAdapter extends ArrayAdapter<String>{
    private String nome;
    private String indirizzo;

    public BluetoothDeviceListAdapter(@NonNull Context context, int resource, List<String> list) {
        super(context, resource, list);
        String nome;
        String indirizzo;
        this.nome=nome;
        this.indirizzo=indirizzo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }



}
