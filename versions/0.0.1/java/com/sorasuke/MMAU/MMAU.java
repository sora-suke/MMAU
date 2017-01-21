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
    public static final String VERSION = "0.0.1";

    public static final CreativeTabs MMAUTAB = new MMAUTab("mmautab");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        MMAUConfig.Load(this, event);

        MMAUItems.registry(this);
        MMAUBlocks.registry(this);

    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

        Recipes.registry(this);
        MMAUGens.registry(this);

    }

}
