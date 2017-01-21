package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CrystalBlock extends Block {

    protected CrystalBlock() {

        super(Material.glass);

        String localname = "crystal_block";

        setCreativeTab(MMAU.MMAUTAB);
        setBlockName("MMAU_" + localname);
        setBlockTextureName("mmau:crystal_block");
        setHardness(0.5F);
        setResistance(0.8F);
        setStepSound(Block.soundTypeGlass);
        setHarvestLevel("pickaxe", 1);

        GameRegistry.registerBlock(this, localname);

		/*
		GameRegistry.addShapelessRecipe(new ItemStack(MMAUItems.Crystal,9,0),
				new ItemStack(this)
				);
		
		GameRegistry.addRecipe(new ItemStack(this),
				new Object[]{
				"NNN",
				"NNN",
				"NNN",
				'N',new ItemStack(MMAUItems.Crystal)
				}
				);
		*/
    }

}
