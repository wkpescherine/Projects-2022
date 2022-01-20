package com.example.ascension;

public class SkillHandler {
    CharDataConfig charSheet = new CharDataConfig();

    public void SkillList(String skill){
        switch(skill) {
            case "slashU1":
                charSheet.charSkills[0] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "slashA1":
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
            case "mindnumbU1":
                charSheet.charSkills[2] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "mindnumbA1":
                charSheet.charSkills[2] = 0;
                charSheet.skillPoints += 1;
                break;
            case "dualwieldU1":
                charSheet.charSkills[3] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "dualwieldA1":
                charSheet.charSkills[3] = 0;
                charSheet.skillPoints += 1;
                break;
            case "lifetapU1":
                charSheet.charSkills[4] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "lifetapA1":
                charSheet.charSkills[4] = 0;
                charSheet.skillPoints += 1;
                break;
            case "healU1":
                charSheet.charSkills[5] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "healA1":
                charSheet.charSkills[5] = 0;
                charSheet.skillPoints += 1;
                break;
            case "stealthU1":
                charSheet.charSkills[6] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "stealthA1":
                charSheet.charSkills[6] = 0;
                charSheet.skillPoints += 1;
                break;
            case "quickshotU1":
                charSheet.charSkills[7] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "quickshotA1":
                charSheet.charSkills[7] = 0;
                charSheet.skillPoints += 1;
                break;
        }
    }
}
