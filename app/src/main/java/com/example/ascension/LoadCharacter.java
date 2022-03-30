package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LoadCharacter extends AppCompatActivity {
    CharDataConfig config = new CharDataConfig();
    CharFileHandler handleFile = new CharFileHandler();

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

    public void readFromFile(){
        //Find the directory for the SD Card using the API
        //*Don't* hardcode "/sdcard"
        File sdcard = Environment.getExternalStorageDirectory();

        //Get the text file
        File file = new File(sdcard,"mytextfile.txt");

        //Read text from file
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            br.close();
        }
        catch (IOException e) {
            //You'll need to add proper error handling here
        }

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