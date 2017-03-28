package com.sorasuke.MMAU.render;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL45;

/**
 * Created by sora_suke on 2017/03/27.
 */
public class QuarrySpecialRender extends TileEntitySpecialRenderer<TileEntityQuarry> {

    private static final ResourceLocation texture = new ResourceLocation(MMAU.MODID, "textures/entity/chicken.png");

    @Override
    public void renderTileEntityAt(TileEntityQuarry tileEntity, double x, double y, double z, float f, int destroyStage) {
        //MMAULogger.log("hoge");
        /**とりあえずポリゴン1つ描画する*/
        GL11.glBegin(GL11.GL_POLYGON);
        GL11.glVertex3d(x,y+1,z);
        GL11.glVertex3d(x,y+10,z);
        GL11.glVertex3d(x+1,y,z);
        GL11.glEnd();



    }

    public boolean isGlobalRenderer(TileEntityQuarry te)
    {
        return true;
    }

}
