package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OrichalcumBlock extends Block {

	protected OrichalcumBlock() {

		super(Material.iron);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_orichalcum_block");
		setBlockTextureName("mmau:orichalcum_block");
		setHardness(5.0F);
		setResistance(600.0F);
		setStepSound(Block.soundTypeMetal);
		setHarvestLevel("pickaxe", 0);

	}

}
