package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * 工具のベースクラス
 * Created by sora_suke on 2016/11/19.
 */
public class MMAUBaseTool extends Item implements IMMAUBaseItem {

    private String name;

    /**
     * MMAUの工具
     *
     * @param material   ツールの素材
     * @param toolType   ツールの種類
     * @param durability 耐久
     */
    public MMAUBaseTool(String material, String toolType, int durability) {

        String localname = name = material + "_" + toolType;

        setCreativeTab(MMAURegistry.MMAUToolsTab);
        setUnlocalizedName("MMAU_" + localname);
        setTextureName("mmau:" + localname);
        setMaxDamage(durability);
        setHasSubtypes(false);


    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack item) {
        if (item.getItem() == this) {
            Random rand = Item.itemRand;
            boolean flag = item.attemptDamageItem(1, rand);
            return flag ? null : item;

        }
        return super.getContainerItem(item);

    }

    @Override
    public String getName() {
        return name;
    }
}
