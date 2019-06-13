import java.util.ArrayList;

public class ImmuneSystem {
    // Returns true if operation is successful. False otherwise.
    public boolean deploy(Organ organ, ImmuneCell c) {
        if (organ.getCurrentCapacity() < organ.getCapacity()) {
            organ.getImmuneCellList().add(c);
            return true;
        }
        return false;
    }
  
    private int totalATP;
    public static boolean cytokineOccured, regenerateOccured, hormoneBoostOccured, freezeDiseaseOccured, induceFeverOccured;
    public static boolean regenerateOnCooldown, hormoneBoostOnCoolDown, freezeDiseaseOnCoolDown, induceFeverOnCoolDown;
    public static int cytokineStartTurn, regenerateStartTurn, hormoneBoostStartTurn, freezeDiseaseStartTurn, induceFeverStartTurn;
    public static int hormoneBoostEndTurn, freezeDiseaseEndTurn, induceFeverEndTurn;

    public ImmuneSystem(){
        totalATP = 0;
        cytokineOccured = false;
        regenerateOccured = false;
        hormoneBoostOccured = false;
        freezeDiseaseOccured = false;
        induceFeverOccured = false;

        regenerateOnCooldown = false;
        hormoneBoostOnCoolDown = false;
        freezeDiseaseOnCoolDown = false;
        induceFeverOnCoolDown = false;

        cytokineStartTurn = 0;
        hormoneBoostStartTurn = 0;
        freezeDiseaseStartTurn = 0;
        induceFeverStartTurn = 0;
    }

    public int getTotalATP() { return totalATP;}

    public boolean changeTotalATP(int delta) {
        totalATP += delta;
        if (totalATP < 0){
            totalATP = 0;
            return false;
        }
        return true;
    }

    // VirginTCell, VirginBCell, BCell, and ATPSynthase must have targetOrgan input of "".
    public boolean synthesize(String name, String targetOrgan) {
        switch (name) {
            case "Macrophage":
                ImmuneCell macro = new Macrophage(targetOrgan);
                Game.mainBody.getReserves().add(macro);
                break;
            case "Neutrophil":
                ImmuneCell neutro = new Neutrophil(targetOrgan);
                Game.mainBody.getReserves().add(neutro);
                break;
            case "Dendritic":
                ImmuneCell dendritic = new Dendritic(targetOrgan);
                Game.mainBody.getReserves().add(dendritic);
                break;
            case "VirginTCell":
                ImmuneCell virginT = new VirginTCell(targetOrgan);
                Game.mainBody.getReserves().add(virginT);
                break;
            case "HelperTCell":
                ImmuneCell helperT = new HelperTCell(targetOrgan);
                Game.mainBody.getReserves().add(helperT);
                break;
            case "CytotoxicTCell":
                ImmuneCell cyto = new CytotoxicTCell(targetOrgan);
                Game.mainBody.getReserves().add(cyto);
                break;
            case "VirginBCell":
                ImmuneCell virginB = new VirginBCell(targetOrgan);
                Game.mainBody.getReserves().add(virginB);
                break;
            case "BCell":
                ImmuneCell bCell = new BCell(targetOrgan);
                Game.mainBody.getReserves().add(bCell);
                break;
            case "ATPSynthase":
                ImmuneCell atpSynthase = new ATPSynthase(targetOrgan);
                Game.mainBody.getReserves().add(atpSynthase);
                break;
        }
        return false;
    }

