public class ATPSynthase extends ImmuneCell {
    private int atpProduction;

    public ATPSynthase(int health, int maxHealth, int damage, int attackSpeed, double accuracy, int infectionShield, String name) {
        super(health, maxHealth, damage, attackSpeed, accuracy, infectionShield, "ATPSynthase");
        atpProduction = 2;
    }

    public int getAtpProductionRate() { return atpProduction; }

    public void attack(Cell target) {
        // ATPSynthase Cells cannot attack.
    }
}
