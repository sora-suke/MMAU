package com.sorasuke.MMAU.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityContainerWood extends TileEntity implements IInventory {

    protected ItemStack[] itemStacks = new ItemStack[16];
    protected byte importingSlot;
    protected byte exportingSlot;

    public boolean tryImportItemStack(ItemStack itemStack) {
        for (int i = 0; i < this.getSizeInventory(); i++) {
            importingSlot = this.getNextSlot(importingSlot);
            if (itemStacks[importingSlot] == null) {
                itemStacks[importingSlot] = itemStack.copy();
                return true;
            }
        }


        return false;
    }

    protected byte getNextSlot(byte slot) {
        slot++;
        if (slot >= this.getSizeInventory()) {
            slot = 0;
        }
        return slot;
    }

    public ItemStack tryExportItemStack() {
        for (int i = 0; i < this.getSizeInventory(); i++) {
            exportingSlot = this.getNextSlot(exportingSlot);
            if (itemStacks[exportingSlot] != null) {
                ItemStack itemStack = itemStacks[exportingSlot].copy();
                itemStacks[exportingSlot] = null;
                return itemStack;
            }
        }
        return null;
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < itemStacks.length; i++) {
            if (itemStacks[i] == null) {
                continue;
            }
            NBTTagCompound nbt1 = new NBTTagCompound();
            nbt1.setByte("Slot", (byte) i);
            itemStacks[i].writeToNBT(nbt1);
            nbttaglist.appendTag(nbt1);
        }
        nbt.setTag("Items", nbttaglist);
        nbt.setByte("ImportingSlot", importingSlot);
        nbt.setByte("ExportingSlot", exportingSlot);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        NBTTagList nbttaglist = nbt.getTagList("Items", 10);
        itemStacks = new ItemStack[16];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbt1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbt1.getByte("Slot");
            if (0 <= b0 && b0 < itemStacks.length) {
                itemStacks[b0] = ItemStack.loadItemStackFromNBT(nbt1);
            }
        }
        importingSlot = nbt.getByte("ImportingSlot");
        exportingSlot = nbt.getByte("ExportingSlot");
    }

    public int getSizeInventory() {
        // TODO 自動生成されたメソッド・スタブ
        return 16;
    }

    public ItemStack getStackInSlot(int i) {
        // TODO 自動生成されたメソッド・スタブ
        return itemStacks[i];
    }

    @Override
    public ItemStack decrStackSize(int slot, int amout) {
        if (itemStacks[slot] == null) {
            return null;
        }
        ItemStack itemstack;
        if (itemStacks[slot].stackSize <= amout) {
            itemstack = itemStacks[slot];
            itemStacks[slot] = null;
            return itemstack;
        }
        itemstack = itemStacks[slot].splitStack(amout);
        if (itemStacks[slot].stackSize < 1) {
            itemStacks[slot] = null;
        }
        return itemstack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack itemStack) {
        itemStacks[slot] = itemStack;
        if (itemStack != null && itemStack.stackSize > this.getInventoryStackLimit()) {
            itemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    @Override
    public String getInventoryName() {
        // TODO 自動生成されたメソッド・スタブ
        return "container.MMAU_container_wood.name";
    }

    @Override
    public boolean hasCustomInventoryName() {
        // TODO 自動生成されたメソッド・スタブ
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        // TODO 自動生成されたメソッド・スタブ
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        // TODO 自動生成されたメソッド・スタブ
        return worldObj.getTileEntity(xCoord, yCoord, zCoord) != this ? false : player.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64.0;
    }

    @Override
    public void openInventory() {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public void closeInventory() {
        // TODO 自動生成されたメソッド・スタブ

    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        // TODO 自動生成されたメソッド・スタブ
        return true;
    }

}
