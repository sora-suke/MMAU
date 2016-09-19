package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MMAUBlocks {
	
	public static Block NegiOre;
	public static Block NegiBlock;
	
	public static Block CrystalOre;
	public static Block CrystalBlock;
	
	public static Block BronzeBlock;
	
	public static Block CobaltOre;
	public static Block CobaltBlock;
	
	public static Block CopperOre;
	public static Block CopperBlock;
	
	public static Block TinOre;
	public static Block TinBlock;
	
	public static Block OrichalcumOre;
	public static Block OrichalcumBlock;
	
	
	public static Block ContainerWood;
	
	public static void registry(MMAU mod){
		
		/* 新しいクラス作ってを変数に登録しているのは、そのクラスのコンストラクタ内で登録しているから
		 * ここでGameRegistryはあまり使用してない
		 * 
		 */
		
		NegiOre = new NegiOre();
		OreDictionary.registerOre("oreNegi", new ItemStack(NegiOre,1,0));
		NegiBlock = new NegiBlock();
		OreDictionary.registerOre("blockNegi", new ItemStack(NegiBlock,1,0));
		
		CrystalOre = new CrystalOre();
		OreDictionary.registerOre("oreCrystal", new ItemStack(CrystalOre,1,0));
		CrystalBlock = new CrystalBlock();
		OreDictionary.registerOre("blockCrystal", new ItemStack(CrystalBlock,1,0));
		
		BronzeBlock = new BronzeBlock();
		OreDictionary.registerOre("blockBronze", new ItemStack(BronzeBlock,1,0));
		
		CobaltOre = new CobaltOre();
		OreDictionary.registerOre("oreCobalt", new ItemStack(CobaltOre,1,0));
		CobaltBlock = new CobaltBlock();
		OreDictionary.registerOre("blockCobalt", new ItemStack(CobaltBlock,1,0));
		
		CopperOre = new CopperOre();
		OreDictionary.registerOre("oreCopper", new ItemStack(CopperOre,1,0));
		CopperBlock = new CopperBlock();
		OreDictionary.registerOre("blockCopper", new ItemStack(CopperBlock,1,0));
		
		TinOre = new TinOre();
		OreDictionary.registerOre("oreTin", new ItemStack(TinOre,1,0));
		TinBlock = new TinBlock();
		OreDictionary.registerOre("blockTin", new ItemStack(TinBlock,1,0));
		
		OrichalcumOre = new OrichalcumOre();
		OreDictionary.registerOre("oreOrichalcum", new ItemStack(OrichalcumOre,1,0));
		OrichalcumBlock = new OrichalcumBlock();
		OreDictionary.registerOre("blockOrichalcum", new ItemStack(OrichalcumBlock,1,0));
		
		
		/*テストで作ったやつ
		ContainerWood = new ContainerWood()
				.setBlockName("container_wood");
		GameRegistry.registerBlock(ContainerWood, "container_wood");
		*/
		
	}
	
}
