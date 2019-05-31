import java.util.ArrayList;
import java.util.List;

public abstract class Organ {
    // maxCapacity dictates amount of cells that can be deployed at one time on the organ.
    private int capacity, currentHealth, maxHealth;
    // Determines pathogen progression path (lowest -> highest).
    private final int priority;
    // Determines damage reduction from pathogens.
    private double resistance;
    private String name;
    private List<ImmuneCell> immuneCellList = new ArrayList<>();
    private List<Pathogen> pathogenList = new ArrayList<>();

    // Determines constant damage to body from collapse penalties.
    public static double penalty = 0;

    public Organ(int health, int capacity, double resistance, int priority, String name) {
        this.priority = priority;
        this.currentHealth = health;
        this.maxHealth = health;
        this.capacity = capacity;
        this.resistance = resistance;
        this.name = name;
    }

    public int getCapacity() { return capacity; }
    public int getCurrentCapacity() { return immuneCellList.size() + pathogenList.size(); }
    public int getPriority() { return priority; }
    public double getResistance() { return resistance; }
    public double getOrganPercentHealth() { return Math.round(((double)currentHealth / maxHealth) * 100.0) / 100.0; }
    public String getName() { return name; }
    public List<ImmuneCell> getImmuneCellList() { return immuneCellList; }
    public List<Pathogen> getPathogenList() { return pathogenList; }

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

    // Applies system-wide debuffs to player once an organ fails.
    public abstract void applyCollapsePenalties(ImmuneSystem system);
}
