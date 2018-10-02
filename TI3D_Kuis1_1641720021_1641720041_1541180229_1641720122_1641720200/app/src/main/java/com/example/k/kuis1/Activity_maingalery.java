package com.example.k.kuis1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_maingalery extends AppCompatActivity {


    Button btnTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maingalery);

        btnTop = (Button) findViewById(R.id.btnTop);

        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity_maingalery.this, activity_hal_satu.class);
                startActivity(i);
            }
        });

    }
}

