package com.sorasuke.MMAU;

import com.sorasuke.MMAU.blocks.MMAUBlocks;
import com.sorasuke.MMAU.gens.MMAUGens;
import com.sorasuke.MMAU.items.MMAUItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = MMAU.MODID, version = MMAU.VERSION)
public class MMAU {

	public static final String MODID = "MoreMaterialsAndUtilities";
	public static final String VERSION = "0.1.0";

	public static final CreativeTabs MMAUTAB = new MMAUTab("mmautab");// クリエイティブタブ。
	public static final CreativeTabs MMAUTOOLSTAB = new MMAUToolsTab("mmautoolstab");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		Logger.registry(event);//ロガーを生成
		
		MMAUConfig.Load(this, event);// コンフィグの読み込み

		MMAUItems.registry(this);// アイテムの登録
		MMAUBlocks.registry(this);// ブロックの登録

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		MMAUOreDict.registry(this);
		Recipes.registry(this);// レシピ登録
		MMAUGens.registry(this);// ワールド生成関連

	}

}
