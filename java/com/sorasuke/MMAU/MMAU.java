package com.sorasuke.MMAU;

import com.sorasuke.MMAU.common.MMAUProxy;
import com.sorasuke.MMAU.gens.MMAUGens;

import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingFallEvent;

@Mod(modid = MMAU.MODID, version = MMAU.VERSION)
public class MMAU {

    public static final String MODID = "MoreMaterialsAndUtilities";
    public static final String VERSION = "0.1.1";
    @Mod.Instance
    public static MMAU instance;
    @SidedProxy(clientSide = "com.sorasuke.MMAU.client.MMAUClientProxy", serverSide = "com.sorasuke.MMAU.common.MMAUProxy")
    public static MMAUProxy proxy;

    //GUIのID
    public static final int guiIdChickenBlock = 0;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        MMAULogger.registry(event);//ロガーを生成

        MMAUConfig.Load(this, event);// コンフィグの読み込み

        MMAURegistry.registerMMAU();// ブロック､アイテムの登録等
        MMAUOreDict.registry(this);// 鉱石辞書登録




    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(this.instance,new MMAUGuiHandler());
        proxy.registerRender();
        MMAURecipeRegister.registry(this);// レシピ登録
        MMAUGens.registry(this);// ワールド生成関連
        MinecraftForge.EVENT_BUS.register(new MMAUEvents());

    }




}
