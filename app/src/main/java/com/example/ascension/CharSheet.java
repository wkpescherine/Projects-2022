package com.example.ascension;

import android.widget.TextView;

public class CharSheet {
    CharDataConfig config = new CharDataConfig();

    static String name = "";
    static int level = 1;
    static String profession = "";
    static int strength = 0;
    static int strengthBonus = 0;
    static int intelligence = 0;
    static int intelligenceBonus = 0;
    static int piety = 0;
    static int pietyBonus = 0;
    static int dexterity = 0;
    static int dexterityBonus = 0;
    static int quickness = 0;
    static int quicknessBonus = 0;
    static int constitution = 0;
    static int constitutionBonus = 0;
    static int hp = 0;
    static int power = 0;
    static int AF = 0;
    static int AFReduce = 0;
    static String weapon = "";
    static int weaponValues []= {0,0};
    static String helm = "";
    static int helmAF = 0;

    public void buildCharSheet(){
        name = config.charName;
        profession = config.charStyle+" "+ config.charRace +" "+ config.charClass;
        strength = config.charStats[0];
        intelligence = config.charStats[1];
        piety = config.charStats[2];
        dexterity = config.charStats[3];
        quickness = config.charStats[4];
        constitution = config.charStats[5];
        hp = config.charStats[7];
        power = config.charStats[8];
        AF = config.charStats[9];
    }

    public int updateCharBonus(int stat){
        int bonusValue = 0;
        for(int b = 0; b < stat; b++){
            if(b+bonusValue <= stat ){
                bonusValue = b;
            } else { b = 100000;}
        }
        return bonusValue;
    }

    public void updateCharSheet(){
        strengthBonus = updateCharBonus(strength);
        intelligenceBonus = updateCharBonus(intelligence);
        pietyBonus = updateCharBonus(piety);
        dexterityBonus = updateCharBonus(dexterity);
        quicknessBonus = updateCharBonus(quickness);
        constitutionBonus = updateCharBonus(constitution);
    }
}
