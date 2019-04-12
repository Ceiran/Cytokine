public class Game {
    private ImmuneSystem immuneSystem;
    private Body mainBody;

    public static int turnNumber = 1;

    public Game(int stageID) {
        mainBody = new Body();
        immuneSystem = new ImmuneSystem();
        switch (stageID) {
            case 0:
                mainBody.changeGlobalHP(1000000);
                break;
            case 1:
                mainBody.changeGlobalHP(1000000);
                break;
            case 2:
                mainBody.changeGlobalHP(800000);
                break;
            default:
                throw new IllegalArgumentException("Game ID is unknown. Terminating program.");
        }
    }

    public void runTurn() {

        turnNumber++;
    }
}
