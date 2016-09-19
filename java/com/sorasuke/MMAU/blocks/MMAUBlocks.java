package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.Logger;
import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

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
	
	public static Block SilverOre;
	public static Block SilverBlock;
	
	public static Block PlatinumOre;
	public static Block PlatinumBlock;
	
	public static Block SteelBlock;
	
	public static Block BrassBlock;
	
	public static Block LeadOre;
	public static Block LeadBlock;
	
	public static Block ZincOre;
	public static Block ZincBlock;

	public static void registry(MMAU mod) {

		/*
		 * 新しいクラス作ってを変数に登録しているのは、そのクラスのコンストラクタ内で登録しているから
		 * ここでGameRegistryはあまり使用してない
		 * 
		 * ver0.1.0以降はこっちにGameRegistryを移動させたよーん
		 */
		
		/* TODO
		 * 
		 * *なんかエラー吐くのでOreDictの登録タイミングをブロックの登録の後にする
		 * 
		 * 
		 */
		
		Logger.log("Register Blocks!");
		NegiOre = new NegiOre();
		NegiBlock = new NegiBlock();

		CrystalOre = new CrystalOre();
		CrystalBlock = new CrystalBlock();

		BronzeBlock = new BronzeBlock();

		CobaltOre = new CobaltOre();
		CobaltBlock = new CobaltBlock();

		CopperOre = new CopperOre();
		CopperBlock = new CopperBlock();

		TinOre = new TinOre();
		TinBlock = new TinBlock();

		OrichalcumOre = new OrichalcumOre();
		OrichalcumBlock = new OrichalcumBlock();
		
		SilverOre = new SilverOre();
		SilverBlock = new SilverBlock();
		
		PlatinumOre = new PlatinumOre();
		PlatinumBlock = new PlatinumBlock();
		
		SteelBlock =new SteelBlock();
		
		BrassBlock = new BrassBlock();
		
		LeadOre = new LeadOre();
		LeadBlock = new LeadBlock();
		
		ZincOre = new ZincOre();
		ZincBlock = new ZincBlock();

		// 登録
		GameRegistry.registerBlock(NegiOre, "negi_ore");
		GameRegistry.registerBlock(NegiBlock, "negi_block");

		GameRegistry.registerBlock(CrystalOre, "crystal_ore");
		GameRegistry.registerBlock(CrystalBlock, "crystal_block");

		GameRegistry.registerBlock(BronzeBlock, "bronze_block");
		
		GameRegistry.registerBlock(CobaltOre, "cobalt_ore");
		GameRegistry.registerBlock(CobaltBlock, "cobalt_block");

		GameRegistry.registerBlock(CopperOre, "copper_ore");
		GameRegistry.registerBlock(CopperBlock, "copper_block");

		GameRegistry.registerBlock(TinOre, "tin_ore");
		GameRegistry.registerBlock(TinBlock, "tin_block");

		GameRegistry.registerBlock(OrichalcumOre, "orichalcum_ore");
		GameRegistry.registerBlock(OrichalcumBlock, "orichalcum_block");
		
		GameRegistry.registerBlock(SilverOre, "silver_ore");
		GameRegistry.registerBlock(SilverBlock, "silver_block");
		
		GameRegistry.registerBlock(PlatinumOre, "platinum_ore");
		GameRegistry.registerBlock(PlatinumBlock, "platinum_block");
		
		GameRegistry.registerBlock(SteelBlock, "steel_block");
		
		GameRegistry.registerBlock(BrassBlock, "brass_block");
		
		GameRegistry.registerBlock(LeadOre, "lead_ore");
		GameRegistry.registerBlock(LeadBlock, "lead_block");
		
		GameRegistry.registerBlock(ZincOre, "zinc_ore");
		GameRegistry.registerBlock(ZincBlock, "zinc_block");
	}

}
