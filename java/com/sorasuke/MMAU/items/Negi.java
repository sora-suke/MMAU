package com.sorasuke.MMAU.items;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class Negi extends Item {
	public Negi() {

		String localname = "negi";

		setCreativeTab(MMAU.MMAUTAB);
		setUnlocalizedName("MMAU_" + localname);
		setTextureName("mmau:" + localname);
		setFull3D();

		GameRegistry.registerItem(this, localname);

		

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean advanced) {

		list.add(ChatFormatting.GREEN + StatCollector.translateToLocal("text.negi.tooltip"));

	}

}
