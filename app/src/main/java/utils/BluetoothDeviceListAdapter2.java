package utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

public class BluetoothDeviceListAdapter2 extends ArrayAdapter<String>{

    public BluetoothDeviceListAdapter2(@NonNull Context context, int resource, List<String> list) {
        super(context, resource, list);
    }

    public class Device {

        private String nome;
        private String MAC;

        public Device(String nome, String MAC) {
            this.nome = nome;
            this.MAC = MAC;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMAC() {
            return MAC;
        }

        public void setMAC(String MAC) {
            this.MAC = MAC;
        }

    }

}

