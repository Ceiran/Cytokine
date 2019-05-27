public class CommonCold extends Pathogen {
    private double duplicationSPD, infectionDMG;


    public CommonCold(double duplicationSPD, double infectionDMG){
        super(60,60,30,1,0.6,"CommonCold");
        this.duplicationSPD = duplicationSPD;
        this.infectionDMG = infectionDMG;
    }



}
