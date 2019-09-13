package utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.progetto_sistematica.BluetoothManager;
import com.example.progetto_sistematica.R;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import static android.bluetooth.BluetoothAdapter.STATE_CONNECTED;
import static android.content.ContentValues.TAG;


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

        Button btnConnetti = convertView.findViewById(R.id.btnConnetti);
        btnConnetti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Connessione in corso a: " + d.getNome() + " " + d.getMAC(), Toast.LENGTH_SHORT).show();
                Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
                if (pairedDevices.size() > 0) {
                    for (BluetoothDevice btdevice : pairedDevices) {
                        if (btdevice.getName().equals(d.getNome())) {
                            try {
                                BluetoothManager.connect(btdevice);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }
            }
        });
        return convertView;
    }// fine onClick

    public void pair(BluetoothDevice device) throws IOException {
        BluetoothDevice dev = bluetoothAdapter.getRemoteDevice(device.getAddress());
        UUID uuid = device.getUuids()[0].getUuid();
        BluetoothSocket socket = device.createInsecureRfcommSocketToServiceRecord(uuid);
        socket.connect();
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
    }
}