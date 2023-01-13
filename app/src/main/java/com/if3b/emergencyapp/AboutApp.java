package com.if3b.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutApp extends AppCompatActivity {

    private TextView tvJudulApp, tvdeskripsiApp, tvdeskripsiApp2,tvdeskripsiApp3;
    private ImageView ivLogoApp;
    private Button btnaboutDamkar,btnaboutUGD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        getSupportActionBar().hide();

        tvJudulApp = findViewById(R.id.tv_judul_aboutApp);
        tvdeskripsiApp = findViewById(R.id.tv_deskripsiApp);
        tvdeskripsiApp2 = findViewById(R.id.tv_deskripsiApp2);
        tvdeskripsiApp3 = findViewById(R.id.tv_deskripsiApp3);

        ivLogoApp = findViewById(R.id.iv_logoApp);

        btnaboutDamkar = findViewById(R.id.btn_aboutAppDamkar);
        btnaboutUGD = findViewById(R.id.btn_aboutAppUgd);

        btnaboutDamkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(AboutApp.this, MainActivityDamkar.class);
                startActivity(pindah);
            }
        });

        btnaboutUGD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah2 = new Intent(AboutApp.this,MainActivityUGD.class);
                startActivity(pindah2);
            }
        });




    }
}