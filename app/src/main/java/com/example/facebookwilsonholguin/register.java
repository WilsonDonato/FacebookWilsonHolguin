package com.example.facebookwilsonholguin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void entraa(View view) {
        Intent intent = new Intent(register.this,interfaz.class);
        startActivity(intent);
        Toast.makeText(register.this,
                "Se registro exitosamente", Toast.LENGTH_SHORT).show();
    }
}