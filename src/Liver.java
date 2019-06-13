public class Liver extends Organ {
    public Liver() {
        super(Stats.liverHealth, Stats.liverCapacity, Stats.liverResistance, Stats.liverPriority, Stats.liverName); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getOrganPercentHealth() < 0) { return; }

    }
}
