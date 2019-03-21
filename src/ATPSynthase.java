public class ATPSynthase extends ImmuneCell {
    public ATPSynthase(int health, int maxHealth, int damage, int attackSpeed, double accuracy, int infectionShield, String name) {
        super(health, maxHealth, damage, attackSpeed, accuracy, infectionShield, "ATPSynthase");
    }

    public void attack(Cell target) {
        // ATPSynthase Cells cannot attack.
    }
}
