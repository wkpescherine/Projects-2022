package com.example.ascension;

import java.util.Random;

public class GearBuilder {
    String gearQuality = "";
    String gearMaterial = "";
    String gearType = "";
    int upper = 13;
    //damage, spd, AF
    int gearValues [] = {0,0,0};
    int tempValues [][] ={{0,0,0}, {0,0,0}, {0,0,0}};
    String gearQualityNames [] = {"Pitted", "Rusty", "Poor"};
    int gearQualityValues [][] = {{1,0,0}, {2,0,0}, {3,0,0}};

    public void gearQuality(){
        Random rand = new Random();
        int gearInt = rand.nextInt(upper)+1;
        gearQuality = gearQualityNames[gearInt];
        tempValues [0] = gearQualityValues[gearInt];
    }

    public void gearMaterial(){}

    public void gearType(){
        gearQuality();
    }
}
