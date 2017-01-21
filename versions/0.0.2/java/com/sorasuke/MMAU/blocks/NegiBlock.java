package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NegiBlock extends Block {

    protected NegiBlock() {

        super(Material.iron);

        String localname = "negi_block";

        setCreativeTab(MMAU.MMAUTAB);
        setBlockName("MMAU_" + localname);
        setBlockTextureName("mmau:negi_block");
        setHardness(5.0F);
        setResistance(10.0F);
        setStepSound(Block.soundTypeMetal);
        setHarvestLevel("pickaxe", 0);

        GameRegistry.registerBlock(this, localname);

		/*
		GameRegistry.addShapelessRecipe(new ItemStack(MMAUItems.Negi,9,0),
				new ItemStack(this)
				);
		
		GameRegistry.addRecipe(new ItemStack(this),
				new Object[]{
				"NNN",
				"NNN",
				"NNN",
				'N',new ItemStack(MMAUItems.Negi)
				}
				);
		*/
    }

}
