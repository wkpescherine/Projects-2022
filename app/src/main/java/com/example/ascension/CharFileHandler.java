package com.example.ascension;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharFileHandler {
    private static final String TAG = "";
    CharDataConfig config = new CharDataConfig();

    public void writeCharToFile(){
        try{
            FileWriter myWriter = new FileWriter("SavedGames.txt", true);
            BufferedWriter bWriter = new BufferedWriter(myWriter);
            PrintWriter pWriter = new PrintWriter(bWriter);
            pWriter.write("Test");
            pWriter.close();
            System.out.print("Current Game Saved");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void readCharFromFile(){

    }
}

