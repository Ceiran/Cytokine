public class Dendritic extends ImmuneCell {
    public Dendritic() {
        super(Stats.dendriticHealth,
                Stats.dendriticMaxHealth,
                Stats.dendriticDamage,
                Stats.dendriticRecharge,
                Stats.dendriticAccuracy,
                Stats.dendriticInfectionShield,
                Stats.dendriticName);
    }

    public void attack(Cell target) {
        // Dendritic Cells cannot attack.
    }
}
