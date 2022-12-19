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

public class AdaptercardUGD  extends  RecyclerView.Adapter<AdaptercardUGD.classviewholder>{
private ArrayList<ModelUGD> dataUGD;


    public AdaptercardUGD(ArrayList<ModelUGD> modelUGD) {
        this.dataUGD = modelUGD;
    }

    @NonNull
    @Override
    public classviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_ugd,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull classviewholder holder, int position) {
        ModelUGD ugd =dataUGD.get(position);
        holder.tvalamatUGD.setText(ugd.getAlamat());
        holder.tvnamaUGD.setText(ugd.getNama());
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
            ivfotoUGD= itemView.findViewById(R.id.iv_fotoUGD);
            tvalamatUGD= itemView.findViewById(R.id.tv_alamatUGD);
            tvnamaUGD= itemView.findViewById(R.id.tv_namaUGD);
            btnhubungiUGD= itemView.findViewById(R.id.btn_hubungiUGD);
            btnlokasiUGD=itemView.findViewById(R.id.btn_lokasiUGD);
        }
    }


}

