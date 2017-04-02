package com.sorasuke.MMAU.items.upgrades;

import net.minecraft.item.ItemStack;

/**
 * Created by sora_suke on 2017/03/08.
 * アップグレードかの判定とグレードとかの判定
 */
public interface IUpgrade {
    public int getGrade(ItemStack stack);
    public String getType();
    public int getMaxGrade();
}
