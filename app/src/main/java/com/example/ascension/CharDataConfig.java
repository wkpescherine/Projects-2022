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
    int raceElven [] = {1,3,1,3,3,1};
    int raceDwarven [] = {3,1,1,1,1,5};
    int classWarrior [] = {2,0,0,1,0,3};
    int classMage [] = {0,2,1,0,3,0};
    int classThief [] = {1,0,0,2,2,1};
    static int charStats [] = {0,0,0,0,0,0};
    static int charBonus [] = {0,0,0,0,0,0};

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
        statsTotal();
    }

    public void updateRace( String choice){
        charRace = choice;
        if(charRace.equals("Human")){
            raceStats = raceHuman;
        }
        if(charRace.equals("Elven")){
            raceStats = raceElven;
        }
        if(charRace.equals("Dwarven")){
            raceStats = raceDwarven;
        }
        statsTotal();
    }

    public void updateClass( String choice){
        charClass = choice;
        if(charClass.equals("Warrior")){
            classStats = classWarrior;
        }
        if(charClass.equals("Mage")){
            classStats = classMage;
        }
        if(charClass.equals("Thief")){
            classStats = classThief;
        }
        statsTotal();
    }

    public void resetUI(){
        charStyle = "";
        charRace = "";
        charClass = "";
        charName = "";
    }

    public void statsTotal(){
        charStats[0] = styleStats[0]+raceStats[0]+classStats[0];
        charStats[1] = styleStats[1]+raceStats[1]+classStats[1];
        charStats[2] = styleStats[2]+raceStats[2]+classStats[2];
        charStats[3] = styleStats[3]+raceStats[3]+classStats[3];
        charStats[4] = styleStats[4]+raceStats[4]+classStats[4];
        charStats[5] = styleStats[5]+raceStats[5]+classStats[5];
        statsBonus();
    }

    public void statsBonus(){
        for(int a = 0; a < 6; a++){
            int bonusValue = 0;
            for(int b = 0; b < charStats[a]; b++){
                bonusValue +=1;
            }
            charBonus[a] = bonusValue;
        }
    }
}