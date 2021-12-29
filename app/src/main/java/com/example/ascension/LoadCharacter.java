package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoadCharacter extends AppCompatActivity {
    CharDataConfig config = new CharDataConfig();
    CharFileHandler handleFile = new CharFileHandler();
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_character);

        handleFile.readCharFromFile();
    }

    public void buildCharsToLoad(){
        LinearLayout parent = findViewById(R.id.subContent);

        LinearLayout savedChar = new LinearLayout();

        TextView tv1 = new TextView();
    }
}