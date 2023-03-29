package com.example.emark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView registerHere, forgot;
    Button loginBtn;
    EditText user , pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registerHere = findViewById(R.id.register);
        loginBtn = findViewById(R.id.loginbtn);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        forgot = findViewById(R.id.forgot);


        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        if(!sh.getString("name", "").equals("")){
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        }
        else{
            loginBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Login.this , MainActivity.class);
                    startActivity(intent);
//                    if (user.getText().toString().equals("")) {
//                        Toast.makeText(Login.this, "Please Enter Username", Toast.LENGTH_SHORT).show();
//                    } else if (pass.getText().toString().equals("")) {
//                        Toast.makeText(Login.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
//                    } else {
////                        getUserInfo(user.getText().toString());
//                    }
                }
            });
        }

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(Login.this, Forgot.class);
//                startActivity(intent);
            }
        });

        registerHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this , Signup.class);
                startActivity(intent);
            }
        });
    }
}