package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

/**
 * Created by sora_suke on 2017/07/23.
 */
public class InformationGoggles extends ItemArmor implements IMMAUBaseItem  {

    String name;
    ResourceLocation location;

    public InformationGoggles(ArmorMaterial materialIn, int renderIndexIn, String name) {
        super(materialIn, renderIndexIn, EntityEquipmentSlot.HEAD);
        this.name = name;

        setCreativeTab(MMAURegistry.MMAUUtilsTab);
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

    @Override
    public int getMaxMetadata() {
        return 0;
    }

    @Override
    public void setMaxMetadata(int i) {

    }
}
