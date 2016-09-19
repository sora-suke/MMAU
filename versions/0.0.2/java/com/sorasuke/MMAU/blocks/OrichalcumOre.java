package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OrichalcumOre extends Block{

	protected OrichalcumOre() {
		
		super(Material.rock);
		
		String localname="orichalcum_ore";
		
		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_"+localname);
		setBlockTextureName("mmau:orichalcum_ore");
		setHardness(5.0F);
		setResistance(15.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe",3);
		
		GameRegistry.registerBlock( this, localname );
		
	}

}
