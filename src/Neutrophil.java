public class Neutrophil extends ImmuneCell {
    public Neutrophil() {
        super(95, 95, 110, 1, 0.95, 20, "Neutrophil");
    }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }
}
