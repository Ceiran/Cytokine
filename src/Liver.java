public class Liver extends Organ {
    public Liver() { super(80000, 2000, 0.15, 3, "Liver"); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getPercentHealth() < 0) { return; }

    }
}
