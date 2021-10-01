package com.example.akashimg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.akashimg.Wanganteng1;
import com.example.akashimg.Wanganteng2;
import com.example.akashimg.Wanganteng3;
import com.example.akashimg.Wanganteng4;
import com.example.akashimg.Wanganteng5;
import com.example.akashimg.Wanganteng6;

public class MainActivity extends AppCompatActivity {

    ImageView ivbeer, ivcoffe, ivhotchocolate, ivjuice, ivmilk, ivtea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivbeer = findViewById(R.id.iv_beer);
        ivbeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Wanganteng1.class);
                startActivity(intent);
            }
        });

        ivcoffe = findViewById(R.id.iv_Coffe);
        ivcoffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Wanganteng2.class);
                startActivity(intent);
            }
        });

        ivhotchocolate = findViewById(R.id.iv_hotchocolate);
        ivhotchocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Wanganteng3.class);
                startActivity(intent);
            }
        });

        ivjuice = findViewById(R.id.iv_juice);
        ivjuice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Wanganteng4.class);
                startActivity(intent);
            }
        });

        ivmilk = findViewById(R.id.iv_milk);
        ivmilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Wanganteng5.class);
                startActivity(intent);
            }
        });

        ivtea = findViewById(R.id.iv_tea);
        ivtea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Wanganteng6.class);
                startActivity(intent);
            }
        });

    }
}