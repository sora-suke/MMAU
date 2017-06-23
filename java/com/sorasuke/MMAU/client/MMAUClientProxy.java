package com.sorasuke.MMAU.client;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.MMAURegistry;
import com.sorasuke.MMAU.blocks.IMMAUBaseBlock;
import com.sorasuke.MMAU.common.MMAUProxy;
import com.sorasuke.MMAU.items.IMMAUBaseItem;
import com.sorasuke.MMAU.items.upgrades.IUpgrade;
import com.sorasuke.MMAU.render.ChickenHeadItemRender;
import com.sorasuke.MMAU.render.ChickenHeadSpecialRender;
import com.sorasuke.MMAU.render.GuidanceMarkerRender;
import com.sorasuke.MMAU.render.QuarrySpecialRender;
import com.sorasuke.MMAU.tileentities.TileEntityChickenHead;

import com.sorasuke.MMAU.tileentities.TileEntityGuidanceMarker;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by sora_suke on 2016/12/22.
 * クライアントプロキシ
 */
@SideOnly(Side.CLIENT)
public class MMAUClientProxy extends MMAUProxy {
    @Override
    public void registerRender() {
        //( ﾟ∀ﾟ)ｱﾊﾊ八八ﾉヽﾉヽﾉヽﾉ ＼ / ＼/ ＼
        //ここのレンダーを残したままだったよwwwwwwwww
        //そりゃJsonをいくらいじってもだめだわwwwwwwwwwwwwwwwwww

        //ChickenHeadSpecialRender chickenHeadSpecialRender = new ChickenHeadSpecialRender();
        //ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChickenHead.class, chickenHeadSpecialRender);
        //MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MMAURegistry.ChickenHead), new ChickenHeadItemRender(chickenHeadSpecialRender, new TileEntityChickenHead()));
        //クソ仕様にしやがってゆるさんぞ
        QuarrySpecialRender quarrySpecialRender = new QuarrySpecialRender();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityQuarry.class, quarrySpecialRender);

        GuidanceMarkerRender guidanceMarkerRender = new GuidanceMarkerRender();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGuidanceMarker.class, guidanceMarkerRender);
        //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(((IMMAUBaseBlock)MMAURegistry.GuidanceMarker).getItemBlock(), 0, new ModelResourceLocation(((IMMAUBaseBlock)MMAURegistry.GuidanceMarker).getLocation(), "inventory"));
    }

    @Override
    public void registerItemBlockModel(Block b){
        ModelLoader.setCustomModelResourceLocation(((IMMAUBaseBlock)b).getItemBlock(), 0, new ModelResourceLocation(((IMMAUBaseBlock)b).getLocation(),"inventory"));
    }

    @Override
    public void registerItemModel(Item i){
        if(i.getHasSubtypes()) {
            MMAULogger.log("length is "+((IUpgrade) i).getMaxGrade());
            for(int j = 0; j < ((IMMAUBaseItem) i).getMaxMetadata(); ++j) {
                //MMAULogger.log("Loop "+j);
                ModelLoader.setCustomModelResourceLocation(
                        i, j,
                        new ModelResourceLocation(
                                new ResourceLocation(MMAU.MODID, ((IMMAUBaseItem) i).getLocation().getResourcePath() + "_" + j)
                                , "inventory"));
            }
        } else {
            ModelLoader.setCustomModelResourceLocation(i, 0, new ModelResourceLocation(((IMMAUBaseItem) i).getLocation(), "inventory"));
        }
    }

    @Override
    public void chatCoordinateRegisterd(EntityPlayer p, BlockPos b, String s, boolean u){
        if(u){
            p.addChatComponentMessage(new TextComponentString(I18n.format(s, b.getX(), b.getY(), b.getZ())));
        }else{
            p.addChatComponentMessage(new TextComponentString(I18n.format(s, null)));
        }
    }
}
