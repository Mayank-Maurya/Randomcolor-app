package com.example.mayank;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import static java.lang.Math.E;


public class MainActivity extends AppCompatActivity {
   Button color;
   TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color=findViewById(R.id.changeit);
        tv=findViewById(R.id.textView2);
        int len=20;
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View someView = findViewById(R.id.main);
                View root = someView.getRootView();
                String id = UUID.randomUUID().toString();
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                root.setBackgroundColor(color);
                tv.setText(id);

            }
        });


    }
}



