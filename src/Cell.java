public abstract class Cell {
    private int health, maxHealth, damage, attackSpeed, infectionShield;
    private double accuracy;
    private String type;

    public Cell(int health, int maxHealth, int damage, int attackSpeed, int infectionShield, double accuracy, String type) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.infectionShield = infectionShield;
        this.accuracy = accuracy;
        this.type = type;
    }

    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public int getDamage() { return damage; }
    public int getAttackSpeed() { return attackSpeed; }
    public int getInfectionShield() { return infectionShield; }
    public double getAccuracy() { return accuracy; }
    public String getType() { return type; }

    public double getPercentage() { return Math.round(((double)health / maxHealth) * 100.0) / 100.0; }

    /* Calculates total health of a cell after a change, delta, is applied.
       Flat is true if delta is a flat rate and false if it is a percent change.
     */
    public void changeHealth(double delta, boolean flat) {
        if (flat) {
            if ((health += delta) < 0) {
                health = 0;
            } else if ((health += delta) > maxHealth) {
                health = maxHealth;
            } else
                health += delta;
        } else {
            health *= (1 + delta);
        }
    }
}
