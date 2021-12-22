package com.example.ascension;

public class CharDataConfig {
    static String charStyle = "";
    static String charRace = "";
    static String charClass = "";
    static String charName = "";
    int styleStats[] = {0,0,0,0,0,0};
    int styleSavage [] = {1,2,3,1,2,3};

    public void updateStyle( String choice){
        charStyle = choice;
        if(charStyle.equals("Savage")){
            styleStats = styleSavage;
        }
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