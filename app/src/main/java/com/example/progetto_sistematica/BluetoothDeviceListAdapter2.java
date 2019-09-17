package com.example.progetto_sistematica;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Set;

import utils.Device;

public class BluetoothDeviceListAdapter2 extends ArrayAdapter<Device> {

    final BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    public BluetoothDeviceListAdapter2(@NonNull Context context, int resource, List<Device> list) {
        super(context, resource, list);
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.listitem, null);
        TextView nome = (TextView) convertView.findViewById(R.id.title);
        TextView mac = (TextView) convertView.findViewById(R.id.description);
        final Device d = getItem(position);
        nome.setText(d.getNome());
        mac.setText(d.getMAC());
        final Button btnConnect = convertView.findViewById(R.id.btnConnetti);
        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Connessione in corso a: " + d.getNome() + " " + d.getMAC(), Toast.LENGTH_SHORT).show();
                Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
                if (pairedDevices.size() > 0) {
                    for (BluetoothDevice btdevice : pairedDevices) {
                        if (btdevice.getName().equals(d.getNome())) {
                                ConnectThread client = new ConnectThread(btdevice);
                                client.start();
                        }
                    }
                }
            }//fine onClick
        });//fine setOnClickListener
        return convertView;
    }// fine getView
}