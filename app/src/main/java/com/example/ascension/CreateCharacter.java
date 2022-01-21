package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.EditText;

public class CreateCharacter extends AppCompatActivity {
    CharDataConfig config = new CharDataConfig();
    CharSheet charSheet = new CharSheet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_character);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void handleStyle(View v){
        TextView t1 = (TextView) v;
        String selectStyle = t1.getText().toString();
        TextView styleText = findViewById(R.id.charStyleHolder);
        config.updateStyle(selectStyle);
        charSheet.style = selectStyle;
        styleText.setText(selectStyle);
        setStats();
    }

    public void handleRace(View v){
        TextView t2 = (TextView) v;
        String selectRace = t2.getText().toString();
        TextView raceText = findViewById(R.id.charRaceHolder);
        config.updateRace(selectRace);
        charSheet.race = selectRace;
        raceText.setText(selectRace);
        setStats();
    }

    public void handleClass(View v){
        TextView t3 = (TextView) v;
        String selectClass = t3.getText().toString();
        TextView classText = findViewById(R.id.charClassHolder);
        config.updateClass(selectClass);
        charSheet.prof = selectClass;
        classText.setText(selectClass);
        setStats();
    }

    public void backToMain(View v){
        config.resetUI();
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void loadSkills(View v){
        EditText nameChar = findViewById(R.id.editName);
        config.charName = nameChar.getText().toString();
        if(config.charName.length() != 0 && config.charStyle.length() != 0 && config.charRace.length() != 0 && config.charClass.length() != 0){
            charSheet.setMainStats(config.charStats, config.combatStats);
            Intent intent2 = new Intent(this, SkillScreen.class);
            startActivity(intent2);
        }
    }

    public void setStats(){
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
        //stats array def -str int, pie, psi, qui, dex, con,sta
        strText.setText("STR: " + config.charStats[0] +" + "+ config.charBonus[0]);
        intText.setText("INT: " + config.charStats[1] +" + "+ config.charBonus[1]);
        pieText.setText("PIE: " + config.charStats[2] +" + "+ config.charBonus[2]);
        psiText.setText("PSI: " + config.charStats[3] +" + "+ config.charBonus[3]);
        dexText.setText("DEX: " + config.charStats[4] +" + "+ config.charBonus[4]);
        quiText.setText("QUI: " + config.charStats[5] +" + "+ config.charBonus[5]);
        conText.setText("CON: " + config.charStats[6] +" + "+ config.charBonus[6]);
        staText.setText("STA: " + config.charStats[7]);
        hpText.setText("HP: "   + charSheet.hp);
        powText.setText("POW: " +charSheet.power);
        // stats array def - toHit, Dodge, AF, SPD
        toHitText.setText("toHit: "+ config.combatStats[0]);
        dodgeText.setText("Dodge: "+ config.combatStats[1]);
        afText.setText("AF: "      + config.combatStats[3]);
        resText.setText("RES: "    + config.combatStats[3]);
        spdText.setText("SPD: "    + config.combatStats[4]);
    }
}