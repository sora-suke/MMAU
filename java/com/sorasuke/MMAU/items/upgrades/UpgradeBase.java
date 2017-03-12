package com.sorasuke.MMAU.items.upgrades;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAULogger;
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
        //MMAULogger.log("UpgradeBaseConstruct!!");
        this.setUnlocalizedName("MMAU_" + this.name);
        this.setHasSubtypes(subtipe > 0);
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

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        int i = stack.getMetadata();
        return super.getUnlocalizedName() + (this.subtipes > 0 ? "." + i : "");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems)
    {
        if(this.hasSubtypes) {
            for (int i = 0; i < this.subtipes; ++i) {
                subItems.add(new ItemStack(itemIn, 1, i));
            }
        }else{
            subItems.add(new ItemStack(itemIn, 1, 0));
        }
    }

    @Override
    public int getGrade(ItemStack stack) {
        return stack.getMetadata();
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getMaxGrade() {
        return this.subtipes;
    }
}
