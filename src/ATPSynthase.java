public class ATPSynthase extends ImmuneCell {
    private int atpProduction, lifeTurns;

    public ATPSynthase(int health, int maxHealth, int damage, int recharge, double accuracy, int infectionShield, String name) {
        super(Stats.atpSynthaseHealth, Stats.atpSynthaseMaxHealth, Stats.atpSynthaseDamage, Stats.atpSynthaseRecharge, Stats.atpSynthaseAccuracy, Stats.atpSynthaseInfectionShield, Stats.atpSynthaseName);
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
