package com.sorasuke.MMAU.tileentities;

import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.utils.MMAUPlaySound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * ニワトリブロックのTileEntity
 * Created by sora_suke on 2016/11/26.
 */
public class TileEntityChickenBlock extends TileEntity implements ISidedInventory {

    private final ItemStack slot = new ItemStack(Items.EGG, 0);
    private int workTime;
    private int workMax = 9600;//デバッグのために生産スピードを上げている

    private String localizedName;

    public void updateEntity() {
        BlockPos pos = this.getPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        Random random = new Random();
        if (random.nextInt(300) == 0)
            MMAUPlaySound.playSound(this.worldObj, pos, "entity.chicken.ambient", SoundCategory.AMBIENT);
        if (slot.stackSize < slot.getMaxStackSize()) workTime++;
        if (workMax <= workTime) {
            if (!this.worldObj.isRemote) slot.stackSize++;
            if (!this.worldObj.isRemote)
                slot.stackSize = slot.getMaxStackSize() < slot.stackSize ? slot.getMaxStackSize() : slot.stackSize;
            workTime = 0;
            MMAUPlaySound.playSound(this.worldObj, pos, "entity.chicken.egg", SoundCategory.AMBIENT);

        }
        this.markDirty();
        worldObj.markBlockRangeForRenderUpdate(pos, pos);
        //worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);//同期メソッド
        //markDityだけでいいのかな?
    }

    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.workTime = (int) nbt.getShort("workTime");
        this.slot.stackSize = nbt.getInteger("ItemSize");
        if (nbt.hasKey("CustomName")) {
            this.localizedName = nbt.getString("CustomName");
        }
    }

    public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setShort("workTime", (short) this.workTime);

        nbt.setInteger("ItemSize", this.slot.stackSize);
        if (this.hasCustomName()) {
            nbt.setString("CustomName", this.localizedName);
        }
        return nbt;
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

    /*@Override
    public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
        return new int[]{0};
    }*/

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return false;
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        return true;
    }

    @Override
    public int getSizeInventory() {
        return 1;
    }

    @Override
    public ItemStack getStackInSlot(int slotNumber) {
        if (slot.stackSize <= 0) return null;
        else return slot;
    }

    @Override
    public ItemStack decrStackSize(int slot, int stack) {
        //MMAULogger.log("decrStackSize");
        if (this.slot.stackSize > 0) {
            ItemStack itemStack;
            if (this.slot.stackSize <= stack) {
                //MMAULogger.log("if(this.slot.stackSize <= stack) true");
                itemStack = this.slot.copy();
                this.slot.stackSize = 0;
                return itemStack;
            } else {
                //MMAULogger.log("if(this.slot.stackSize <= stack) false");
                itemStack = this.slot.splitStack(stack);

                return itemStack;
            }

        }
        return null;
    }

    @Nullable
    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }

    /*@Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        if (p_70304_1_ == 0) {
            return slot.stackSize < 0 ? null : slot;
        }
        return null;
    }*/

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {

    }

    @Override
    public String getName() {
        return this.hasCustomName() ? this.localizedName : "container.chicken_block";
    }

    @Override
    public boolean hasCustomName() {
        return this.localizedName != null && this.localizedName.length() > 0;
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
    public void openInventory(EntityPlayer player) {}

    @Override
    public void closeInventory(EntityPlayer player) {}

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
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

    public float getWorkingPercentage(int i) {
        return workTime * i / workMax;
    }

    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        return new int[0];
    }
}
