package com.example.ascension;

import android.widget.LinearLayout;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharFileHandler {
    CharDataConfig config = new CharDataConfig();

    public void writeCharToFile(){
        try{
        FileWriter myWriter = new FileWriter("savedGames.txt");
        BufferedWriter bWriter = new BufferedWriter(myWriter);
        PrintWriter pWriter = new PrintWriter(bWriter);
        pWriter.write("test");
        pWriter.close();} catch(IOException e){
            e.printStackTrace();
        }
    }

    public void readCharFromFile(){

    }
}

