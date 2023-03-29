package com.example.emark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.emark.lib.models.Users;

public class Signup extends AppCompatActivity {

    Button registerBtn;
    TextView loginBtn;
    TextView rollno , username , email , college, password, confirmPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);



        loginBtn = findViewById(R.id.loginbtn);
        registerBtn = findViewById(R.id.registerBtn);

        rollno = findViewById(R.id.rollno);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        college = findViewById(R.id.college);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.cpassword);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this , Login.class);
                startActivity(intent);
            }
        });


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(password.getText().toString().equals(confirmPassword.getText().toString())){
                    if (nullCheck(rollno , username, email, college, password, confirmPassword)){
//                        User user = new User();
//                        user.setRollNo(rollno.getText().toString());
//                        user.setPassword(password.getText().toString());
//                        user.setEmail(email.getText().toString());
//                        user.setCollegeName(college.getText().toString());
//                        user.setName(username.getText().toString());
//                        createUser(user);
                    }else {
                        Toast.makeText(Signup.this, "Please Fill All The Entries", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(Signup.this, "Passwords Must Be Equal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private Boolean nullCheck(TextView rollno , TextView name , TextView email, TextView college, TextView pass, TextView cpass){
        if(rollno.getText().toString().equals("") ||
                email.getText().toString().equals("") ||
                name.getText().toString().equals("") ||
                college.getText().toString().equals("") ||
                pass.getText().toString().equals("") ||
                cpass.getText().toString().equals("")){
            return false;
        }else {
            return true;
        }
    }
}