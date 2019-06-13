public class BCell extends ImmuneCell {
    private int antibodyProduction;
    private int lifeTurns;

    public BCell() {
        super(Stats.bCellHealth, Stats.bCellMaxHealth, Stats.bCellDamage, Stats.bCellRecharge, Stats.bCellAccuracy, Stats.bCellInfectionShield, Stats.bCellName);
        antibodyProduction = Stats.bCellAntibodyProduction;
        lifeTurns = Stats.bCellLifeTurns;
    }

    public int getAntibodyProduction() { return antibodyProduction; }

    public void attack(Cell target) {
        // BCells cannot attack.
    }
}
