package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CobaltOre extends Block{

	protected CobaltOre() {
		
		super(Material.rock);
		
		String localname="cobalt_ore";
		
		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_"+localname);
		setBlockTextureName("mmau:cobalt_ore");
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe",3);
		
		GameRegistry.registerBlock( this, localname );
		
	}

}
