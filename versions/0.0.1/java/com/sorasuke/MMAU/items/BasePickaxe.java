package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;

public class BasePickaxe extends ItemPickaxe {

    protected BasePickaxe(ToolMaterial p_i45347_1_, String localname) {
        super(p_i45347_1_);
        localname = localname + "_pickaxe";
        setCreativeTab(MMAU.MMAUTAB);
        setUnlocalizedName("MMAU_" + localname);
        setTextureName("mmau:" + localname);

        GameRegistry.registerItem(this, localname);

    }

}
