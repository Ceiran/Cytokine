public class VirginBCell extends ImmuneCell {

    public VirginBCell() {
        super(Stats.virginBHealth, Stats.virginBMaxHealth, Stats.virginBDamage, Stats.virginBRecharge, Stats.virginBOrganHealRate, Stats.virginBAccuracy, Stats.virginBInfectionShield, Stats.virginBName);
        spawnTime = Stats.virginBSpawnTime;
    }

    public void attack(Cell target) {
        // VirginBCells cannot attack.
    }

}
