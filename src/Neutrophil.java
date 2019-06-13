public class Neutrophil extends ImmuneCell {
    public Neutrophil() {
        super(Stats.neutroHealth, Stats.neutroMaxHealth, Stats.neutroDamage, Stats.neutroRecharge, Stats.neutroOrganHealRate, Stats.neutroAccuracy, Stats.neutroInfectionShield, Stats.neutroName);
    }

    public void attack(Cell target) { target.changeHealth(-getDamage(), true); }
}
