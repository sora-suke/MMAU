package com.sorasuke.MMAU;

import com.sorasuke.MMAU.items.MMAUItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MMAUToolsTab extends CreativeTabs{

	public MMAUToolsTab(String label) {
		super(label);
		
	}

	@Override
	public Item getTabIconItem() {
		
		return MMAUItems.NegiPickaxe;
	}

}
