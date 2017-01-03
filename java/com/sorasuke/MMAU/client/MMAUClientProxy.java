package com.sorasuke.MMAU.client;

import com.sorasuke.MMAU.MMAURegistry;
import com.sorasuke.MMAU.common.MMAUProxy;
import com.sorasuke.MMAU.render.ChickenHeadItemRender;
import com.sorasuke.MMAU.render.ChickenHeadSpecialRender;
import com.sorasuke.MMAU.tileentities.TileEntityChickenHead;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * Created by sora_suke on 2016/12/22.
 */
public class MMAUClientProxy extends MMAUProxy {
    @Override
    public void registerRender() {
        ChickenHeadSpecialRender chickenHeadSpecialRender = new ChickenHeadSpecialRender();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChickenHead.class, chickenHeadSpecialRender);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MMAURegistry.ChickenHead), new ChickenHeadItemRender(chickenHeadSpecialRender, new TileEntityChickenHead()));
    }
}
