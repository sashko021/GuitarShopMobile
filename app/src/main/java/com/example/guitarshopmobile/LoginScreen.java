package com.example.guitarshopmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

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
        DBHelper dbHelper = new DBHelper(LoginScreen.this);


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

                if (username.getText().toString().isEmpty()){
                    Toast.makeText(LoginScreen.this, "Username field is empty.", Toast.LENGTH_SHORT).show();
                }
                else if (password.getText().toString().isEmpty()){
                    Toast.makeText(LoginScreen.this, "Enter password.", Toast.LENGTH_SHORT).show();
                }
                else if (dbHelper.getPasswordandUsername(password.getText().toString(), username.getText().toString())){
                    Intent login = new Intent(LoginScreen.this, ElectricGuitar.class);
                    startActivity(login);
                }
                else Toast.makeText(LoginScreen.this, "Wrong password or username.", Toast.LENGTH_SHORT).show();




            }
        });


    }
}
