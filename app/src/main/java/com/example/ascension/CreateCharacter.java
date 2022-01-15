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
        styleText.setText(selectStyle);
        setStats();
    }

    public void handleRace(View v){
        TextView t2 = (TextView) v;
        String selectRace = t2.getText().toString();
        TextView raceText = findViewById(R.id.charRaceHolder);
        config.updateRace(selectRace);
        raceText.setText(selectRace);
        setStats();
    }

    public void handleClass(View v){
        TextView t3 = (TextView) v;
        String selectClass = t3.getText().toString();
        TextView classText = findViewById(R.id.charClassHolder);
        config.updateClass(selectClass);
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
            charSheet.setMainStats();
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
        //stats array def -str int, pie, qui, dex, con
        strText.setText("STR: " + charSheet.strength +" + "+ charSheet.strengthBonus);
        intText.setText("INT: " + charSheet.intelligence +" + "+ charSheet.intelligenceBonus);
        pieText.setText("PIE: " + charSheet.piety +" + "+ charSheet.pietyBonus);
        psiText.setText("PSI: " + charSheet.psionic +" + "+ charSheet.psionicBonus);
        dexText.setText("DEX: " + charSheet.dexterity +" + "+ charSheet.dexterityBonus);
        quiText.setText("QUI: " + charSheet.quickness +" + "+ charSheet.quicknessBonus);
        conText.setText("CON: " + charSheet.constitution +" + "+ charSheet.constitutionBonus);
        staText.setText("STA: " + charSheet.stamina);
        hpText.setText("HP: " + charSheet.hp);
        powText.setText("POW: " +charSheet.power);
        // stats array def - toHit, Dodge, AF, SPD
        toHitText.setText("toHit: "+ (charSheet.toHit));
        dodgeText.setText("Dodge: "+ charSheet.dexterityBonus);
        afText.setText("AF: " + charSheet.AF);
        resText.setText("RES: " + charSheet.resistance);
        spdText.setText("SPD: "+ charSheet.quicknessBonus);
    }
}