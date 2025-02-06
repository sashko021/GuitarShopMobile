package com.example.guitarshopmobile;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageButton imgGuitar;
    TextView priceView;
    Button cartButton;
    ImageButton description;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imgGuitar = itemView.findViewById(R.id.imgbtn1);
        /*description = itemView.findViewById(R.id.desc1);*/
        priceView = itemView.findViewById(R.id.price1);
        cartButton = itemView.findViewById(R.id.btn1);
    }
}
