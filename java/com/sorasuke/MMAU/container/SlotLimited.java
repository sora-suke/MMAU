package com.sorasuke.MMAU.container;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

/**
 * Created by sora_suke on 2017/03/07.
 */
public class SlotLimited extends Slot {
    private ItemStack itemStack;
    public SlotLimited(IInventory inventoryIn, int index, int xPosition, int yPosition, ItemStack itemStack) {
        super(inventoryIn, index, xPosition, yPosition);
        this.itemStack = itemStack;
    }

    public boolean isItemValid(@Nullable ItemStack stack){
        return stack.isItemEqual(this.itemStack);
    }
}
