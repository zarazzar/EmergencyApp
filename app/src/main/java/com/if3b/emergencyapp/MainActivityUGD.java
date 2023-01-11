package com.if3b.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityUGD extends AppCompatActivity {

    private RecyclerView rvUGD;
    private ArrayList<ModelUGD> data =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("UNIT GAWAT DARURAT");
        setContentView(R.layout.activity_main_ugd);

        rvUGD = findViewById(R.id.rv_ugd);
        rvUGD.setHasFixedSize(true);

        data.addAll(dataUGD.ambilDataUGD());

        tampilDataUGD();


    }
    private void tampilDataUGD(){
        rvUGD.setLayoutManager(new LinearLayoutManager(this));
        AdaptercardUGD varAdapterUGD = new AdaptercardUGD(data, MainActivityUGD.this);
        rvUGD.setAdapter(varAdapterUGD);


    }

}