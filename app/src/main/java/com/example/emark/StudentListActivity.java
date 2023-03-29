package com.example.emark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.emark.adapters.StListAdapter;
import com.example.emark.lib.models.Users;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity {


    private static ArrayList<Users> studentList = new ArrayList<>();
    private static RecyclerView stList;
    private static StListAdapter stListAdapter;
    private static Users user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        stList = findViewById(R.id.stList);

        if(studentList.size()>0){
            studentList.clear();
        }

        studentList.add(new Users(1 ,"ABC000" , "!@#ABC" , "Harsh Verma" , "Student" , "B Tech"  , "CSE" , "1st", "jhagjdshkgsadkgasjda" , "9140203313" , "https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80"));
        studentList.add(new Users(2 ,"ABC000" , "!@#ABC" , "Himanshu Shekhar" , "Student" , "B Tech"  , "CSE" , "2nd", "jhagjdshkgsadkgasjda" , "9140203313" , "https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80"));
        studentList.add(new Users(3 ,"ABC000" , "!@#ABC" , "Vipin Kishor" , "Student" , "B Tech"  , "IT" , "3rd", "jhagjdshkgsadkgasjda" , "9140203313" , "https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80"));
        studentList.add(new Users(4 ,"ABC000" , "!@#ABC" , "Rishabh Mishra" , "Student" , "B Tech"  , "ME" , "1st", "jhagjdshkgsadkgasjda" , "9140203313" , "https://images.unsplash.com/photo-1633332755192-727a05c4013d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80"));
        studentList.add(new Users(5 ,"ABC000" , "!@#ABC" , "Rishabh Sharma" , "Student" , "B Tech"  , "CSE" , "3rd", "jhagjdshkgsadkgasjda" , "9140203313" , "jdsbahjgdashdgasj"));
        studentList.add(new Users(6 ,"ABC000" , "!@#ABC" , "Madhav Muskan" , "Student" , "B Tech"  , "IT" , "4th", "jhagjdshkgsadkgasjda" , "9140203313" , "jdsbahjgdashdgasj"));
        studentList.add(new Users(7 ,"ABC000" , "!@#ABC" , "Haarish Khan" , "Student" , "B Tech"  , "EE" , "2nd", "jhagjdshkgsadkgasjda" , "9140203313" , "jdsbahjgdashdgasj"));
        studentList.add(new Users(8 ,"ABC000" , "!@#ABC" , "Sharmishtha Sinha" , "Student" , "B Tech"  , "ME" , "4th", "jhagjdshkgsadkgasjda" , "9140203313" , "jdsbahjgdashdgasj"));
        studentList.add(new Users(9 ,"ABC000" , "!@#ABC" , "Shatakshi Kaushik" , "Student" , "BBA"  , "CSE" , "1st", "jhagjdshkgsadkgasjda" , "9140203313" , "jdsbahjgdashdgasj"));
        studentList.add(new Users(10 ,"ABC000" , "!@#ABC" , "Varun Gupta" , "Student" , "BBA"  , "CSE" , "2nd", "jhagjdshkgsadkgasjda" , "9140203313" , "jdsbahjgdashdgasj"));
        studentList.add(new Users(11 ,"ABC000" , "!@#ABC" , "Atul Singh" , "Student" , "BBA"  , "CSE" , "3rd", "jhagjdshkgsadkgasjda" , "9140203313" , "jdsbahjgdashdgasj"));
        studentList.add(new Users(12 ,"ABC000" , "!@#ABC" , "Neeha Kapoor" , "Student" , "BBA"  , "CSE" , "2nd", "jhagjdshkgsadkgasjda" , "9140203313" , "jdsbahjgdashdgasj"));
        studentList.add(new Users(13 ,"ABC000" , "!@#ABC" , "Nishachan" , "Student" , "BBA"  , "CSE" , "2nd", "jhagjdshkgsadkgasjda" , "9140203313" , "jdsbahjgdashdgasj"));

        Intent intent = getIntent();
        String course = intent.getStringExtra("course");
        String branch = intent.getStringExtra("branch");
        String year = intent.getStringExtra("year");

        ArrayList<Users> showableUser = new ArrayList<>();
        if(showableUser.size()>0){
            showableUser.clear();
        }
        for(Users u:studentList){
            if (u.getCourse_id().equals(course) && u.getYear_id().equals(year) && u.getBranch_id().equals(branch)){
                showableUser.add(u);
            }
        }


        stListAdapter = new StListAdapter(this, showableUser);
        stList.setAdapter(stListAdapter);
        stList.setLayoutManager(new LinearLayoutManager(this));


        Toast.makeText(this, " " + course + " " + branch + " " + year, Toast.LENGTH_SHORT).show();
    }
}