package com.sorasuke.MMAU.render;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.models.ModelGuidanceMarker;
import com.sorasuke.MMAU.tileentities.TileEntityGuidanceMarker;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by sora_suke on 2017/03/30.
 */
public class GuidanceMarkerRender extends TileEntitySpecialRenderer<TileEntityGuidanceMarker> {

    private static final ResourceLocation texture = new ResourceLocation(MMAU.MODID, "textures/entity/tile/marker.png");

    @Override
    public void renderTileEntityAt(TileEntityGuidanceMarker tileEntity, double x, double y, double z, float f, int destroyStage) {
        ModelGuidanceMarker model = new ModelGuidanceMarker();
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5f, (float) y + 0.5f, (float) z + 0.5f);
        GL11.glRotatef(180f, 0f, 0f, 1f);

        this.bindTexture(texture);

        GL11.glPushMatrix();

        /**ここにモデルの描画処理を書く*/

        model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }

}
