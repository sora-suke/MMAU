package com.sorasuke.MMAU.render;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.MMAURegistry;
import com.sorasuke.MMAU.items.InformationGoggles;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import com.sorasuke.MMAU.utils.MMAUUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL45;

import java.awt.*;

/**
 * Created by sora_suke on 2017/03/27.
 */
public class QuarrySpecialRender extends TileEntitySpecialRenderer<TileEntityQuarry> {

    //private static final ResourceLocation texture = new ResourceLocation(MMAU.MODID, "textures/blocks/tin_block.png");
    private static final ResourceLocation texture = new ResourceLocation( "textures/blocks/wool_colored_white.png");

    @Override
    public void renderTileEntityAt(TileEntityQuarry tileEntity, double x, double y, double z, float f, int destroyStage) {
        //MMAULogger.log("hoge");


        if (0 < destroyStage) return;
        if(!tileEntity.isRemembering) return;
        //GL11.glDisable(GL11.GL_LIGHTING);
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.disableLighting();//ここやるとむっちゃ明るくなる あかるくするかくらくするか...
        if((Minecraft.getMinecraft().thePlayer.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null)
                && (Minecraft.getMinecraft().thePlayer.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof InformationGoggles))GlStateManager.disableDepth();
        GlStateManager.translate(x + 0.5F, y + 0.5F, z + 0.5F);
        //GlStateManager.enableBlend();

        //GlStateManager.enableLight(1);


        //GL11.glDisable(GL11.GL_LIGHTING);
        Tessellator tessellator = Tessellator.getInstance();
        VertexBuffer wr = tessellator.getBuffer();

        this.bindTexture(texture);

        int color = Color.red.getRGB();
        int r = color >> 16 & 255;
        int g = color >> 8 & 255;
        int b = color & 255;

        wr.begin(GL11.GL_LINES, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);

        BlockPos ppp = MMAUUtils.getRelativePos(tileEntity.getPos(), tileEntity.getDiagonalPos());
        int px = ppp.getX();
        int py = ppp.getY();
        int pz = ppp.getZ();

        //wr.pos(0,0,0).normal(0,0,0).color(r, g, b, 255).tex(0,1).endVertex();
        //wr.pos(px, py, pz).normal(px, py, pz).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(0,0,0).normal(0,0,0).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(px, 0, 0).normal(px, 0, 0).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(0,0,0).normal(0,0,0).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(0, py, 0).normal(0, py, 0).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(0,0,0).normal(0,0,0).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(0, 0, pz).normal(0, 0, pz).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(px, 0, 0).normal(px, 0, 0).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(px, py, 0).normal(px, py, 0).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(0, py, 0).normal(0, py, 0).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(px, py, 0).normal(px, py, 0).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(px, 0, 0).normal(px, 0, 0).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(px, 0, pz).normal(px, 0, pz).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(0, py, 0).normal(0, py, 0).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(0, py, pz).normal(0, py, pz).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(px, py, 0).normal(px, py, 0).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(px, py, pz).normal(px, py, pz).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(0, 0, pz).normal(0, 0, pz).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(px, 0, pz).normal(px, 0, pz).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(px, 0, pz).normal(px, 0, pz).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(px, py, pz).normal(px, py, pz).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(0, 0, pz).normal(0, 0, pz).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(0, py, pz).normal(0, py, pz).color(r, g, b, 255).tex(0,1).endVertex();

        wr.pos(0, py, pz).normal(0, py, pz).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(px, py, pz).normal(px, py, pz).color(r, g, b, 255).tex(0,1).endVertex();




        tessellator.draw();

        //GlStateManager.disableBlend();
        GlStateManager.enableDepth();
        GlStateManager.enableLighting();
        GlStateManager.enableCull();

        GlStateManager.popMatrix();

    }

    public boolean isGlobalRenderer(TileEntityQuarry te)
    {
        return true;
    }

}
