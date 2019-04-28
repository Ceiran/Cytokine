public class Game {
    private ImmuneSystem immuneSystem;
    private Body mainBody;

    public static int turnNumber = 1;

    // Parameter stageID refers to type of disease in this game. Higher stageID means more difficult pathogens.
    public Game(int stageID) {
        mainBody = new Body();
        immuneSystem = new ImmuneSystem();
        switch (stageID) {
            case 0:
                mainBody.changeGlobalHP(1000000, true);
                break;
            case 1:
                mainBody.changeGlobalHP(1000000, true);
                break;
            case 2:
                mainBody.changeGlobalHP(800000, true);
                break;
            default:
                throw new IllegalArgumentException("Game ID is unknown. Terminating program.");
        }
    }

    public void runTurn() {

        turnNumber++;
    }
}
