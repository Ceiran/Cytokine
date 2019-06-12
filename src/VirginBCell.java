public class VirginBCell extends ImmuneCell {

    public VirginBCell(int spawn) {
        super(Stats.virginBHealth,
                Stats.virginBMaxHealth,
                Stats.virginBDamage,
                Stats.virginBRecharge,
                Stats.virginBAccuracy,
                Stats.virginBInfectionShield,
                Stats.virginBName);
    }

    public void attack(Cell target) {
        // VirginBCells cannot attack.
    }

}
