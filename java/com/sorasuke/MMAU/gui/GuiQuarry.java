package com.sorasuke.MMAU.gui;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.container.ContainerQuarry;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiBeacon;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
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
    public void initGui(){
        super.initGui();
        this.buttonList.add(new PanelRFAmount(0, this.guiLeft + 9, this.guiTop + 8, this.tileEntity));
    }

    @Override
    public void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
        for (GuiButton guibutton : this.buttonList)
        {
            if (guibutton.isMouseOver())
            {
                guibutton.drawButtonForegroundLayer(mouseX - this.guiLeft, mouseY - this.guiTop);
                break;
            }
        }
        //this.fontRendererObj.drawString(String.valueOf(this.tileEntity.getRFAmount()), 118, this.ySize - 96 + 8, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
        this.fontRendererObj.drawString(I18n.format("gui.mmau.upgrade", new Object[0]), 72, 26, 4210752);
        RenderHelper.enableGUIStandardItemLighting();
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(bground);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        this.drawTexturedModalRect(k + 9, l + 8, 176, 0, (int) (tileEntity.getRFPercentage(53)), 16);
    }

    @SideOnly(Side.CLIENT)
    public class PanelRFAmount extends GuiButton {
        private final ResourceLocation iconTexture = new ResourceLocation(MMAU.MODID, "textures/gui/container/quarry.png");
        private final int iconX = 176;
        private final int iconY = 16;
        private TileEntityQuarry tileEntityQuarry;
        public PanelRFAmount(int buttonId, int x, int y, TileEntityQuarry tileEntityQuarry) {
            super(buttonId, x, y,53, 16, "");
            this.tileEntityQuarry = tileEntityQuarry;
        }

        @Override
        public void playPressSound(SoundHandler soundHandlerIn) {
            //MMAULogger.log("pushed!");
            //鳴らさない
        }

        @Override
        public void drawButtonForegroundLayer(int mouseX, int mouseY) {
            //MMAULogger.log("drawButtonForegroundLayer!");
            GuiQuarry.this.drawCreativeTabHoveringText(I18n.format("gui.mmau.rf", new Object[0])
                    + " " + this.tileEntityQuarry.getRFAmount() + "/" + this.tileEntityQuarry.getMaxRFAmount(), mouseX, mouseY);
        }

        @Override
        public void drawButton(Minecraft mc, int mouseX, int mouseY){
            this.tileEntityQuarry = GuiQuarry.tileEntity;
            if (this.visible)
            {
                mc.getTextureManager().bindTexture(iconTexture);
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;

                this.drawTexturedModalRect(this.xPosition, this.yPosition, this.iconX, this.iconY, this.width, this.height);

                if (!iconTexture.equals(this.iconTexture))
                {
                    mc.getTextureManager().bindTexture(this.iconTexture);
                }

                //this.drawTexturedModalRect(this.xPosition + 2, this.yPosition + 2, this.iconX, this.iconY, 53, 16);
            }
        }

        @Override
        public boolean isMouseOver()
        {
            return this.hovered;
        }

    }
}
