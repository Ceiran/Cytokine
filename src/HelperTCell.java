public class HelperTCell extends ImmuneCell {
    private double healRate;
    
    public HelperTCell(String destination) {
        super(Stats.helperTHealth, Stats.helperTMaxHealth, Stats.helperTDamage, Stats.helperTRecharge, Stats.helperTOrganHealRate, Stats.helperTAccuracy, Stats.helperTInfectionShield, destination, Stats.helperTName);
        healRate = Stats.helperTHealRate;
    }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }

    // Heals ImmuneCells given that it is not itself or another T-Cell.
    public void heal(ImmuneCell target) {

    }
}
