package com.example.guitarshopmobile;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imgGuitar;
    TextView descView, priceView;
    Button cartButton;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imgGuitar = itemView.findViewById(R.id.img1);
        descView = itemView.findViewById(R.id.desc1);
        priceView = itemView.findViewById(R.id.price1);
        cartButton = itemView.findViewById(R.id.btn1);
    }
}
