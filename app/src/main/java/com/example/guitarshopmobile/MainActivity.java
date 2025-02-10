package com.example.guitarshopmobile;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;


import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ImageButton eGuitar;
    ImageButton aGuitar;
    ImageButton cGuitar;
    ImageButton bGuitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.menubar);
        setSupportActionBar(toolbar);



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
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.cart)
        {
            Intent intent=new Intent(this,Cart.class);
            startActivity(intent);
        } else if (item.getItemId()==R.id.logout)
        {
            Intent intent1=new Intent(this, LoginScreen.class);
            startActivity(intent1);
        } else if (item.getItemId()==R.id.home)
        {
            Intent intent2=new Intent(this, MainActivity.class);
            startActivity(intent2);
        }
        return super.onOptionsItemSelected(item);
    }

}