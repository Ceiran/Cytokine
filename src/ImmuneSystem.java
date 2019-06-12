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
            // int startTurn = getTurnNumber();
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
            for (Organ organ : mainBody.getOrganList()) {
                for (ImmuneCell immuneCell : organ.getImmuneCellList()) {
                    immuneCell.changeDamage(1, false);
                    immuneCell.changeMaxHealth(1, false);
                    immuneCell.changeHealth(immuneCell.getMaxHealth() - immuneCell.getHealth(), true);
                    immuneCell.changeInfectionShield(1, false);
                    immuneCell.changeAccuracy(immuneCell.getAccuracy());
                    // immuneCell.changeRecharge();
                }
                for (Pathogen pathogen : organ.getPathogenList()) {
                    // Put stat changes to Pathogen here.
                }
            }
            /* while (getTurnNumber() <= startTurn + 100) {
                // Hold thread for 100 turns.
            } */
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
