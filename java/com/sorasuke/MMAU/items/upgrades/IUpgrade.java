package com.sorasuke.MMAU.items.upgrades;

import net.minecraft.item.ItemStack;

/**
 * Created by sora_suke on 2017/03/08.
 */
public interface IUpgrade {
    public int getGread(ItemStack stack);
    public String getType();
}
