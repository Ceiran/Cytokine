public class Stats {
    // Body Stats
    public static int globalHPStage0 = 1000000;
    public static int globalHPStage1 = 1000000;
    public static int globalHPStage2 = 800000;

    // Cell ImmuneCell Stats
    public static int immuneCellOrganHealRate = 3;

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
    public static int neutroMaxHealth = 95;
    public static int neutroDamage = 110;
    public static int neutroRecharge = 1;
    public static double neutroAccuracy = 0.95;
    public static int neutroInfectionShield = 20;
    public static String neutroName = "Neutrophil";

    // Cell Dendritic Stats
    public static int dendriticHealth = 40;
    public static int dendriticMaxHealth = 40;
    public static int dendriticDamage = 0;
    public static int dendriticRecharge = 0;
    public static double dendriticAccuracy = 0.0;
    public static int dendriticInfectionShield = 300;
    public static String dendriticName = "Dendritic";

    // Cell Virgin T-Cell Stats
    public static int virginTHealth = 50;
    public static int virginTMaxHealth = 50;
    public static int virginTDamage = 0;
    public static int virginTRecharge = 0;
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
    public static int virginBMaxHealth = 50;
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

    // Cell ATP Synthase Stats
    public static int atpSynthaseHealth = 1;
    public static int atpSynthaseMaxHealth = 1;
    public static int atpSynthaseDamage = 0;
    public static int atpSynthaseRecharge = 0;
    public static double atpSynthaseAccuracy = 0.0;
    public static int atpSynthaseInfectionShield = 0;
    public static String atpSynthaseName = "ATPSynthase";
    public static int atpSynthaseAtpProduction = 2;
    public static int atpSynthaseLifeTurns = 45;

    // Organ Brain Stats
    public static int brainPriority = 0;
    public static int brainHealth = 30000;
    public static int brainMaxHealth = 30000;
    public static int brainCapacity = 1450;
    public static double brainResistance = 0.1;
    public static String brainName = "Brain";

    // Organ Heart Stats
    public static int heartPriority = 0;
    public static int heartHealth = 35000;
    public static int heartMaxHealth = 35000;
    public static int heartCapacity = 1150;
    public static double heartResistance = 0.4;
    public static String heartName = "Heart";

    // Organ Kidneys Stats
    public static int kidneysPriority = 4;
    public static int kidneysHealth = 25000;
    public static int kidneysMaxHealth = 25000;
    public static int kidneysCapacity = 1800;
    public static double kidneysResistance = 0.5;
    public static String kidneysName = "Kidneys";

    // Organ Liver Stats
    public static int liverPriority = 3;
    public static int liverHealth = 80000;
    public static int liverMaxHealth = 80000;
    public static int liverCapacity = 2000;
    public static double liverResistance = 0.15;
    public static String liverName = "Liver";

    // Organ Lungs Stats
    public static int lungsPriority = 1;
    public static int lungsHealth = 82000;
    public static int lungsMaxHealth = 82000;
    public static int lungsCapacity = 2100;
    public static double lungsResistance = 0.6;
    public static String lungsName = "Lungs";

    // Organs Stomach Stats
    public static int stomachPriority = 2;
    public static int stomachHealth = 64500;
    public static int stomachMaxHealth = 64500;
    public static int stomachCapacity = 1600;
    public static double stomachResistance = 0.3;
    public static String stomachName = "Stomach";

    // Cell Pathogen CommonCold Stats
    public static int commonColdHealth = 60;
    public static int commonColdMaxHealth = 60;
    public static int commonColdDamage = 30;
    public static int commonColdRecharge = 1;
    public static double commonColdAccuracy = 0.6;
    public static double commonColdInfectionDamage = 1.5;
    public static String commonColdName = "CommonCold";
    public static double commonColdDuplicationSPD = 1.5;

}
