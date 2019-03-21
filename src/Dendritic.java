public class Dendritic extends ImmuneCell {
    public Dendritic() {
        super(40, 40, 0, 0, 0, 300, "Dendritic");
    }

    public void attack(Cell target) {
        // Dendritic Cells cannot attack.
    }
}
