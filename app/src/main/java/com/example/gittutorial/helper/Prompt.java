package com.example.gittutorial.helper;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Prompt {

    public static void e(String msg) {
        Log.e("Logger", msg);
    }

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
