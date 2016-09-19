package com.sorasuke.MMAU.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OrichalcumNugget extends Item {
	
	@Override
	@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack p_77636_1_)
		{
			return true;
		}
}
