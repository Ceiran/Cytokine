public abstract class ImmuneCell extends Cell {
    private int infectionShield;
    private String name;

    public ImmuneCell(int health, int maxHealth, int damage, int attackSpeed, double accuracy, int infectionShield, String name) {
        super(health, maxHealth, damage, attackSpeed, accuracy, "Immune Cell");
        this.infectionShield = infectionShield;
        this.name = name;
    }

    public int getInfectionShield() { return infectionShield; }
    public String getName() { return name; }
}
