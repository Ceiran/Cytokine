public class HelperTCell extends ImmuneCell {
    private double healRate;
    
    public HelperTCell(double healRate) {
        super(95, 95, 30, 1, 0.85, 100, "HelperTCell");
        this.healRate = healRate;
    }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }

    // Heals ImmuneCells given that it is not itself or another T-Cell.
    public void heal(ImmuneCell target) {

    }
}
