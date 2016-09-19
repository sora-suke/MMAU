package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OrichalcumOre extends Block {

	protected OrichalcumOre() {

		super(Material.rock);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_orichalcum_ore");
		setBlockTextureName("mmau:orichalcum_ore");
		setHardness(5.0F);
		setResistance(600.0F);
		setStepSound(Block.soundTypeStone);
		setHarvestLevel("pickaxe", 3);

	}

}
