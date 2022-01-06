package com.example.ascension;

import android.widget.TextView;

public class CharSheet {
    CharDataConfig config = new CharDataConfig();

    static String name = "";
    static int level = 1;
    static String profession = "";
    static int strength = 0;
    static int intelligence = 0;
    static int piety = 0;
    static int dexterity = 0;
    static int quickness = 0;
    static int constitution = 0;

    public void buildCharSheet(){
        name = config.charName;
        profession = config.charStyle+" "+ config.charRace +" "+ config.charClass;
        strength = config.charStats[0];
        intelligence = config.charStats[1];
        piety = config.charStats[2];
        dexterity = config.charStats[3];
        quickness = config.charStats[4];
        constitution = config.charStats[5];
    }
}
