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

public class DetailActivityUGD extends AppCompatActivity {

    private ImageView ivFotoUGD;
    private TextView tvNamaUGD, tvAlamatUGD;
    private Button btnLokasiUGD, btnHPUGD;
    private String yNamaUGD,yAlamatUGD,yFotoUGD,yLokasiUGD,yNomorUGD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ugd);
        getSupportActionBar().setTitle("Detail UGD");

        ivFotoUGD = findViewById(R.id.iv_foto_ugd);
        tvNamaUGD = findViewById(R.id.tv_nama_ugd);
        tvAlamatUGD = findViewById(R.id.tv_alamat_ugd);
        btnLokasiUGD = findViewById(R.id.btn_lokasi_ugd);
//        btnHPUGD = findViewById(R.id.btn_hubungi_ugd);

        Intent GetUGD = getIntent();
        yNamaUGD = GetUGD.getStringExtra("xNamaUGD");
        yAlamatUGD = GetUGD.getStringExtra("xAlamatUGD");
        yFotoUGD = GetUGD.getStringExtra("xFotoUGD");
        yLokasiUGD = GetUGD.getStringExtra("xLokasiUGD");
//        yNomorUGD = GetUGD.getStringExtra("xNomorUGD");

        Glide
                .with(DetailActivityUGD.this)
                .load(yFotoUGD).into(ivFotoUGD);
        tvNamaUGD.setText(yNamaUGD);
        tvAlamatUGD.setText(yAlamatUGD);

        btnLokasiUGD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri lokasiUGD = Uri.parse("geo:0,0?q="+yLokasiUGD);

                Intent bukaLokasi = new Intent(Intent.ACTION_VIEW,lokasiUGD);
                startActivity(bukaLokasi);

            }
        });



    }
}