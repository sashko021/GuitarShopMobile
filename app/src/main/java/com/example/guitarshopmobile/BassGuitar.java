package com.example.guitarshopmobile;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BassGuitar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bass_guitar);

        RecyclerView recyclerView = findViewById(R.id.recycler4);

        List<Items> items = new ArrayList<Items>();
        items.add(new Items("10",R.drawable.bass2,108,"J&D Bass Black"));
        /*items.add(new Items(R.drawable.bass2,"170"));
        items.add(new Items(R.drawable.bass3,"250"));*/

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}