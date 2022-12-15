package com.if3b.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivityUGD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("UNIT GAWAT DARURAT");
        setContentView(R.layout.activity_main_ugd);
    }
}