public class Brain extends Organ {
    public Brain() {
        super(Stats.brainHealth, Stats.brainCapacity, Stats.brainResistance, Stats.brainPriority, Stats.brainName); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getOrganPercentHealth() < 0) { return; }

    }
}
