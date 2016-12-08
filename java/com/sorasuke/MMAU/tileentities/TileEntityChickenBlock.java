package com.sorasuke.MMAU.tileentities;

import com.sorasuke.MMAU.MMAULogger;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by sora_suke on 2016/11/26.
 */
public class TileEntityChickenBlock extends TileEntity implements ISidedInventory {

    private ItemStack slot;
    private int workTime;
    private int workMax = 80;//デバッグのために生産スピードを上げている



    public void updateEntity() {
        workTime++;
        if(workMax<=workTime){
            if(slot == null){
                slot = new ItemStack(Items.egg);
                workTime = 0;
            }else if(slot.isItemEqual(new ItemStack(Items.egg)) && slot.getMaxStackSize() > slot.stackSize){
                slot.stackSize++;
                workTime = 0;
            }
        }
        //MMAULogger.log("working!");
    }

    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        if(nbt != null)nbt = new NBTTagCompound();
        this.workMax = nbt.getShort("workTime");
        NBTTagCompound nbt1 = nbt.getCompoundTag("Item");
        this.slot = ItemStack.loadItemStackFromNBT(nbt1);

    }

    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setShort("workTime", (short)this.workTime);

        NBTTagCompound compound = new NBTTagCompound();
        if(this.slot != null)this.slot.writeToNBT(compound);
        nbt.setTag("Item", compound);
        //MMAULogger.log("テステス");

    }


    @Override
    public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
        return new int[0];
    }

    @Override
    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return false;
    }

    @Override
    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        if(p_102008_3_==0){
            return true;
        }
        return false;
    }

    @Override
    public int getSizeInventory() {
        return 1;
    }

    @Override
    public ItemStack getStackInSlot(int p_70301_1_) {
        if(p_70301_1_==0){
            return slot;
        }
        return null;
    }

    @Override
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
        if(this.slot != null){
            ItemStack itemStack;

            if(this.slot.stackSize <= p_70298_2_){
                itemStack = this.slot;
                this.slot = null;
                return itemStack;
            }else{
                itemStack = this.slot.splitStack(p_70298_2_);

                if(this.slot.stackSize == 0){
                    this.slot = null;
                }
                return itemStack;
            }

        }
        return null;    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        if(p_70304_1_ == 0){
            return slot;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {

    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return true;
    }

    @Override
    public void openInventory() {
        MMAULogger.log("テステス");
    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }
}
