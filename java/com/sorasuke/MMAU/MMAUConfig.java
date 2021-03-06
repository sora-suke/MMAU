package com.sorasuke.MMAU;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class MMAUConfig {

    public static boolean genAll;
    public static boolean genNegiOre;
    public static boolean genCrystalOre;
    public static boolean genCrystalOreB;
    public static boolean genCobaltOre;
    public static boolean genCopperOre;
    public static boolean genTinOre;
    public static boolean genOrichalcumOre;
    public static boolean genSilverOre;
    public static boolean genPlatinumOre;
    public static boolean genLeadOre;
    public static boolean genZincOre;

    public static int quarryDefaultMaxRFAmount;

    public static void Load(FMLPreInitializationEvent event) {

        MMAULogger.log("Load Config!");
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        try {
            config.load();

            genAll = config.get("GENERAL", "genAll", true, "Generate all ores.").getBoolean(true);
            genNegiOre = config.get("GENERAL", "genNegiOre", true, "Generate negi ores.").getBoolean(true);
            genCrystalOre = config.get("GENERAL", "genCrystalOre", true, "Generate crystal ores.").getBoolean(true);
            genCrystalOreB = config.get("GENERAL", "genCrystalOreB", true, "Generate big crystal ores.")
                    .getBoolean(true);
            genCopperOre = config.get("GENERAL", "genCopperOre", true, "Generate copper ores.").getBoolean(true);
            genTinOre = config.get("GENERAL", "genTinOre", true, "Generate tin ores.").getBoolean(true);
            genCobaltOre = config.get("GENERAL", "genCobaltOre", true, "Generate cobalt ores.").getBoolean(true);
            genOrichalcumOre = config.get("GENERAL", "genOrichalcumOre", true, "Generate orichalcum ores.")
                    .getBoolean(true);
            genSilverOre = config.get("GENERAL", "genSilverOre", true, "Generate silver ores.")
                    .getBoolean(true);
            genPlatinumOre = config.get("GENERAL", "genPlatinumOre", true, "Generate platinum ores.")
                    .getBoolean(true);
            genLeadOre = config.get("GENERAL", "genLeadOre", true, "Generate lead ores.").getBoolean(true);
            genZincOre = config.get("GENERAL", "genZincOre", true, "Generate zinc ores.").getBoolean(true);

            quarryDefaultMaxRFAmount = config.get("MACHINE", "quarryDefaultMaxRFAmount", 65536, "Default Quarry max RF amount.").getInt();

        } catch (Exception e) {
            MMAULogger.error("Config load error!");
        } finally {
            config.save();
        }

    }

}
