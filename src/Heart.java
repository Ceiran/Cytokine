public class Heart extends Organ {
    public Heart() { super(35000, 1150, 0.4, 0, "Heart"); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getOrganPercentHealth() < 0) { return; }

    }
}
