package com.sorasuke.MMAU.tileentities;

import com.sorasuke.MMAU.MMAULogger;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

import java.util.Random;

/**
 * ニワトリブロックのTileEntity
 * Created by sora_suke on 2016/11/26.
 */
public class TileEntityChickenBlock extends TileEntity implements ISidedInventory {

    private final ItemStack slot = new ItemStack(Items.egg,0);
    private int workTime;
    private int workMax = 9600;//デバッグのために生産スピードを上げている

    private String localizedName;

    public void updateEntity() {
        Random random = new Random();
        if(random.nextInt(300)==0)this.worldObj.playSoundEffect((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D, "mob.chicken.say", 1.0F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
        if(slot.stackSize<slot.getMaxStackSize())workTime++;
        if (workMax <= workTime) {
            if (!this.getWorldObj().isRemote) slot.stackSize++;
            if (!this.getWorldObj().isRemote) slot.stackSize = slot.getMaxStackSize() < slot.stackSize ? slot.getMaxStackSize() : slot.stackSize;
            workTime = 0;
            this.worldObj.playSoundEffect((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D, "mob.chicken.plop", 1.0F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
            this.markDirty();
        }
        worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);//同期メソッド
    }

    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.workTime = (int)nbt.getShort("workTime");
        this.slot.stackSize = nbt.getInteger("ItemSize");
        if(nbt.hasKey("CustomName")){
            this.localizedName = nbt.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setShort("workTime", (short)this.workTime);

        nbt.setInteger("ItemSize", this.slot.stackSize);
        if(this.hasCustomInventoryName()){
            nbt.setString("CustomName", this.localizedName);
        }
    }


    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        //MMAULogger.log("onDataPacket!");
        readFromNBT(pkt.func_148857_g());
    }

    @Override
    public Packet getDescriptionPacket() {
        //MMAULogger.log("getDescriptionPacket!");
        NBTTagCompound tagCompound = new NBTTagCompound();
        writeToNBT(tagCompound);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tagCompound);
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
        return new int[]{0};
    }

    @Override
    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return false;
    }

    @Override
    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        return true;
    }

    @Override
    public int getSizeInventory() {
        return 1;
    }

    @Override
    public ItemStack getStackInSlot(int slotNumber) {
        if(slot.stackSize <= 0)return null;
        else return slot;
    }

    @Override
    public ItemStack decrStackSize(int slot, int stack) {
        //MMAULogger.log("decrStackSize");
        if(this.slot.stackSize > 0){
            ItemStack itemStack;
            if(this.slot.stackSize <= stack){
                //MMAULogger.log("if(this.slot.stackSize <= stack) true");
                itemStack = this.slot.copy();
                this.slot.stackSize = 0;
                return itemStack;
            }else{
                //MMAULogger.log("if(this.slot.stackSize <= stack) false");
                itemStack = this.slot.splitStack(stack);

                return itemStack;
            }

        }
        return null;    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        if(p_70304_1_ == 0){
            return slot.stackSize < 0 ? null : slot;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {

    }

    @Override
    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.localizedName : "container.chicken_block";
    }

    @Override
    public boolean hasCustomInventoryName() {
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
    public void openInventory() {
        MMAULogger.log("テステス");
    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return true;
    }

    public float getWorkingPercentage(int i){
        return workTime * i /workMax;
    }
}
