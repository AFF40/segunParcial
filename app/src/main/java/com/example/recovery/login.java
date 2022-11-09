package com.example.recovery;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }
    public void goCreateAccount(View view){
        Intent intent= new Intent(this, CreateAccountActivity.class);
        startActivity(intent);

    }
}