package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ZincOre extends Block {
	protected ZincOre() {

		super(Material.rock);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_zinc_ore");
		setBlockTextureName("mmau:zinc_ore");
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe", 1);

	}
}
