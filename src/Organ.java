public abstract class Organ {
    private int priority, capacity;
    private double currentHealth, totalHealth, percentageControl, resistance;
    private boolean playerControl;

    public Organ(double health, int capacity, double resistance, int priority) {
        this.priority = priority;
        this.currentHealth = health;
        this.totalHealth = health;
        this.capacity = capacity;
        this.resistance = resistance;
        playerControl = true;
        percentageControl = 1;
    }

    public boolean getPlayerControl() { return playerControl; }
    public int getCapacity() { return capacity; }

    public abstract void applyPenalties();
}
