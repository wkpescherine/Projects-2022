package com.example.ascension;

public class CharDataConfig {
    static String charStyle = "";
    static String charRace = "";
    static String charClass = "";
    static String charName = "";
    static int skillPoints = 0;
    static int charSkills[] = {0,0,0,0};
    //stats array def -str int, pie, psi, qui, dex, con, sta, lvl, hp ,pow
    int styleStats[] = {0,0,0,0,0,0,0,0,0,0,0};
    int raceStats[] = {0,0,0,0,0,0,0,0,0,0,0};
    int classStats[] = {0,0,0,0,0,0,0,0,0,0,0};
    //Styles 12 points
    int styleSavage [] = {6,0,0,0,2,3,1,0,0,0,0,0};
    int styleDiabolic [] = {0,5,0,0,2,4,1,0,0,0,0,0};
    int styleDivine [] = {0,0,6,0,1,3,2,0,0,0,0,0};
    int styleStout [] = {0,0,2,0,2,2,6,0,0,0,0,0};
    int styleDemonic [] = {0,4,0,0,2,2,4,0,0,0,0,0};
    int stylePure [] = {0,0,8,0,0,0,4,0,0,0,0};
    int styleAgile [] = {2,0,0,0,6,4,0,0,0,0,0};
    int stylePsionic [] = {0,3,0,9,0,0,0,0,0,0,0};
    int styleFallen [] = {4,0,3,0,1,2,2,0,0,0,0};
    //Race 12 points
    int raceHuman [] = {3,3,3,0,3,3,3,25,0,0,0};
    int raceElven [] = {2,4,1,1,4,4,2,27,0,0,0};
    int raceDwarven [] = {4,1,2,0,2,2,7,30,0,0,0};
    int raceUndead [] = {5,1,1,2,2,2,5,23,0,0,0};
    int raceGoblin [] = {2,1,1,0,5,7,2,24,0,0,0};
    int raceOgre [] = {6,1,1,0,1,1,2,20,0,0,0};
    int raceAtlantean [] = {2,4,1,4,2,3,2,25,0,0,0};
    int raceDraconic [] = {4,2,1,2,2,2,5,26,0,0,0};
    int raceSpirit [] = {1,5,1,6,1,3,1,26,0,0,0};
    //class 12 points
    int classWarrior [] = {4,0,0,0,2,2,4,30,1, 20,0};
    int classMage [] = {0,6,2,0,0,4,0,20,1,8,20};
    int classThief [] = {2,0,0,0,5,3,2,25,1,12,0};
    int classBerzerker [] = {8,0,0,0,2,2,30,1,16,0};
    int classPriest [] = {0,0,7,0,1,3,2,20,1,10,15};
    int classRanger [] = {3,0,1,0,4,4,0,25,1,14,0};
    int classJuggernaut [] = {8,0,0,0,1,1,2,30,1,24,0};
    int classMindweaver [] = {0,3,0,8,0,1,0,20,1,12,15};
    int classShadow [] = {3,1,0,1,3,3,1,25,1,10,10};
    //stats array def -str int, pie, qui, dex, con, lvl,hp,pow
    static int charStats [] = {0,0,0,0,0,0,0,0,0,0,0};
    //stats array def -str int, pie, qui, dex, con
    static int []charBonus = {0,0,0,0,0,0,0,0};
    // stats array def - toHit, Dodge, AF, SPD
    static int [] combatStats = {0,0,0,0,0};
    //Main, Off, helm, chest, legs, boots, shoulders, arms, gloves, back
    static String gearWorn [] = {"None","None","None","None","None","None","None","None","None","None"};

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
        if(charStyle.equals("Agile")){
            styleStats = styleAgile;
        }
        if(charStyle.equals("Psionic")){
            styleStats = stylePsionic;
        }
        if(charStyle.equals("Fallen")){
            styleStats = styleFallen;
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
        if(charRace.equals("Atlantean")){
            raceStats = raceAtlantean;
        }
        if(charRace.equals("Draconic")){
            raceStats = raceDraconic;
        }
        if(charRace.equals("Spirit")){
            raceStats = raceSpirit;
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
        if(charClass.equals("Juggernaut")){
            classStats = classJuggernaut;
        }
        if(charClass.equals("Mindweaver")){
            classStats = classMindweaver;
        }
        if(charClass.equals("Shadow")){
            classStats = classShadow;
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
        charStats[6] = styleStats[6]+raceStats[6]+classStats[6];
        charStats[7] = styleStats[7]+raceStats[7]+classStats[7];
        charStats[8] = classStats[8];
        statsBonus();
        charStats[9] = classStats[9]+ charBonus[9];
        charStats[10] = styleStats[10]+ charBonus[10];
    }

    public void statsBonus(){
        for(int a = 0; a < 8; a++){
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
        combatStats[4] = charBonus[1];
    }
}