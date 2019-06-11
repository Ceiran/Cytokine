public class ImmuneSystem {
    private int money, cell;
    private String cytokine, regen, boost, freeze, fever;

    public ImmuneSystem(int cell, int money, String regen, String boost, String freeze, String fever){
        this.cell = cell;
        this.money = money;
        this.regen = regen;
        this.boost = boost;
        this.freeze = freeze;
        this.fever = fever;
    }

    public int getCells() { return cell;}
    public int getMoney() { return money;}
    public String getRegen() { return regen; }
    public String getBoost() { return boost;}
    public String getFreeze() { return freeze;}
    public String getFever() { return fever;}

    public void synthesize(){

    }

    public void deploy(){

    }
}
