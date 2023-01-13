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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_about,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_about_app:
                Intent pindahAboutAPP = new Intent(MainActivityDamkar.this, AboutApp.class);
                startActivity(pindahAboutAPP);
                break;
            case R.id.menu_about_us:
                Intent pindahAboutUs = new Intent(MainActivityDamkar.this, AboutUs.class);
                startActivity(pindahAboutUs);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}