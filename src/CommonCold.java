public class CommonCold extends Pathogen {
    private double healRate;

    public CommonCold(double healRate){
        super(100,1000,40,1,0.5,"CommonCold");
        this.healRate = healRate;

    }

    public void attack(Cell target) {target.changeHealth(-getDamage(), true); }

    
}
