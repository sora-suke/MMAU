package com.sorasuke.MMAU.render;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.models.ChickenHeadModel;
import com.sorasuke.MMAU.models.ModelGuidanceMarker;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by sora_suke on 2017/03/30.
 */
public class GuidanceMarkerRender extends TileEntitySpecialRenderer {

    private static final ResourceLocation texture = new ResourceLocation(MMAU.MODID, "textures/entity/chicken.png");

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f, int destroyStage) {
        ModelGuidanceMarker model = new ModelGuidanceMarker();
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5f, (float) y + 1.5f, (float) z + 0.5f);
        GL11.glRotatef(180f, 0f, 0f, 1f);

        this.bindTexture(texture);

        GL11.glPushMatrix();

        /**ここにモデルの描画処理を書く*/

        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

}
