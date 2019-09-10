package utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

public class BluetoothDeviceListAdapter extends ArrayAdapter<String>{

    public BluetoothDeviceListAdapter(@NonNull Context context, int resource, List<String> list) {
        super(context, resource, list);
    }

    
}
