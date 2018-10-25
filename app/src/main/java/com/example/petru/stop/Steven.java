package com.example.petru.stop;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Steven extends AppCompatActivity {
    Button btn1;
    ImageView Default, Suit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steven);
        btn1 = findViewById(R.id.Suitbtn);
        Suit = findViewById(R.id.Suit);
        Default = findViewById(R.id.StD);
        Suit.setImageAlpha(0x0);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Default.setImageAlpha(0x0);
                Suit.setImageAlpha(0xff);
            }
        });
    }
}
