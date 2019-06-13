public class VirginBCell extends ImmuneCell {

    public VirginBCell() {
        super(Stats.virginBHealth, Stats.virginBMaxHealth, Stats.virginBDamage, Stats.virginBRecharge, Stats.virginBOrganHealRate, Stats.virginBAccuracy, Stats.virginBInfectionShield, Stats.virginBName);
    }

    public void attack(Cell target) {
        // VirginBCells cannot attack.
    }

}
