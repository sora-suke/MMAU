package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import com.sorasuke.MMAU.MMAURegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MMAUBaseArmor extends ItemArmor implements IMMAUBaseItem {

    public String ARMORTYPE[] = {"helmet", "chestplate", "leggings", "boots"};
    private String armorname;
    private Item repair;
    private String name;

    /**
     * @param material   アーマーマテリアル
     * @param type       鎧の部位 0～3 が 頭～足 に対応している
     * @param localname  名前
     * @param repairItem 修復アイテム
     */
    public MMAUBaseArmor(ArmorMaterial material, int type, String localname, Item repairItem) {
        super(material, 0, type);

        this.repair = repairItem;
        armorname = localname;
        localname = this.name = localname + "_" + ARMORTYPE[type];
        setCreativeTab(MMAURegistry.MMAUToolsTab);
        setUnlocalizedName("MMAU_" + localname);
        setTextureName("mmau:" + localname);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.armorType == 2) {
            return "MMAU:textures/models/armor/" + armorname + "_layer_2.png";
        }
        return "MMAU:textures/models/armor/" + armorname + "_layer_1.png";
    }

    @Override
    public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_) {
        return this.repair == p_82789_2_.getItem() ? true : super.getIsRepairable(p_82789_1_, p_82789_2_);
    }

    public String getName() {
        return this.name;
    }

}
