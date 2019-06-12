public class VirginTCell extends ImmuneCell {
    
    public VirginTCell(int spawn) {
        super(Stats.virginTHealth,
                Stats.virginTMaxHealth,
                Stats.virginTDamage,
                Stats.virginTRecharge,
                Stats.virginTAccuracy,
                Stats.virginTInfectionShield,
                Stats.virginTName);
    }

    public void attack(Cell target) {
        // VirginTCells cannot attack.
    }

}
