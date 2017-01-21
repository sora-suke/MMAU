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

    //素材とツール系
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

    public static Item Bronze;
    public static Item BronzePickaxe;
    public static Item BronzeSword;
    public static Item BronzeAxe;
    public static Item BronzeShovel;
    public static Item BronzeHoe;
    public static Item BronzeHelmet;
    public static Item BronzeChestplate;
    public static Item BronzeLeggings;
    public static Item BronzeBoots;
    public static Item BronzeNugget;
    public static Item BronzeDust;

    public static Item Cobalt;
    public static Item CobaltPickaxe;
    public static Item CobaltSword;
    public static Item CobaltAxe;
    public static Item CobaltShovel;
    public static Item CobaltHoe;
    public static Item CobaltHelmet;
    public static Item CobaltChestplate;
    public static Item CobaltLeggings;
    public static Item CobaltBoots;
    public static Item CobaltNugget;
    public static Item CobaltDust;

    public static Item Orichalcum;
    public static Item OrichalcumPickaxe;
    public static Item OrichalcumSword;
    public static Item OrichalcumAxe;
    public static Item OrichalcumShovel;
    public static Item OrichalcumHoe;
    public static Item OrichalcumHelmet;
    public static Item OrichalcumChestplate;
    public static Item OrichalcumLeggings;
    public static Item OrichalcumBoots;
    public static Item OrichalcumNugget;
    public static Item OrichalcumDust;

    public static Item Copper;
    public static Item CopperNugget;
    public static Item CopperDust;

    public static Item Tin;
    public static Item TinNugget;
    public static Item TinDust;

    public static Item IronNugget;
    public static Item IronDust;

    public static Item GoldDust;


    public static Item IronMortar;


    public static void registry(MMAU mod) {
        /* 新しいクラス作ってを変数に登録しているのは、そのクラスのコンストラクタ内で登録しているから
		 * ここでGameRegistryはあまり使用してない
		 * 
		 */


        //ネギ系
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


        //クリスタル系
        Crystal = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "crystal")
                .setTextureName("mmau:crystal");
        GameRegistry.registerItem(Crystal, "crystal");
        OreDictionary.registerOre("gemCrystal", new ItemStack(Crystal, 1, 0));
        final ToolMaterial CRYSTAL = EnumHelper.addToolMaterial("CRYSTAL", 2, 250, 5F, 2F, 18)
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


        //青銅系
        Bronze = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "bronze")
                .setTextureName("mmau:bronze");
        GameRegistry.registerItem(Bronze, "bronze");
        OreDictionary.registerOre("ingotBronze", new ItemStack(Bronze, 1, 0));
        final ToolMaterial BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 230, 5.5F, 2F, 13)
                .setRepairItem(new ItemStack(Bronze));
        BronzePickaxe = new BasePickaxe(BRONZE, "bronze");
        BronzeSword = new BaseSword(BRONZE, "bronze");
        BronzeAxe = new BaseAxe(BRONZE, "bronze");
        BronzeShovel = new BaseShovel(BRONZE, "bronze");
        BronzeHoe = new BaseHoe(BRONZE, "bronze");
        final ArmorMaterial BRONZEARMOR = EnumHelper.addArmorMaterial("BRONZE", 13, new int[]{2, 6, 5, 2}, 8);
        BronzeHelmet = new BronzeArmor(BRONZEARMOR, 0, "bronze");
        BronzeChestplate = new BronzeArmor(BRONZEARMOR, 1, "bronze");
        BronzeLeggings = new BronzeArmor(BRONZEARMOR, 2, "bronze");
        BronzeBoots = new BronzeArmor(BRONZEARMOR, 3, "bronze");
        BronzeNugget = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "bronze_nugget")
                .setTextureName("mmau:bronze_nugget");
        GameRegistry.registerItem(BronzeNugget, "bronze_nugget");
        OreDictionary.registerOre("nuggetBronze", new ItemStack(BronzeNugget, 1, 0));
        BronzeDust = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "bronze_dust")
                .setTextureName("mmau:bronze_dust");
        GameRegistry.registerItem(BronzeDust, "bronze_dust");
        OreDictionary.registerOre("dustBronze", new ItemStack(BronzeDust, 1, 0));


        //コバルト系
        Cobalt = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "cobalt")
                .setTextureName("mmau:cobalt");
        GameRegistry.registerItem(Cobalt, "cobalt");
        OreDictionary.registerOre("ingotCobalt", new ItemStack(Cobalt, 1, 0));
        final ToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 3, 1500, 7.5F, 4.0F, 12)
                .setRepairItem(new ItemStack(Cobalt));
        CobaltPickaxe = new BasePickaxe(COBALT, "cobalt");
        CobaltSword = new BaseSword(COBALT, "cobalt");
        CobaltAxe = new BaseAxe(COBALT, "cobalt");
        CobaltShovel = new BaseShovel(COBALT, "cobalt");
        CobaltHoe = new BaseHoe(COBALT, "cobalt");
        final ArmorMaterial COBALTARMOR = EnumHelper.addArmorMaterial("COBALT", 33, new int[]{3, 8, 6, 3}, 12);
        CobaltHelmet = new CobaltArmor(COBALTARMOR, 0, "cobalt");
        CobaltChestplate = new CobaltArmor(COBALTARMOR, 1, "cobalt");
        CobaltLeggings = new CobaltArmor(COBALTARMOR, 2, "cobalt");
        CobaltBoots = new CobaltArmor(COBALTARMOR, 3, "cobalt");
        CobaltNugget = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "cobalt_nugget")
                .setTextureName("mmau:cobalt_nugget");
        GameRegistry.registerItem(CobaltNugget, "cobalt_nugget");
        OreDictionary.registerOre("nuggetCobalt", new ItemStack(CobaltNugget, 1, 0));
        CobaltDust = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "cobalt_dust")
                .setTextureName("mmau:cobalt_dust");
        GameRegistry.registerItem(CobaltDust, "cobalt_dust");
        OreDictionary.registerOre("dustCobalt", new ItemStack(CobaltDust, 1, 0));


        //オリハルコン系
        Orichalcum = new Orichalcum()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "orichalcum")
                .setTextureName("mmau:orichalcum");
        GameRegistry.registerItem(Orichalcum, "orichalcum");
        OreDictionary.registerOre("ingotOrichalcum", new ItemStack(Orichalcum, 1, 0));
        final ToolMaterial ORICHALCUM = EnumHelper.addToolMaterial("ORICHALCUM", 5, 8192, 32F, 28F, 42)
                .setRepairItem(new ItemStack(Orichalcum));
        OrichalcumPickaxe = new BasePickaxe(ORICHALCUM, "orichalcum");
        OrichalcumSword = new BaseSword(ORICHALCUM, "orichalcum");
        OrichalcumAxe = new BaseAxe(ORICHALCUM, "orichalcum");
        OrichalcumShovel = new BaseShovel(ORICHALCUM, "orichalcum");
        OrichalcumHoe = new BaseHoe(ORICHALCUM, "orichalcum");
        final ArmorMaterial ORICHALCUMARMOR = EnumHelper.addArmorMaterial("ORICHALCUM", 256, new int[]{5, 5, 5, 5}, 50);
        OrichalcumHelmet = new OrichalcumArmor(ORICHALCUMARMOR, 0, "orichalcum");
        OrichalcumChestplate = new OrichalcumArmor(ORICHALCUMARMOR, 1, "orichalcum");
        OrichalcumLeggings = new OrichalcumArmor(ORICHALCUMARMOR, 2, "orichalcum");
        OrichalcumBoots = new OrichalcumArmor(ORICHALCUMARMOR, 3, "orichalcum");
        OrichalcumNugget = new OrichalcumNugget()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "orichalcum_nugget")
                .setTextureName("mmau:orichalcum_nugget");
        GameRegistry.registerItem(OrichalcumNugget, "orichalcum_nugget");
        OreDictionary.registerOre("nuggetOrichalcum", new ItemStack(OrichalcumNugget, 1, 0));
        OrichalcumDust = new OrichalcumDust()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "orichalcum_dust")
                .setTextureName("mmau:orichalcum_dust");
        GameRegistry.registerItem(OrichalcumDust, "orichalcum_dust");
        OreDictionary.registerOre("dustOrichalcum", new ItemStack(OrichalcumDust, 1, 0));


        //銅系
        Copper = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "copper")
                .setTextureName("mmau:copper");
        GameRegistry.registerItem(Copper, "copper");
        OreDictionary.registerOre("ingotCopper", new ItemStack(Copper, 1, 0));
        CopperNugget = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "copper_nugget")
                .setTextureName("mmau:copper_nugget");
        GameRegistry.registerItem(CopperNugget, "copper_nugget");
        OreDictionary.registerOre("nuggetCopper", new ItemStack(CopperNugget, 1, 0));
        CopperDust = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "copper_dust")
                .setTextureName("mmau:copper_dust");
        GameRegistry.registerItem(CopperDust, "copper_dust");
        OreDictionary.registerOre("dustCopper", new ItemStack(CopperDust, 1, 0));


        //錫系
        Tin = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "tin")
                .setTextureName("mmau:tin");
        GameRegistry.registerItem(Tin, "tin");
        OreDictionary.registerOre("ingotTin", new ItemStack(Tin, 1, 0));
        TinNugget = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "tin_nugget")
                .setTextureName("mmau:tin_nugget");
        GameRegistry.registerItem(TinNugget, "tin_nugget");
        OreDictionary.registerOre("nuggetTin", new ItemStack(TinNugget, 1, 0));
        TinDust = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "tin_dust")
                .setTextureName("mmau:tin_dust");
        GameRegistry.registerItem(TinDust, "tin_dust");
        OreDictionary.registerOre("dustTin", new ItemStack(TinDust, 1, 0));


        //鉄系
        IronNugget = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "iron_nugget")
                .setTextureName("mmau:iron_nugget");
        GameRegistry.registerItem(IronNugget, "iron_nugget");
        OreDictionary.registerOre("nuggetIron", new ItemStack(IronNugget, 1, 0));

        IronDust = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "iron_dust")
                .setTextureName("mmau:iron_dust");
        GameRegistry.registerItem(IronDust, "iron_dust");
        OreDictionary.registerOre("dustIron", new ItemStack(IronDust, 1, 0));


        //金系
        GoldDust = new Item()
                .setCreativeTab(MMAU.MMAUTAB)
                .setUnlocalizedName("MMAU_" + "gold_dust")
                .setTextureName("mmau:gold_dust");
        GameRegistry.registerItem(GoldDust, "gold_dust");
        OreDictionary.registerOre("dustGold", new ItemStack(GoldDust, 1, 0));


        //工具系
        IronMortar = new IronMortar();


    }

}
