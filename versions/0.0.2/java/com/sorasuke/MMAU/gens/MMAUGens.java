package com.sorasuke.MMAU.gens;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAUConfig;

import cpw.mods.fml.common.registry.GameRegistry;

public class MMAUGens {
	
	public static void registry(MMAU mod){
		//鉱石の生成の登録、コンフィグのgenAllがtrueなら生成する
		if(MMAUConfig.genAll){
			
			if(MMAUConfig.genNegiOre){GameRegistry.registerWorldGenerator(new NegiOreGen(),0);}
			if(MMAUConfig.genCrystalOre){GameRegistry.registerWorldGenerator(new CrystalOreGen(),0);}
			if(MMAUConfig.genCrystalOreB){GameRegistry.registerWorldGenerator(new CrystalOreBGen(),0);}
			if(MMAUConfig.genCobaltOre){GameRegistry.registerWorldGenerator(new CobaltOreGen(),0);}
			if(MMAUConfig.genCopperOre){GameRegistry.registerWorldGenerator(new CopperOreGen(),0);}
			if(MMAUConfig.genTinOre){GameRegistry.registerWorldGenerator(new TinOreGen(),0);}
			if(MMAUConfig.genOrichalcumOre){GameRegistry.registerWorldGenerator(new OrichalcumOreGen(),0);}
			
		}
		
	}
	
}
