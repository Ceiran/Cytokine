public class VirginTCell extends ImmuneCell {
    
    public VirginTCell() {
        super(Stats.virginTHealth, Stats.virginTMaxHealth, Stats.virginTDamage, Stats.virginTRecharge, Stats.virginTOrganHealRate, Stats.virginTAccuracy, Stats.virginTInfectionShield, Stats.virginTName);
        spawnTime = Stats.virginTSpawnTime;
    }

    public void attack(Cell target) {
        // VirginTCells cannot attack.
    }

}
