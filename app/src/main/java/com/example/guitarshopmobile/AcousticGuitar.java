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

public class AcousticGuitar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acoustic_guitar);

        RecyclerView recyclerView = findViewById(R.id.recycler2);

        List<Items> items = new ArrayList<Items>();
        items.add(new Items("4",R.drawable.acoustic1,345,"Orangewood Brooklyn"));
        /*items.add(new Items(R.drawable.acoustic2,"170"));
        items.add(new Items(R.drawable.acoustic3,"250"));*/

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}