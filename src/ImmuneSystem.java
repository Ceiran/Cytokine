public class ImmuneSystem {
    private int  money;
    private boolean cell;
    private String cytokine, regen, boost, freeze, fever;

    public ImmuneSystem(boolean cell, int money, String regen, String boost, String freeze, String fever){
        this.cell = cell;
        this.money = money;
        this.regen = regen;
        this.boost = boost;
        this.freeze = freeze;
        this.fever = fever;
    }

    public boolean getCells(){return cell;}
    public int getMoney(){return money;}
    public String getRegen(){return regen; }
    public String getBoost(){return boost;}
    public String getFreeze(){return freeze;}
    public String getFever(){return fever;}

    public void makeCells(){
        if(getCells()){

        }
    }
}
