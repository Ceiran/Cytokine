public abstract class Cell {
    // aliveTime is the number of turns the Cell has been alive after being deployed.
    // If the Cell is a non-combat Cell, aliveTime tracks the number of turns after being instantiated in reserves.
    private int health, maxHealth, damage, recharge, aliveTime;
    private double accuracy;
    private String type;

    // The instance variable type defines whether the Cell is an immuneCell or Pathogen.
    public Cell(int health, int maxHealth, int damage, int recharge, double accuracy, String type) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.recharge = recharge;
        this.accuracy = accuracy;
        this.type = type;
        aliveTime = 0;
    }

    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public int getDamage() { return damage; }
    public int getAttackSpeed() { return recharge; }
    public double getAccuracy() { return accuracy; }
    public String getType() { return type; }
    public int getAliveTime() { return aliveTime; }

    public double calcPercentage() { return Math.round(((double)health / maxHealth) * 100.0) / 100.0; }

    /* Calculates total health of a cell after a change, delta, is applied.
       Flat is true if delta is a flat rate and false if it is a percent change.
       Delta should indicate a percent increase with a positive value.
       Delta should indicate a percent decrease with a negative value.
       Returns false if Cell is dead.
     */
    public boolean changeHealth(double delta, boolean flat) {
        if (flat) {
            health += delta;
        } else {
            health *= (1 + delta);
        }
        if (health < 0) {
            health = 0;
            return false;
        } else if (health > maxHealth) {
            health = maxHealth;
        }
        return true;
    }

    // When max health is increased, health is also increased proportionally.
    public void changeMaxHealth(double delta, boolean flat) {
        if (flat) {
            maxHealth += delta;
        } else {
            maxHealth *= (1 + delta);
        }
        if (maxHealth < 0) { maxHealth = 0; }
        if (delta > 0) { changeHealth(delta, flat); }
        changeHealth(0, false);
    }

    public void changeDamage(double delta, boolean flat) {
        if (flat) {
            damage += delta;
        } else {
            damage *= (1 + delta);
        }
        if (damage < 0) { damage = 0; }
    }

    public void changeRecharge(int delta, boolean flat) {
        if (flat) {
            recharge += delta;
        } else {
            recharge *= (1 + delta);
        }
        if (recharge < 0) { recharge = 0; }
    }

    public void changeAccuracy(double delta){
        accuracy += delta;
        if (accuracy < 0) { accuracy = 0; }
    }

    public abstract void attack(Cell target);
}
