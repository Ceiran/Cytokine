public class CommonCold extends Pathogen {
    private double duplicationSPD, infectionDMG;


    public CommonCold(double healRate){
        super(60,60,30,1,0.6,"CommonCold");
        this.duplicationSPD = duplicationSPD;
        this.infectionDMG = infectionDMG;
    }

    public void attackCell(Cell target) {target.changeHealth(-getDamage(), true); }
    public void attackOrgan(Organ target){target.changeHealth(-getDamage());}
    
}
