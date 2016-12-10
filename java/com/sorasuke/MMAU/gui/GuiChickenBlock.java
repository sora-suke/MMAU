package com.sorasuke.MMAU.gui;

import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.container.ContainerChickenBlock;
import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by sora_suke on 2016/11/26.
 */
public class GuiChickenBlock extends GuiContainer {

    private static TileEntityChickenBlock tileEntity;

    public static final ResourceLocation bground = new ResourceLocation("mmau:textures/gui/container/chicken_block.png");
    public GuiChickenBlock(InventoryPlayer inventoryPlayer, TileEntityChickenBlock entity) {
        super(new ContainerChickenBlock(inventoryPlayer, entity));
        this.tileEntity = entity;
        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(bground);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

        this.drawTexturedModalRect(k+71, l+21, 176, 0, 24, (int)(tileEntity.getWorkingPercentage(28)));
    }
}
