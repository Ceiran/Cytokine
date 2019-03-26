public class Body {
    private Organ[] organList;
    private int globalHP;

    public Body() {
        organList = new Organ[6];
        organList[0] = new Brain();
        organList[1] = new Heart();
        organList[2] = new Lungs();
        organList[3] = new Stomach();
        organList[4] = new Liver();
        organList[5] = new Kidneys();
        globalHP = 0;
    }

    public int getGlobalHP() { return globalHP; }
    public Organ[] getOrganList() { return organList; }

    public boolean changeGlobalHP(int delta) {
        globalHP += delta;
        if (globalHP < 0) {
            globalHP = 0;
            return false;
        }
        return globalHP > 0;
    }
}
