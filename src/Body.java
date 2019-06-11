import java.util.ArrayList;
import java.util.List;

public class Body {
    private Organ[] organList;
    private int globalHP, maxGlobalHP;
    // Contains all cells currently not deployed in the field. Cells are placed here when first created.
    private List<ImmuneCell> reserves;

    public Body() {
        organList = new Organ[6];
        organList[0] = new Brain();
        organList[1] = new Heart();
        organList[2] = new Lungs();
        organList[3] = new Stomach();
        organList[4] = new Liver();
        organList[5] = new Kidneys();
        globalHP = 0;
        maxGlobalHP = 0;
        reserves = new ArrayList<>();
    }

    public int getGlobalHP() { return globalHP; }
    public Organ[] getOrganList() { return organList; }
    public List<ImmuneCell> getReserves() { return reserves; }

    // Return false if patient is dead. Core game-over check.
    public boolean changeGlobalHP(int delta, boolean flat) {
        if (flat) {
            globalHP += delta;
        } else {
            globalHP *= 1 + delta;
        }
        if (globalHP < 0) {
            globalHP = 0;
            return false;
        }
        return globalHP > 0;
    }

    // Return false if patient is dead.
    public boolean changeMaxGlobalHP(int delta, boolean flat) {
        if (flat) {
            maxGlobalHP += delta;
            if (maxGlobalHP < 0) { maxGlobalHP = 0; }
            if (delta > 0) { globalHP += delta; }
        } else {
            maxGlobalHP *= 1 + delta;
            if (delta > 0) { globalHP *= 1 + delta; }
        }
        if (globalHP > maxGlobalHP) { globalHP = maxGlobalHP; }
        return changeGlobalHP(0, true);
    }

    // Return false if game is over.
    public boolean runCombat() {
        for (Organ organ : organList) {
            for (ImmuneCell immune : organ.getImmuneCellList()) {
                immune.attack(organ.getPathogenList().get((int) (Math.random() * organ.getPathogenList().size())));
            }
            if (organ.getImmuneCellList().size() > organ.getPathogenList().size()) {
                for (int i = 0; i < organ.getImmuneCellList().size() - organ.getPathogenList().size(); i++) {
                    organ.getImmuneCellList().get((int) (Math.random() * organ.getImmuneCellList().size())).healOrgan(organ);
                }
            } else if (organ.getImmuneCellList().size() < organ.getPathogenList().size()) {
                for (int i = 0; i < organ.getPathogenList().size() - organ.getImmuneCellList().size(); i++) {
                    organ.getPathogenList().get((int) (Math.random() * organ.getPathogenList().size())).damageOrgan(organ);
                }
            }
        }

        // Check lose condition.
        if (!changeGlobalHP(0, true)) {
            return false;
        }

        // Check win condition.
        for (Organ organ : organList) {
            if (organ.getPathogenList().size() != 0) { return true; }
        }
        return false;
    }

}
