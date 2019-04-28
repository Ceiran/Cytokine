public class Brain extends Organ {
    public Brain() { super(30000, 1450, 0.1, 0, "Brain"); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getOrganPercentHealth() < 0) { return; }

    }
}
