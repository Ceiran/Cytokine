public class BCell extends ImmuneCell {
    private int antibodyProduction;

    public BCell() {
        super(0, 0, 0, 0, 0, 0, "BCell");
        antibodyProduction = 12;
    }

    public int getAntibodyProduction() { return antibodyProduction; }

    public void attack(Cell target) {
        // BCells cannot attack.
    }
}
