public class ATPSynthase extends ImmuneCell {
    private int atpProduction, lifeTurns;

    public ATPSynthase() {
        super(Stats.atpSynthaseHealth, Stats.atpSynthaseMaxHealth, Stats.atpSynthaseDamage, Stats.atpSynthaseRecharge, Stats.atpSynthaseOrganHealRate, Stats.atpSynthaseAccuracy, Stats.atpSynthaseInfectionShield, Stats.atpSynthaseName);
        atpProduction = Stats.atpSynthaseAtpProduction;
        lifeTurns = Stats.atpSynthaseLifeTurns;
    }

    public int getATPProduction() { return atpProduction; }

    public void attack(Cell target) {
        // ATPSynthase cannot attack.
    }

    // This method runs once per turn.
    public void produceATP(ImmuneSystem immuneSystem) {
        immuneSystem.changeTotalATP(atpProduction);
    }
}
