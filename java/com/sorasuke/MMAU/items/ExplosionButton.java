package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ExplosionButton extends Item implements IMMAUBaseItem{

	String name;

	public ExplosionButton() {

		String localname = this.name = "button_explosion";

		setCreativeTab(MMAU.MMAUTOOLSTAB);
		setUnlocalizedName("MMAU_" + localname);
		setTextureName("mmau:" + localname);

		

	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){
		
		if(!world.isRemote){
			double x = entityPlayer.posX;
			double y = entityPlayer.posY;
			double z = entityPlayer.posZ;
			
			world.newExplosion(entityPlayer, x, y, z, 4F, false, true);//最後の2つは､燃えるかと､地形破壊
			
			
		}
		
		if(entityPlayer.capabilities.isCreativeMode){
			return itemStack;
		}
		return new ItemStack(itemStack.getItem(),itemStack.stackSize-1,itemStack.getItemDamage());
		
	}

	@Override
	public String getName() {
		return this.name;
	}
}
