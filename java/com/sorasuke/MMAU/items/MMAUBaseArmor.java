package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class MMAUBaseArmor extends ItemArmor implements IMMAUBaseItem {

    private String ARMORTYPE[] = {"helmet", "chestplate", "leggings", "boots"};
    private String armorName;
    private Item repair;
    private String name;
    private int type;
    private ResourceLocation location;

    /**
     * @param type 0~3がヘルメット~ブーツに対応している
     * 後は引数の名前でわかるよね?
     * */
    public MMAUBaseArmor(ArmorMaterial material, int type, String localname, Item repairItem) {
        super(material, type == 2 ? 2 : 1,
                type == 0 ? EntityEquipmentSlot.HEAD : type == 1 ? EntityEquipmentSlot.CHEST :
                        type == 2 ? EntityEquipmentSlot.LEGS : EntityEquipmentSlot.FEET);
        this.type = type;
        this.repair = repairItem;
        armorName = localname;
        localname = this.name = localname + "_" + ARMORTYPE[type];
        setCreativeTab(MMAURegistry.MMAUToolsTab);
        setUnlocalizedName("MMAU_" + localname);
        this.location = new ResourceLocation(MMAU.MODID, name);
    }

    /*@Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.type == 2) {
            return "MMAU:textures/models/armor/" + armorName + "_layer_2.png";
        }
        return "MMAU:textures/models/armor/" + armorName + "_layer_1.png";
    }*/

    @Override
    public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_) {
        return this.repair == p_82789_2_.getItem() ? true : super.getIsRepairable(p_82789_1_, p_82789_2_);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public ResourceLocation getLocation() {
        return this.location;
    }

}
