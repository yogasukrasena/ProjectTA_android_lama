package com.example.taproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);

        //onclik in setting to fingger list
        TextView textView = (TextView) findViewById(R.id.fingger_button);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFinggerPrint();
            }
        });
    }

    public void openFinggerPrint(){
        Intent intent = new Intent(this, FinggerActivity.class);
        startActivity(intent);
    }
}
