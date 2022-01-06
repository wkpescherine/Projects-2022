package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class TownScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void clickForge(){}

    public void clickHome(){}

    public void clickDungeon(View v){
        Intent intent = new Intent(this, Dungeon.class);
        startActivity(intent);
    }

    public void clickCharSheet(View v){
        Intent intent = new Intent(this, CharScreen.class);
        startActivity(intent);
    }
}