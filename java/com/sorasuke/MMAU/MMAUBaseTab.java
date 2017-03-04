package com.sorasuke.MMAU;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.text.MessageFormat;

/**
 * MMAU用クリエタブクラス
 *
 *
 * Created by sora_suke on 2017/01/11.
 */
public class MMAUBaseTab extends CreativeTabs{

    private ItemStack iconItem;

    public MMAUBaseTab(String title, ItemStack icon){
        super(title);
        MMAULogger.log("Construct of MMAUBaseTab called!");
        if(icon != null){
            iconItem = icon;
        }else{
            throw new IllegalArgumentException(MessageFormat.format("Please include ItemStack as arguments. ItemStackを入れてください｡", icon));
        }
    }

    @Override
    public Item getTabIconItem() {
        return iconItem.getItem();
    }

    @Override
    public ItemStack getIconItemStack(){
        return iconItem;
    }
}
