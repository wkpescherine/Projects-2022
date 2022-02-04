package com.example.ascension;

import android.widget.TextView;

public class CharSheet {
    //Char Stats
    static String name = "";
    static int level = 1;
    static int currentXP = 0;
    static int nextLvlXP = level*1000;
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
    static String mainHand = "";
    static int [] mainHandValues = {0,0};
    static String offHand = "";
    static int [] offHandValues = {0,0,0};
    static String helmOn = "";
    static String chestOn = "";
    static String legsOn = "";
    static String bootsOn = "";
    static String shoulderOn = "";
    static String armsOn = "";
    static String glovesOn = "";
    static int [] AFValues = {0,0,0,0,0,0,0,0};
    //Combat stats
    static int hp = 0;
    static int power = 0;
    static int toHit = 0;
    static int dodge = 0;
    static int AF = 0;
    static int damage = 0;
    static int speed = 0;
    static int AFReduce = 0;
    static int resistance = 0;
    static int [] skillsLVL = {0,0,0,0,0,0,0,0,0,0,0,0,0};

    public int updateCharBonus(int stat){
        int testScore = 0;
        int bonusLvl = 0;
        for(int a = 0; a < stat; a++){
            for(int y =0; y < stat; y++){
                testScore += y;
                if(testScore+y < stat){
                    bonusLvl += 1;
                }
            }
        }
        return bonusLvl;
    }

    public void setMainStats(int [] stats, int [] combat){
        //Set base main char stats
        strength += stats[0];
        intelligence += stats[1];
        piety += stats[2];
        psionic += stats[3];
        dexterity += stats[4];
        quickness += stats[5];
        constitution += stats[6];
        stamina += stats[7];
        hp += stats[9];
        power += stats[10];
        //set combat char sheet stats
        toHit += combat[0];
        dodge += combat[1];
        AF += combat[2];
        resistance += combat[3];
        speed += combat[4];
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
