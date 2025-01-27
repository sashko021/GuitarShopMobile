package com.example.guitarshopmobile;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class ItemView extends AppCompatActivity {

    ImageButton imgButton;
    private List<Integer> imgList = Arrays.asList(R.drawable.es335, R.id.desc1);
    private int imgIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item_view);

        imgButton = (ImageButton) findViewById(R.id.btn);
        imgButton.setOnClickListener(v -> {
            imgIndex++;
            if (imgIndex >= imgList.size()) {
                imgIndex = 0;
            }
            imgButton.setImageResource(imgList.get(imgIndex));
        });
    }
}