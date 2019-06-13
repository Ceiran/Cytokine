public class VirginTCell extends ImmuneCell {
    private int spawnTime;
    
    public VirginTCell(String destination) {
        super(Stats.virginTHealth, Stats.virginTMaxHealth, Stats.virginTDamage, Stats.virginTRecharge, Stats.virginTOrganHealRate, Stats.virginTAccuracy, Stats.virginTInfectionShield, destination, Stats.virginTName);
        spawnTime = Stats.virginTSpawnTime;
    }

    public int getSpawnTime() { return spawnTime; }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }
}
