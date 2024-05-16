package com.smartpos.bootcompleteself;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("BootCompleteSelf", "receive boot_completed");
        Toast.makeText(context, "Your POS alread receive boot_completed", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(context, MainActivity.class);
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent1.putExtra("BootTips", "If you see this msg, mean receive BOOT_COMPLETED is auto start app.");
        context.startActivity(intent1);
    }
}