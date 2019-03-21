public class Dendritic extends ImmuneCell {
    public Dendritic(int health, int maxHealth, int damage, int attackSpeed, double accuracy, int infectionShield, String name) {
        super(health, maxHealth, damage, attackSpeed, accuracy, infectionShield, "Dendritic");
    }

    public void attack(Cell target) {
        // Dendritic Cells cannot attack.
    }
}
