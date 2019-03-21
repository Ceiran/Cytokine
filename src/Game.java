public class Game {
    private ImmuneCell[] immuneCells;
    private PathogenCells[] pathogenCells;
    private ImmuneSystem immuneSystem;
    private Body mainBody;

    public Game(int stageID) {
        mainBody = new Body();
        switch (stageID) {
            case 0:
                mainBody.changeGlobalHP(1000000);
                break;
            case 1:
                mainBody.changeGlobalHP(1000000);
            case 2:
                mainBody.changeGlobalHP(800000);
            default:
                throw new IllegalArgumentException("Game ID is unknown.");
        }
    }
}
