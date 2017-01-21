package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MMAUBlocks {

    public static Block NegiOre;
    public static Block NegiBlock;
    public static Block CrystalOre;
    public static Block CrystalBlock;

    public static void registry(MMAU mod) {

        NegiOre = new NegiOre();
        OreDictionary.registerOre("oreNegi", new ItemStack(NegiOre, 1, 0));
        NegiBlock = new NegiBlock();
        OreDictionary.registerOre("blockNegi", new ItemStack(NegiBlock, 1, 0));

        CrystalOre = new CrystalOre();
        OreDictionary.registerOre("oreCrystal", new ItemStack(CrystalOre, 1, 0));
        CrystalBlock = new CrystalBlock();
        OreDictionary.registerOre("blockCrystal", new ItemStack(CrystalBlock, 1, 0));

    }

}
