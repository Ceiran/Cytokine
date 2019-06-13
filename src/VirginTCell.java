public class VirginTCell extends ImmuneCell {
    private int spawnTime;
    
    public VirginTCell() {
        super(Stats.virginTHealth, Stats.virginTMaxHealth, Stats.virginTDamage, Stats.virginTRecharge, Stats.virginTAccuracy, Stats.virginTInfectionShield, Stats.virginTName);
        spawnTime = Stats.virginTSpawnTime;
    }

    public int getSpawnTime() { return spawnTime; }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }
}
