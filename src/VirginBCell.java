public class VirginBCell extends ImmuneCell {
    private int antibodyProduction;

    public VirginBCell() {
        super(0, 0, 0, 0, 0, 0, "VirginBCell");
        antibodyProduction = 0;
    }

    public int getAntibodyProduction() { return antibodyProduction; }

    public void attack(Cell target) {
        // VirginBCells cannot attack.
    }
}
