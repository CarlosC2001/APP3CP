package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    private static final int SPLASH_TIMEOUT = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Este método se ejecutará después del tiempo definido en SPLASH_TIMEOUT
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish(); // Cierra la actividad actual para evitar que el usuario regrese a la pantalla de splash
            }
        }, SPLASH_TIMEOUT);

    }
}