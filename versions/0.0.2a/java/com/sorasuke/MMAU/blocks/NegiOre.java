package com.sorasuke.MMAU.blocks;

import java.util.Random;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.items.MMAUItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.oredict.OreDictionary;

public class NegiOre extends Block {

    private Random rnd = new Random();

    public NegiOre() {

        super(Material.rock);


        String localname = "negi_ore";

        setCreativeTab(MMAU.MMAUTAB);
        setBlockName("MMAU_" + localname);
        setBlockTextureName("mmau:negi_ore");
        setHardness(3.0F);
        setStepSound(Block.soundTypeStone);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 3);


        GameRegistry.registerBlock(this, localname);
        OreDictionary.registerOre("oreNegi", new ItemStack(this, 1, 0));
    }

    @Override
    public Item getItemDropped(int meta, Random rnd, int fortune) {
        return MMAUItems.Negi;
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
