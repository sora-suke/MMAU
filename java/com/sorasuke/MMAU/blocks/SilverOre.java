package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SilverOre extends Block{
	protected SilverOre() {

		super(Material.rock);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_silver_ore");
		setBlockTextureName("mmau:silver_ore");
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe", 2);

	}
}
