public class ImmuneSystem {
    private int totalATP;

    public ImmuneSystem(int totalATP){
        this.totalATP = totalATP;
    }

    public int getTotalATP() { return totalATP;}

    public boolean changeTotalATP(int delta) {
        totalATP += delta;
        if(totalATP < 0){
            totalATP = 0;
            return false;
        }
        return true;
    }

    public void cytokineStorm() {

    }

    public void regenerate() {

    }

    public void hormoneBoost() {

    }

    public void freezeDisease() {

    }

    public void induceFever() {

    }

    public void synthesize(){

    }

    public void deploy(){

    }
}
