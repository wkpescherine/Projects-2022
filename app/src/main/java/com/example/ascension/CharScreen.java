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
        nameText.setText(chSheet.name);
    }
}