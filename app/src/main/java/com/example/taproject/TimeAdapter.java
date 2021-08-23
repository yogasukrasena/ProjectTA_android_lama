package com.example.taproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class TimeAdapter extends RecyclerView.Adapter<TimeAdapter.TimeViewHolder> {
    private List<TimeClass> dataList;

    public TimeAdapter(List<TimeClass> dataList){
        this.dataList = dataList;
    }

    @Override
    public TimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.time_cardview, parent, false);
        return new TimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TimeViewHolder holder, int position) {
        TimeClass timeClass = dataList.get(position);
        holder.selisih_waktu.setText(timeClass.getSelisih_waktu());
        holder.tanggal.setText(timeClass.getTanggal());
        holder.waktu_mulai.setText(timeClass.getWaktu_mulai());
        holder.waktu_berjalan.setText(timeClass.getWaktu_berjalan());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class TimeViewHolder extends RecyclerView.ViewHolder {
        private final TextView selisih_waktu;
        private final TextView tanggal;
        private final TextView waktu_mulai;
        private final TextView waktu_berjalan;

        public TimeViewHolder(View itemView) {
            super(itemView);
            selisih_waktu = (TextView) itemView.findViewById(R.id.timeValue);
            tanggal = (TextView) itemView.findViewById(R.id.tanggal);
            waktu_mulai = (TextView) itemView.findViewById(R.id.jam_mulai);
            waktu_berjalan = (TextView) itemView.findViewById(R.id.jam_akhir);
        }
    }
}
