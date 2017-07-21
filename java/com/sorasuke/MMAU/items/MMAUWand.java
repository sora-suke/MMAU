package com.sorasuke.MMAU.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
import com.sorasuke.MMAU.MMAURegistry;
import com.sorasuke.MMAU.blocks.GuidanceMarker;
import com.sorasuke.MMAU.utils.MMAUGetter;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Set;

/**
 * Created by sora_suke on 2017/03/30.
 *
 * MMAUのツールに使う用のレンチ的な物
 */
public class MMAUWand extends Item implements IMMAUBaseItem {

    String name;
    ResourceLocation location;

    public MMAUWand(String name){
        this.name = name;
        setCreativeTab(MMAURegistry.MMAUToolsTab);
        setUnlocalizedName("MMAU_" + this.name);
        this.location = new ResourceLocation(MMAU.MODID, this.name);
        setFull3D();
        setMaxStackSize(1);
    }

    public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn, EnumHand hand) {
        if(!worldIn.isRemote) {
            NBTTagCompound NBT = stack.getTagCompound();
            NBT = MMAUWand.checkNBT(NBT);

            if (playerIn.isSneaking() && NBT.getBoolean("isRemembering")) {

                NBT.setBoolean("isRemembering", false);
                stack.setTagCompound(NBT);
                MMAU.proxy.chatCoordinateRegisterd(playerIn, null, "message.wand.coordinate.removed", false);

            }
        }
        return new ActionResult(EnumActionResult.SUCCESS, stack);
    }

    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return EnumActionResult.SUCCESS;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean advanced) {
        if(itemstack.hasTagCompound()){
            if(itemstack.getTagCompound().hasKey("isRemembering")){
                if(itemstack.getTagCompound().getBoolean("isRemembering"))list.add(ChatFormatting.GREEN + I18n.format("text.negi.tooltip", null));
            }
        }
    }

    public String getWandType(){
        return "normal";
    }



    public static NBTTagCompound checkNBT(NBTTagCompound nbt){
        if(nbt == null) nbt = new NBTTagCompound();
        if(!nbt.hasKey("isRemembering")) nbt.setBoolean("isRemembering", false);
        if(!nbt.hasKey("memoryX")) nbt.setInteger("memoryX", 0);
        if(!nbt.hasKey("memoryY")) nbt.setInteger("memoryY", 0);
        if(!nbt.hasKey("memoryZ")) nbt.setInteger("memoryZ", 0);
        return nbt;
    }

    public static BlockPos getPos(ItemStack i){

        NBTTagCompound n = checkNBT(i.getTagCompound());
        return new BlockPos(n.getInteger("memoryX"), n.getInteger("memoryY"), n.getInteger("memoryZ"));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ResourceLocation getLocation() {
        return location;
    }

    @Override
    public int getMaxMetadata() {
        return 0;
    }

    @Override
    public void setMaxMetadata(int i) {

    }
}
