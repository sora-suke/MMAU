package com.sorasuke.MMAU.container;

import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
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

    public ContainerQuarry(InventoryPlayer inventory, TileEntityQuarry tileentity) {
        this.tileEntity = tileentity;

        this.addSlotToContainer(new Slot(tileEntity, 0, 69, 8));//Enchant Book Slot.

        this.addSlotToContainer(new Slot(tileEntity, 1, 90, 8));//Upgrade Slot.


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(tileEntity, j + i * 9 + 2, 8 + j * 18, 72 + i * 18));
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
            if(clickedIndex >= 0 && clickedIndex<=28){
                if(!this.mergeItemStack(itemStackMem, 29, 65, true)){
                    return null;
                }
                slot.onSlotChange(itemStackMem, itemStack);
            }/*else if(!this.mergeItemStack(itemStackMem, 0, 29, false)){
                return null;
            }*/
            else if (clickedIndex >= 29 && clickedIndex <= 64){
                if(itemStackMem.isItemEqual(new ItemStack(Items.ENCHANTED_BOOK))){
                    if(!this.mergeItemStack(itemStackMem, 0, 1, false)){
                        return null;
                    }
                } else if(itemStackMem.isItemEqual(new ItemStack(Items.DIAMOND/*アップグレード作るまでこのまま*/))){
                    if(!this.mergeItemStack(itemStackMem, 1, 2, false)){
                        return null;
                    }
                }else if(clickedIndex >= 29 && clickedIndex <= 55){
                    if(this.mergeItemStack(itemStackMem, 56, 65, false)){
                        return null;
                    }
                }else if(clickedIndex >= 56 && clickedIndex <= 64){
                    if(this.mergeItemStack(itemStackMem, 29, 56, false)){
                        return null;
                    }
                }
            }
            if(!(itemStackMem.stackSize <=0)){
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
