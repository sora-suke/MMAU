package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BronzeBlock extends Block {

	protected BronzeBlock() {

		super(Material.iron);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_bronze_block");
		setBlockTextureName("mmau:bronze_block");
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(Block.soundTypeMetal);
		setHarvestLevel("pickaxe", 0);

	}

}
