public abstract class Pathogen extends Cell{
    private String name;

    public Pathogen(int health, int maxHealth, int damage, int recharge, double accuracy, String name) {
        super(health, maxHealth, damage, recharge, accuracy, "Pathogen");
        this.name = name;
    }

    public String getName() { return name; }
    public void attack(Cell target) {target.changeHealth(-getDamage(), true); }
    public void attack(Organ target){target.changeHealth(-getDamage());}


}
