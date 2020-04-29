package com.example.gittutorial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gittutorial.helper.Prompt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("welcome");
        Prompt.e("error occured");
        Prompt.showToast(this, "Hi hello");
    }
}
