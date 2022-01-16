package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class CharScreen extends AppCompatActivity {
    CharSheet chSheet = new CharSheet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        buildCharSheet();
    }

    public void buildCharSheet(){
        TextView nameText = findViewById(R.id.name);
        TextView profText = findViewById(R.id.profession);
        TextView strText = findViewById(R.id.strength);
        TextView intText = findViewById(R.id.intelligence);
        TextView pieText = findViewById(R.id.piety);
        TextView psiText = findViewById(R.id.psionic);
        TextView dexText = findViewById(R.id.dexterity);
        TextView quiText = findViewById(R.id.quickness);
        TextView conText = findViewById(R.id.constitution);
        TextView staText = findViewById(R.id.stamina);
        TextView hpText = findViewById(R.id.hp);
        TextView powText = findViewById(R.id.power);
        TextView spdText = findViewById(R.id.speed);
        TextView AFText = findViewById(R.id.armor);
        TextView resText = findViewById(R.id.res);
        //The following are the setting of the text
        nameText.setText(chSheet.name);
        profText.setText("Lvl "+chSheet.level+" "+chSheet.style+" "+chSheet.race+" "+chSheet.prof);
        strText.setText("STR: " +chSheet.strength);
        intText.setText("INT: " +chSheet.intelligence);
        pieText.setText("PIE: " +chSheet.piety);
        psiText.setText("PSI: " +chSheet.psionic);
        dexText.setText("DEX: " +chSheet.dexterity);
        quiText.setText("QUI: " +chSheet.quickness);
        conText.setText("CON: " +chSheet.constitution);
        staText.setText("STA: " +chSheet.stamina);
        hpText.setText("HP: " +chSheet.hp);
        powText.setText("POW: " +chSheet.power);
        spdText.setText("SPD: " + (chSheet.mainHandValues[1]+chSheet.quicknessBonus));
        AFText.setText("AF: " +chSheet.AF);
        resText.setText("RES: " + chSheet.intelligenceBonus);
    }
}