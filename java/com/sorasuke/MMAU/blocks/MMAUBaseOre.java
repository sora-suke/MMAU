package com.sorasuke.MMAU.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

/**
 * Created by sora_suke on 2016/11/20.
 */
public class MMAUBaseOre extends MMAUBaseBlock implements IMMAUBaseBlock {
    private String name;
    public ItemBlock itemBlock;

    public MMAUBaseOre(String name, int harvestLevel) {
        super(Material.ROCK, name, "pickaxe", harvestLevel, SoundType.STONE);
        this.name = name;
        this.itemBlock = new ItemBlock(this);
        setSoundType(SoundType.STONE);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ItemBlock getItemBlock() {
        return this.itemBlock;
    }
}
