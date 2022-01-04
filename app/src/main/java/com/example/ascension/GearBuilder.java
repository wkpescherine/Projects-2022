package com.example.ascension;

import java.util.Random;

public class GearBuilder {
    String gearQuality = "";
    String gearMaterial = "";
    String gearType = "";
    int upper = 3;
    //damage, spd, AF
    int gearValues [] = {0,0,0};
    int tempValues [][] ={{0,0,0}, {0,0,0}, {0,0,0}};
    String gearWeaponQualityNames [] = {"Pitted", "Rusty", "Poor"};
    String gearWeaponMaterialNames [] = {"Iron","Steel", "Bronze"};
    int gearWeaponQualityValues [][] = {{1,0,0}, {2,0,0}, {3,0,0}};
    int gearWeaponMaterialValues [][] = {{1,0,0}, {2,0,0}, {3,0,0}};

    public void gearQuality(){
        Random rand = new Random();
        int gearInt = rand.nextInt(upper)+1;
        gearQuality = gearWeaponQualityNames[gearInt];
        tempValues [0] = gearWeaponQualityValues[gearInt];
    }

    public void gearMaterial(){
        Random rand = new Random();
        int gearInt2 = rand.nextInt(upper)+1;
        gearMaterial = gearWeaponMaterialNames[gearInt2];
        tempValues [1] = gearWeaponMaterialValues[gearInt2];
    }

    public void gearType(String Type){
        gearQuality();
        gearMaterial();
        // 1 : Weapon
        if(Type.equals("Dagger")){
            gearType = Type;
            int daggerVales [] = {1,5,0};
            tempValues [2] = daggerVales;
        }
    }
}
