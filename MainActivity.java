package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnEmployee(View view){
        Intent intent = new Intent(MainActivity.this,EmployeeActivity.class);
        startActivity(intent);
    }
    public void btnManager(View view){
        Intent intent = new Intent(MainActivity.this,ManagerActivity.class);
        startActivity(intent);
    }
}
