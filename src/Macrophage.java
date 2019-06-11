public class Macrophage extends ImmuneCell {
    
    public Macrophage() {
        super(Stats.macroHealth,
                Stats.macroMaxHealth,
                Stats.macroDamage,
                Stats.macroRecharge,
                Stats.macroAccuracy,
                Stats.macroInfectionShield,
                Stats.macroName);
    }

    public void attack(Cell target) { target.changeHealth(-getDamage(), true); }
}
