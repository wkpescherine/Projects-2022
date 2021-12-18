package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void loadCharScreen(View v){
        Intent intent = new Intent(this, LoadCharacter.class);
        startActivity(intent);
    }

    public void createCharScreen(View v){
        Intent intent = new Intent(this, CreateCharacter.class);
        startActivity(intent);
    }
}