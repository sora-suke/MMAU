package com.sorasuke.MMAU.tileentities;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyReceiver;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.items.upgrades.IUpgrade;
import net.minecraft.block.state.IBlockState;
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
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

import javax.annotation.Nullable;

/**
 * Created by sora_suke on 2017/03/05.
 */
public class TileEntityQuarry extends TileEntityLockable implements ISidedInventory, ITickable, IEnergyReceiver {

    private final ItemStack[] slot = new ItemStack[32];
    private String localizedName;

    private int maxRFAmount = 65535;

    EnergyStorage energyStorage;

    public TileEntityQuarry(){
        this.energyStorage = new EnergyStorage(maxRFAmount);
    }

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
        if (this.hasCustomName()) {
            nbt.setString("CustomName", this.localizedName);
        }
        this.energyStorage.writeToNBT(nbt);
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
        this.energyStorage.readFromNBT(nbt);
    }

    @Override
    @SideOnly(Side.CLIENT)
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
        return new int[]{0,1,2,3,4,5,6,7,8,9
                ,10,11,12,13,14,15,16,17,18,19
                ,20,21,22,23,24,25,26,27,28,29
                ,30,31};
    }

    @Override
    public boolean canInsertItem(int index, @Nullable ItemStack stack, EnumFacing direction) {
        //MMAULogger.log("canInsertItem called! Arguments:int index " + index + ", ItemStack stack " + stack == null?"null":(stack.getItem()) + ", EnumFacing direction" + direction.getName());
        return this.isItemValidForSlot(index, stack);
    }

    @Override
    public boolean canExtractItem(int index, @Nullable ItemStack stack, EnumFacing direction) {
        //MMAULogger.log("canExtractItem called! Arguments:int index " + index + ", ItemStack itemStackIn " + stack == null?"null":(stack.getItem()) + ", EnumFacing direction" + direction.getName());
        return !this.isItemValidForSlot(index, stack);
    }

    @Override
    public int getSizeInventory() {
        return slot.length;
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
        if(index < 5 && stack.getItem() instanceof IUpgrade){
            return true;
        }
        return false;
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
        MMAULogger.log("hoge"+this.energyStorage.getEnergyStored());
        BlockPos pos = this.getPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        IBlockState b = worldObj.getBlockState(pos);

        this.markDirty();
        worldObj.notifyBlockUpdate(pos, b, b, 0);
        worldObj.scheduleBlockUpdate(pos, this.getBlockType(), 0, 0);
    }

    public float getRFPercentage(int i) {
        return getRFAmount() * i / this.getMaxRFAmount();
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



    IItemHandler handler = new SidedInvWrapper(this, null);

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            //MMAULogger.log("hogehoge");
            return (T) handler;
        }

        return super.getCapability(capability, facing);
    }

    public int getRFAmount() {
        return this.energyStorage.getEnergyStored();
    }

    public int getMaxRFAmount() {
        return this.energyStorage.getMaxEnergyStored();
    }

    @Override
    public boolean canConnectEnergy(EnumFacing from) {
        return true;
    }

    @Override
    public int getEnergyStored(EnumFacing from) {
        return energyStorage.getEnergyStored();
    }

    @Override
    public int getMaxEnergyStored(EnumFacing from) {
        return energyStorage.getMaxEnergyStored();
    }

    @Override
    public int receiveEnergy(EnumFacing from, int maxReceive, boolean simulate) {
        return energyStorage.receiveEnergy(maxReceive, simulate);
    }
}