    public boolean cytokineStorm() {
        if (totalATP >= 300 && !cytokineOccured){
            cytokineOccured = true;
            changeTotalATP(-300);
            cytokineStartTurn = Game.turnNumber;
            Stats.macroDamage *= 2;
            Stats.neutroDamage *= 2;
            Stats.helperTDamage *= 2;
            Stats.cytoDamage *= 2;

            Stats.macroMaxHealth *= 2;
            Stats.neutroMaxHealth *= 2;
            Stats.dendriticMaxHealth *= 2;
            Stats.virginTMaxHealth *= 2;
            Stats.helperTMaxHealth *= 2;
            Stats.cytoMaxHealth *= 2;
            Stats.virginBMaxHealth *= 2;
            Stats.bCellMaxHealth *= 2;

            Stats.macroHealth = Stats.macroMaxHealth;
            Stats.neutroHealth = Stats.neutroMaxHealth;
            Stats.dendriticHealth = Stats.dendriticMaxHealth;
            Stats.virginTHealth = Stats.virginTMaxHealth;
            Stats.helperTHealth = Stats.helperTMaxHealth;
            Stats.cytoHealth = Stats.cytoMaxHealth;
            Stats.virginBHealth = Stats.virginBMaxHealth;
            Stats.bCellHealth = Stats.bCellMaxHealth;

            Stats.macroInfectionShield *= 2;
            Stats.neutroInfectionShield *= 2;
            Stats.dendriticInfectionShield *= 2;
            Stats.virginTInfectionShield *= 2;
            Stats.helperTInfectionShield *= 2;
            Stats.cytoInfectionShield *= 2;
            Stats.virginBInfectionShield *= 2;
            Stats.bCellInfectionShield *= 2;
            Stats.atpSynthaseInfectionShield *= 2;

            Stats.macroAccuracy = 1;
            Stats.neutroAccuracy = 1;
            Stats.helperTAccuracy = 1;
            Stats.cytoAccuracy = 1;

            Stats.macroRecharge /= 2;
            Stats.neutroRecharge /= 2;
            Stats.dendriticRecharge /= 2;
            Stats.helperTRecharge /= 2;
            Stats.cytoRecharge /= 2;

            Stats.commonColdDamage /= 2;
            Stats.commonColdHealth /= 2;
            Stats.commonColdInfectionDamage /= 2;
            Stats.commonColdAccuracy /= 2;
            Stats.commonColdRecharge *= 2;
            Stats.commonColdDuplicationSPD = 1.0001;
            for (Organ organ : Game.mainBody.getOrganList()) {
                for (ImmuneCell immuneCell : organ.getImmuneCellList()) {
                    immuneCell.changeDamage(1, false);
                    immuneCell.changeMaxHealth(1, false);
                    immuneCell.changeHealth(immuneCell.getMaxHealth() - immuneCell.getHealth(), true);
                    immuneCell.changeInfectionShield(1, false);
                    immuneCell.changeAccuracy(immuneCell.getAccuracy());
                    immuneCell.changeRecharge(-0.5, false);
                }
                for (Pathogen pathogen : organ.getPathogenList()) {
                    pathogen.changeDamage(-0.5, false);
                    pathogen.changeHealth(-0.5, false);
                    pathogen.changeInfectionDMG(-0.5, false);
                    pathogen.changeAccuracy(-(pathogen.getAccuracy() / 2));
                    pathogen.changeRecharge(1, false);
                    pathogen.changeDuplicationSPD(1.0001);
                }
            }
        }
        return false;
    }

