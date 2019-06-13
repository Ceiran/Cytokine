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
                mainBody.changeGlobalHP(Stats.globalHPLevel0, true);
                for (int i = 0; i < 70; i++) { mainBody.getReserves().add(new Macrophage()); }
                for (int i = 0; i < 30; i++) { mainBody.getReserves().add(new Neutrophil()); }
                for (int i = 0; i < 5; i++) { mainBody.getReserves().add(new Dendritic()); }
                for (int i = 0; i < 20; i++) { mainBody.getReserves().add(new VirginTCell()); }
                for (int i = 0; i < 7; i++) { mainBody.getReserves().add(new VirginBCell()); }
                for (int i = 0; i < 10; i++) { mainBody.getReserves().add(new ATPSynthase()); }
                for (int i = 0; i < 250; i++) { mainBody.getOrganList()[2].getPathogenList().add(new CommonCold()); }
                break;
            case 1: // PLACEHOLDER Pathogen
                mainBody.changeGlobalHP(Stats.globalHPLevel1, true);
                break;
            case 2: // PLACEHOLDER Pathogen
                mainBody.changeGlobalHP(Stats.globalHPLevel2, true);
                break;
            default:
                throw new IllegalArgumentException("Illegal Game ID. Terminating program.");
        }
    }

    // Return false if game is over.
    public boolean runTurn() {
        System.out.printf("%02d:%02d:%02d\n", turnNumber / 3600, (turnNumber / 60) % 60, turnNumber % 60);
        turnNumber++;
        if (ImmuneSystem.cytokineOccured && Game.turnNumber == ImmuneSystem.cytokineStartTurn + 100) {
            immuneSystem.cytokinePenalty();
        }
        return mainBody.runCombat();
    }
}
