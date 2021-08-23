package com.example.taproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FinggerAdapter extends RecyclerView.Adapter<FinggerAdapter.FinggerViewHolder> {
    private ArrayList<FinggerClass> dataList;

    public FinggerAdapter(ArrayList<FinggerClass> dataList){
        this.dataList = dataList;
    }

    @Override
    public FinggerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fingger_cardview,parent,false);
        return new FinggerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FinggerViewHolder holder, int position) {
        holder.fingger_id.setText(dataList.get(position).getFingger_id());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class FinggerViewHolder extends RecyclerView.ViewHolder {
        private TextView fingger_id;

        public FinggerViewHolder(@NonNull View itemView) {
            super(itemView);
            fingger_id = (TextView) itemView.findViewById(R.id.fingger_id);
        }
    }
}
