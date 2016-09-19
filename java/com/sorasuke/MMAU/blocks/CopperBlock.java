package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperBlock extends Block {

	protected CopperBlock() {

		super(Material.iron);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_copper_block");
		setBlockTextureName("mmau:copper_block");
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(Block.soundTypeMetal);
		setHarvestLevel("pickaxe", 0);

	}

}
