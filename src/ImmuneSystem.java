public class ImmuneSystem {

    public boolean deploy(Organ target, ImmuneCell c) {
        if (target.getCurrentCapacity() < target.getCapacity()) {
            target.getImmuneCellList().add(c);
            return true;
        }
        return false;
    }

}
