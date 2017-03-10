package com.sorasuke.MMAU.container;

import com.sorasuke.MMAU.items.upgrades.IUpgrade;
import com.sorasuke.MMAU.items.upgrades.UpgradeBase;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

/**
 * Created by sora_suke on 2017/03/08.
 */
public class SlotUpgrade extends Slot {
    public SlotUpgrade(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    public boolean isItemValid(@Nullable ItemStack stack){
        return stack.getItem() instanceof IUpgrade;
    }

}
