package com.example.facebookwilsonholguin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setTheme(R.style.Theme_FacebookWilsonHolguin);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        Intent intent = new Intent(MainActivity.this,register.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this,
                "Registre sus datos aqui", Toast.LENGTH_SHORT).show();
    }

    public void entrar(View view) {
        Intent intent = new Intent(MainActivity.this,interfaz.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this,
                "Se logeo exitosamente", Toast.LENGTH_SHORT).show();
    }


}