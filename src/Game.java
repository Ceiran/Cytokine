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
        // Manages ability penalties and cooldowns.
        if (ImmuneSystem.cytokineOccured && Game.turnNumber == ImmuneSystem.cytokineStartTurn + 100) {
            immuneSystem.cytokinePenalty();
        }
        if (ImmuneSystem.regenerateOccured && Game.turnNumber == ImmuneSystem.regenerateStartTurn + 75) {
            ImmuneSystem.regenerateOnCooldown = false;
        }
        if (ImmuneSystem.hormoneBoostOccured && Game.turnNumber == ImmuneSystem.hormoneBoostStartTurn + 30) {
            immuneSystem.hormoneBoostPenalty();
            ImmuneSystem.hormoneBoostEndTurn = Game.turnNumber;
            ImmuneSystem.hormoneBoostOnCoolDown = true;
        } else if (ImmuneSystem.hormoneBoostOccured && Game.turnNumber == ImmuneSystem.hormoneBoostEndTurn + 60) {
            ImmuneSystem.hormoneBoostOnCoolDown = false;
        }
        if (ImmuneSystem.freezeDiseaseOccured && Game.turnNumber == ImmuneSystem.freezeDiseaseStartTurn + 45) {
            immuneSystem.freezeDiseasePenalty();
            ImmuneSystem.freezeDiseaseEndTurn = Game.turnNumber;
            ImmuneSystem.freezeDiseaseOnCoolDown = true;
        } else if (ImmuneSystem.freezeDiseaseOccured && Game.turnNumber == ImmuneSystem.freezeDiseaseEndTurn + 120) {
            ImmuneSystem.freezeDiseaseOnCoolDown = false;
        }
        return mainBody.runCombat();
    }
}
