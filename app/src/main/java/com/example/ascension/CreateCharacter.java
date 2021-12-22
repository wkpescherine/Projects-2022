package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class CreateCharacter extends AppCompatActivity {
    CharDataConfig charSheet = new CharDataConfig();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character);
    }

    public void handleStyle(View v){
        TextView t1 = (TextView) v;
        String selectStyle = t1.getText().toString();
        TextView styleText = findViewById(R.id.charStyleHolder);
        charSheet.updateStyle(selectStyle);
        styleText.setText(selectStyle);
    }

    public void handleRace(View v){
        TextView t2 = (TextView) v;
        String selectRace = t2.getText().toString();
        TextView raceText = findViewById(R.id.charRaceHolder);
        charSheet.updateRace(selectRace);
        raceText.setText(selectRace);
    }

    public void handleClass(View v){
        TextView t3 = (TextView) v;
        String selectClass = t3.getText().toString();
        TextView classText = findViewById(R.id.charClassHolder);
        charSheet.updateClass(selectClass);
        classText.setText(selectClass);
    }

    public void backToMain(View v){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void loadSkills(View v){
        Intent intent2 = new Intent(this, SkillScreen.class);
        startActivity(intent2);
    }
}