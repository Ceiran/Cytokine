public abstract class Pathogen extends Cell{
    private String name;

    public Pathogen(int health, int maxHealth, int damage, int recharge, double accuracy, String name) {
        super(health, maxHealth, damage, recharge, accuracy, "Pathogen");
        this.name = name;
    }

    public String getName() { return name; }

}
