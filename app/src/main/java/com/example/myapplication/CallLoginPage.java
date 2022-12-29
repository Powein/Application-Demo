package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CallLoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        Button svDt0 = (Button) findViewById(R.id.saveData0);
        Button svDt1 = (Button) findViewById(R.id.saveData1);
        Button delDt0 = (Button) findViewById(R.id.deleteData0);
        Button delDt1 = (Button) findViewById(R.id.deleteData1);
        svDt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CallLoginPage.this,"开发中",Toast.LENGTH_SHORT).show();
            }

        });
        svDt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CallLoginPage.this,"开发中",Toast.LENGTH_SHORT).show();
            }
        });
        delDt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CallLoginPage.this,"开发中",Toast.LENGTH_SHORT).show();
            }
        });
        delDt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CallLoginPage.this,"开发中",Toast.LENGTH_SHORT).show();
            }
        });
    }
}