package com.example.gittutorial;

import android.content.Context;
import android.widget.Toast;

public class ToastClass {

    public void makeToast(Context context,String msg)
    {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
