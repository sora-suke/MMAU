package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

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
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ResourceLocation getLocation() {
        return location;
    }
}
