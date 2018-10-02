package com.example.k.kuis1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class fasilitas extends AppCompatActivity {
    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);

        myButton = (Button) findViewById(R.id.ButtonToilet);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (fasilitas.this, activity_toilet.class);
                startActivity(i);
            }
        });

        myButton = (Button) findViewById(R.id.ButtonFood);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (fasilitas.this, activity_food.class);
                startActivity(i);
            }
        });

        myButton = (Button) findViewById(R.id.ButtonInfo);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (fasilitas.this, activity_info.class);
                startActivity(i);
            }
        });

        myButton = (Button) findViewById(R.id.ButtonParkir);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (fasilitas.this, activity_parkir.class);
                startActivity(i);
            }
        });

        myButton = (Button) findViewById(R.id.btnhome1);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (fasilitas.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}

