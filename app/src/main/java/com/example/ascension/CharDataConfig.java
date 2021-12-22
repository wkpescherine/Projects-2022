package com.example.ascension;

public class CharDataConfig {
    static String charStyle = "";
    static String charRace = "";
    static String charClass = "";
    static String charName = "";

    public void updateStyle( String choice){
        charStyle = choice;
    }

    public void updateRace( String choice){
        charRace = choice;
    }

    public void updateClass( String choice){
        charClass = choice;
    }

    public void resetUI(){
        charStyle = "";
        charRace = "";
        charClass = "";
        charName = "";
    }
}