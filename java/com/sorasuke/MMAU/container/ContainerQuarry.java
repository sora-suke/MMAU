package com.sorasuke.MMAU.container;

import com.sorasuke.MMAU.items.upgrades.IUpgrade;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created by sora_suke on 2017/03/05.
 */
public class ContainerQuarry extends Container {

    TileEntityQuarry tileEntity;
    int upgradeIndex = 0;
    int qSlotIndex = 5;
    int pInventoryIndex = 32;
    int pHotbarIndex = 59;
    int endIndex = 68;

    public ContainerQuarry(InventoryPlayer inventory, TileEntityQuarry tileentity) {
        this.tileEntity = tileentity;

        this.addSlotToContainer(new SlotUpgrade(tileEntity, 0, 69, 8));
        this.addSlotToContainer(new SlotUpgrade(tileEntity, 1, 87, 8));
        this.addSlotToContainer(new SlotUpgrade(tileEntity, 2, 105, 8));
        this.addSlotToContainer(new SlotUpgrade(tileEntity, 3, 123, 8));
        this.addSlotToContainer(new SlotUpgrade(tileEntity, 4, 141, 8));


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(tileEntity, j + i * 9 + 5, 8 + j * 18, 72 + i * 18));
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 140 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 198));
        }


    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int clickedIndex) {
        Slot slot = (Slot) this.inventorySlots.get(clickedIndex);
        ItemStack itemStack = null;
        if(slot != null && slot.getHasStack()){
            ItemStack itemStackMem = slot.getStack();
            itemStack = itemStackMem.copy();
            if(clickedIndex >= upgradeIndex && clickedIndex < pInventoryIndex){
                if(!this.mergeItemStack(itemStackMem, pInventoryIndex, endIndex, false)){
                    return null;
                }
                slot.onSlotChange(itemStackMem, itemStack);
            } else /*if (clickedIndex >= 29 && clickedIndex <= 64)*/{
                if(itemStackMem.getItem() instanceof IUpgrade){
                    if(!this.mergeItemStack(itemStackMem, upgradeIndex, qSlotIndex, false)){
                        return null;
                    }
                } else {
                    if(clickedIndex >= pInventoryIndex && clickedIndex < pHotbarIndex && !this.mergeItemStack(itemStackMem, pHotbarIndex, endIndex, false)){
                        return null;
                    }else if(clickedIndex >= pHotbarIndex && clickedIndex < endIndex && !this.mergeItemStack(itemStackMem, pInventoryIndex, pHotbarIndex, false)){
                        return null;
                    }
                }
            }
            if (itemStack.stackSize == 0) {
                slot.putStack((ItemStack)null);
            } else {
                slot.onSlotChanged();
            }
            if(itemStack.stackSize == itemStackMem.stackSize){
                return null;
            }
            slot.onPickupFromSlot(par1EntityPlayer, itemStackMem);
        }
        return  itemStack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
