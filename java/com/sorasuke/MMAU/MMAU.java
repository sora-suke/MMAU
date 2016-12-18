package com.sorasuke.MMAU;

import com.sorasuke.MMAU.gens.MMAUGens;

import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.entity.living.LivingFallEvent;

@Mod(modid = MMAU.MODID, version = MMAU.VERSION)
public class MMAU {

	public static final String MODID = "MoreMaterialsAndUtilities";
	public static final String VERSION = "0.1.0";
	@Mod.Instance
	public static MMAU instance;

    //GUIのID
    public static final int guiIdChickenBlock = 0;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		MMAULogger.registry(event);//ロガーを生成
		
		MMAUConfig.Load(this, event);// コンフィグの読み込み

        FMLCommonHandler.instance().bus().register(this);

		MMAURegistry.registerMMAU();// ブロック､アイテムの登録等
		MMAUOreDict.registry(this);// 鉱石辞書登録


	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(this.instance,new MMAUGuiHandler());

		MMAURecipeRegister.registry(this);// レシピ登録
		MMAUGens.registry(this);// ワールド生成関連

	}


	@SubscribeEvent
    public void fallToFeatherBlock(LivingFallEvent event){
        MMAULogger.log("fall!");

        if(MMAURegistry.FeatherBlock.equals(event.entityLiving.worldObj.getBlock((int)event.entityLiving.posX, (int)event.entityLiving.posY-1, (int)event.entityLiving.posZ))){
            event.setCanceled(true);
        }
    }

}
