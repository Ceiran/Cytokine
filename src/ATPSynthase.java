public class ATPSynthase extends ImmuneCell {
    private int atpProduction;
    private int lifeTurns;

    public ATPSynthase() {
        super(1, 1, 0, 0, 0, 0, "ATPSynthase");
        atpProduction = 2;
        lifeTurns = 45;
    }

    public int getAtpProduction() { return atpProduction; }

    public void attack(Cell target) {
        // ATPSynthase cannot attack.
    }
}
