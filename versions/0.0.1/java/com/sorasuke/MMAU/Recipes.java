package com.sorasuke.MMAU;

import com.sorasuke.MMAU.blocks.MMAUBlocks;
import com.sorasuke.MMAU.items.MMAUItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
	
	public static void registry(MMAU mod){
		
		Negis();
		Crystals();
		
	}
	
	
	private static void Negis(){
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.Negi,9,0),
				new Object[]{
						"blockNegi"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUBlocks.NegiBlock,1,0),
				new Object[]{
						"NNN",
						"NNN",
						"NNN",
						Character.valueOf('N'), "gemNegi"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiAxe,1,0),
				new Object[]{
						" N ",
						"NAN",
						" N ",
						Character.valueOf('N'), "gemNegi",
						Character.valueOf('A'), Items.diamond_axe
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiHoe,1,0),
				new Object[]{
						" N ",
						"NHN",
						" N ",
						Character.valueOf('N'), "gemNegi",
						Character.valueOf('H'), Items.diamond_hoe
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiPickaxe,1,0),
				new Object[]{
						" N ",
						"NPN",
						" N ",
						Character.valueOf('N'), "gemNegi",
						Character.valueOf('P'), Items.diamond_pickaxe
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiShovel,1,0),
				new Object[]{
						" N ",
						"NSN",
						" N ",
						Character.valueOf('N'), "gemNegi",
						Character.valueOf('S'), Items.diamond_shovel
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiSword,1,0),
				new Object[]{
						" N ",
						"NSN",
						" N ",
						Character.valueOf('N'), "gemNegi",
						Character.valueOf('S'), Items.diamond_sword
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiHelmet,1,0),
				new Object[]{
						" N ",
						"NHN",
						" N ",
						Character.valueOf('N'), "gemNegi",
						Character.valueOf('H'), Items.diamond_helmet
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiChestplate,1,0),
				new Object[]{
						" N ",
						"NCN",
						" N ",
						Character.valueOf('N'), "gemNegi",
						Character.valueOf('C'), Items.diamond_chestplate
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiLeggings,1,0),
				new Object[]{
						" N ",
						"NLN",
						" N ",
						Character.valueOf('N'), "gemNegi",
						Character.valueOf('L'), Items.diamond_leggings
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiBoots,1,0),
				new Object[]{
						" N ",
						"NBN",
						" N ",
						Character.valueOf('N'), "gemNegi",
						Character.valueOf('B'), Items.diamond_boots
						}));
		
	}
	
	private static void Crystals(){
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.Crystal,9,0),
				new Object[]{
						"blockCrystal"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUBlocks.CrystalBlock,1,0),
				new Object[]{
						"CCC",
						"CCC",
						"CCC",
						Character.valueOf('C'), "gemCrystal"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalAxe,1,0),
				new Object[]{
						"CC ",
						"CS ",
						" S ",
						Character.valueOf('C'), "gemCrystal",
						Character.valueOf('S'), "stickWood"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalAxe,1,0),
				new Object[]{
						" CC",
						" SC",
						" S ",
						Character.valueOf('C'), "gemCrystal",
						Character.valueOf('S'), "stickWood"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalHoe,1,0),
				new Object[]{
						"CC ",
						" S ",
						" S ",
						Character.valueOf('C'), "gemCrystal",
						Character.valueOf('S'), "stickWood"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalHoe,1,0),
				new Object[]{
						" CC",
						" S ",
						" S ",
						Character.valueOf('C'), "gemCrystal",
						Character.valueOf('S'), "stickWood"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalPickaxe,1,0),
				new Object[]{
						"CCC",
						" S ",
						" S ",
						Character.valueOf('C'), "gemCrystal",
						Character.valueOf('S'), "stickWood"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalShovel,1,0),
				new Object[]{
						" C ",
						" S ",
						" S ",
						Character.valueOf('C'), "gemCrystal",
						Character.valueOf('S'), "stickWood"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalSword,1,0),
				new Object[]{
						" C ",
						" C ",
						" S ",
						Character.valueOf('C'), "gemCrystal",
						Character.valueOf('S'), "stickWood"
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalHelmet,1,0),
				new Object[]{
						"CCC",
						"C C",
						Character.valueOf('C'), "gemCrystal",
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalChestplate,1,0),
				new Object[]{
						"C C",
						"CCC",
						"CCC",
						Character.valueOf('C'), "gemCrystal",
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalLeggings,1,0),
				new Object[]{
						"CCC",
						"C C",
						"C C",
						Character.valueOf('C'), "gemCrystal",
						}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalBoots,1,0),
				new Object[]{
						"C C",
						"C C",
						Character.valueOf('C'), "gemCrystal",
						}));
		
	}
	
	
	
}
