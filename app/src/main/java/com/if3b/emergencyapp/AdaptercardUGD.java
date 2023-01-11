package com.if3b.emergencyapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptercardUGD  extends  RecyclerView.Adapter<AdaptercardUGD.classviewholder>{
    private ArrayList<ModelUGD> dataUGD;
    private Context ctx;

    public AdaptercardUGD(ArrayList<ModelUGD> dataUGD, Context ctx) {
        this.dataUGD = dataUGD;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public classviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewUGD = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_ugd,parent,false);
        return new classviewholder(viewUGD);
    }

    @Override
    public void onBindViewHolder(@NonNull classviewholder holder, int position) {
        ModelUGD ugd = dataUGD.get(position);
        holder.tvnamaUGD.setText(ugd.getNama());
        holder.tvalamatUGD.setText(ugd.getAlamat());

        Glide
                .with(holder.itemView.getContext())
                .load(ugd.getFoto())
                .placeholder(R.drawable.ic_baseline_image_24)
                .into(holder.ivfotoUGD);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xNamaUGD, xAlamatUGD,xFotoUGD,
                        xLokasiUGD ,xNomorUGD;

                xNamaUGD = ugd.getNama();
                xAlamatUGD= ugd.getAlamat();
                xFotoUGD= ugd.getFoto();
                xLokasiUGD = ugd.getUrlLokasi();
//                xNomorUGD =damkar.getNoTelp();

                Intent Kirim = new Intent(ctx, DetailActivityUGD.class);
                Kirim.putExtra("xNamaUGD",xNamaUGD);
                Kirim.putExtra("xAlamatUGD",xAlamatUGD);
                Kirim.putExtra("xFotoUGD",xFotoUGD);
                Kirim.putExtra("xLokasiUGD",xLokasiUGD);
//                Kirim.putExtra("xNomorUGD",xNomorUGD);

                ctx.startActivity(Kirim);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataUGD.size();
    }

    public  class classviewholder extends RecyclerView.ViewHolder{
        ImageView ivfotoUGD;
        TextView tvnamaUGD,tvalamatUGD;
        Button btnhubungiUGD,btnlokasiUGD;

        public classviewholder(@NonNull View itemView) {
            super(itemView);
            ivfotoUGD= itemView.findViewById(R.id.iv_foto_ugd);
            tvnamaUGD= itemView.findViewById(R.id.tv_nama_ugd);
            tvalamatUGD= itemView.findViewById(R.id.tv_alamat_ugd);
            btnhubungiUGD= itemView.findViewById(R.id.btn_hubungi_ugd);
            btnlokasiUGD=itemView.findViewById(R.id.btn_lokasi_ugd);

        }
    }


}

