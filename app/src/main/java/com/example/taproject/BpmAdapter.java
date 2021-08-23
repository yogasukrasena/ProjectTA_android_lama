package com.example.taproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BpmAdapter extends RecyclerView.Adapter<BpmAdapter.BpmViewHolder> {

    private List<BpmClass> dataList;

    public BpmAdapter(List<BpmClass> dataList){
        this.dataList = dataList;
    }

    @Override
    public BpmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.bpmlog_cardview, parent, false);
        return new BpmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BpmViewHolder holder, int position) {
        BpmClass bpmClass = dataList.get(position);
        holder.bpm_min.setText(String.valueOf(bpmClass.getBpm_min()));
        holder.bpm_max.setText(String.valueOf(bpmClass.getBpm_max()));
        holder.tanggal.setText(bpmClass.getTanggal());
        holder.waktu_mulai.setText(bpmClass.getWaktu_mulai());
        holder.waktu_berjalan.setText(bpmClass.getWaktu_berjalan());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class BpmViewHolder extends RecyclerView.ViewHolder {
        private TextView bpm_min, bpm_max, tanggal, waktu_mulai, waktu_berjalan;

        public BpmViewHolder(View itemView) {
            super(itemView);
            bpm_min = (TextView) itemView.findViewById(R.id.bpm_min);
            bpm_max = (TextView) itemView.findViewById(R.id.bpm_max);
            tanggal = (TextView) itemView.findViewById(R.id.tanggal);
            waktu_mulai = (TextView) itemView.findViewById(R.id.jam_mulai);
            waktu_berjalan = (TextView) itemView.findViewById(R.id.jam_akhir);
        }
    }
}
