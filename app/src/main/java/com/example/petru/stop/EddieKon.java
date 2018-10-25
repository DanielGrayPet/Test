package com.example.petru.stop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EddieKon extends AppCompatActivity {
    Button btn1;
    ImageView suit, edD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eddie_kon);
        btn1 = findViewById(R.id.eddsuitbtn);
        suit = findViewById(R.id.eddiesuit);
        suit.setImageAlpha(0x0);
        edD = findViewById(R.id.EkD);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edD.setImageAlpha(0x0);
                suit.setImageAlpha(0xff);
            }
        });
    }
}
