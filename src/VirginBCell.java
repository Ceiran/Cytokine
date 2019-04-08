public class VirginBCell extends ImmuneCell {
    private int spawnTime;

    public VirginBCell(int spawn) {
        super(50, 50, 0, 0, 0, 0, "VirginBCell");
        spawnTime = spawn;
    }

    public int getSpawnTime() { return spawnTime; }

    public void attack(Cell target) {
        // VirginBCells cannot attack.
    }
}
