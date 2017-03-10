package com.sorasuke.MMAU.items.upgrades;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAURegistry;
import com.sorasuke.MMAU.items.IMMAUBaseItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by sora_suke on 2017/03/08.
 */
public class UpgradeBase extends Item implements IMMAUBaseItem, IUpgrade{

    String name;
    ResourceLocation location;
    int subtipes;
    String type;

    public UpgradeBase(String name, int subtipe) {
        this.name = "upgrade_" + name;
        this.setCreativeTab(MMAURegistry.MMAUUtilsTab);
        this.setUnlocalizedName("MMAU_" + this.name);
        this.setHasSubtypes(subtipe > 0);
        this.setMaxDamage(0);
        this.setMaxStackSize(1);
        this.subtipes = subtipe;
        this.type = name;
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

    public String getUnlocalizedName(ItemStack stack)
    {
        int i = stack.getMetadata();
        return super.getUnlocalizedName() + (this.subtipes > 0 ? "." + i : "");
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems)
    {
        for (int i = 0; i < this.subtipes; ++i)
        {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }

    @Override
    public int getGread(ItemStack stack) {
        return stack.getMetadata();
    }

    @Override
    public String getType() {
        return this.type;
    }
}
