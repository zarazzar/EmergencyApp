package com.if3b.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    private ImageView ivFotoAzzar, ivFotoDepniel,ivFotoNando;
    private TextView namaAzzar,namaDepniel,namaNando,tvJudulAboutUS,tvDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().setTitle("ABOUT US");

        ivFotoAzzar = findViewById(R.id.iv_foto_azzar);
        ivFotoDepniel = findViewById(R.id.iv_foto_depniel);
        ivFotoNando = findViewById(R.id.iv_foto_nando);

        namaAzzar=findViewById(R.id.nama_azzar);
        namaDepniel=findViewById(R.id.nama_depniel);
        namaNando=findViewById(R.id.nama_nando);

        tvJudulAboutUS = findViewById(R.id.tv_judul_aboutUs);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);


    }
}