package com.example.k.kuis1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button gmaps;
    Button deskripsi;
    Button fasilitas;
    Button galeri;
    Button review;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gmaps = (Button) findViewById(R.id.butgmaps);
        gmaps.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                        i.setAction(Intent.ACTION_VIEW);
                        i.addCategory(Intent.CATEGORY_BROWSABLE);
                        i.setData(Uri.parse("https://www.google.co.id/maps/place/Museum+Satwa+Jawa+Timur+Park+2/@-7.8885938,112.5278963,17z/data=!3m1!4b1!4m5!3m4!1s0x2e78812bb84d2d63:0xb594f3837d9ade3f!8m2!3d-7.8885938!4d112.530085"));
                        startActivity(i);
            }
        }));
        deskripsi = (Button) findViewById(R.id.butdeskripsi);
        deskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), deskripsi.class);
                startActivity(i);
                finish();
            }
        });
        fasilitas = (Button) findViewById(R.id.butfasilitas);
        fasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), fasilitas.class);
                startActivity(i);
                finish();
            }
        });
        galeri = (Button) findViewById(R.id.butgaleri);
        galeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity_maingalery.class);
                startActivity(i);
                finish();
            }
        });
        review = (Button) findViewById(R.id.butreview);
        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, review.class);
                startActivity(i);
                finish();
            }
        });

    }
}
