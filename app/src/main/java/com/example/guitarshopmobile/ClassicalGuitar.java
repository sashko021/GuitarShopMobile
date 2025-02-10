package com.example.guitarshopmobile;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ClassicalGuitar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_classical_guitar);

        RecyclerView recyclerView = findViewById(R.id.recycler3);

        List<Items> items = new ArrayList<Items>();
        items.add(new Items("7",R.drawable.classical1,115,"Valencia VC104BUS"));
        /*items.add(new Items(R.drawable.classical2,"170"));
        items.add(new Items(R.drawable.classical3,"250"));*/

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}