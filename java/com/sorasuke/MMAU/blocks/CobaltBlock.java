package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CobaltBlock extends Block {

	protected CobaltBlock() {

		super(Material.iron);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_cobalt_block");
		setBlockTextureName("mmau:cobalt_block");
		setHardness(5.0F);
		setResistance(10.0F);
		setStepSound(Block.soundTypeMetal);
		setHarvestLevel("pickaxe", 0);

	}

}
