package com.example.guitarshopmobile;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;


import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SignUpFragment extends Fragment {

    TextInputEditText password, repassword;
    EditText email,username;
    AppCompatButton btn_sign;
    public SignUpFragment() {
        // Required empty public constructor
    }
    public boolean isEmailValid(String email)
    {
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        final Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.signup_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    email = view.findViewById(R.id.email);
    username = view.findViewById(R.id.username);
    password = view.findViewById(R.id.password);
    repassword = view.findViewById(R.id.reenter_password);
    btn_sign = view.findViewById(R.id.signup_btn);



        }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usermodel usermodel;
                DBHelper dbHelper = new DBHelper(SignUpFragment.this.getContext());

                //Check correctness of email
                if (email.getText().toString().isEmpty()){
                    Toast.makeText(SignUpFragment.this.getContext(), "Email field is empty", Toast.LENGTH_SHORT).show();
                }
                //Check if email format is valid
                else if (isEmailValid(email.getText().toString())) {
                    //Check if the email already exists
                    boolean exists = dbHelper.getEmail(email.getText().toString());
                    if (exists){
                        Toast.makeText(SignUpFragment.this.getContext(), "An account using this email already exists.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        //Check correctness of username
                        if (username.getText().toString().isEmpty()){
                            Toast.makeText(SignUpFragment.this.getContext(), "Username field is empty", Toast.LENGTH_SHORT).show();
                        }
                        else if (dbHelper.getUsername(username.getText().toString())) {
                            Toast.makeText(SignUpFragment.this.getContext(), "An account using this username already exists.", Toast.LENGTH_SHORT).show();
                        }

                        //Check correctness of password
                        else if (password.toString().isEmpty()){
                            Toast.makeText(SignUpFragment.this.getContext(), "Password field is empty", Toast.LENGTH_SHORT).show();
                        }

                        //Check correctness of second password
                        else if (repassword.toString().isEmpty()){
                            Toast.makeText(SignUpFragment.this.getContext(), "Repeat password field is empty", Toast.LENGTH_SHORT).show();
                        }

                        //Check if the passwords are the same
                        else if(!Objects.requireNonNull(password.getText()).toString().equals(Objects.requireNonNull(repassword.getText()).toString())){
                            Toast.makeText(SignUpFragment.this.getContext(), "The passwords do not match", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            try {
                                usermodel = new Usermodel(1, username.getText().toString(), email.getText().toString(), Objects.requireNonNull(password.getText()).toString());
                                dbHelper.addOne(usermodel);
                                Toast.makeText(SignUpFragment.this.getContext(), "Your account has been created", Toast.LENGTH_SHORT).show();
                            }
                            catch (Exception e) {
                                Toast.makeText(SignUpFragment.this.getContext(), "Something went wrong :(", Toast.LENGTH_SHORT).show();
                            }
                        }


                    }
                }
                else Toast.makeText(SignUpFragment.this.getContext(), "Invalid email", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
