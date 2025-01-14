package com.example.guitarshopmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class LoginScreen extends AppCompatActivity {

    EditText username,password;


    protected void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);

        setContentView(R.layout.login_screen_layout);
        AppCompatButton sign_up_btn = findViewById(R.id.signup_btn);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        sign_up_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent("com.example.guitarshopmobile.SignUpScreen");
                startActivity(signup);
            }
        });


    }
}
