package com.example.guitarshopmobile;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;


import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        eGuitar = (ImageButton) findViewById(R.id.electric);
        aGuitar = (ImageButton) findViewById(R.id.acoustic);
        cGuitar = (ImageButton) findViewById(R.id.classical);
        bGuitar = (ImageButton) findViewById(R.id.bass);

        eGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,ElectricGuitar.class);
                startActivity(intent);
            }
        });
        aGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,AcousticGuitar.class);
                startActivity(intent);
            }
        });
        cGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,ClassicalGuitar.class);
                startActivity(intent);
            }
        });
        bGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,BassGuitar.class);
                startActivity(intent);
            }
        });*/
    }
}