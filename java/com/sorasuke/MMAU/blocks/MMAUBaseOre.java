package com.sorasuke.MMAU.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by sora_suke on 2016/11/20.
 */
public class MMAUBaseOre extends MMAUBaseBlock implements IMMAUBaseBlock{
    private String name;
    public MMAUBaseOre(String name, int harvestLevel) {
        super(Material.rock, name, "pickaxe", harvestLevel);
        this.name = name;
        setStepSound(Block.soundTypeStone);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
