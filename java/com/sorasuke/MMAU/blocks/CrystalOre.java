package com.sorasuke.MMAU.blocks;

import java.util.Random;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.items.MMAUItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class CrystalOre extends Block {

	private Random rnd = new Random();

	public CrystalOre() {

		super(Material.rock);

		setCreativeTab(MMAU.MMAUTAB);
		setBlockName("MMAU_crystal_ore");
		setBlockTextureName("mmau:crystal_ore");
		setHardness(2.5F);
		setStepSound(Block.soundTypeStone);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);

	}

	@Override
	public Item getItemDropped(int meta, Random rnd, int fortune) {
		return MMAUItems.Crystal;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random rnd) {
		if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, rnd, fortune)) {
			int i = rnd.nextInt(fortune + 2) - 1;
			if (i < 0) {
				i = 0;
			}
			return quantityDropped(rnd) * i + 1;
		} else {
			return quantityDropped(rnd);
		}

	}

	@Override
	public int getExpDrop(IBlockAccess iBlockAccess, int meta, int fortune) {
		return MathHelper.getRandomIntegerInRange(rnd, 3, 7);
	}

}
