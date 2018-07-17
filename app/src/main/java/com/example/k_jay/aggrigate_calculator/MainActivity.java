package com.example.k_jay.aggrigate_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBcs, btnMaster;
    Intent bcsIntent, MasterIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBcs = (Button) findViewById(R.id.btnBcs);
        btnMaster = (Button) findViewById(R.id.btnMaster);

        btnBcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bcsIntent = new Intent(MainActivity.this, bcs_Activity.class);
                startActivity(bcsIntent);

            }
        });

        btnMaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MasterIntent = new Intent(MainActivity.this, master_Activity.class);
                startActivity(MasterIntent);
            }
        });
    }
}
