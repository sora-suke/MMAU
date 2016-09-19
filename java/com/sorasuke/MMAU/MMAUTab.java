package com.sorasuke.MMAU;

import com.sorasuke.MMAU.items.MMAUItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MMAUTab extends CreativeTabs {

	public MMAUTab(String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {

		return MMAUItems.Negi;
	}

}
