package com.if3b.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageButton ibDamkar,ibAmbulan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("EmergencyApp");




        ibDamkar = findViewById(R.id.ib_damkar);
        ibAmbulan = findViewById(R.id.ib_ambulan);

        ibDamkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pindahRvDamkar = new Intent(MainActivity.this,MainActivityDamkar.class);
                startActivity(pindahRvDamkar);
            }
        });

        ibAmbulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahRvUGD = new Intent(MainActivity.this,MainActivityUGD.class);
                startActivity(pindahRvUGD);
            }
        });




    }
}