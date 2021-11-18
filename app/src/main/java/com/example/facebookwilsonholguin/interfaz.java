package com.example.facebookwilsonholguin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class interfaz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz);
    }

    public void gaa(View view) {
        Intent intent = new Intent(interfaz.this,estado.class);
        startActivity(intent);
    }
}