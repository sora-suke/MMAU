package com.sorasuke.MMAU;


import com.sorasuke.MMAU.common.MMAUProxy;
import com.sorasuke.MMAU.gens.MMAUGens;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import static com.sorasuke.MMAU.MMAUCollaboration.registerEMC;

@Mod(modid = MMAU.MODID, version = MMAU.VERSION)
public class MMAU {

    public static final String MODID = "MoreMaterialsAndUtilities";
    public static final String VERSION = "0.1.1";
    @Mod.Instance
    public static MMAU instance;
    @SidedProxy(clientSide = "com.sorasuke.MMAU.client.MMAUClientProxy", serverSide = "com.sorasuke.MMAU.common.MMAUProxy")
    public static MMAUProxy proxy;

    public static final String RL = "mmau";

    //GUIのID
    public static final int guiIdChickenBlock = 0;

    //連携MODが読み込まれてるかのBoolean
    public boolean loadedProjectE;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        MMAULogger.registry(event);//ロガーを生成

        MMAUConfig.Load(event);// コンフィグの読み込み

        MMAURegistry.registerMMAU();// ブロック､アイテムの登録等
        MMAUOreDict.registry(this);// 鉱石辞書登録


    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(this.instance, new MMAUGuiHandler());
        proxy.registerRender();
        MMAURecipeRegister.registry(this);// レシピ登録
        MMAUGens.registry(this);// ワールド生成関連
        MinecraftForge.EVENT_BUS.register(new MMAUEvents());

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //連携MODが読み込まれてるか取得
        loadedProjectE = Loader.isModLoaded("ProjectE");

        if (loadedProjectE) {
            MMAULogger.log("ProjectE is Loaded!");
            registerEMC();
        }

    }


}
