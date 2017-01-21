package com.sorasuke.MMAU.items;

import java.util.Random;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class IronMortar extends Item {

    public IronMortar() {

        String localname = "iron_mortar";

        setCreativeTab(MMAU.MMAUTOOLSTAB);
        setUnlocalizedName("MMAU_" + localname);
        setTextureName("mmau:" + localname);
        setMaxDamage(127);
        setHasSubtypes(false);

        GameRegistry.registerItem(this, localname);

        OreDictionary.registerOre("mortarL1", new ItemStack(this, 1, 32767));

    }


    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack item) {
        if (item.getItem() == this) {
            Random rand = Item.itemRand;
            boolean flag = item.attemptDamageItem(1, rand);
            return flag ? null : item;

        }
        return super.getContainerItem(item);

    }


}
