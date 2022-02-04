package com.example.ascension;

public class SkillHandler {
    CharDataConfig charSheet = new CharDataConfig();

    public void SkillList(String skill){
        switch(skill) {
            case "slashU1":
                charSheet.skillLevels[0] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "slashA1":
                charSheet.skillLevels[0] = 0;
                charSheet.skillPoints += 1;;
                break;
            case "sparkU1":
                charSheet.skillLevels[1] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "sparkA1":
                charSheet.skillLevels[1] = 0;
                charSheet.skillPoints += 1;
                break;
            case "mindnumbU1":
                charSheet.skillLevels[2] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "mindnumbA1":
                charSheet.skillLevels[2] = 0;
                charSheet.skillPoints += 1;
                break;
            case "dualwieldU1":
                charSheet.skillLevels[3] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "dualwieldA1":
                charSheet.skillLevels[3] = 0;
                charSheet.skillPoints += 1;
                break;
            case "lifetapU1":
                charSheet.skillLevels[4] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "lifetapA1":
                charSheet.skillLevels[4] = 0;
                charSheet.skillPoints += 1;
                break;
            case "healU1":
                charSheet.skillLevels[5] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "healA1":
                charSheet.skillLevels[5] = 0;
                charSheet.skillPoints += 1;
                break;
            case "stealthU1":
                charSheet.skillLevels[6] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "stealthA1":
                charSheet.skillLevels[6] = 0;
                charSheet.skillPoints += 1;
                break;
            case "quickshotU1":
                charSheet.skillLevels[7] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "quickshotA1":
                charSheet.skillLevels[7] = 0;
                charSheet.skillPoints += 1;
                break;
            case "maulU1":
                charSheet.skillLevels[8] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "maulA1":
                charSheet.skillLevels[8] = 0;
                charSheet.skillPoints += 1;
                break;
            case "smiteU1":
                charSheet.skillLevels[9] = 1;
                charSheet.skillPoints -= 1;
                break;
            case "smiteA1":
                charSheet.skillLevels[9] = 0;
                charSheet.skillPoints += 1;
                break;
        }
    }
}
