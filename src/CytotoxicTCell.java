public class CytotoxicTCell extends ImmuneCell {
    public CytotoxicTCell() {
        super(95, 95, 30, 1, 0.85, 100, "CytotoxicTCell");
    }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }

    // Kills an ally cell that has been infected.
    public void purge(ImmuneCell target) {

    }
}
