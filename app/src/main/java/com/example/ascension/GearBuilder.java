package com.example.ascension;

import java.util.Random;

public class GearBuilder {
    String gearQuality = "";
    String gearMaterial = "";
    String gearType = "";
    int upper = 3;
    //damage, spd, AF
    int []gearValues    = {0,0,0};
    int [][]tempValues  = {{0,0,0}, {0,0,0}, {0,0,0}};
    String [] gearWeaponQualityNames  = {"Pitted", "Rusty", "Poor", "Weak", "Basic", "Excellent", "Superior","Perfect", "Legendary", "Mythical"};
    String [] gearWeaponMaterialNames = {"Iron","Steel", "Bronze", "?????","?????", "Damascues","Titanium","Mithril", "?????", "Astral"};
    String [] gearWeaponTypes         = {"Dagger", "Short Sword", "Staff", "Long Sword", "Bastard Sword", "Axed", "War Hammer", "Maul", "Claymore"};
    int [][] gearWeaponQualityValues  = {{1,0,0}, {2,0,0}, {3,0,0}, {4,1,0}, {5,1,0}, {6,1,0}, {7,2,0}, {8,2,0}, {9,2,0}, {10,3,0}};
    int [][] gearWeaponMaterialValues = {{1,0,0}, {2,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}};
    int [][] gearWeaponValues         = {{1,5,0}, {2,3,0}, {1,3,0}, {5,3,0}, {7,2,0}, {6,2,0}, {8,2,0}, {14,0,0}, {12,1,0}};
    //Armor Section
    String [] gearArmorQualitNames    = {"Tattered", "Worn","Ragged"};
    String [] gearArmorMaterialNames  = {"Cloth", "Hide", "Leather"};
    String [] gearArmorTypes          = {"Helm", "Chest", "Legs", "Boots"};
    int [][] armorQualityValues       = {{0,0,1},{0,0,2},{0,0,3}};
    int [][] armorMaterialValues      = {{0,0,1},{0,0,2},{0,0,3}};
    int [][] armorTypeValues          = {{0,0,1},{0,0,5},{0,0,3},{0,0,1}};

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

    public void starterGear(){

    }
}