    public void cytokinePenalty() {
        Stats.macroDamage /= 2;
        Stats.neutroDamage /= 2;
        Stats.helperTDamage /= 2;
        Stats.cytoDamage /= 2;

        Stats.macroMaxHealth /= 2;
        Stats.neutroMaxHealth /= 2;
        Stats.dendriticMaxHealth /= 2;
        Stats.virginTMaxHealth /= 2;
        Stats.helperTMaxHealth /= 2;
        Stats.cytoMaxHealth /= 2;
        Stats.virginBMaxHealth /= 2;
        Stats.bCellMaxHealth /= 2;

        Stats.macroHealth = Stats.macroMaxHealth;
        Stats.neutroHealth = Stats.neutroMaxHealth;
        Stats.dendriticHealth = Stats.dendriticMaxHealth;
        Stats.virginTHealth = Stats.virginTMaxHealth;
        Stats.helperTHealth = Stats.helperTMaxHealth;
        Stats.cytoHealth = Stats.cytoMaxHealth;
        Stats.virginBHealth = Stats.virginBMaxHealth;
        Stats.bCellHealth = Stats.bCellMaxHealth;

        Stats.macroInfectionShield /= 2;
        Stats.neutroInfectionShield /= 2;
        Stats.dendriticInfectionShield /= 2;
        Stats.virginTInfectionShield /= 2;
        Stats.helperTInfectionShield /= 2;
        Stats.cytoInfectionShield /= 2;
        Stats.virginBInfectionShield /= 2;
        Stats.bCellInfectionShield /= 2;
        Stats.atpSynthaseInfectionShield /= 2;

        Stats.macroAccuracy = 0.75;
        Stats.neutroAccuracy = 0.95;
        Stats.helperTAccuracy = 0.85;
        Stats.cytoAccuracy =0.85;

        Stats.macroRecharge *= 2;
        Stats.neutroRecharge *= 2;
        Stats.dendriticRecharge *= 2;
        Stats.helperTRecharge *= 2;
        Stats.cytoRecharge *= 2;

        Stats.commonColdDamage *= 2;
        Stats.commonColdHealth *= 2;
        Stats.commonColdInfectionDamage *= 2;
        Stats.commonColdAccuracy *= 2;
        Stats.commonColdRecharge /= 2;
        Stats.commonColdDuplicationSPD = 1.5;
        for (Organ organ : Game.mainBody.getOrganList()) {
            for (ImmuneCell immuneCell : organ.getImmuneCellList()) {
                immuneCell.changeDamage(-0.5, false);
                if (immuneCell.getHealth() > immuneCell.getMaxHealth() / 2) {
                    immuneCell.changeHealth(immuneCell.getMaxHealth() / 2, true);
                }
                immuneCell.changeMaxHealth(-0.5, false);
                immuneCell.changeInfectionShield(-0.5, false);
                immuneCell.changeAccuracy(-immuneCell.getAccuracy());
                immuneCell.changeRecharge(1, false);
            }
            for (Pathogen pathogen : organ.getPathogenList()) {
                pathogen.changeDamage(1, false);
                pathogen.changeHealth(1, false);
                pathogen.changeInfectionDMG(1, false);
                pathogen.changeAccuracy(-(pathogen.getAccuracy() * 2));
                pathogen.changeInfectionDMG(1, false);
                pathogen.changeDuplicationSPD(1.5);
            }
        }
        Game.mainBody.changeGlobalHP(-50000, true);
        for (Organ organ : Game.mainBody.getOrganList()) {
            organ.changeHealth(-0.7, false);
        }
    }

    // Returns true if ability was successfully used. False if it failed to be used.
    public boolean regenerate() {
        if (totalATP >= 175 && !regenerateOnCooldown) {
            regenerateOccured = true;
            changeTotalATP(-175);
            regenerateStartTurn = Game.turnNumber;
            Game.mainBody.changeGlobalHP(10000, true);
            regenerateOnCooldown = true;
            return true;
        }
        return false;
    }

