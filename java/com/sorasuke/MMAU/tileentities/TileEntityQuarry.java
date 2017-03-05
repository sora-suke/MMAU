package com.sorasuke.MMAU.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;

import javax.annotation.Nullable;

/**
 * Created by sora_suke on 2017/03/05.
 */
public class TileEntityQuarry extends TileEntityLockable implements ISidedInventory, ITickable {

    private ItemStack[] slot = new ItemStack[29];
    private String localizedName;

    private int rfAmount;
    private int rfMax;

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < slot.length; i++) {
            if (slot[i] == null)
                continue;
            NBTTagCompound nbt1 = new NBTTagCompound();
            nbt1.setByte("Slot", (byte) i);
            slot[i].writeToNBT(nbt1);
            nbttaglist.appendTag(nbt1);
        }
        nbt.setTag("Items", nbttaglist);
        nbt.setInteger("RFAmount", this.rfAmount);
        if (this.hasCustomName()) {
            nbt.setString("CustomName", this.localizedName);
        }
        return nbt;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt){
        super.readFromNBT(nbt);
        NBTTagList nbttaglist = nbt.getTagList("Items", 10);
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbt1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbt1.getByte("Slot");
            if (0 <= b0 && b0 < slot.length) {
                slot[b0] = ItemStack.loadItemStackFromNBT(nbt1);
            }
        }
        if (nbt.hasKey("CustomName")) {
            this.localizedName = nbt.getString("CustomName");
        }
        this.rfAmount = nbt.getInteger("RFAmount");
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        //MMAULogger.log("onDataPacket!");
        readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        //MMAULogger.log("getDescriptionPacket!");
        NBTTagCompound tagCompound = new NBTTagCompound();
        writeToNBT(tagCompound);
        return new SPacketUpdateTileEntity(getPos(), this.getBlockMetadata(), tagCompound);
    }

    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        return new int[0];
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return false;
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        return false;
    }

    @Override
    public int getSizeInventory() {
        return 29;
    }

    @Nullable
    @Override
    public ItemStack getStackInSlot(int index) {
        return this.slot[index];
    }

    @Nullable
    @Override
    public ItemStack decrStackSize(int index, int count) {
        ItemStack itemstack = ItemStackHelper.getAndSplit(this.slot, index, count);

        if (itemstack != null)
        {
            this.markDirty();
        }

        return itemstack;
    }

    @Nullable
    @Override
    public ItemStack removeStackFromSlot(int index) {
        return ItemStackHelper.getAndRemove(this.slot, index);
    }

    @Override
    public void setInventorySlotContents(int index, @Nullable ItemStack stack) {
        this.slot[index] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        this.markDirty();
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void update() {

    }

    public float getRFPercentage(int i) {
        return rfAmount * i / rfMax;
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return null;
    }

    @Override
    public String getGuiID() {
        return "mmau:quarry";
    }

    @Override
    public String getName() {
        return this.hasCustomName() ? this.localizedName : "container.chicken_block";
    }

    @Override
    public boolean hasCustomName() {
        return this.localizedName != null && this.localizedName.length() > 0;
    }
}
