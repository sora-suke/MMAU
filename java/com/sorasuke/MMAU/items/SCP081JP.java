package com.sorasuke.MMAU.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

/**
 * Created by sora_suke on 2017/03/25.
 */
public class SCP081JP extends ItemArmor implements IMMAUBaseItem {

    String name;
    ResourceLocation location;

    private boolean isRepair = false;

    public SCP081JP(ArmorMaterial materialIn, int renderIndexIn, String name) {
        super(materialIn, renderIndexIn, EntityEquipmentSlot.LEGS);
        this.name = name;

        setCreativeTab(MMAURegistry.MMAUToolsTab);
        setUnlocalizedName("MMAU_" + this.name);
        this.location = new ResourceLocation(MMAU.MODID, this.name);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean advanced) {
        list.add(I18n.format("text.scp081jp.tooltip", null));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ResourceLocation getLocation() {
        return this.location;
    }
}
