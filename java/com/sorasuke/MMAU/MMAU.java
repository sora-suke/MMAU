package com.sorasuke.MMAU;


import com.sorasuke.MMAU.common.MMAUProxy;
import com.sorasuke.MMAU.gens.MMAUGens;


import com.sorasuke.MMAU.items.MMAUBaseTool;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = MMAU.MODID, version = MMAU.VERSION, name = MMAU.MODNAME)
public class MMAU {

    public static final String MODNAME = "MoreMaterialsAndUtilities";
    public static final String MODID = "morematerialsandutilities";
    public static final String VERSION = "0.2.0";
    @Mod.Instance
    public static MMAU instance;
    @Mod.Metadata
    public static ModMetadata metadata;
    @SidedProxy(clientSide = "com.sorasuke.MMAU.client.MMAUClientProxy", serverSide = "com.sorasuke.MMAU.common.MMAUProxy")
    public static MMAUProxy proxy;

    //GUIのID
    public static final int guiIdChickenBlock = 0;
    public static final int guiIdQuarry = 1;




    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        this.loadMetadata(metadata);

        MMAULogger.registry(event);//ロガーを生成

        MMAUConfig.Load(event);// コンフィグの読み込み

        MMAURegistry.registerMMAU();// ブロック､アイテムの登録等
        MMAUOreDict.registry(this);// 鉱石辞書登録


    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new MMAUGuiHandler());
        proxy.registerRender();
        MMAURecipeRegister.registry(this);// レシピ登録
        MMAUGens.registry(this);// ワールド生成関連
        MinecraftForge.EVENT_BUS.register(new MMAUEvents());
        MinecraftForge.EVENT_BUS.register(MMAURegistry.IronMortar);
        MinecraftForge.EVENT_BUS.register(new MMAULoot());

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {


    }

    private void loadMetadata(ModMetadata m){
        m.modId = MODID;
        m.name = MODNAME;
        m.version = VERSION;
        m.url = "https://minecraft.curseforge.com/projects/morematerialsandutilities";
        m.authorList.add("sora_suke(Twitter:@sora_suke_mc)");
        m.description = "This mod adds many materials,tools and utilities!";
        m.autogenerated = false;
    }


}
