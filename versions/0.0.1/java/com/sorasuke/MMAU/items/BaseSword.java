package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;

public class BaseSword extends ItemSword {

    public BaseSword(ToolMaterial p_i45356_1_, String localname) {
        super(p_i45356_1_);
        localname = localname + "_sword";
        setCreativeTab(MMAU.MMAUTAB);
        setUnlocalizedName("MMAU_" + localname);
        setTextureName("mmau:" + localname);

        GameRegistry.registerItem(this, localname);

    }

}
