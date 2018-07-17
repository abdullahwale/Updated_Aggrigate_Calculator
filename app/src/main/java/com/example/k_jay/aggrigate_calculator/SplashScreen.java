package com.example.k_jay.aggrigate_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    Intent mainIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread splashThread = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(5000);

                    mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(mainIntent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splashThread.start();
    }
}
