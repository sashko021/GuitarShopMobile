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

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class SignUpScreen extends AppCompatActivity {

    TextInputLayout password_layout, reenter_password_layout;
    TextInputEditText password, repassword;
    EditText email,username;
    AppCompatButton btn_sign;
    ImageButton back_button;


    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);

        setContentView(R.layout.sign_up_screen);
        password_layout = findViewById(R.id.password_layout);
        reenter_password_layout = findViewById(R.id.reenter_password_layout);
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
                // usermodel = new Usermodel(1, username.getText().toString(), email.getText().toString(), password.toString());
                //Check correctness of email
                if (email.getText().toString().isEmpty()){
                    Toast.makeText(SignUpScreen.this, "Email field is empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    boolean exists = dbHelper.getEmail(email.getText().toString());
                    if (exists){
                        Toast.makeText(SignUpScreen.this, "An account using this email already exists.", Toast.LENGTH_SHORT).show();
                    }
                    else Toast.makeText(SignUpScreen.this, "Light weight babyyy", Toast.LENGTH_SHORT).show();
                }

                //Check correctness of username
                if (username.getText().toString().isEmpty()){
                    Toast.makeText(SignUpScreen.this, "Username field is empty", Toast.LENGTH_SHORT).show();
                }

                //Check correctness of password
                if (password.toString().isEmpty()){
                    Toast.makeText(SignUpScreen.this, "Password field is empty", Toast.LENGTH_SHORT).show();
                }

                //Check correctness of second password
                if (repassword.toString().isEmpty()){
                    Toast.makeText(SignUpScreen.this, "Repeat password field is empty", Toast.LENGTH_SHORT).show();
                }

                //Check if the passwords are the same
                else if(!password.getText().toString().equals(repassword.getText().toString())){
                    Toast.makeText(SignUpScreen.this, "The passwords do not match", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}
