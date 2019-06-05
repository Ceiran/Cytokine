public abstract class Pathogen extends Cell{
    private String name;

    public Pathogen(int health, int maxHealth, int damage, int recharge, double accuracy, String name) {
        super(health, maxHealth, damage, recharge, accuracy, "Pathogen");
        this.name = name;
    }

    public String getName() { return name; }
    public void attack(Cell target) {target.changeHealth(-getDamage(), true); }
/*
    public Cell deploy(String whatever){
        if(whatever.equals("HelperTCell")){
            return new HelperTCell();
        }else if(whatever.equals("CytotoxicTCell")){
            return new CytotoxicTCell();
        }else if(whatever.equals("ATPSynthase")){
            return new ATPSynthase();
        }else if(whatever.equals("Dendritic")){
            return new Dendritic();
        }else if(whatever.equals("Macrophage")){
            return new Macrophage();
        }else if(whatever.equals("Neutrophil")){
            return new Neutrophil();
        }else if(whatever.equals("VirginBCell")){
            return new VirginBCell();
        }else if(whatever.equals("VirginTCell")){
            return new VirginTCell();
        }
    }
    */
}
