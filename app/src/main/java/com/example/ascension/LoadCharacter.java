package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
            readFromFile();
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

    public void readFromFile() throws IOException {
        final Resources resources = mHelperContext.getResources();
        InputStream inputStream = resources.openRawResource(R.raw.definitions);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strings = TextUtils.split(line, "-");
                if (strings.length < 2)
                    continue;
                long id = addWord(strings[0].trim(), strings[1].trim());
                if (id < 0) {
                    Log.e(TAG, "unable to add word: " + strings[0].trim());
                }
            }
        } finally {
            reader.close();
        }
        Log.d(TAG, "DONE loading words.");
    }
}