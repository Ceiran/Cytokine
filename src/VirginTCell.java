public class VirginTCell extends ImmuneCell {
    
    public VirginTCell(String destination) {
        super(Stats.virginTHealth, Stats.virginTMaxHealth, Stats.virginTDamage, Stats.virginTRecharge, Stats.virginTOrganHealRate, Stats.virginTAccuracy, Stats.virginTInfectionShield, destination, Stats.virginTName);
        spawnTime = Stats.virginTSpawnTime;
    }

    public void attack(Cell target) {
        // VirginTCells cannot attack.
    }

}
