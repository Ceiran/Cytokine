public class VirginTCell extends ImmuneCell {
    private int spawnTime;
    public VirginTCell(int spawn) {
        super(50, 50, 0, 0, 0, 0, "VirginTCell");
        spawnTime = spawn;
    }

    public int getSpawnTime() { return spawnTime; }

    public void attack(Cell target) {
        target.changeHealth(-getDamage(), true);
    }
}
