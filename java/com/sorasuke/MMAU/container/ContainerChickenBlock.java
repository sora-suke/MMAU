package com.sorasuke.MMAU.container;

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

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int clickedIndex) {


        Slot slot = (Slot)this.inventorySlots.get(clickedIndex);
        if(slot == null) {
            return null;
        }

        if(slot.getHasStack() == false) {
            return null;
        }

        ItemStack itemStack = slot.getStack();
        ItemStack itemStackMem = slot.getStack().copy();

        if(clickedIndex == 0){
            if(!this.mergeItemStack(itemStack, 1, 37, false)){
                return null;
            }
            slot.onSlotChange(itemStack, itemStackMem);
        }

        if(itemStack.stackSize == 0){
            slot.putStack(null);
        }else{
            slot.onSlotChanged();
        }
        if(itemStack.stackSize == itemStackMem.stackSize){
            return null;
        }
        slot.onPickupFromSlot(par1EntityPlayer,itemStack);

        return itemStack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return chickenBlock.isUseableByPlayer(player);
    }
}
