package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CobaltOre extends Block {

	protected CobaltOre() {

		super(Material.rock);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_cobalt_ore");
		setBlockTextureName("mmau:cobalt_ore");
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe", 3);

	}

}
