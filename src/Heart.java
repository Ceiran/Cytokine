public class Heart extends Organ {
    public Heart() { super(Stats.heartHealth, Stats.heartCapacity, Stats.heartResistance, Stats.heartPriority, Stats.heartName); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getOrganPercentHealth() < 0) { return; }

    }
}
