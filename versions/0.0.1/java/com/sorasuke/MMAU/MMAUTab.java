package com.sorasuke.MMAU;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class MMAUTab extends CreativeTabs{

	public MMAUTab(String label) {
		super(label);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public Item getTabIconItem() {
		// TODO 自動生成されたメソッド・スタブ
		return Item.getItemFromBlock(Blocks.diamond_block);
	}

}
