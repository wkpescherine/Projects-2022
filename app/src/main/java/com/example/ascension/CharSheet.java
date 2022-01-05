package com.example.ascension;

import android.widget.TextView;

public class CharSheet {
    CharDataConfig config = new CharDataConfig();

    static String name = "";
    static int level = 0;
    static String profession = "";
    static int strength = 0;
    static int intelligence = 0;
    static int piety = 0;
    static int dexterity = 0;
    static int quickness = 0;
    static int constitution = 0;

    public void buildCharSheet(){
        name = config.charName;
        level = config.charStats[6];
        profession = config.charStyle+" "+ config.charRace +" "+ config.charClass;
    }
}
