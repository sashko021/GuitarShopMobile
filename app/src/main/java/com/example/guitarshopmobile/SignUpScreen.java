package com.example.guitarshopmobile;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class SignUpScreen extends AppCompatActivity {

    EditText email,username, password, repassword;
    AppCompatButton btn_sign;
    ImageButton back_button;


    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);

        setContentView(R.layout.sign_up_screen);
        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        repassword = findViewById(R.id.reenter_password);
        btn_sign = findViewById(R.id.signup_btn);
        back_button = findViewById(R.id.back_btn);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtoLogin = new Intent("com.example.guitarshopmobile.LOGIN");
                startActivity(backtoLogin);
            }
        });
        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usermodel usermodel;
                DBHelper dbHelper = new DBHelper(SignUpScreen.this);
                try{
                    usermodel = new Usermodel(1, username.getText().toString(), email.getText().toString(), password.getText().toString());
                    Toast.makeText(SignUpScreen.this, "Success", Toast.LENGTH_SHORT).show();
                    dbHelper.addOne(usermodel);
                    int version = dbHelper.dbVersion();
                    Toast.makeText(SignUpScreen.this, "Version is:" + version , Toast.LENGTH_SHORT).show();
                    dbHelper.close();

                }
                catch (Exception e){
                    Toast.makeText(SignUpScreen.this, "Fail", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
