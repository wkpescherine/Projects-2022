package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SkillScreen extends AppCompatActivity {
    CharDataConfig charSheet = new CharDataConfig();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_screen);
    }
}