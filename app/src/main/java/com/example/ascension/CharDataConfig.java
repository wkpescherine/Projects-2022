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
    int styleDiabolic [] = {0,3,0,1,1,1};
    int styleDivine [] = {0,0,3,1,1,1};
    int styleStout [] = {0,0,1,1,1,4};
    int styleDemonic [] = {0,2,0,1,1,2};
    int stylePure [] = {0,0,4,0,0,2};
    int raceHuman [] = {2,2,2,2,2,2};
    int raceElven [] = {1,3,1,3,3,1};
    int raceDwarven [] = {3,1,1,1,1,5};
    int raceUndead [] = {4,1,1,1,1,4};
    int raceGoblin [] = {1,1,1,4,4,1};
    int raceOgre [] = {6,1,1,1,1,2};
    int classWarrior [] = {2,0,0,1,0,3};
    int classMage [] = {0,2,1,0,3,0};
    int classThief [] = {1,0,0,2,2,1};
    int classBerzerker [] = {4,0,0,1,1,0};
    int classPriest [] = {0,0,3,1,1,1};
    int classRanger [] = {2,0,0,2,2,0};
    //stats array def -str int, pie, qui, dex, con
    static int charStats [] = {0,0,0,0,0,0};
    static int charBonus [] = {0,0,0,0,0,0};
    // stats array def - toHit, Dodge, AF, SPD
    static int combatStats [] = {0,0,0,0};

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
        if(charStyle.equals("Stout")){
            styleStats = styleStout;
        }
        if(charStyle.equals("Demonic")){
            styleStats = styleDemonic;
        }
        if(charStyle.equals("Pure")){
            styleStats = stylePure;
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
        if(charRace.equals("Undead")){
            raceStats = raceUndead;
        }
        if(charRace.equals("Goblin")){
            raceStats = raceGoblin;
        }
        if(charRace.equals("Ogre")){
            raceStats = raceOgre;
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
        if(charClass.equals("Berzerker")){
            classStats = classBerzerker;
        }
        if(charClass.equals("Priest")){
            classStats = classPriest;
        }
        if(charClass.equals("Ranger")){
            classStats = classRanger;
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
                if(b+bonusValue <= charStats[a] ){
                    bonusValue = b;
                } else { b = 100000;}
            }
            charBonus[a] = bonusValue;
        }
        setCombatStats();
    }

    public void setCombatStats(){
        combatStats[0] = charBonus[4]+10;
        combatStats[1] = charBonus[4]+charBonus[3];
        combatStats[3] = charBonus[3];
    }
}