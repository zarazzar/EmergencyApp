package com.if3b.emergencyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_about_app:
                Intent pindahAboutAPP = new Intent(MainActivityUGD.this, AboutApp.class);
                startActivity(pindahAboutAPP);
                break;
            case R.id.menu_about_us:
                Intent pindahAboutUs = new Intent(MainActivityUGD.this, AboutUs.class);
                startActivity(pindahAboutUs);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}