package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CrystalBlock extends Block {

	protected CrystalBlock() {

		super(Material.glass);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_crystal_block");
		setBlockTextureName("mmau:crystal_block");
		setHardness(0.5F);
		setResistance(0.8F);
		setStepSound(Block.soundTypeGlass);
		setHarvestLevel("pickaxe", 1);

	}

}
