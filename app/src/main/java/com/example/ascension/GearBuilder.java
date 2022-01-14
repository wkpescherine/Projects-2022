package com.example.ascension;

import java.util.Random;

public class GearBuilder {
    String gearQuality = "";
    String gearMaterial = "";
    String gearType = "";
    String item = "";
    //damage, spd, AF
    int []gearValues    = {0,0,0};
    int [][]tempValues  = {{0,0,0}, {0,0,0}, {0,0,0}};
    String [] gearWeaponQualityNames  = {"Pitted", "Rusty", "Poor", "Weak", "Basic", "Excellent", "Superior","Perfect", "Legendary", "Mythical"};
    String [] gearWeaponMaterialNames = {"Copper","Iron", "Bronze", "Steel","Brass", "Damascues","Titanium","Mithril", "Palladium", "Astral"};
    String [] gearWeaponTypes         = {"Dagger", "Short Sword", "Staff", "Long Sword", "Bastard Sword", "Axed", "War Hammer", "Maul", "Claymore"};
    int [][] gearWeaponQualityValues  = {{1,0,0}, {2,0,0}, {3,0,0}, {4,1,0}, {5,1,0}, {6,1,0}, {7,2,0}, {8,2,0}, {9,2,0}, {10,3,0}};
    int [][] gearWeaponMaterialValues = {{1,0,0}, {2,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}, {3,0,0}};
    int [][] gearWeaponValues         = {{1,5,0}, {2,3,0}, {1,3,0}, {5,3,0}, {7,2,0}, {6,2,0}, {8,2,0}, {14,0,0}, {12,1,0}};
    //Armor Section
    String [] gearArmorQualityNames   = {"Tattered", "Worn","Ragged","Weakened", "Basic","Refined", "Excellent","Superior", "Legendary", "Mythical"};
    String [] gearArmorMaterialNames  = {"Wool","Cloth", "Hide", "Leather", "Studded", "Banded", "Chain", "Plated", "Etheral", "Astral"};
    String [] gearArmorTypesNames     = {"Helm", "Chest", "Legs", "Boots", "Shoulder", "Arms", "Gloves", "Buckler", "Kite SHield", "Yower Shield"};
    int [][] armorQualityValues       = {{0,0,1},{0,0,2},{0,0,3},{0,0,4},{0,0,5},{0,0,6},{0,0,7},{0,0,8},{0,0,9},{0,0,10}};
    int [][] armorMaterialValues      = {{0,0,1},{0,0,2},{0,0,3},{0,0,4},{0,0,6},{0,0,8},{0,0,10},{0,0,13},{0,0,16},{0,0,20}};
    int [][] armorTypeValues          = {{0,0,1},{0,0,5},{0,0,3},{0,0,1},{0,0,1},{0,0,4},{0,0,1},{0,0,1},{0,0,4},{0,0,10}};

    public int randGearPicker(){
        int upper = 1111111111;
        int lower = 1;
        int selection = 0;
        Random rand = new Random();
        int gearInt = rand.nextInt(upper);
        int itemInt = rand.nextInt(lower);
        if(itemInt == 0){ item = "weapon"}
        else{ item == "other"}
        if(gearInt > 0 && gearInt<=1000000000){selection = 0;}
        if(gearInt >= 1000000001 && gearInt<=1100000000){selection = 1;}
        if(gearInt >= 1100000001 && gearInt<=1110000000){selection = 2;}
        if(gearInt >= 1110000001 && gearInt<=1111000000){selection = 3;}
        if(gearInt >= 1111000001 && gearInt<=1111100000){selection = 4;}
        if(gearInt >= 1111100001 && gearInt<=1111110000){selection = 5;}
        if(gearInt >= 1111110001 && gearInt<=1111111000){selection = 6;}
        if(gearInt >= 1111111001 && gearInt<=1111111100){selection = 7;}
        if(gearInt >= 1111111101 && gearInt<=1111111110){selection = 8;}
        if(gearInt<=1111111111){selection = 9;}
        return selection;
    }

    public void gearQuality(String item){
        if(item.equals("weapon")){
            int value = randGearPicker();
            gearQuality = gearWeaponQualityNames[value];
            tempValues [0] = gearWeaponQualityValues[value];
        }  else {
            int value = randGearPicker();
            gearQuality = gearArmorQualityNames[value];
            tempValues [0] = armorQualityValues[value];
        }
    }

    public void gearMaterial(String item){
        if(item.equals("weapon")){
            int value = randGearPicker();
            gearMaterial = gearWeaponMaterialNames[value];
            tempValues [1] = gearWeaponMaterialValues[value];
        } else {
            int value = randGearPicker();
            gearMaterial = gearArmorMaterialNames[value];
            tempValues [1] = armorMaterialValues[value];
        }
    }

    public void gearType(String item){
        if(item.equals("weapon")){
            int value = randGearPicker();
            gearType = gearWeaponTypes[value];
            tempValues[2] = gearWeaponValues[value];
        } else {
            int value = randGearPicker();
            gearMaterial = gearArmorTypesNames[value];
            tempValues [2] = armorTypeValues[value];
        }
    }

    public void resetGearValues(){
        gearQuality = "";
        gearMaterial = "";
        gearType = "";
    }

    public void buildItem(){
        gearMaterial();
        gearQuality();
        gearType();
        resetGearValues();
    }

    public void starterGear(){

    }
}
