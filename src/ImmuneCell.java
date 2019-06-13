public abstract class ImmuneCell extends Cell {
    // targetTime is the turnNumber that the cell should spawn on.
    // initSpawnTime is the number of turns deployable cells must wait in reserves before they can be deployed.
    private int infectionShield, organHealRate, targetTime, initSpawnTime;
    private String destination;
    private String name;

    public ImmuneCell(int health, int maxHealth, int damage, int recharge, int organHealRate, double accuracy, int infectionShield, int initSpawnTime, String destination, String name) {
        super(health, maxHealth, damage, recharge, accuracy, "Immune Cell");
        this.infectionShield = infectionShield;
        this.name = name;
        this.organHealRate = organHealRate;
        this.initSpawnTime = initSpawnTime;
        this.destination = destination;
        targetTime = 0;
    }

    public int getInfectionShield() { return infectionShield; }
    public int getTargetTime() { return targetTime; }
    public int getInitSpawnTime() { return initSpawnTime; }
    public String getDestination() { return destination; }
    public String getName() { return name; }

    public void changeInfectionShield(double delta, boolean flat) {
        if (flat) {
            infectionShield += delta;
        } else {
            infectionShield = (int)Math.round(infectionShield * (1 + delta));
        }
        if (infectionShield < 0) { infectionShield = 0; }
    }

    public void changeTargetTime(double delta, boolean flat) {
        if (flat) {
            targetTime += delta;
        } else {
            targetTime = (int)Math.round(targetTime * (1 + delta));
        }
        if (targetTime < 0) { targetTime = 0; }
    }

    public void changeDestination(String newDestination) {
        destination = newDestination;
    }

    public void healOrgan(Organ org) {
        org.changeHealth(organHealRate, true);
    }
}
