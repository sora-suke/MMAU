package com.sorasuke.MMAU.render;

import com.sorasuke.MMAU.models.ChickenHeadModel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by sora_suke on 2016/12/22.
 */
public class ChickenHeadSpecialRender extends TileEntitySpecialRenderer {

    private static final ResourceLocation texture = new ResourceLocation("textures/entity/chicken.png");

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
        ChickenHeadModel model = new ChickenHeadModel();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5f, (float)y + 1.5f, (float)z + 0.5f);
        GL11.glRotatef(180f,0f,0f,1f);

        this.bindTexture(texture);

        GL11.glPushMatrix();
        GL11.glRotatef(tileentity.getBlockMetadata() * 90, 0.0F, 1.0F, 0.0F);
        //model.renderModel(0.0625f);
        model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();


    }
}
