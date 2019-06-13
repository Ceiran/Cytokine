public class VirginBCell extends ImmuneCell {
    private int spawnTime;

    public VirginBCell(String destination) {
        super(Stats.virginBHealth, Stats.virginBMaxHealth, Stats.virginBDamage, Stats.virginBRecharge, Stats.virginBOrganHealRate, Stats.virginBAccuracy, Stats.virginBInfectionShield, destination, Stats.virginBName);
        spawnTime = Stats.virginBSpawnTime;
    }

    public int getSpawnTime() { return spawnTime; }

    public void attack(Cell target) {
        // VirginBCells cannot attack.
    }
}
