public class Macrophage extends ImmuneCell {
    public Macrophage() {
        super(200, 200, 45, 4, 0.75, 120, "Macrophage");
    }

    public void attack(Cell target) { target.changeHealth(-getDamage(), true); }
}
