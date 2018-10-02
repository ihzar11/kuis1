package com.example.k.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_hal_satu extends AppCompatActivity {

    private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_satu);

        myButton = (Button) findViewById(R.id.ButtonBack2);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (activity_hal_satu.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
