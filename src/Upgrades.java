public abstract class Upgrades {
    private int health, damage, infectionShield, accuracy, ATPConsumption;
    private double attackSpeed;

    public Upgrades(int health, int damage, int infectionShield, int accuracy, int ATPConsumption, double attackSpeed){
        this.health = health;
        this.damage = damage;
        this.infectionShield = infectionShield;
        this.accuracy = accuracy;
        this.ATPConsumption = ATPConsumption;
        this.attackSpeed = attackSpeed;
    }
    public int getHealth() { return health; }
    public int getDamage() { return damage; }
    public int getInfectionShield() { return infectionShield; }
    public int getaccuracy() { return accuracy; }
    public int getATPConsumption() { return ATPConsumption; }
    public double getAttackSpeed() { return attackSpeed; }

}
