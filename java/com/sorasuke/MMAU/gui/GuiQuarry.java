package com.sorasuke.MMAU.gui;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.container.ContainerQuarry;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by sora_suke on 2017/03/05.
 */
public class GuiQuarry extends GuiContainer {

    private static TileEntityQuarry tileEntity;

    private static final ResourceLocation bground = new ResourceLocation(MMAU.MODID, "textures/gui/container/quarry.png");

    public GuiQuarry(InventoryPlayer inventoryPlayer, TileEntityQuarry entity) {
        super(new ContainerQuarry(inventoryPlayer, entity));
        this.tileEntity = entity;
        this.xSize = 176;
        this.ySize = 222;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(bground);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
}
