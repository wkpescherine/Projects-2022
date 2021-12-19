package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;

public class CreateCharacter extends AppCompatActivity {
    String charStyle = "";
    String charRace = "";
    String charClass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character);
    }

    public void handleStyle(View v){
        charStyle ="something";
    }

    public void handleRace(View v){
        charRace="whatever";
    }

    public void handleClass(View v){
        charClass="IDK";
    }

    public void backToMain(View v){ }

    public void loadSkills(View v){ }

}