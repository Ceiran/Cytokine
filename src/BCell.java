public class BCell extends ImmuneCell {
    private int antibodyProduction;
    private int lifeTurns;

    public BCell() {
        super(50, 50, 0, 0, 0, 0, "BCell");
        antibodyProduction = 12;
        lifeTurns = 30;
    }

    public int getAntibodyProduction() { return antibodyProduction; }

    public void attack(Cell target) {
        // BCells cannot attack.
    }
}
