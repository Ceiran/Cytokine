public class VirginTCell extends ImmuneCell {
    public VirginTCell() {
        super(50, 50, 0, 0, 0, 0, "VirginTCell");
    }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }
}
