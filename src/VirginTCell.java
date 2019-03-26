public class VirginTCell extends ImmuneCell {
    public VirginTCell() {
        super(95, 95, 30, 1, 0.85, 100, "VirginTCell");
    }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }
}
