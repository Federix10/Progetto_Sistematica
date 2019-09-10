package utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class BluetoothDeviceListAdapter2 extends ArrayAdapter<String>{

    public BluetoothDeviceListAdapter2(@NonNull Context context, int resource, List<String> list) {
        super(context, resource, list);
    }



}

