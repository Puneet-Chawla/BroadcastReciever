package com.example.student.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
    Toast.makeText(context,"Broadcast has been recieved",Toast.LENGTH_LONG).show();
    }
}
