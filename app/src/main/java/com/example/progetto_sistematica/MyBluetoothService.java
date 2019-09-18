package com.example.progetto_sistematica;

import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;


//CLASSE DI GOOGLE


public class MyBluetoothService {
    public static final int MESSAGE_READ = 0;
    public static final int MESSAGE_WRITE = 1;
    public static final int MESSAGE_TOAST = 2;
    public static List mConversationArrayAdapter;
    private static final String TAG = "MY_APP_DEBUG_TAG";
    public static final Handler handler = new Handler(Looper.getMainLooper()) { // handler that gets info from Bluetooth service
        @Override
        public void handleMessage(Message message) {
            System.out.println("HANDLER MESSAGE");
            if (message.what == MESSAGE_WRITE)
            {
                System.out.println("Message: Write");
                byte[] writeBuf = (byte[]) message.obj;
                // construct a string from the buffer
                String writeMessage = new String(writeBuf);
                System.out.println("MESSAGGIO WRITE" + writeMessage);
                //mConversationArrayAdapter.add("Me:  " + writeMessage);
            }
            else if(message.what == MESSAGE_READ)
            {
                System.out.println("Message: Read");
                byte[] readBuf = (byte[]) message.obj;
                // construct a string from the valid bytes in the buffer
                String readMessage = new String(readBuf, 0, message.arg1);
                System.out.println("MESSAGGIO READ" + readMessage);
                //mConversationArrayAdapter.add("Connected Device:  " + readMessage);
            }
            // This is where you do your work in the UI thread.
            // Your worker tells you in the message what to do.
        }
    };
    // Defines several constants used when transmitting messages between the
    // service and the UI.

    public static class ConnectedThread extends Thread {
        private final BluetoothSocket mmSocket;
        private final InputStream mmInStream;
        private final OutputStream mmOutStream;
        private byte[] mmBuffer; // mmBuffer store for the stream

        public ConnectedThread(BluetoothSocket socket) {
            mmSocket = socket;
            InputStream tmpIn = null;
            OutputStream tmpOut = null;

            // Get the input and output streams; using temp objects because
            // member streams are final.
            try {
                tmpIn = socket.getInputStream();
            } catch (IOException e) {
                //Toast.makeText(GlobalApplication.getAppContext(), "Error occurred when creating input stream", Toast.LENGTH_SHORT).show();
            }
            try {
                tmpOut = socket.getOutputStream();
            } catch (IOException e) {
                //Toast.makeText(GlobalApplication.getAppContext(), "Error occurred when creating output stream", Toast.LENGTH_SHORT).show();
            }

            mmInStream = tmpIn;
            mmOutStream = tmpOut;
        }

        public void run() {
            mmBuffer = new byte[1024];
            int numBytes; // bytes returned from read()

            // Keep listening to the InputStream until an exception occurs.
            while (true) {
                try {
                    // Read from the InputStream.
                    numBytes = mmInStream.read(mmBuffer);
                    // Send the obtained bytes to the UI activity.
                    Message readMsg = handler.obtainMessage(
                            MyBluetoothService.MESSAGE_READ, numBytes, -1,
                            mmBuffer);
                    readMsg.sendToTarget();
                } catch (IOException e) {
                    //Toast.makeText(GlobalApplication.getAppContext(), "Input stream was disconnected", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }

        // Call this from the main activity to send data to the remote device.
        public void write(byte[] bytes) {
            try {
                mmOutStream.write(bytes);

                // Share the sent message with the UI activity.
                Message writtenMsg = handler.obtainMessage(
                        MyBluetoothService.MESSAGE_WRITE, -1, -1, mmBuffer);
                writtenMsg.sendToTarget();
            } catch (IOException e) {
                //Toast.makeText(GlobalApplication.getAppContext(), "Error occurred when sending data", Toast.LENGTH_SHORT).show();

                // Send a failure message back to the activity.
                Message writeErrorMsg =
                        handler.obtainMessage(MyBluetoothService.MESSAGE_TOAST);
                Bundle bundle = new Bundle();
                bundle.putString("toast",
                        "Couldn't send data to the other device");
                writeErrorMsg.setData(bundle);
                handler.sendMessage(writeErrorMsg);
            }
        }

        // Call this method from the main activity to shut down the connection.
        public void cancel() {
            try {
                mmSocket.close();
            } catch (IOException e) {
                Log.e(TAG, "Could not close the connect socket", e);
            }
        }
    }
}