package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ExplosionButton extends Item implements IMMAUBaseItem {

    String name;
    ResourceLocation location;

    public ExplosionButton() {

        String localname = this.name = "button_explosion";

        setCreativeTab(MMAURegistry.MMAUToolsTab);
        setUnlocalizedName("MMAU_" + localname);
        this.location = new ResourceLocation(MMAU.MODID, name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer, EnumHand hand) {

        if (!world.isRemote) {
            double x = entityPlayer.posX;
            double y = entityPlayer.posY;
            double z = entityPlayer.posZ;

            world.newExplosion(entityPlayer, x, y, z, 4F, false, true);//最後の2つは､燃えるかと､地形破壊


        }

        if (entityPlayer.capabilities.isCreativeMode) {
            return new ActionResult(EnumActionResult.SUCCESS, itemStack);
        }
        itemStack.stackSize--;
        return new ActionResult(EnumActionResult.SUCCESS, itemStack);

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
