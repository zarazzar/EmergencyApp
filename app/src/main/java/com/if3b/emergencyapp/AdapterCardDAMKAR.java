package com.if3b.emergencyapp;
import android.net.Uri;
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

        holder.tvNamaDamkar.setText(damkar.getNama());
        holder.tvAlamatDamkar.setText(damkar.getAlamat());

        Glide
                .with(holder.itemView.getContext())
                .load(damkar.getFoto())
                .placeholder(R.drawable.ic_baseline_image_24)
                .into(holder.ivFotoDamkar);

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
        String getlokasiDamkar;

        public DamkarViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFotoDamkar = itemView.findViewById(R.id.iv_foto_damkar);
            tvNamaDamkar = itemView.findViewById(R.id.tv_nama_damkar);
            tvAlamatDamkar = itemView.findViewById(R.id.tv_alamat_damkar);
            btnHubungi = itemView.findViewById(R.id.btn_hubungi_damkar);
            btnLokasi = itemView.findViewById(R.id.btn_hubungi_damkar);

            btnLokasi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   getlokasiDamkar=tvAlamatDamkar.getText().toString();

                    Uri location = Uri.parse("geo:0,0?q=" + getlokasiDamkar);
                    Intent bukaLokasi = new Intent(Intent.ACTION_VIEW, location);
                    ctx.startActivity(bukaLokasi);
                }



            });
        }
    }
}
