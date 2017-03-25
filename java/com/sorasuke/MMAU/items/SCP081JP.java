package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ResourceLocation getLocation() {
        return this.location;
    }
}
