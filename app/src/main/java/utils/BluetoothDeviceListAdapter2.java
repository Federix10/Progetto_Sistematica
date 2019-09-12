package utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.progetto_sistematica.MainActivity;
import com.example.progetto_sistematica.R;

import java.util.ArrayList;
import java.util.List;

public class BluetoothDeviceListAdapter2 extends ArrayAdapter<Device>{

    public BluetoothDeviceListAdapter2(@NonNull Context context, int resource, List<Device> list) {
        super(context, resource, list);
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.listitem, null);
        TextView nome = (TextView)convertView.findViewById(R.id.title);
        TextView mac = (TextView)convertView.findViewById(R.id.description);
        Device d = getItem(position);
        Button btnConnetti = convertView.findViewById(R.id.btnConnetti);
        nome.setText(d.getNome());
        mac.setText(d.getMAC());

        btnConnetti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Connessione in corso", Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}

