package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSpade;

public class BaseShovel extends ItemSpade {

    public BaseShovel(ToolMaterial p_i45353_1_, String localname) {
        super(p_i45353_1_);
        localname = localname + "_shovel";
        setCreativeTab(MMAU.MMAUTAB);
        setUnlocalizedName("MMAU_" + localname);
        setTextureName("mmau:" + localname);

        GameRegistry.registerItem(this, localname);
    }

}
