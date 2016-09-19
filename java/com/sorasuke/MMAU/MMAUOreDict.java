package com.sorasuke.MMAU;

import com.sorasuke.MMAU.blocks.MMAUBlocks;
import com.sorasuke.MMAU.items.MMAUItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MMAUOreDict {

	public static void registry(MMAU mod){
		
		/* ブロック系　
		 * 
		 * 
		 */
		OreDictionary.registerOre("oreNegi", new ItemStack(MMAUBlocks.NegiOre, 1, 0));
		OreDictionary.registerOre("blockNegi", new ItemStack(MMAUBlocks.NegiBlock, 1, 0));
		
		OreDictionary.registerOre("oreCrystal", new ItemStack(MMAUBlocks.CrystalOre, 1, 0));
		OreDictionary.registerOre("blockCrystal", new ItemStack(MMAUBlocks.CrystalBlock, 1, 0));
		
		OreDictionary.registerOre("blockBronze", new ItemStack(MMAUBlocks.BronzeBlock, 1, 0));
		
		OreDictionary.registerOre("oreCobalt", new ItemStack(MMAUBlocks.CobaltOre, 1, 0));
		OreDictionary.registerOre("blockCobalt", new ItemStack(MMAUBlocks.CobaltBlock, 1, 0));
		
		OreDictionary.registerOre("oreCopper", new ItemStack(MMAUBlocks.CopperOre, 1, 0));
		OreDictionary.registerOre("blockCopper", new ItemStack(MMAUBlocks.CopperBlock, 1, 0));
		
		OreDictionary.registerOre("oreTin", new ItemStack(MMAUBlocks.TinOre, 1, 0));
		OreDictionary.registerOre("blockTin", new ItemStack(MMAUBlocks.TinBlock, 1, 0));
		
		OreDictionary.registerOre("oreOrichalcum", new ItemStack(MMAUBlocks.OrichalcumOre, 1, 0));
		OreDictionary.registerOre("blockOrichalcum", new ItemStack(MMAUBlocks.OrichalcumBlock, 1, 0));
		
		OreDictionary.registerOre("oreSilver", new ItemStack(MMAUBlocks.SilverOre, 1, 0));
		OreDictionary.registerOre("blockSilver", new ItemStack(MMAUBlocks.SilverBlock, 1, 0));
		
		OreDictionary.registerOre("orePlatinum", new ItemStack(MMAUBlocks.PlatinumOre, 1, 0));
		OreDictionary.registerOre("blockPlatinum", new ItemStack(MMAUBlocks.PlatinumBlock, 1, 0));
		
		OreDictionary.registerOre("blockSteel", new ItemStack(MMAUBlocks.SteelBlock, 1, 0));
		
		OreDictionary.registerOre("blockBrass", new ItemStack(MMAUBlocks.BrassBlock, 1, 0));
		
		OreDictionary.registerOre("oreLead", new ItemStack(MMAUBlocks.LeadOre, 1, 0));
		OreDictionary.registerOre("blockLead", new ItemStack(MMAUBlocks.LeadBlock, 1, 0));
		
		OreDictionary.registerOre("oreZinc", new ItemStack(MMAUBlocks.ZincOre, 1, 0));
		OreDictionary.registerOre("blockZinc", new ItemStack(MMAUBlocks.ZincBlock, 1, 0));
		
		
		//アイテム系
		OreDictionary.registerOre("gemNegi", new ItemStack(MMAUItems.Negi, 1, 0));
		
		OreDictionary.registerOre("gemCrystal", new ItemStack(MMAUItems.Crystal, 1, 0));
		
		OreDictionary.registerOre("ingotBronze", new ItemStack(MMAUItems.Bronze, 1, 0));
		OreDictionary.registerOre("nuggetBronze", new ItemStack(MMAUItems.BronzeNugget, 1, 0));
		OreDictionary.registerOre("dustBronze", new ItemStack(MMAUItems.BronzeDust, 1, 0));
		
		OreDictionary.registerOre("ingotCobalt", new ItemStack(MMAUItems.Cobalt, 1, 0));
		OreDictionary.registerOre("nuggetCobalt", new ItemStack(MMAUItems.CobaltNugget, 1, 0));
		OreDictionary.registerOre("dustCobalt", new ItemStack(MMAUItems.CobaltDust, 1, 0));

		OreDictionary.registerOre("ingotOrichalcum", new ItemStack(MMAUItems.Orichalcum, 1, 0));
		OreDictionary.registerOre("nuggetOrichalcum", new ItemStack(MMAUItems.OrichalcumNugget, 1, 0));
		OreDictionary.registerOre("dustOrichalcum", new ItemStack(MMAUItems.OrichalcumDust, 1, 0));
		
		OreDictionary.registerOre("ingotSilver", new ItemStack(MMAUItems.Silver, 1, 0));
		OreDictionary.registerOre("nuggetSilver", new ItemStack(MMAUItems.SilverNugget, 1, 0));
		OreDictionary.registerOre("dustSilver", new ItemStack(MMAUItems.SilverDust, 1, 0));

		OreDictionary.registerOre("ingotCopper", new ItemStack(MMAUItems.Copper, 1, 0));
		OreDictionary.registerOre("nuggetCopper", new ItemStack(MMAUItems.CopperNugget, 1, 0));
		OreDictionary.registerOre("dustCopper", new ItemStack(MMAUItems.CopperDust, 1, 0));

		OreDictionary.registerOre("ingotTin", new ItemStack(MMAUItems.Tin, 1, 0));
		OreDictionary.registerOre("nuggetTin", new ItemStack(MMAUItems.TinNugget, 1, 0));
		OreDictionary.registerOre("dustTin", new ItemStack(MMAUItems.TinDust, 1, 0));
		
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(MMAUItems.Platinum, 1, 0));
		OreDictionary.registerOre("nuggetPlatinum", new ItemStack(MMAUItems.PlatinumNugget, 1, 0));
		OreDictionary.registerOre("dustPlatinum", new ItemStack(MMAUItems.PlatinumDust, 1, 0));
		
		OreDictionary.registerOre("ingotSteel", new ItemStack(MMAUItems.Steel, 1, 0));
		OreDictionary.registerOre("nuggetSteel", new ItemStack(MMAUItems.SteelNugget, 1, 0));
		OreDictionary.registerOre("dustSteel", new ItemStack(MMAUItems.SteelDust, 1, 0));
		
		OreDictionary.registerOre("ingotBrass", new ItemStack(MMAUItems.Brass, 1, 0));
		OreDictionary.registerOre("nuggetBrass", new ItemStack(MMAUItems.BrassNugget, 1, 0));
		OreDictionary.registerOre("dustBrass", new ItemStack(MMAUItems.BrassDust, 1, 0));
		
		OreDictionary.registerOre("ingotLead", new ItemStack(MMAUItems.Lead, 1, 0));
		OreDictionary.registerOre("nuggetLead", new ItemStack(MMAUItems.LeadNugget, 1, 0));
		OreDictionary.registerOre("dustLead", new ItemStack(MMAUItems.LeadDust, 1, 0));
		
		OreDictionary.registerOre("ingotZinc", new ItemStack(MMAUItems.Zinc, 1, 0));
		OreDictionary.registerOre("nuggetZinc", new ItemStack(MMAUItems.ZincNugget, 1, 0));
		OreDictionary.registerOre("dustZinc", new ItemStack(MMAUItems.ZincDust, 1, 0));

		OreDictionary.registerOre("nuggetIron", new ItemStack(MMAUItems.IronNugget, 1, 0));
		OreDictionary.registerOre("dustIron", new ItemStack(MMAUItems.IronDust, 1, 0));
		
		OreDictionary.registerOre("dustGold", new ItemStack(MMAUItems.GoldDust, 1, 0));
		
		OreDictionary.registerOre("dustCoal", new ItemStack(MMAUItems.CoalDust, 1, 0));
		
		
		OreDictionary.registerOre("mortarL1", new ItemStack(MMAUItems.IronMortar, 1, 32767));
		
		
		
	}
	
}
