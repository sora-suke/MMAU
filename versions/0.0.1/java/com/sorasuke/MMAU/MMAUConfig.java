package com.sorasuke.MMAU;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class MMAUConfig {

    public static void Load(MMAU mmau, FMLPreInitializationEvent event) {

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        try {
            config.load();


        } catch (Exception e) {
            FMLLog.severe("Config load error!");
        } finally {
            config.save();
        }

    }

}
