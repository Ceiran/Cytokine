public abstract class Pathogen extends Cell {
    private String name;
    private double duplicationSPD, infectionDMG;

    public Pathogen(int health, int maxHealth, int damage, int infectionDMG, int recharge, double accuracy,
                    String name, double duplicationSPD) {
        super(health, maxHealth, damage, recharge, accuracy, "Pathogen");
        this.name = name;
        this.duplicationSPD = duplicationSPD;
        this.infectionDMG = infectionDMG;
    }

    public String getName() { return name; }
    public double getDuplicationSPD() { return duplicationSPD; }
    public double getInfectionDMG() { return infectionDMG; }
    public void attack(Cell target) { target.changeHealth(-getDamage(), true); }
    public void damageOrgan(Organ target) { target.changeHealth(-getDamage(), true); }
}
