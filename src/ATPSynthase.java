public class ATPSynthase extends ImmuneCell {
    private int atpProduction;
    private int lifeTurns;

    public ATPSynthase(int health, int maxHealth, int damage, int recharge, double accuracy, int infectionShield, String name) {
        super(1, 1, 0, 0, 0, 0, "ATPSynthase");
        atpProduction = 2;
        lifeTurns = 45;
    }

    public int getATPProduction() { return atpProduction; }

    public void attack(Cell target) {
        // ATPSynthase cannot attack.
    }

    // This method runs once per turn.
    public void produceATP() {

    }
}
