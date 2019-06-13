public class ImmuneSystem {

    // Returns true if operation is successful. False otherwise.
    public boolean deploy(Organ organ, ImmuneCell c) {
        if (organ.getCurrentCapacity() < organ.getCapacity()) {
            organ.getImmuneCellList().add(c);
            return true;
        }
        return false;
    }

}
