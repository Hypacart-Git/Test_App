package com.example.test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Aberor_Norbert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aberor__norbert);
    }

    public void moveFromAberor(View view){
        Intent intent = new Intent(getApplicationContext(),Annan_kofi.class);
        startActivity(intent);
    }
}