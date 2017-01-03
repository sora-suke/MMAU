package com.sorasuke.MMAU.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

/**
 * Created by sora_suke on 2016/12/22.
 */
@SideOnly(Side.CLIENT)
public class ChickenHeadItemRender implements IItemRenderer {

    private TileEntity tileEntity;
    private ChickenHeadSpecialRender tileEntitySpecialRenderer;

    public ChickenHeadItemRender(TileEntitySpecialRenderer tileEntitySpecialRenderer, TileEntity tileEntity) {
        this.tileEntity = tileEntity;
        this.tileEntitySpecialRenderer = (ChickenHeadSpecialRender) tileEntitySpecialRenderer;
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {
            case INVENTORY:
            case ENTITY:
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
            case FIRST_PERSON_MAP:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        this.tileEntitySpecialRenderer.renderItem(this.tileEntity, 0.0D, 0.0D, 0.0D, 0.0f);
    }
}
