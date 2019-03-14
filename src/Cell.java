public class Cell {
    private int health, damage, attackSpeed, infectionShield;
    private double accuracy;
    private String type;

    public Cell(int health, int damage, int attackSpeed, int infectionShield, double accuracy, String type){
        this.health = health;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.infectionShield = infectionShield;
        this.accuracy = accuracy;
        this.type = type;
    }

    public int getHealth(){ return health; }
    public int getDamage(){ return damage; }
    public int getAttackSpeed(){ return attackSpeed; }
    public int getInfectionShield(){ return infectionShield; }
    public double getAccuracy(){ return accuracy; }
}
