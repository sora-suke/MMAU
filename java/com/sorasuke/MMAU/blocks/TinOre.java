package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TinOre extends Block {

	protected TinOre() {

		super(Material.rock);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_tin_ore");
		setBlockTextureName("mmau:tin_ore");
		setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe", 1);

	}

}
