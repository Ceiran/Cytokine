public class Kidneys extends Organ {
    public Kidneys() {
        super(Stats.kidneysHealth, Stats.kidneysCapacity, Stats.kidneysResistance, Stats.kidneysPriority, Stats.kidneysName); }

    public void applyCollapsePenalties(ImmuneSystem system) {

    }

    public void applyDamage(Pathogen cell) {
        if (getOrganPercentHealth() < 0) { return; }

    }
}
