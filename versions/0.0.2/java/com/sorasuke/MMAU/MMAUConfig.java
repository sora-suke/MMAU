package com.sorasuke.MMAU;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class MMAUConfig {

    public static boolean genAll;
    public static boolean genNegiOre;
    public static boolean genCrystalOre;
    public static boolean genCrystalOreB;
    public static boolean genCobaltOre;
    public static boolean genCopperOre;
    public static boolean genTinOre;
    public static boolean genOrichalcumOre;

    public static void Load(MMAU mmau, FMLPreInitializationEvent event) {
        //いまのところ何も無い
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        try {
            config.load();

            genAll = config.get("GENERAL", "genAll", true, "Generate all ores.").getBoolean(true);
            genNegiOre = config.get("GENERAL", "genNegiOre", true, "Generate negi ores.").getBoolean(true);
            genCrystalOre = config.get("GENERAL", "genCrystalOre", true, "Generate crystal ores.").getBoolean(true);
            genCrystalOreB = config.get("GENERAL", "genCrystalOreB", true, "Generate big crystal ores.").getBoolean(true);
            genCopperOre = config.get("GENERAL", "genCopperOre", true, "Generate copper ores.").getBoolean(true);
            genTinOre = config.get("GENERAL", "genTinOre", true, "Generate tin ores.").getBoolean(true);
            genCobaltOre = config.get("GENERAL", "genCobaltOre", true, "Generate cobalt ores.").getBoolean(true);
            genOrichalcumOre = config.get("GENERAL", "genOrichalcumOre", true, "Generate orichalcum ores.").getBoolean(true);


        } catch (Exception e) {
            FMLLog.severe("Config load error!");
        } finally {
            config.save();
        }

    }

}
