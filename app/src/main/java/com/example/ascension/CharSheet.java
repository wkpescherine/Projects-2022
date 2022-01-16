package com.example.ascension;

import android.widget.TextView;

public class CharSheet {
    static String name = "";
    static int level = 1;
    static String style = "";
    static String race = "";
    static String prof = "";
    static int strength = 0;
    static int strengthBonus = 0;
    static int intelligence = 0;
    static int intelligenceBonus = 0;
    static int piety = 0;
    static int pietyBonus = 0;
    static int psionic = 0;
    static int psionicBonus = 0;
    static int dexterity = 0;
    static int dexterityBonus = 0;
    static int quickness = 0;
    static int quicknessBonus = 0;
    static int constitution = 0;
    static int constitutionBonus = 0;
    static int stamina = 0;
    static int toHit = 0;
    static int dodge = 0;
    static String mainHand = "";
    static int [] mainHandValues = {0,0};
    static String offHand = "";
    static String helmOn = "";
    static String chestOn = "";
    static String legsOn = "";
    static String bootsOn = "";
    static String shoulderOn = "";
    static String armsOn = "";
    static String glovesOn = "";
    static int [] AFValues = {0,0,0,0,0,0,0,0};

    static int hp = 0;
    static int power = 0;
    static int AF = 0;
    static int AFReduce = 0;
    static int resistance = 0;

    public int updateCharBonus(int stat){
        int bonusValue = 0;
        for(int b = 0; b < stat; b++){
            if(b+bonusValue <= stat ){
                bonusValue = b;
            } else { b = 100000;}
        }
        return bonusValue;
    }

    public void setMainStats(int [] stats){
        strength += stats[0];
        intelligence += stats[1];
        piety += stats[2];
        psionic += stats[3];
        dexterity += stats[4];
        quickness += stats[5];
        constitution += stats[6];
        stamina += stats[7];
    }

    public void updateCharSheet(){
        strengthBonus = updateCharBonus(strength);
        intelligenceBonus = updateCharBonus(intelligence);
        pietyBonus = updateCharBonus(piety);
        psionicBonus = updateCharBonus(psionic);
        dexterityBonus = updateCharBonus(dexterity);
        quicknessBonus = updateCharBonus(quickness);
        constitutionBonus = updateCharBonus(constitution);
        resistance = intelligenceBonus;
    }
}
