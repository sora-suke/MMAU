package com.sorasuke.MMAU.gens;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;

public class MMAUGens {
	
	public static void registry(MMAU mod){
		
		GameRegistry.registerWorldGenerator(new NegiOreGen(),0);
		GameRegistry.registerWorldGenerator(new CrystalOreGen(),0);
		GameRegistry.registerWorldGenerator(new CrystalOreBGen(),0);
		
	}
	
}
