package com.example.leemalarmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enter(View v){

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        float rating = ratingBar.getRating();

        Intent goToSecond = new Intent();
        goToSecond.setClass(this, SecondActivity.class);
        goToSecond.putExtra("nbStars",rating);
        ratingBar.setRating(0.0f);
        //Intent goToThird = new Intent();
        //startActivity(goToThird);
        startActivity(goToSecond);





    }

}