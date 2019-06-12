public class ImmuneSystem {
    private int totalATP;

    public ImmuneSystem(int totalATP){
        this.totalATP = totalATP;
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
        if (totalATP >= 100){
            int startTurn = Game.turnNumber;
            Stats.macroDamage *= 2;
            Stats.neutroDamage *= 2;
            Stats.helperTDamage *= 2;
            Stats.cytoDamage *= 2;

            Stats.macroHealth = Stats.macroMaxHealth * 2;
            Stats.neutroHealth = Stats.neutroMaxHealth * 2;
            Stats.dendriticHealth = Stats.dendriticMaxHealth * 2;
            Stats.virginTHealth = Stats.virginTMaxHealth * 2;
            Stats.helperTHealth = Stats.helperTMaxHealth * 2;
            Stats.cytoHealth = Stats.cytoMaxHealth * 2;
            Stats.virginBHealth = Stats.virginBMaxHealth * 2;
            Stats.bCellHealth = Stats.bCellMaxHealth * 2;

            Stats.commonColdDamage = Stats.commonColdDamage / 2;
            Stats.commonColdHealth = Stats.commonColdHealth / 2;
            Stats.commonColdInfectionDamage = Stats.commonColdInfectionDamage / 2;
            Stats.commonColdDuplicationSPD = 1.0001;
            Stats.commonColdAccuracy = Stats.commonColdAccuracy / 2;
            for (Organ organ : Game.mainBody.getOrganList()) {
                for (ImmuneCell immuneCell : organ.getImmuneCellList()) {
                    immuneCell.changeDamage(1, false);
                    immuneCell.changeMaxHealth(1, false);
                    immuneCell.changeHealth(immuneCell.getMaxHealth() - immuneCell.getHealth(), true);
                    immuneCell.changeInfectionShield(1, false);
                    immuneCell.changeAccuracy(immuneCell.getAccuracy());
                    // immuneCell.changeRecharge();
                }
                for (Pathogen pathogen : organ.getPathogenList()) {
                    pathogen.changeDamage(-0.5, false);
                    pathogen.changeHealth(-0.5, false);
                    pathogen.changeInfectionDMG(-0.5, false);
                    pathogen.changeAccuracy(-(pathogen.getAccuracy() / 2));
                    pathogen.changeInfectionDMG(-0.5, false);
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

            Stats.macroHealth = Stats.macroMaxHealth / 2;
            Stats.neutroHealth = Stats.neutroMaxHealth / 2;
            Stats.dendriticHealth = Stats.dendriticMaxHealth / 2;
            Stats.virginTHealth = Stats.virginTMaxHealth / 2;
            Stats.helperTHealth = Stats.helperTMaxHealth / 2;
            Stats.cytoHealth = Stats.cytoMaxHealth / 2;
            Stats.virginBHealth = Stats.virginBMaxHealth / 2;
            Stats.bCellHealth = Stats.bCellMaxHealth / 2;

            Stats.commonColdDamage = Stats.commonColdDamage * 2;
            Stats.commonColdHealth = Stats.commonColdHealth * 2;
            Stats.commonColdInfectionDamage = Stats.commonColdInfectionDamage * 2;
            Stats.commonColdDuplicationSPD = 1.5;
            Stats.commonColdAccuracy = Stats.commonColdAccuracy * 2;
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
            // Add aftereffects
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
