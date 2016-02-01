package com.richdroid.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSpotify(View view) {
        Toast.makeText(this, "This button will launch my spotify app", Toast.LENGTH_SHORT).show();
    }

    public void openScores(View view) {
        Toast.makeText(this, "This button will launch my scores app", Toast.LENGTH_SHORT).show();
    }

    public void openLibrary(View view) {
        Toast.makeText(this, "This button will launch my library app", Toast.LENGTH_SHORT).show();
    }

    public void openBigger(View view) {
        Toast.makeText(this, "This button will launch my bigger app", Toast.LENGTH_SHORT).show();
    }

    public void openBaconReader(View view) {
        Toast.makeText(this, "This button will launch my bacon reader app", Toast.LENGTH_SHORT).show();
    }

    public void openCapstone(View view) {
        Toast.makeText(this, "This button will launch my capstone app", Toast.LENGTH_SHORT).show();
    }
}

