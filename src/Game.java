public class Game {
    public static ImmuneSystem immuneSystem;
    public static Body mainBody;

    public static int turnNumber = 1;

    // Parameter stageID refers to type of disease in this game. Higher stageID means more difficult pathogens.
    public Game(int stageID) {
        mainBody = new Body();
        immuneSystem = new ImmuneSystem();
        switch (stageID) {
            case 0: // Common Cold
                mainBody.changeGlobalHP(1000000, true);
                break;
            case 1: // PLACEHOLDER Pathogen
                mainBody.changeGlobalHP(1000000, true);
                break;
            case 2: // PLACEHOLDER Pathogen
                mainBody.changeGlobalHP(800000, true);
                break;
            default:
                throw new IllegalArgumentException("Game ID is unknown. Terminating program.");
        }
    }

    public boolean runTurn() {
        System.out.printf("%02d:%02d:%02d", turnNumber / 3600, (turnNumber / 60) % 60, turnNumber % 60);
        turnNumber++;
        if (ImmuneSystem.cytokineOccured && Game.turnNumber == ImmuneSystem.cytokineStartTurn + 100) {
            immuneSystem.cytokinePenalty();
        }
        return mainBody.runCombat();
    }
}
