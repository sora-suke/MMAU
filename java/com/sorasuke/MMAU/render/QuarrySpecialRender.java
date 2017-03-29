package com.sorasuke.MMAU.render;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL45;

/**
 * Created by sora_suke on 2017/03/27.
 */
public class QuarrySpecialRender extends TileEntitySpecialRenderer<TileEntityQuarry> {

    private static final ResourceLocation texture = new ResourceLocation(MMAU.MODID, "textures/blocks/tin_block.png");

    @Override
    public void renderTileEntityAt(TileEntityQuarry tileEntity, double x, double y, double z, float f, int destroyStage) {
        MMAULogger.log("hoge");
        /**とりあえずポリゴン1つ描画する*/
        /*GL11.glBegin(GL11.GL_POLYGON);
        GL11.glVertex3d(x,y+1,z);
        GL11.glVertex3d(x,y+10,z);
        GL11.glVertex3d(x+1,y,z);
        GL11.glEnd();*/

        if (0 < destroyStage) return;
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.translate(x + 0.5F, y, z + 0.5F);

        {
            Tessellator tessellator = Tessellator.getInstance();
            VertexBuffer wr = tessellator.getBuffer();

            this.bindTexture(texture);
            wr.begin(GL11.GL_TRIANGLES, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);

            int color = java.awt.Color.white.getRGB();
            int r = color >> 16 & 255;
            int g = color >> 8 & 255;
            int b = color & 255;

            wr.pos(-30, 1, 2).normal(-30, 1, 2).color(r, g, b, 255).tex(0,1).endVertex();
            wr.pos(0, 5, 0).normal(0, 5, 0).color(r, g, b, 255).tex(0,1).endVertex();
            wr.pos(4, 1, 0).normal(4, 1, 0).color(r, g, b, 255).tex(0,1).endVertex();

            tessellator.draw();
        }

        GlStateManager.popMatrix();

    }

    public boolean isGlobalRenderer(TileEntityQuarry te)
    {
        return false;
    }

}
