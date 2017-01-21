package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class MMAUItems {

    public static Item Negi;
    public static Item NegiPickaxe;
    public static Item NegiSword;
    public static Item NegiAxe;
    public static Item NegiShovel;
    public static Item NegiHoe;
    public static Item NegiHelmet;
    public static Item NegiChestplate;
    public static Item NegiLeggings;
    public static Item NegiBoots;

    public static Item Crystal;
    public static Item CrystalPickaxe;
    public static Item CrystalSword;
    public static Item CrystalAxe;
    public static Item CrystalShovel;
    public static Item CrystalHoe;
    public static Item CrystalHelmet;
    public static Item CrystalChestplate;
    public static Item CrystalLeggings;
    public static Item CrystalBoots;


    public static void registry(MMAU mod) {

        Negi = new Negi();
        final ToolMaterial NEGI = EnumHelper.addToolMaterial("NEGI", 3, 1009, 10.0F, 4.0F, 10)
                .setRepairItem(new ItemStack(Negi));
        NegiPickaxe = new BasePickaxe(NEGI, "negi");
        NegiSword = new BaseSword(NEGI, "negi");
        NegiAxe = new BaseAxe(NEGI, "negi");
        NegiShovel = new BaseShovel(NEGI, "negi");
        NegiHoe = new BaseHoe(NEGI, "negi");
        final ArmorMaterial NEGIARMOR = EnumHelper.addArmorMaterial("NEGI", 31, new int[]{5, 5, 5, 5}, 13);
        NegiHelmet = new NegiArmor(NEGIARMOR, 0, "negi");
        NegiChestplate = new NegiArmor(NEGIARMOR, 1, "negi");
        NegiLeggings = new NegiArmor(NEGIARMOR, 2, "negi");
        NegiBoots = new NegiArmor(NEGIARMOR, 3, "negi");

        Crystal = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "crystal")
                .setTextureName("mmau:crystal");
        GameRegistry.registerItem(Crystal, "crystal");
        OreDictionary.registerOre("gemCrystal", new ItemStack(Crystal, 1, 0));
        final ToolMaterial CRYSTAL = EnumHelper.addToolMaterial("crystal", 2, 250, 5F, 2F, 18)
                .setRepairItem(new ItemStack(Crystal));
        CrystalPickaxe = new BasePickaxe(CRYSTAL, "crystal");
        CrystalSword = new BaseSword(CRYSTAL, "crystal");
        CrystalAxe = new BaseAxe(CRYSTAL, "crystal");
        CrystalShovel = new BaseShovel(CRYSTAL, "crystal");
        CrystalHoe = new BaseHoe(CRYSTAL, "crystal");
        final ArmorMaterial CRYSTALARMOR = EnumHelper.addArmorMaterial("CRYSTAL", 18, new int[]{3, 5, 4, 2}, 13);
        CrystalHelmet = new CrystalArmor(CRYSTALARMOR, 0, "crystal");
        CrystalChestplate = new CrystalArmor(CRYSTALARMOR, 1, "crystal");
        CrystalLeggings = new CrystalArmor(CRYSTALARMOR, 2, "crystal");
        CrystalBoots = new CrystalArmor(CRYSTALARMOR, 3, "crystal");


    }

}
