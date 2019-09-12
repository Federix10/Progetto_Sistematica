package utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BluetoothDeviceListAdapter2 extends ArrayAdapter<Device>{


    final BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    private BluetoothDevice boundingDevice;


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
        final Device d = getItem(position);
        Button btnConnetti = convertView.findViewById(R.id.btnConnetti);
        nome.setText(d.getNome());
        mac.setText(d.getMAC());


        btnConnetti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Connessione in corso a: "+ d.getNome()+" "+d.getMAC(), Toast.LENGTH_SHORT).show();
                Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
                if (pairedDevices.size() > 0)
                {
                    for(BluetoothDevice btdevice : pairedDevices)
                    {
                        if (btdevice.getName().equals(d.getNome()))
                            pair(btdevice);
                    }
                }
            }
        });
        return convertView;
    }

    public boolean pair(BluetoothDevice device) {
        boolean outcome = device.createBond();
        if (outcome == true) {
            this.boundingDevice = device;
        }
        return outcome;
    }


}

