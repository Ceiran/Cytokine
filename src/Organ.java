import java.util.ArrayList;

public abstract class Organ {
    // maxCapacity dictates amount of cells that can be deployed at one time on the organ.
    private int currentCapacity, maxCapacity, currentHealth, maxHealth;
    // Determines pathogen progression path (lowest -> highest).
    private final int priority;
    // Determines damage reduction from pathogens.
    private double resistance;
    private String name;
    private List<ImmuneCell> cellList = new ArrayList<>();
    private List<Pathogen> pathogenList = new ArrayList<>();

    public Organ(int health, int capacity, double resistance, int priority, String name) {
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
    public double getOrganPercentHealth() { return Math.round(((double)currentHealth / maxHealth) * 100.0) / 100.0; }
    public String getName() { return name; }
    public List<ImmuneCell> getCellList() { return cellList; }
    public List<Pathogen> getPathogenList() { return pathogenList; }

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

    public void runCombat() {

    }

    // Applies system-wide debuffs to player once an organ fails.
    public abstract void applyCollapsePenalties(ImmuneSystem system);
    // Applies damage done by pathogens to organ.
    public abstract void applyDamage(Pathogen cell);
}
