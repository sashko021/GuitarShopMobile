package com.example.guitarshopmobile;

import android.content.ClipData;
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

public class ElectricGuitar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_electric_guitar);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        List<Items> items = new ArrayList<Items>();
        items.add(new Items(R.drawable.es335,"Epiphone-ES225\n" +
                "Body\tLayered Maple\t" +
                "Neck\tMahogany\t" +
                "Neck Shape\tRounded C\t" +
                "Fingerboard\tIndian Laurel\t" +
                "Scale\t24.724\t" +
                "        Frets\t22\t" +
                "    Nut\tGraph Tech NuBone\t" +
                "    Nut Width\t1.693\t" +
                "    Controls\t2 x Volume, 2 x Tone, 3 Way Selector\t" +
                "    Bridge\tTune-O-Matic","470$"));
        items.add(new Items(R.drawable.es335_2,"Epiphone","470$"));
        items.add(new Items(R.drawable.es335,"Epiphone","470$"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}