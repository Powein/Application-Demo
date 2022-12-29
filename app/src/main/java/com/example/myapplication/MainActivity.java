package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button)findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent("com.example.activitytest.OPEN_LOGIN_PAGE");
                startActivity(intent);
            }
        });
        Button test = (Button)findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent(MainActivity.this,test.class);
                startActivity(intent);
            }
        });
        Button lesson = (Button)findViewById(R.id.lesson);
        lesson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent(MainActivity.this,lessons.class);
                startActivity(intent);
            }
        });
        Button attention = (Button)findViewById(R.id.attention);
        attention.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent(MainActivity.this,information.class);
                startActivity(intent);
            }
        });
        Button discussion = (Button)findViewById(R.id.discussion);
        discussion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Toast.makeText(MainActivity.this,"开发中",Toast.LENGTH_SHORT).show();
            }
        });
        Button contactus = (Button)findViewById(R.id.contactus);
        contactus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:1145141919810"));
                startActivity(intent);
            }
        });
        Button info = (Button)findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent(MainActivity.this,info.class);
                startActivity(intent);
            }
        });
    }
}