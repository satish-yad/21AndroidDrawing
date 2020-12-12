package com.example.androiddrawing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomTextView customTextView= new CustomTextView(this, null);

        Drawing drawing= new Drawing(this);
        setContentView(customTextView);
    }
}