public class CytotoxicTCell extends ImmuneCell {
    public CytotoxicTCell(String destination) {
        super(Stats.cytoHealth, Stats.cytoMaxHealth, Stats.cytoDamage, Stats.cytoRecharge, Stats.cytoOrganHealRate, Stats.cytoAccuracy, Stats.cytoInfectionShield, destination, Stats.cytoName);
    }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }

    // Kills an ally cell that has been infected.
    public void purge(ImmuneCell target) {

    }
}
