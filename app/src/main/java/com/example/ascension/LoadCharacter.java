package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

public class LoadCharacter extends AppCompatActivity {
    CharDataConfig config = new CharDataConfig();
    CharFileHandler handleFile = new CharFileHandler();
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_character);

        handleFile.readCharFromFile();

        for(int a = 0; a< 4; a++){
            buildCharsToLoad();
        }
    }

    public void buildCharsToLoad(){
        LinearLayout parent = findViewById(R.id.parent);

        LinearLayout subSection = new LinearLayout(this);
        subSection.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        );
        subSection.setOrientation(LinearLayout.VERTICAL);
        TextView tv1 = new TextView(this);

        tv1.setText(" This should show something ");
        parent.addView(tv1);

    }
}