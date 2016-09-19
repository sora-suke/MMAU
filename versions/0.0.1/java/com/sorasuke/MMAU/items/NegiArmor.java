package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class NegiArmor extends ItemArmor {
	
	static String ARMORTYPE[] = {"helmet","chestplate","leggings","boots"};
	
	public NegiArmor(ArmorMaterial material,int type,String localname) {
		super(material, 0, type);
		localname=localname+"_"+ARMORTYPE[type];
		setCreativeTab(MMAU.MMAUTAB);
		setUnlocalizedName("MMAU_"+localname);
		setTextureName("mmau:"+localname);
		
		GameRegistry.registerItem(this, localname);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (this.armorType == 2)
		{
			return "MMAU:textures/models/armor/negi_layer_2.png";
		}
		return "MMAU:textures/models/armor/negi_layer_1.png";
	}

}
