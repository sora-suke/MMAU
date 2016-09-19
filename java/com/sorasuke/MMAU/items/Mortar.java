package com.sorasuke.MMAU.items;

import java.util.Random;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Mortar extends Item {

	public Mortar(String material, int durability) {

		String localname = material + "_mortar";

		setCreativeTab(MMAU.MMAUTOOLSTAB);
		setUnlocalizedName("MMAU_" + localname);
		setTextureName("mmau:" + localname);
		setMaxDamage(durability);
		setHasSubtypes(false);

		GameRegistry.registerItem(this, localname);

		

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
