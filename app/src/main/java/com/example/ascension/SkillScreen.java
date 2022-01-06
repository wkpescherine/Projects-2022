package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class SkillScreen extends AppCompatActivity {
    CharDataConfig config = new CharDataConfig();
    SkillHandler skills = new SkillHandler();
    CharFileHandler saveChar = new CharFileHandler();
    GearBuilder gear = new GearBuilder();
    CharSheet charSheet = new CharSheet();

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
        if(config.charSkills[0] == 0 && config.charStats[0] >= 5) {
            skill001.setVisibility(View.VISIBLE);
            skill002.setVisibility(View.GONE);
        }
        if(config.charSkills[0] == 1){
            skill001.setVisibility(View.GONE);
            skill002.setVisibility(View.VISIBLE);
        }
        if(config.charSkills[1] == 0 && config.charStats[1] >= 5) {
            skill003.setVisibility(View.VISIBLE);
            skill004.setVisibility(View.GONE);
        }
        if (config.charSkills[1] == 1){
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
        nameText.setText(config.charName);
        proText.setText("LVL "+config.charStats[6]+" "+config.charStyle+ " "+config.charRace+ " "+config.charClass);
        strText.setText("STR: " + config.charStats[0] +" + "+ config.charBonus[0]);
        intText.setText("INT: " + config.charStats[1] +" + "+ config.charBonus[1]);
        pieText.setText("PIE: " + config.charStats[2] +" + "+ config.charBonus[2]);
        dexText.setText("DEX: " + config.charStats[3] +" + "+ config.charBonus[3]);
        quiText.setText("QUI: " + config.charStats[4] +" + "+ config.charBonus[4]);
        conText.setText("CON: " + config.charStats[5] +" + "+ config.charBonus[5]);
        // stats array def - toHit, Dodge, AF, SPD
        toHitText.setText("toHit: "+ (config.combatStats[0]+10));
        dodgeText.setText("Dodge: "+ config.combatStats[1]);
        afText.setText("AF: 0");
        spdText.setText("SPD: "+ config.combatStats[3]);
        //Skill point
        skillText.setText("Skill Points: " + config.skillPoints);
        displaySkills();
    }

    public void startGame(View v){
        charSheet.buildCharSheet();
        saveChar.writeCharToFile();
        Intent intent2 = new Intent(this, TownScreen.class);
        startActivity(intent2);
    }

    public void backToChar(View v){
        Intent intent1 = new Intent(this, CreateCharacter.class);
        startActivity(intent1);
    }
}