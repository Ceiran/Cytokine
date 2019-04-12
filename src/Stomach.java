public class Stomach extends Organ {
    public Stomach() { super(64500, 1600, 0.3, 2, "Stomach"); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getPercentHealth() < 0) { return; }

    }
}
