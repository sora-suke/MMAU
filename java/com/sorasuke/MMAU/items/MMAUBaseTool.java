package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.util.Random;

/**
 * 工具のベースクラス
 * Created by sora_suke on 2016/11/19.
 */
public class MMAUBaseTool extends Item implements IMMAUBaseItem {

    private String name;
    private ResourceLocation location;

    private boolean isRepair = false;

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
        this.location = new ResourceLocation(MMAU.MODID, name);
        setMaxDamage(durability);
        setHasSubtypes(false);
        setContainerItem(this);
        setMaxStackSize(1);//ウォォーーーーーーッ! これの指定やってなかったアアアアアアアアアア
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return !isRepair;
    }

    @Override
    public ItemStack getContainerItem(ItemStack item) {
        if (item.getItem() == this) {
            Random rand = Item.itemRand;
            boolean flag = item.attemptDamageItem(1, rand);
            return flag ? null : new ItemStack(item.getItem(), 1, item.getMetadata());

        }
        return null;
    }

    @SubscribeEvent
    public void onCrafting(PlayerEvent.ItemCraftedEvent event){
        isRepair = this == event.crafting.getItem();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ResourceLocation getLocation() {
        return this.location;
    }
}
