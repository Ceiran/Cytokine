public class Lungs extends Organ {
    public Lungs() {
        super(Stats.lungsHealth, Stats.lungsCapacity, Stats.lungsResistance, Stats.lungsPriority, Stats.lungsName); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getOrganPercentHealth() < 0) { return; }

    }
}
