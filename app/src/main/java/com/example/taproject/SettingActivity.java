package com.example.taproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SettingActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference databaseReference;
    private EditText namaPengguna;
    private EditText namaKeluarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);

        //call database reference and retrive to view
        databaseReference = database.getReference("Device_50:02:91:C9:DF:C4");

        namaPengguna = findViewById(R.id.username_tongkat);
        namaKeluarga = findViewById(R.id.username_keluarga);

        //onclik in setting to fingger list
        TextView textView = (TextView) findViewById(R.id.fingger_button);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFinggerPrint();
            }
        });
    }

    public void getData(){

    }

    public void openFinggerPrint(){
        Intent intent = new Intent(this, FinggerActivity.class);
        startActivity(intent);
    }
}
