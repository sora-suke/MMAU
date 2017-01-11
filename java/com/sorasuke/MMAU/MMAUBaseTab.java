package com.sorasuke.MMAU;

import net.minecraft.block.Block;
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
public class MMAUBaseTab <T>extends CreativeTabs{

    private T icon;

    public MMAUBaseTab(String title, T icon){
        super(title);
        if(icon instanceof Item || icon instanceof Block || icon instanceof ItemStack){
            this.icon = icon;
        }else{
            throw new IllegalArgumentException(MessageFormat.format("Please include Item, Block, ItemStack as arguments. Item､Block､ItemStackを入れてください｡", icon));
        }
    }

    @Override
    public Item getTabIconItem() {
        if(icon instanceof Item){
            Item rIcon = (Item)icon;
            return rIcon;
        }
        if(icon instanceof Block){
            Item rIcon = (Item)Item.getItemFromBlock((Block)icon);
            return rIcon;
        }
        return null;
    }

    @Override
    public ItemStack getIconItemStack(){
        if(icon instanceof ItemStack){
            ItemStack rIcon = (ItemStack)icon;
            return rIcon;
        }
        return null;
    }
}
