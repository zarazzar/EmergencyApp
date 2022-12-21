package com.if3b.emergencyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCardDAMKAR extends RecyclerView.Adapter<AdapterCardDAMKAR.DamkarViewHolder>{
    private ArrayList<ModelDamkar>dataDamkar;
    private Context ctx;

    public AdapterCardDAMKAR(ArrayList<ModelDamkar> dataDamkar) {
        this.dataDamkar = dataDamkar;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public DamkarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewDamkar = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_damkar, parent, false);
        return new DamkarViewHolder(viewDamkar);
    }

    @Override
    public void onBindViewHolder(@NonNull DamkarViewHolder holder, int position) {
        ModelDamkar damkar = dataDamkar.get(position);

        holder.tvNamaDamkar.setText(damkar.getNama());;
        holder.tvAlamatDamkar.setText(damkar.getAlamat());

    }


    @Override
    public int getItemCount() {
        return dataDamkar.size();
    }

    public class DamkarViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivFotoDamkar;
        TextView tvNamaDamkar,tvAlamatDamkar;
        Button btnHubungi, btnLokasi;
        public DamkarViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFotoDamkar = itemView.findViewById(R.id.iv_foto_damkar);
            tvNamaDamkar = itemView.findViewById(R.id.tv_nama_damkar);
            tvAlamatDamkar = itemView.findViewById(R.id.tv_alamat_damkar);
            //btnHubungi = itemView.findViewById(R.id.btn_hubungi_damkar);
            //btnLokasi = itemView.findViewById(R.id.btn_hubungi_damkar);
        }
    }
}
