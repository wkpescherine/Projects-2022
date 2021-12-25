package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class SkillScreen extends AppCompatActivity {
    CharDataConfig charSheet = new CharDataConfig();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setStats();
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
        //stats array def -str int, pie, qui, dex, con
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
    }
}