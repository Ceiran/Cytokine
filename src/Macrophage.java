public class Macrophage extends ImmuneCell {
    public Macrophage(String destination) {
        super(Stats.macroHealth, Stats.macroMaxHealth, Stats.macroDamage, Stats.macroRecharge, Stats.macroOrganHealRate, Stats.macroAccuracy, Stats.macroInfectionShield, destination, Stats.macroName);
    }

    public void attack(Cell target) { target.changeHealth(-getDamage(), true); }
}
