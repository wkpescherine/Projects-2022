package com.example.ascension;

public class CharDataConfig {
    static String charStyle = "";
    static String charRace = "";
    static String charClass = "";
    static String charName = "";
    //stats array def -str int, pie, qui, dex, con
    int styleStats[] = {0,0,0,0,0,0};
    int raceStats[] = {0,0,0,0,0,0};
    int classStats[] = {0,0,0,0,0,0};
    int styleSavage [] = {3,0,0,2,0,1};
    int styleDiabolic [] = {1,4,2,1,3,1};
    int styleDivine [] = {1,2,4,1,3,1};
    int raceHuman [] = {2,2,2,2,2,2};
    int classWarrior [] = {2,0,0,1,0,3};

    public void updateStyle( String choice){
        charStyle = choice;
        if(charStyle.equals("Savage")){
            styleStats = styleSavage;
        }
        if(charStyle.equals("Diabolic")){
            styleStats = styleDiabolic;
        }
        if(charStyle.equals("Divine")){
            styleStats = styleDivine;
        }
    }

    public void updateRace( String choice){
        charRace = choice;
        if(charRace.equals("Human")){
            raceStats = raceHuman;
        }
    }

    public void updateClass( String choice){
        charClass = choice;
        if(charClass.equals("Warrior")){
            classStats = classWarrior;
        }
    }

    public void resetUI(){
        charStyle = "";
        charRace = "";
        charClass = "";
        charName = "";
    }
}