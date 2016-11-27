package com.sorasuke.MMAU.container;

import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;

/**
 * Created by sora_suke on 2016/11/26.
 */
public class ContainerChickenBlock extends Container {

    private TileEntityChickenBlock chickenBlock;
    public ContainerChickenBlock(InventoryPlayer inventory, TileEntityChickenBlock tileentity) {
        this.chickenBlock = tileentity;
        this.addSlotToContainer(new SlotFurnace(inventory.player, this.chickenBlock, 0, 116, 35));

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for(int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return chickenBlock.isUseableByPlayer(player);
    }
}
