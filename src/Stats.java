public class Stats {
    // Cell Macrophage Stats
    public static int macroHealth = 200;
    public static int macroMaxHealth = 200;
    public static int macroDamage = 45;
    public static int macroRecharge = 3;
    public static double macroAccuracy = 0.75;
    public static int macroInfectionShield = 120;
    public static String macroName = "Macrophage";

    // Cell Neutrophil Stats
    public static int neutroHealth = 95;
    public static int neutorMaxHealth = 95;
    public static int neutroDamage = 110;
    public static int neutroRecharge = 1;
    public static double neutroAccuracy = 0.95;
    public static int neutroInfectionShield = 20;
    public static String neutroName = "Neutrophil";

    // Cell Dendritic Stats
    public static int dendriticHealth = 40;
    public static int dedriticMaxHealth = 40;
    public static int dedriticDamage = 0;
    public static int dendriticRecharge = 0;
    public static double dendriticAccuracy = 0.0;
    public static int dedriticInfectionShield = 300;
    public static String dendriticName = "Dendritic";

    // Cell Virgin T-Cell Stats
    public static int virginTHealth = 50;
    public static int virginTMaxHealth = 50;
    public static int virginTDamage = 0;
    public static int virginTRecharge =0;
    public static double virginTAccuracy = 0.0;
    public static int virginTInfectionShield = 0;
    public static String virginTName = "VirginTCell";
    public static int virginTSpawnTime = 25;

    // Cell Helper T-Cell Stats
    // Heal Rate is the percent of max HP healed per turn.
    public static int helperTHealth = 95;
    public static int helperTMaxHealth = 95;
    public static int helperTDamage = 30;
    public static int helperTRecharge = 1;
    public static double helperTAccuracy = 0.85;
    public static int helperTInfectionShield = 100;
    public static String helperTName = "HelperTCell";
    public static double helperTHealRate = 0.15;

    // Cell Cytotoxic T-Cell Stats
    public static int cytoHealth = 95;
    public static int cytoMaxHealth = 95;
    public static int cytoDamage = 30;
    public static int cytoRecharge = 1;
    public static double cytoAccuracy = 0.85;
    public static int cytoInfectionShield = 100;
    public static String cytoName = "CytotoxicTCell";

    // Cell Virgin B-Cell Stats
    public static int virginBHealth = 50;
    public static int virignMaxHealth = 50;
    public static int virginBDamage = 0;
    public static int virginBRecharge = 0;
    public static double virginBAccuracy = 0.0;
    public static int virginBInfectionShield = 0;
    public static String virginBName = "VirginBCell";
    public static int virginBSpawnTime = 25;

    // Cell B-Cell Stats
    public static int bCellHealth = 50;
    public static int bCellMaxHealth = 50;
    public static int bCellDamage = 0;
    public static int bCellRecharge = 0;
    public static double bCellAccuracy = 0.0;
    public static int bCellInfectionShield = 0;
    public static String bCellName = "BCell";
    public static int bCellAntibodyProduction = 12;
    public static int bCellLifeTurns = 30;

    // Cell ATP Synthase
    public static int atpSynthaseHealth = 1;
    public static int atpSynthaseMaxHealth = 1;
    public static int atpSynthaseDamage = 0;
    public static int atpSynthaseRecharge = 0;
    public static double atpSynthaseAccuracy = 0.0;
    public static int atpSynthaseInfectionShield = 0;
    public static String atpSynthaseName = "ATPSynthase";
    public static int atpSynthaseAtpProduction = 2;
    public static int atpSynthaseLifeTurns = 45;
}
