package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class SkillScreen extends AppCompatActivity {
    CharDataConfig charSheet = new CharDataConfig();
    SkillHandler skills = new SkillHandler();
    CharFileHandler saveChar = new CharFileHandler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setStats();
    }

    public void skillPicker(View v){
        String skillSelected = getResources().getResourceEntryName(v.getId());
        skills.SkillList(skillSelected);
        displaySkills();
    }

    public void displaySkills(){
        TextView skill001 = findViewById(R.id.sweepU1);
        TextView skill002 = findViewById(R.id.sweepA1);
        TextView skill003 = findViewById(R.id.sparkU1);
        TextView skill004 = findViewById(R.id.sparkA1);
        if(charSheet.charSkills[0] == 0 && charSheet.charStats[0] >= 5) {
            skill001.setVisibility(View.VISIBLE);
            skill002.setVisibility(View.GONE);
        }
        if(charSheet.charSkills[0] == 1){
            skill001.setVisibility(View.GONE);
            skill002.setVisibility(View.VISIBLE);
        }
        if(charSheet.charSkills[1] == 0 && charSheet.charStats[1] >= 5) {
            skill003.setVisibility(View.VISIBLE);
            skill004.setVisibility(View.GONE);
        }
        if (charSheet.charSkills[1] == 1){
            skill003.setVisibility(View.GONE);
            skill004.setVisibility(View.VISIBLE);
        }
    }

    public void setStats(){
        TextView strText = findViewById(R.id.str);
        TextView dexText = findViewById(R.id.dex);
        TextView conText = findViewById(R.id.con);
        TextView intText = findViewById(R.id.intel);
        TextView pieText = findViewById(R.id.pie);
        TextView quiText = findViewById(R.id.qui);
        TextView toHitText = findViewById(R.id.toHit);
        TextView dodgeText = findViewById(R.id.dodge);
        TextView afText = findViewById(R.id.armor);
        TextView spdText = findViewById(R.id.speed);
        TextView nameText = findViewById(R.id.nameChar);
        TextView proText = findViewById(R.id.profession);
        TextView skillText = findViewById(R.id.skillpts);
        //stats array def -str int, pie, qui, dex, con
        nameText.setText(charSheet.charName);
        proText.setText(charSheet.charStyle+ " "+charSheet.charRace+ " "+charSheet.charClass);
        strText.setText("STR: " + charSheet.charStats[0] +" + "+ charSheet.charBonus[0]);
        intText.setText("INT: " + charSheet.charStats[1] +" + "+ charSheet.charBonus[1]);
        pieText.setText("PIE: " + charSheet.charStats[2] +" + "+ charSheet.charBonus[2]);
        dexText.setText("DEX: " + charSheet.charStats[3] +" + "+ charSheet.charBonus[3]);
        quiText.setText("QUI: " + charSheet.charStats[4] +" + "+ charSheet.charBonus[4]);
        conText.setText("CON: " + charSheet.charStats[5] +" + "+ charSheet.charBonus[5]);
        // stats array def - toHit, Dodge, AF, SPD
        toHitText.setText("toHit: "+ (charSheet.combatStats[0]+10));
        dodgeText.setText("Dodge: "+ charSheet.combatStats[1]);
        afText.setText("AF: 0");
        spdText.setText("SPD: "+ charSheet.combatStats[3]);
        //Skill point
        skillText.setText("Skill Points: " + charSheet.skillPoints);
        displaySkills();
    }

    public void startGame(View v){
        saveChar.writeCharToFile();
        Intent intent2 = new Intent(this, TownScreen.class);
        startActivity(intent2);
    }

    public void backToChar(View v){
        Intent intent1 = new Intent(this, CreateCharacter.class);
        startActivity(intent1);
    }
}