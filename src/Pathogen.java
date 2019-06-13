public abstract class Pathogen extends Cell {
    private double infectionDMG, duplicationSPD;
    private String name;
    private double duplicationSPD, infectionDMG;

    public Pathogen(int health, int maxHealth, int damage, int recharge, double accuracy, double infectionDMG, double duplicationSPD, String name) {
        super(health, maxHealth, damage, recharge, accuracy, "Pathogen");
        this.infectionDMG = infectionDMG;
        this.duplicationSPD = duplicationSPD;
        this.name = name;
        this.duplicationSPD = duplicationSPD;
        this.infectionDMG = infectionDMG;
    }

    public double getInfectionDMG() { return infectionDMG; }
    public double getDuplicationSPD() { return duplicationSPD; }
    public String getName() { return name; }
  
    public void changeInfectionDMG(double delta, boolean flat) {
        if (flat) {
            infectionDMG += delta;
        } else {
            infectionDMG *= (1 + delta);
        }
        if (infectionDMG < 0) { infectionDMG = 0; }
    }

    public void changeDuplicationSPD(double delta) {
        duplicationSPD += delta;
        if (duplicationSPD < 0) { duplicationSPD = 0; }
    }

    public void attack(Cell target) { target.changeHealth(-getDamage(), true); }
    public void damageOrgan(Organ target) { target.changeHealth(-getDamage(), true); }
}
