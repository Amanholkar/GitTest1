package com.example.gittest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Name1 = "this is my name 1";

        String Name = "This is my name Aman";

        String Change = "local changes";

        String Dev = "Dev branch  changes1";

        String local = "local change and swith to master branch";

    }
}