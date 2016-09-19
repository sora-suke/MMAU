package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemHoe;

public class BaseHoe extends ItemHoe {

	public BaseHoe(ToolMaterial p_i45343_1_,String localname) {
		super(p_i45343_1_);
		localname=localname+"_hoe";
		setCreativeTab(MMAU.MMAUTAB);
		setUnlocalizedName("MMAU_"+localname);
		setTextureName("mmau:"+localname);
		
		GameRegistry.registerItem(this, localname);
	}

}
