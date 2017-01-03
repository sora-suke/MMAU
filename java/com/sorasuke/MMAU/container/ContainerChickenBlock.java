package com.sorasuke.MMAU.container;

import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;

/**
 * Created by sora_suke on 2016/11/26.
 */
public class ContainerChickenBlock extends Container {

    private TileEntityChickenBlock chickenBlock;

    public ContainerChickenBlock(InventoryPlayer inventory, TileEntityChickenBlock tileentity) {
        this.chickenBlock = tileentity;
        this.addSlotToContainer(new SlotFurnace(inventory.player, this.chickenBlock, 0, 80, 57));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
        }
    }

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int clickedIndex) {
        //MMAULogger.log("transferStackInSlot!");
        //MMAULogger.log("0");
        Slot slot = (Slot) this.inventorySlots.get(clickedIndex);
        ItemStack itemStack = null;
        if (slot != null && slot.getHasStack()) {
            ItemStack itemStackMem = slot.getStack();
            itemStack = itemStackMem.copy();
            //MMAULogger.log("1");
            if (clickedIndex == 0) {
                if (!this.mergeItemStack(itemStackMem, 1, 37, true)) {
                    //slot.putStack(null);
                    //MMAULogger.log("2");
                    return null;
                }
                //MMAULogger.log("3");
                slot.onSlotChange(itemStackMem, itemStack);
            }

            if (itemStackMem.stackSize <= 0) {
                //slot.putStack(null);// ぬる入れちゃだめらしい
                //MMAULogger.log("4");
            } else {
                slot.onSlotChanged();
                //MMAULogger.log("5");
            }
            if (itemStack.stackSize == itemStackMem.stackSize) {
                //MMAULogger.log("6");
                return null;

            }
            slot.onPickupFromSlot(par1EntityPlayer, itemStackMem);
            //MMAULogger.log("7");
        }

        return itemStack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return chickenBlock.isUseableByPlayer(player);
    }
}
