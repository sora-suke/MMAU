package com.sorasuke.MMAU.gens;

import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAUConfig;
import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class MMAUGens {

    public static void registry(MMAU mod) {
        // 鉱石の生成の登録、コンフィグのgenAllがtrueなら生成する
        //MMAULogger.log("Registry World Generates!");
        if (MMAUConfig.genAll) {
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.NegiOre, 20, 1, 2, 8, false, MMAUConfig.genNegiOre), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.CrystalOre, 50, 1, 3, 12, false, MMAUConfig.genCrystalOre), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.CrystalBlock, 20, 1, 10, 35, true, MMAUConfig.genCrystalOreB), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.CobaltOre, 20, 1, 5, 8, false, MMAUConfig.genCobaltOre), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.CopperOre, 20, 1, 2, 8, false, MMAUConfig.genCopperOre), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.TinOre, 70, 1, 15, 8, false, MMAUConfig.genTinOre), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.OrichalcumOre, 20, 1, 2, 4, false, MMAUConfig.genOrichalcumOre), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.SilverOre, 30, 1, 7, 8, false, MMAUConfig.genSilverOre), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.PlatinumOre, 30, 1, 5, 8, false, MMAUConfig.genPlatinumOre), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.LeadOre, 45, 1, 8, 8, false, MMAUConfig.genLeadOre), 0);
            GameRegistry.registerWorldGenerator(new MMAUOreGen(MMAURegistry.ZincOre, 35, 1, 6, 8, false, MMAUConfig.genZincOre), 0);
        }

    }

}
