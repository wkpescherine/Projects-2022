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
        TextView dexText = findViewById(R.id.dexterity);
        TextView quiText = findViewById(R.id.quickness);
        TextView conText = findViewById(R.id.constitution);
        //The following are the setting of the text
        nameText.setText(chSheet.name);
        profText.setText("Lvl "+chSheet.level+" "+chSheet.profession);
        strText.setText("STR: " +chSheet.strength+" + ");
        intText.setText("INT: " +chSheet.intelligence+" + ");
        pieText.setText("PIE: " +chSheet.piety+" + ");
        dexText.setText("PIE: " +chSheet.dexterity+" + ");
        quiText.setText("PIE: " +chSheet.quickness+" + ");
        conText.setText("PIE: " +chSheet.constitution+" + ");
    }
}