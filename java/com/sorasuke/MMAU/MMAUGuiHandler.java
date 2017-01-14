package com.sorasuke.MMAU;

import com.sorasuke.MMAU.container.ContainerChickenBlock;
import com.sorasuke.MMAU.gui.GuiChickenBlock;
import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by sora_suke on 2016/11/27.
 */
public class MMAUGuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));
        if (entity != null) {
            switch (ID) {
                case MMAU.guiIdChickenBlock:
                    if (entity instanceof TileEntityChickenBlock) {
                        return new ContainerChickenBlock(player.inventory, (TileEntityChickenBlock) entity);
                    }
                    //return null;
            }
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));
        if (entity != null) {
            switch (ID) {
                case MMAU.guiIdChickenBlock:
                    if (entity instanceof TileEntityChickenBlock) {
                        return new GuiChickenBlock(player.inventory, (TileEntityChickenBlock) entity);
                    }
                    //return null;
            }
        }
        return null;
    }
}
