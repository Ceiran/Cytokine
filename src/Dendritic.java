public class Dendritic extends ImmuneCell {
    public Dendritic(String destination) {
        super(Stats.dendriticHealth, Stats.dendriticMaxHealth, Stats.dendriticDamage, Stats.dendriticRecharge, Stats.dendriticOrganHealRate, Stats.dendriticAccuracy, Stats.dendriticInfectionShield, destination, Stats.dendriticName);
    }

    public void attack(Cell target) {
        // Dendritic Cells cannot attack.
    }
}
