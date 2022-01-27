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
        TextView skill001 = findViewById(R.id.slashU1);
        TextView skill002 = findViewById(R.id.slashA1);
        TextView skill003 = findViewById(R.id.sparkU1);
        TextView skill004 = findViewById(R.id.sparkA1);
        TextView skill005 = findViewById(R.id.mindnumbU1);
        TextView skill006 = findViewById(R.id.mindnumbA1);
        TextView skill007 = findViewById(R.id.dualwieldU1);
        TextView skill008 = findViewById(R.id.dualwieldA1);
        TextView skill009 = findViewById(R.id.lifetapU1);
        TextView skill010 = findViewById(R.id.lifetapA1);
        TextView skill011 = findViewById(R.id.healU1);
        TextView skill012 = findViewById(R.id.healA1);
        TextView skill013 = findViewById(R.id.stealthU1);
        TextView skill014 = findViewById(R.id.stealthA1);
        TextView skill015 = findViewById(R.id.quickshotU1);
        TextView skill016 = findViewById(R.id.quickshotA1);
        if(config.charSkills[0] == 0 && (config.charStats[0] >= 10 || config.charClass.equals("Warrior"))) {
            skill001.setVisibility(View.VISIBLE);
            skill002.setVisibility(View.GONE);
        }
        if(config.charSkills[0] == 1){
            skill001.setVisibility(View.GONE);
            skill002.setVisibility(View.VISIBLE);
        }
        if(config.charSkills[1] == 0 && (config.charStats[1] >= 10 || config.charClass.equals("Mage"))) {
            skill003.setVisibility(View.VISIBLE);
            skill004.setVisibility(View.GONE);
        }
        if (config.charSkills[1] == 1){
            skill003.setVisibility(View.GONE);
            skill004.setVisibility(View.VISIBLE);
        }
        if(config.charSkills[2] == 0 && config.charClass.equals("MindWeaver")) {
            skill005.setVisibility(View.VISIBLE);
            skill006.setVisibility(View.GONE);
        }
        if(config.charSkills[2] == 1){
            skill005.setVisibility(View.GONE);
            skill006.setVisibility(View.VISIBLE);
        }
        if(config.charSkills[3] == 0 && config.charClass.equals("Berzerker")) {
            skill007.setVisibility(View.VISIBLE);
            skill008.setVisibility(View.GONE);
        }
        if (config.charSkills[3] == 1){
            skill007.setVisibility(View.GONE);
            skill008.setVisibility(View.VISIBLE);
        }
        if(config.charSkills[4] == 0 && config.charClass.equals("Flayer")) {
            skill009.setVisibility(View.VISIBLE);
            skill010.setVisibility(View.GONE);
        }
        if (config.charSkills[4] == 1){
            skill009.setVisibility(View.GONE);
            skill010.setVisibility(View.VISIBLE);
        }
        if(config.charSkills[5] == 0 && config.charClass.equals("Priest")) {
            skill011.setVisibility(View.VISIBLE);
            skill012.setVisibility(View.GONE);
        }
        if (config.charSkills[5] == 1){
            skill011.setVisibility(View.GONE);
            skill012.setVisibility(View.VISIBLE);
        }
        if(config.charSkills[6] == 0 && (config.charClass.equals("Thief") || config.charClass.equals("Slither"))) {
            skill013.setVisibility(View.VISIBLE);
            skill014.setVisibility(View.GONE);
        }
        if (config.charSkills[6] == 1){
            skill013.setVisibility(View.GONE);
            skill014.setVisibility(View.VISIBLE);
        }
        if(config.charSkills[7] == 0 && (config.charClass.equals("Ranger"))) {
            skill015.setVisibility(View.VISIBLE);
            skill016.setVisibility(View.GONE);
        }
        if (config.charSkills[7] == 1){
            skill015.setVisibility(View.GONE);
            skill016.setVisibility(View.VISIBLE);
        }
    }

    public void setStats(){
        int [] nullify = {0,0,0,0,0,0,0,0};
        config.charSkills = nullify;
        TextView strText = findViewById(R.id.str);
        TextView dexText = findViewById(R.id.dex);
        TextView conText = findViewById(R.id.con);
        TextView staText = findViewById(R.id.sta);
        TextView intText = findViewById(R.id.intel);
        TextView pieText = findViewById(R.id.pie);
        TextView psiText = findViewById(R.id.psi);
        TextView quiText = findViewById(R.id.qui);
        TextView toHitText = findViewById(R.id.toHit);
        TextView dodgeText = findViewById(R.id.dodge);
        TextView afText = findViewById(R.id.armor);
        TextView resText = findViewById(R.id.res);
        TextView spdText = findViewById(R.id.speed);
        TextView hpText = findViewById(R.id.hp);
        TextView powText = findViewById(R.id.pow);
        TextView nameText = findViewById(R.id.nameChar);
        TextView proText = findViewById(R.id.profession);
        TextView skillText = findViewById(R.id.skillpts);
        //stats array def -str int, pie, qui, dex, con
        nameText.setText(config.charName);
        proText.setText("LVL "+config.charStats[8]+" "+config.charStyle+ " "+config.charRace+ " "+config.charClass);
        strText.setText("STR: " + config.charStats[0] +" + "+ config.charBonus[0]);
        intText.setText("INT: " + config.charStats[1] +" + "+ config.charBonus[1]);
        pieText.setText("PIE: " + config.charStats[2] +" + "+ config.charBonus[2]);
        psiText.setText("PSI: " + config.charStats[3] +" + "+ config.charBonus[3]);
        dexText.setText("DEX: " + config.charStats[4] +" + "+ config.charBonus[4]);
        quiText.setText("QUI: " + config.charStats[5] +" + "+ config.charBonus[5]);
        conText.setText("CON: " + config.charStats[6] +" + "+ config.charBonus[6]);
        staText.setText("STA: " + config.charStats[7]);
        hpText.setText("HP: " + config.charStats[9]);
        powText.setText("POW: " +config.charStats[10]);
        // stats array def - toHit, Dodge, AF, SPD
        toHitText.setText("toHit: "+ (config.combatStats[0]+10));
        dodgeText.setText("Dodge: "+ config.combatStats[1]);
        afText.setText("AF: 0");
        resText.setText("RES: " + config.charBonus[1]);
        spdText.setText("SPD: "+ config.combatStats[3]);
        //Skill point
        skillText.setText("Skill Points: " + config.skillPoints);
        displaySkills();
    }

    public void startGame(View v){
        //charSheet.buildCharSheet();
        charSheet.updateCharSheet();
        saveChar.writeCharToFile();
        Intent intent2 = new Intent(this, TownScreen.class);
        startActivity(intent2);
    }

    public void backToChar(View v){
        Intent intent1 = new Intent(this, CreateCharacter.class);
        startActivity(intent1);
    }
}