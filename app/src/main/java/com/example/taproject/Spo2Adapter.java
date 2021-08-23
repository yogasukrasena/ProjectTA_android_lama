package com.example.taproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Spo2Adapter extends RecyclerView.Adapter<Spo2Adapter.Spo2ViewHolder> {
    private List<Spo2Class> dataList;

    public Spo2Adapter(List<Spo2Class> dataList){
        this.dataList = dataList;
    }

    @Override
    public Spo2ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.spo_cardview, parent, false);
        return new Spo2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Spo2ViewHolder holder, int position) {
        Spo2Class spo2Class = dataList.get(position);
        holder.spo_min.setText(String.valueOf(spo2Class.getSpo_min()));
        holder.spo_max.setText(String.valueOf(spo2Class.getSpo_max()));
        holder.tanggal.setText(spo2Class.getTanggal());
        holder.waktu_mulai.setText(spo2Class.getWaktu_mulai());
        holder.waktu_berjalan.setText(spo2Class.getWaktu_berjalan());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class Spo2ViewHolder extends RecyclerView.ViewHolder {
        private TextView spo_min, spo_max, tanggal, waktu_mulai, waktu_berjalan;
        
        public Spo2ViewHolder(View itemView) {
            super(itemView);
            spo_min = (TextView) itemView.findViewById(R.id.spo_min);
            spo_max = (TextView) itemView.findViewById(R.id.spo_max);
            tanggal = (TextView) itemView.findViewById(R.id.tanggal);
            waktu_mulai = (TextView) itemView.findViewById(R.id.jam_mulai);
            waktu_berjalan = (TextView) itemView.findViewById(R.id.jam_akhir);
        }
    }
}
