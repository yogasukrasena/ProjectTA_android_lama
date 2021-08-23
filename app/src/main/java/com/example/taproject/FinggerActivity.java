package com.example.taproject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FinggerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FinggerAdapter adapter;
    private ArrayList<FinggerClass> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fingger_activity);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_fingger);

        adapter = new FinggerAdapter(dataList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FinggerActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    void addData(){
        int i;
        dataList = new ArrayList<>();
        for(i=1;i<=6;i++){
            String data = Integer.toString(i);
            dataList.add(new FinggerClass(data));
        }
    }
}
