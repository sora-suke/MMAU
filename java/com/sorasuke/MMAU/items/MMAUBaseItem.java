package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * Created by sora_suke on 2016/11/19.
 * 無機能アイテム用のベース
 */
public class MMAUBaseItem extends Item implements IMMAUBaseItem {
    private String name;
    private ResourceLocation location;
    private int subtipes;

    public MMAUBaseItem(String name) {
        this.name = name;
        setUnlocalizedName("MMAU_" + name);
        this.location = new ResourceLocation(MMAU.MODID, name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public ResourceLocation getLocation() {
        return this.location;
    }

    @Override
    public int getMaxMetadata() {
        return subtipes;
    }

    @Override
    public void setMaxMetadata(int i) {
        this.setHasSubtypes(i > 0);
        this.subtipes = i;
    }
}
