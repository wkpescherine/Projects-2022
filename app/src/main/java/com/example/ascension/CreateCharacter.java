package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

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
        setStats();
    }

    public void handleRace(View v){
        TextView t2 = (TextView) v;
        String selectRace = t2.getText().toString();
        TextView raceText = findViewById(R.id.charRaceHolder);
        charSheet.updateRace(selectRace);
        raceText.setText(selectRace);
        setStats();
    }

    public void handleClass(View v){
        TextView t3 = (TextView) v;
        String selectClass = t3.getText().toString();
        TextView classText = findViewById(R.id.charClassHolder);
        charSheet.updateClass(selectClass);
        classText.setText(selectClass);
        setStats();
    }

    public void backToMain(View v){
        charSheet.resetUI();
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void loadSkills(View v){
        EditText nameChar = findViewById(R.id.editName);
        charSheet.charName = nameChar+"";
        if(charSheet.charName.length() != 0 && charSheet.charStyle.length() != 0 && charSheet.charRace.length() != 0 && charSheet.charClass.length() != 0){
            Intent intent2 = new Intent(this, SkillScreen.class);
            startActivity(intent2);
        }
    }

    public void setStats(){
        TextView strText = findViewById(R.id.str);
        TextView dexText = findViewById(R.id.dex);
        TextView conText = findViewById(R.id.con);
        TextView intText = findViewById(R.id.intel);
        TextView pieText = findViewById(R.id.pie);
        TextView quiText = findViewById(R.id.qui);
        strText.setText("STR: " + charSheet.charStats[0] +" + "+ charSheet.charBonus[0]);
        dexText.setText("STR: " + charSheet.charStats[1] +" + "+ charSheet.charBonus[1]);
        conText.setText("STR: " + charSheet.charStats[2] +" + "+ charSheet.charBonus[2]);
        intText.setText("STR: " + charSheet.charStats[3] +" + "+ charSheet.charBonus[3]);
        pieText.setText("STR: " + charSheet.charStats[4] +" + "+ charSheet.charBonus[4]);
        quiText.setText("STR: " + charSheet.charStats[5] +" + "+ charSheet.charBonus[5]);
    }
}