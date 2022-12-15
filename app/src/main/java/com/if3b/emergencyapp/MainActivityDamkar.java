package com.if3b.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivityDamkar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("PEMADAM KEBAKARAN");
        setContentView(R.layout.activity_main_damkar);
    }
}