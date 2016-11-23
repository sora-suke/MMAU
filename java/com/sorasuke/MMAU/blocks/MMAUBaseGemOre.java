package com.sorasuke.MMAU.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

/**
 * Created by sora_suke on 2016/11/20.
 */
public class MMAUBaseGemOre extends MMAUBaseOre implements IMMAUBaseBlock{
    private String name;
    private ItemStack drop;
    public MMAUBaseGemOre(String name, ItemStack drop, int harvestLevel) {
        super(name, harvestLevel);
        this.name = name;
        this.drop = drop;
    }

    @Override
    public Item getItemDropped(int meta, Random rnd, int fortune) {
        return this.drop.getItem();
    }

    @Override
    public int damageDropped(int metadata) {
        return this.drop.getItemDamage();
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
        Random rnd = new Random();
        return MathHelper.getRandomIntegerInRange(rnd, 3, 7);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
