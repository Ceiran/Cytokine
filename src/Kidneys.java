public class Kidneys extends Organ {
    public Kidneys() { super(25000, 1800, 0.5, 4, "Kidneys"); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getPlayerControl() < 0) { return; }

    }
}
