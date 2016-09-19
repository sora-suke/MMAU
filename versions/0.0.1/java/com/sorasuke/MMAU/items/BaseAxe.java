package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemAxe;

public class BaseAxe extends ItemAxe {

	protected BaseAxe(ToolMaterial p_i45327_1_,String localname) {
		super(p_i45327_1_);
		localname=localname+"_axe";
		setCreativeTab(MMAU.MMAUTAB);
		setUnlocalizedName("MMAU_"+localname);
		setTextureName("mmau:"+localname);
		
		GameRegistry.registerItem(this, localname);
	}

}
