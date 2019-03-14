public abstract class Organ {
    private int priority, currentCapacity;
    private final int maxCapacity;
    private double currentHealth, resistance;
    private final double maxHealth;
    private String name;

    public Organ(double health, int capacity, double resistance, int priority, String name) {
        this.priority = priority;
        this.currentHealth = health;
        this.maxHealth = health;
        this.maxCapacity = capacity;
        currentCapacity = 0;
        this.resistance = resistance;
        this.name = name;
    }

    public int getMaxCapacity() { return maxCapacity; }
    public int getCurrentCapacity() { return currentCapacity; }
    public int getPriority() { return priority; }
    public double getResistance() { return resistance; }
    public boolean getPlayerControl() { return currentHealth > 0; }
    public String getName() { return name; }

    public boolean changeCapacity(int delta) {
        if (delta < 0 && currentCapacity == 0 || delta > 0 && currentCapacity == maxCapacity) { return false; }
        currentCapacity += delta;
        return true;
    }
    public void changeHealth(double delta) {
        currentHealth += delta;
        if (currentHealth < 0) {
            currentHealth = 0;
        } else if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }
    public void changeResistance(double delta) {
        resistance += delta;
        if (resistance > 1) { resistance = 1; }
    }

    public abstract void applyCollapsePenalties(ImmuneSystem system);
    public abstract void applyDamage(Pathogen cell);
}
