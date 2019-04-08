public class ATPSynthase extends ImmuneCell {
    private int atpProduction;

    public ATPSynthase(int health, int maxHealth, int damage, int recharge, double accuracy, int infectionShield, String name) {
        super(1, 1, 0, 0, 0, 0, "ATPSynthase");
        atpProduction = 2;
    }

    public int getAtpProductionRate() { return atpProduction; }

    public void attack(Cell target) {
        // ATPSynthase Cells cannot attack.
    }
}
