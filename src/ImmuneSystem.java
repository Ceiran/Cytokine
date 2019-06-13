public class ImmuneSystem {
    private int totalATP;
    private boolean cytokineOccured;

    public ImmuneSystem(){
        cytokineOccured = false;
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

    public boolean cytokineStorm() {
        if (totalATP >= 100 && !cytokineOccured){
            int startTurn = Game.turnNumber;
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
            while (Game.turnNumber <= startTurn + 100) {
                // Hold thread for 100 turns.
            }
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
                    // immuneCell.changeRecharge();
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
            cytokineOccured = true;
        }
        return false;
    }

    public void regenerate() {

    }

    public void hormoneBoost() {

    }

    public void freezeDisease() {

    }

    public void induceFever() {

    }

    public void synthesize(){

    }

    public void deploy(){

    }
}
