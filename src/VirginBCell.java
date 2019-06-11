public class VirginBCell extends ImmuneCell {
    private int spawnTime;

    public VirginBCell(int spawn) {
        super(Stats.virginBHealth,
                Stats.virginBMaxHealth,
                Stats.virginBDamage,
                Stats.virginBRecharge,
                Stats.virginBAccuracy,
                Stats.virginBInfectionShield,
                Stats.virginBName);
        spawnTime = Stats.virginBSpawnTime;
    }

    public int getSpawnTime() { return spawnTime; }

    public void attack(Cell target) {
        // VirginBCells cannot attack.
    }
}
