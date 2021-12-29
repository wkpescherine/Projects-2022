package com.example.ascension;

public class SkillHandler {
    CharDataConfig charSheet = new CharDataConfig();

    public void SkillList(String skill){
        switch(skill) {
            case "sweepU1":
                charSheet.charSkills[0] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "sweepA1":
                charSheet.charSkills[0] = 0;
                charSheet.skillPoints += 1;;
                break;
            case "sparkU1":
                charSheet.charSkills[1] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "sparkA1":
                charSheet.charSkills[1] = 0;
                charSheet.skillPoints += 1;
                break;
        }
    }
}
