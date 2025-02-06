package com.example.guitarshopmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class ItemView extends AppCompatActivity {

    ImageButton imgButton;
    private List<Integer> imgList  = Arrays.asList(R.drawable.es335, R.drawable.desc1);
    private int imgIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item_view);

        imgButton = findViewById(R.id.imgbtn1);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*imgIndex++;
                if (imgIndex >= imgList.size()) {
                    imgIndex = 0;
                }
                imgButton.setImageResource(imgList.get(imgIndex));*/

            }
        });
        /*imgButton.setOnClickListener(v -> {
            imgIndex++;
            if (imgIndex >= imgList.size()) {
                imgIndex = 0;
            }
            imgButton.setImageResource(imgList.get(imgIndex));
        });*/
    }
}