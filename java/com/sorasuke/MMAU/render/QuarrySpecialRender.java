package com.sorasuke.MMAU.render;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
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
        //GL11.glDisable(GL11.GL_LIGHTING);
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.disableLighting();
        GlStateManager.disableDepth();
        GlStateManager.translate(x + 0.5F, y, z + 0.5F);
        GlStateManager.enableBlend();

        //GlStateManager.enableLight(1);


        //GL11.glDisable(GL11.GL_LIGHTING);
        Tessellator tessellator = Tessellator.getInstance();
        VertexBuffer wr = tessellator.getBuffer();

        this.bindTexture(texture);
        wr.begin(GL11.GL_TRIANGLES, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);


        int color = Color.yellow.getRGB();
        int r = color >> 16 & 255;
        int g = color >> 8 & 255;
        int b = color & 255;

        wr.pos(-30, 1, 2).normal(-30, 1, 2).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(0, 5, 0).normal(0, 5, 0).color(r, g, b, 255).tex(0,1).endVertex();
        wr.pos(4, 1, 0).normal(4, 1, 0).color(r, g, b, 255).tex(0,1).endVertex();

        tessellator.draw();

        GlStateManager.disableBlend();
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
