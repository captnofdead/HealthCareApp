package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

public class ManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
    }
    public void btnSubmit(View view){
        String toastText = "Accessing the database";
        Toast.makeText(this,toastText,Toast.LENGTH_LONG).show();
    }

}
