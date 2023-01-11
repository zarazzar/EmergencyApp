package com.if3b.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivityDamkar extends AppCompatActivity {

    private ImageView ivFotoDamkar;
    private TextView tvNamaDamkar, tvAlamatDamkar;
    private Button btnLokasiDamkar, btnHPDamkar;
    private String yNamaDamkar,yAlamatDamkar,yFotoDamkar,yLokasiDamkar,yNomorDamkar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_damkar);

        ivFotoDamkar = findViewById(R.id.iv_foto_damkar);
        tvNamaDamkar = findViewById(R.id.tv_nama_damkar);
        tvAlamatDamkar = findViewById(R.id.tv_alamat_damkar);
        btnLokasiDamkar = findViewById(R.id.btn_lokasi_damkar);
       btnHPDamkar = findViewById(R.id.btn_hubungi_damkar);

        Intent GetDamkar = getIntent();
        yNamaDamkar = GetDamkar.getStringExtra("xNamaDamkar");
        yAlamatDamkar = GetDamkar.getStringExtra("xAlamatDamkar");
        yFotoDamkar = GetDamkar.getStringExtra("xFotoDamkar");
        yLokasiDamkar = GetDamkar.getStringExtra("xLokasiDamkar");
       yNomorDamkar = GetDamkar.getStringExtra("xNomorDamkar");



        Glide
                .with(DetailActivityDamkar.this)
                .load(yFotoDamkar)
                .into(ivFotoDamkar);
        tvNamaDamkar.setText(yNamaDamkar);
        tvAlamatDamkar.setText(yAlamatDamkar);


        btnHPDamkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri nomorDamkar = Uri.parse("tel:"+yNomorDamkar);
                Intent Telepon = new Intent(Intent.ACTION_DIAL,nomorDamkar);
                startActivity(Telepon);
            }
        });

        btnLokasiDamkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri lokasiDamkar = Uri.parse("geo:0,0?q="+yLokasiDamkar);
                Intent bukaLokasi = new Intent(Intent.ACTION_VIEW,lokasiDamkar);
                startActivity(bukaLokasi);

            }
        });

        getSupportActionBar().setTitle("Detail DAMKAR " + yNamaDamkar);



    }
}