package com.sorasuke.MMAU.gui;

import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.container.ContainerChickenBlock;
import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * ニワトリブロックのGUI
 * Created by sora_suke on 2016/11/26.
 */
public class GuiChickenBlock extends GuiContainer {

    private static TileEntityChickenBlock tileEntity;

    private static final ResourceLocation bground = new ResourceLocation("mmau:textures/gui/container/chicken_block.png");

    public GuiChickenBlock(InventoryPlayer inventoryPlayer, TileEntityChickenBlock entity) {
        super(new ContainerChickenBlock(inventoryPlayer, entity));
        this.tileEntity = entity;
        this.xSize = 176;
        this.ySize = 166;
    }

    public void drawGuiContainerForegroundLayer(int par1, int par2) {
        String name = this.tileEntity.hasCustomName() ? this.tileEntity.getName() : I18n.format(this.tileEntity.getName(), new Object[0]);
        this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 4210752);
        this.fontRendererObj.drawString(String.valueOf(this.tileEntity.getWorkTime()), 118, this.ySize - 96 + 8, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(bground);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

        this.drawTexturedModalRect(k + 71, l + 21, 176, 0, 24, (int) (tileEntity.getWorkingPercentage(28)));
    }
}
