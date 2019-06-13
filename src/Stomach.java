public class Stomach extends Organ {
    public Stomach() {
        super(Stats.stomachHealth, Stats.stomachCapacity, Stats.stomachResistance, Stats.stomachPriority, Stats.stomachName); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getOrganPercentHealth() < 0) { return; }

    }
}
