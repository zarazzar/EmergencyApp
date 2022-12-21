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
    private Context ctx;

    public AdaptercardUGD(ArrayList<ModelUGD> dataUGD, Context ctx) {
        this.dataUGD = dataUGD;
    }



    @NonNull
    @Override
    public classviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_ugd,parent,false);
        return new classviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull classviewholder holder, int position) {
        ModelUGD ugd =dataUGD.get(position);
        holder.tvnamaUGD.setText(ugd.getNama());
        holder.tvalamatUGD.setText(ugd.getAlamat());

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
            ivfotoUGD= itemView.findViewById(R.id.iv_foto_UGD);
            tvalamatUGD= itemView.findViewById(R.id.tv_alamat_UGD);
            tvnamaUGD= itemView.findViewById(R.id.tv_nama_UGD);
            btnhubungiUGD= itemView.findViewById(R.id.btn_hubungi_UGD);
            btnlokasiUGD=itemView.findViewById(R.id.btn_lokasi_UGD);
        }
    }


}

