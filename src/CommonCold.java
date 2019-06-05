public class CommonCold extends Pathogen {
    private double  infectionDMG;
    private double duplicationSPD = 1.5;


    public CommonCold(double duplicationSPD){
        super(60,60,30,1,0.6,"CommonCold");
        this.infectionDMG = infectionDMG;
    }

    public double duplicate(){
        return duplicationSPD;
    }

}