    public boolean hormoneBoost() {
        if (totalATP >= 95 && !hormoneBoostOnCoolDown) {
            hormoneBoostOccured = true;
            changeTotalATP((-95));
            hormoneBoostStartTurn = Game.turnNumber;
            Stats.macroRecharge -= 2;
            Stats.neutroRecharge -= 1;
            Stats.helperTRecharge -= 1;
            Stats.cytoRecharge -= 1;

            Stats.macroDamage += 15;
            Stats.neutroDamage += 20;
            Stats.helperTDamage += 10;
            Stats.cytoDamage += 5;

            Stats.macroAccuracy += 0.1;
            Stats.neutroAccuracy +=  0.05;
            Stats.helperTAccuracy += 0.05;
            Stats.cytoAccuracy += 0.025;

            for (Organ organ : Game.mainBody.getOrganList()) {
                for (ImmuneCell immuneCell : organ.getImmuneCellList()) {
                    if (immuneCell.getName().equals("Macrophage")) {
                        immuneCell.changeRecharge(-2, true);
                        immuneCell.changeDamage(15, true);
                        immuneCell.changeAccuracy(0.1);
                    } else if (immuneCell.getName().equals("Neutrophil")) {
                        immuneCell.changeRecharge(-1, true);
                        immuneCell.changeDamage(20, true);
                        immuneCell.changeAccuracy(0.05);
                    } else if (immuneCell.getName().equals("HelperTCell")) {
                        immuneCell.changeRecharge(-1, true);
                        immuneCell.changeDamage(10, true);
                        immuneCell.changeAccuracy(0.05);
                    } else if (immuneCell.getName().equals("CytotoxicTCell")) {
                        immuneCell.changeRecharge(-1, true);
                        immuneCell.changeDamage(5, true);
                        immuneCell.changeAccuracy(0.025);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void hormoneBoostPenalty() {
        Stats.macroRecharge += 2;
        Stats.neutroRecharge += 1;
        Stats.helperTRecharge += 1;
        Stats.cytoRecharge += 1;

        Stats.macroDamage -= 15;
        Stats.neutroDamage -= 20;
        Stats.helperTDamage -= 10;
        Stats.cytoDamage -= 5;

        Stats.macroAccuracy -= 0.1;
        Stats.neutroAccuracy -=  0.05;
        Stats.helperTAccuracy -= 0.05;
        Stats.cytoAccuracy -= 0.025;

        for (Organ organ : Game.mainBody.getOrganList()) {
            for (ImmuneCell immuneCell : organ.getImmuneCellList()) {
                if (immuneCell.getName().equals("Macrophage")) {
                    immuneCell.changeRecharge(2, true);
                    immuneCell.changeDamage(-15, true);
                    immuneCell.changeAccuracy(-0.1);
                } else if (immuneCell.getName().equals("Neutrophil")) {
                    immuneCell.changeRecharge(1, true);
                    immuneCell.changeDamage(-20, true);
                    immuneCell.changeAccuracy(-0.05);
                } else if (immuneCell.getName().equals("HelperTCell")) {
                    immuneCell.changeRecharge(1, true);
                    immuneCell.changeDamage(-10, true);
                    immuneCell.changeAccuracy(-0.05);
                } else if (immuneCell.getName().equals("CytotoxicTCell")) {
                    immuneCell.changeRecharge(1, true);
                    immuneCell.changeDamage(-5, true);
                    immuneCell.changeAccuracy(-0.025);
                }
            }
        }
    }

    public boolean freezeDisease() {
        if (totalATP >= 245 && !freezeDiseaseOnCoolDown) {
            freezeDiseaseOccured = true;
            changeTotalATP(-245);
            freezeDiseaseStartTurn = Game.turnNumber;
            Stats.commonColdDuplicationSPD = 0;
            Stats.commonColdDamage = 0;

            for (Organ organ : Game.mainBody.getOrganList()) {
                for (Pathogen pathogen : organ.getPathogenList()) {
                    pathogen.changeDuplicationSPD(-pathogen.getDuplicationSPD());
                    pathogen.changeDamage(-pathogen.getDamage(), true);
                }
            }
            return true;
        }
        return false;
    }

    public void freezeDiseasePenalty() {
        Stats.commonColdDuplicationSPD = 1.5;
        Stats.commonColdDamage = 30;

        for (Organ organ : Game.mainBody.getOrganList()) {
            for (Pathogen pathogen : organ.getPathogenList()) {
                pathogen.changeDuplicationSPD(1.5);
                pathogen.changeDamage(30, true);
            }
        }
    }

    public boolean induceFever() {
        if (totalATP >= 80 && !induceFeverOnCoolDown) {
            induceFeverOccured = true;
            changeTotalATP(-80);
            induceFeverStartTurn = Game.turnNumber;
            Stats.commonColdDuplicationSPD = 0.75;
            Stats.commonColdRecharge = 3;
            Stats.commonColdDamage = 20;
            Stats.commonColdInfectionDamage = 1.25;

            for (Organ organ : Game.mainBody.getOrganList()) {
                for (Pathogen pathogen : organ.getPathogenList()) {
                    pathogen.changeDuplicationSPD(-(pathogen.getDuplicationSPD() - 0.75));
                    pathogen.changeRecharge(3 - pathogen.getRecharge(), true);
                    pathogen.changeDamage(-(pathogen.getDamage() - 20), true);
                    pathogen.changeInfectionDMG(-(pathogen.getDuplicationSPD() - 1.25), true);
                }
            }
            return true;
        }
        return false;
    }


    public void induceFeverPenalty() {
        Stats.commonColdDuplicationSPD = 1.5;
        Stats.commonColdRecharge = 2;
        Stats.commonColdDamage = 30;
        Stats.commonColdInfectionDamage = 1.5;

        for (Organ organ : Game.mainBody.getOrganList()) {
            for (Pathogen pathogen : organ.getPathogenList()) {
                pathogen.changeDuplicationSPD(1.5 - pathogen.getDuplicationSPD());
                pathogen.changeRecharge(-(pathogen.getRecharge() - 2), true);
                pathogen.changeDamage(30 - pathogen.getDamage(), true);
                pathogen.changeInfectionDMG(1.5 - pathogen.getDuplicationSPD(), true);
            }
        }
    }
}
