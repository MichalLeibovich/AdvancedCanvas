package com.example.advancedcanvas;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    WritingView writingView;
    //Drawing1 drawing;


//
    //ActivityMainBinding binding;
    //

    int mDafaultColor = Color.GREEN;
    float defStroke = 20f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        //
        //setContentView(binding.getRoot());
        //writingView = findViewById(R.id.myview);
        //
        writingView = new WritingView(this);



    }
}