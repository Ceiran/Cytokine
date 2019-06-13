public abstract class ImmuneCell extends Cell {
    private int infectionShield;
    private int organHealRate;
    private String name;

    public ImmuneCell(int health, int maxHealth, int damage, int recharge, int organHealRate, double accuracy, int infectionShield, String name) {
        super(health, maxHealth, damage, recharge, accuracy, "Immune Cell");
        this.infectionShield = infectionShield;
        this.name = name;
        this.organHealRate = organHealRate;
    }

    public int getInfectionShield() { return infectionShield; }
    public String getName() { return name; }

    public void changeInfectionShield(double delta, boolean flat) {
        if (flat) {
            infectionShield += delta;
        } else {
            infectionShield = (int)Math.round(infectionShield * (1 + delta));
        }
        if (infectionShield < 0) { infectionShield = 0; }
    }

    public void healOrgan(Organ org) {
        org.changeHealth(organHealRate, true);
    }
}
