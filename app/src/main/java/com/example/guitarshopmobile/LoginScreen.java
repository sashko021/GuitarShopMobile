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
        AppCompatButton login_btn = findViewById(R.id.Login_button);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        sign_up_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent(LoginScreen.this, SignUpScreen.class);
                startActivity(signup);
            }
        });



        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(LoginScreen.this, ElectricGuitar.class);
                startActivity(login);
            }
        });


    }
}
