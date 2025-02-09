package com.example.guitarshopmobile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;




public class LoginFragment extends Fragment {

    Context thiscontext;
    EditText username, password;
    TextView text1,text2;
    AppCompatButton login_btn,google_btn;
    DBHelper dbHelper;



    public LoginFragment(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.login_fragment_layout, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        username = view.findViewById(R.id.username);
        password = view.findViewById(R.id.password);
        text1 = view.findViewById(R.id.or);
        text2 = view.findViewById(R.id.sign_up_with);
        login_btn = view.findViewById(R.id.Login_button);
        google_btn = view.findViewById(R.id.google_btn);



        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }



    @Override
    public void onStart() {
        super.onStart();

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper = new DBHelper(getContext());
                if (username.getText().toString().isEmpty()){
                    Toast.makeText(LoginFragment.this.getContext(), "Username field is empty.", Toast.LENGTH_SHORT).show();
                }
                else if (password.getText().toString().isEmpty()){
                    Toast.makeText(LoginFragment.this.getContext(), "Password field is empty.", Toast.LENGTH_SHORT).show();
                }
                else if (!dbHelper.getPasswordandUsername(username.getText().toString(), password.getText().toString())){
                    Intent intent = new Intent(LoginFragment.this.getContext(), MainActivity.class);
                    startActivity(intent);
                }
                else Toast.makeText(LoginFragment.this.getContext(), "Such an account doesn't exist.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

