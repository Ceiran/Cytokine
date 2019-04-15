public class Lungs extends Organ {
    public Lungs() { super(82000, 2100, 0.6, 1, "Lungs"); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getOrganPercentHealth() < 0) { return; }

    }
}
