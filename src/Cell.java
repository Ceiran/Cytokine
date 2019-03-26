public abstract class Cell {
    private int health, maxHealth, damage, attackSpeed;
    private double accuracy;
    private String type;

    // The instance variable type defines whether the Cell is an immuneCell or Pathogen.
    public Cell(int health, int maxHealth, int damage, int attackSpeed, double accuracy, String type) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.accuracy = accuracy;
        this.type = type;
    }

    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public int getDamage() { return damage; }
    public int getAttackSpeed() { return attackSpeed; }
    public double getAccuracy() { return accuracy; }
    public String getType() { return type; }

    public double calcPercentage() { return Math.round(((double)health / maxHealth) * 100.0) / 100.0; }

    /* Calculates total health of a cell after a change, delta, is applied.
       Flat is true if delta is a flat rate and false if it is a percent change.
     */
    public void changeHealth(double delta, boolean flat) {
        if (flat) {
            health += delta;
        } else {
            health *= (1 + delta);
        }
        if (health < 0) {
            health = 0;
        } else if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public abstract void attack(Cell target);
}
