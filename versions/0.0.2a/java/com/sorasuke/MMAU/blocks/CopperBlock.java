package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperBlock extends Block{

	protected CopperBlock() {
		
		super(Material.iron);
		
		String localname="copper_block";
		
		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_"+localname);
		setBlockTextureName("mmau:copper_block");
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(Block.soundTypeMetal);
		setHarvestLevel("pickaxe",0);
		
		GameRegistry.registerBlock( this, localname );
		
	}

}
