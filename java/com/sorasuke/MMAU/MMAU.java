package com.sorasuke.MMAU;

import com.sorasuke.MMAU.gens.MMAUGens;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = MMAU.MODID, version = MMAU.VERSION)
public class MMAU {

	public static final String MODID = "MoreMaterialsAndUtilities";
	public static final String VERSION = "0.1.0";


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		MMAULogger.registry(event);//ロガーを生成
		
		MMAUConfig.Load(this, event);// コンフィグの読み込み

		MMAURegistry.registerMMAU();// ブロック､アイテムの登録等
		MMAUOreDict.registry(this);// 鉱石辞書登録

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		

		MMAURecipeRegister.registry(this);// レシピ登録
		MMAUGens.registry(this);// ワールド生成関連

	}

}
