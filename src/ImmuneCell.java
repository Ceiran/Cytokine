public abstract class ImmuneCell extends Cell {
    private int infectionShield;
    private double organHealRate;
    private String name;

    public ImmuneCell(int health, int maxHealth, int damage, int recharge, double accuracy, int infectionShield, String name) {
        super(health, maxHealth, damage, recharge, accuracy, "Immune Cell");
        this.infectionShield = infectionShield;
        this.name = name;
        organHealRate = 3;
    }

    public int getInfectionShield() { return infectionShield; }
    public String getName() { return name; }

    public void healOrgan(Organ org) {
        org.changeHealth(organHealRate, true);
    }
}
