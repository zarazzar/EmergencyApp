package com.if3b.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityDamkar extends AppCompatActivity {

    private  RecyclerView rvDamkar;
    private ArrayList<ModelDamkar>data=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("PEMADAM KEBAKARAN");
        setContentView(R.layout.activity_main_damkar);

        rvDamkar = findViewById(R.id.rv_damkar);
        rvDamkar.setHasFixedSize(true);

        data.addAll(dataDamkar.ambilDataDamkar());

        tampilDataDamkar();

    }

    private void tampilDataDamkar(){
        rvDamkar.setLayoutManager(new LinearLayoutManager(this));
        AdapterCardDAMKAR varAdapterDamkar = new AdapterCardDAMKAR(data, MainActivityDamkar.this);
        rvDamkar.setAdapter(varAdapterDamkar);
    }

}