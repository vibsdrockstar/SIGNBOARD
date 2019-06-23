package com.example.road;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }
    public void openNextPage(View view) {
        startActivity(new Intent(this,CamScanner.class));
    }
}
