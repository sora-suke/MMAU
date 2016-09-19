package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.Logger;
import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class MMAUItems {

	// 素材とツール系
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
	public static Item BronzePlate;

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
	public static Item CobaltPlate;

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
	public static Item OrichalcumPlate;
	
	public static Item Silver;
	public static Item SilverPickaxe;
	public static Item SilverSword;
	public static Item SilverAxe;
	public static Item SilverShovel;
	public static Item SilverHoe;
	public static Item SilverHelmet;
	public static Item SilverChestplate;
	public static Item SilverLeggings;
	public static Item SilverBoots;
	public static Item SilverNugget;
	public static Item SilverDust;
	public static Item SilverPlate;
	
	public static Item Platinum;
	public static Item PlatinumPickaxe;
	public static Item PlatinumSword;
	public static Item PlatinumAxe;
	public static Item PlatinumShovel;
	public static Item PlatinumHoe;
	public static Item PlatinumHelmet;
	public static Item PlatinumChestplate;
	public static Item PlatinumLeggings;
	public static Item PlatinumBoots;
	public static Item PlatinumNugget;
	public static Item PlatinumDust;
	public static Item PlatinumPlate;
	
	public static Item Steel;
	public static Item SteelPickaxe;
	public static Item SteelSword;
	public static Item SteelAxe;
	public static Item SteelShovel;
	public static Item SteelHoe;
	public static Item SteelHelmet;
	public static Item SteelChestplate;
	public static Item SteelLeggings;
	public static Item SteelBoots;
	public static Item SteelNugget;
	public static Item SteelDust;
	public static Item SteelPlate;

	public static Item Copper;
	public static Item CopperNugget;
	public static Item CopperDust;
	public static Item CopperPlate;

	public static Item Tin;
	public static Item TinNugget;
	public static Item TinDust;
	public static Item TinPlate;
	
	public static Item Brass;
	public static Item BrassNugget;
	public static Item BrassDust;
	public static Item BrassPlate;
	
	public static Item Lead;
	public static Item LeadNugget;
	public static Item LeadDust;
	public static Item LeadPlate;
	
	public static Item Zinc;
	public static Item ZincNugget;
	public static Item ZincDust;
	public static Item ZincPlate;

	public static Item IronNugget;
	public static Item IronDust;
	public static Item IronPlate;

	public static Item GoldDust;
	public static Item GoldPlate;
	
	public static Item CoalDust;

	
	
	public static Item IronMortar;
	
	
	
	public static Item ExplosionButton;
	
	
	

	public static void registry(MMAU mod) {
		/*
		 * 新しいクラス作ってを変数に登録しているのは、そのクラスのコンストラクタ内で登録しているから
		 * ここでGameRegistryはあまり使用してない
		 * 
		 */
		Logger.log("Registry Items!");
		// ネギ系
		Negi = new Negi();
		final ToolMaterial NEGI = EnumHelper.addToolMaterial("NEGI", 3, 1009, 10.0F, 4.0F, 10)
				.setRepairItem(new ItemStack(Negi));
		NegiPickaxe = new BasePickaxe(NEGI, "negi");
		NegiSword = new BaseSword(NEGI, "negi");
		NegiAxe = new BaseAxe(NEGI, "negi");
		NegiShovel = new BaseShovel(NEGI, "negi");
		NegiHoe = new BaseHoe(NEGI, "negi");
		final ArmorMaterial NEGIARMOR = EnumHelper.addArmorMaterial("NEGI", 31, new int[] { 5, 5, 5, 5 }, 13);
		NegiHelmet = new BaseArmor(NEGIARMOR, 0, "negi");
		NegiChestplate = new BaseArmor(NEGIARMOR, 1, "negi");
		NegiLeggings = new BaseArmor(NEGIARMOR, 2, "negi");
		NegiBoots = new BaseArmor(NEGIARMOR, 3, "negi");

		// クリスタル系
		Crystal = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "crystal")
				.setTextureName("mmau:crystal");
		GameRegistry.registerItem(Crystal, "crystal");
		final ToolMaterial CRYSTAL = EnumHelper.addToolMaterial("CRYSTAL", 2, 250, 5F, 2F, 18)
				.setRepairItem(new ItemStack(Crystal));
		CrystalPickaxe = new BasePickaxe(CRYSTAL, "crystal");
		CrystalSword = new BaseSword(CRYSTAL, "crystal");
		CrystalAxe = new BaseAxe(CRYSTAL, "crystal");
		CrystalShovel = new BaseShovel(CRYSTAL, "crystal");
		CrystalHoe = new BaseHoe(CRYSTAL, "crystal");
		final ArmorMaterial CRYSTALARMOR = EnumHelper.addArmorMaterial("CRYSTAL", 18, new int[] { 3, 5, 4, 2 }, 13);
		CrystalHelmet = new BaseArmor(CRYSTALARMOR, 0, "crystal");
		CrystalChestplate = new BaseArmor(CRYSTALARMOR, 1, "crystal");
		CrystalLeggings = new BaseArmor(CRYSTALARMOR, 2, "crystal");
		CrystalBoots = new BaseArmor(CRYSTALARMOR, 3, "crystal");

		// 青銅系
		Bronze = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "bronze")
				.setTextureName("mmau:bronze");
		GameRegistry.registerItem(Bronze, "bronze");

		final ToolMaterial BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 230, 5.5F, 2F, 13)
				.setRepairItem(new ItemStack(Bronze));
		BronzePickaxe = new BasePickaxe(BRONZE, "bronze");
		BronzeSword = new BaseSword(BRONZE, "bronze");
		BronzeAxe = new BaseAxe(BRONZE, "bronze");
		BronzeShovel = new BaseShovel(BRONZE, "bronze");
		BronzeHoe = new BaseHoe(BRONZE, "bronze");
		final ArmorMaterial BRONZEARMOR = EnumHelper.addArmorMaterial("BRONZE", 13, new int[] { 2, 6, 5, 2 }, 8);
		BronzeHelmet = new BaseArmor(BRONZEARMOR, 0, "bronze");
		BronzeChestplate = new BaseArmor(BRONZEARMOR, 1, "bronze");
		BronzeLeggings = new BaseArmor(BRONZEARMOR, 2, "bronze");
		BronzeBoots = new BaseArmor(BRONZEARMOR, 3, "bronze");
		BronzeNugget = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "bronze_nugget")
				.setTextureName("mmau:bronze_nugget");
		GameRegistry.registerItem(BronzeNugget, "bronze_nugget");
		BronzeDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "bronze_dust")
				.setTextureName("mmau:bronze_dust");
		GameRegistry.registerItem(BronzeDust, "bronze_dust");
		BronzePlate = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "bronze_plate")
				.setTextureName("mmau:bronze_plate");
		GameRegistry.registerItem(BronzePlate, "bronze_plate");

		// コバルト系
		Cobalt = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "cobalt")
				.setTextureName("mmau:cobalt");
		GameRegistry.registerItem(Cobalt, "cobalt");
		final ToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 3, 1500, 7.5F, 4.0F, 12)
				.setRepairItem(new ItemStack(Cobalt));
		CobaltPickaxe = new BasePickaxe(COBALT, "cobalt");
		CobaltSword = new BaseSword(COBALT, "cobalt");
		CobaltAxe = new BaseAxe(COBALT, "cobalt");
		CobaltShovel = new BaseShovel(COBALT, "cobalt");
		CobaltHoe = new BaseHoe(COBALT, "cobalt");
		final ArmorMaterial COBALTARMOR = EnumHelper.addArmorMaterial("COBALT", 33, new int[] { 3, 8, 6, 3 }, 12);
		CobaltHelmet = new BaseArmor(COBALTARMOR, 0, "cobalt");
		CobaltChestplate = new BaseArmor(COBALTARMOR, 1, "cobalt");
		CobaltLeggings = new BaseArmor(COBALTARMOR, 2, "cobalt");
		CobaltBoots = new BaseArmor(COBALTARMOR, 3, "cobalt");
		CobaltNugget = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "cobalt_nugget")
				.setTextureName("mmau:cobalt_nugget");
		GameRegistry.registerItem(CobaltNugget, "cobalt_nugget");
		CobaltDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "cobalt_dust")
				.setTextureName("mmau:cobalt_dust");
		GameRegistry.registerItem(CobaltDust, "cobalt_dust");
		CobaltPlate = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "cobalt_plate")
				.setTextureName("mmau:cobalt_plate");
		GameRegistry.registerItem(CobaltPlate, "cobalt_plate");

		// オリハルコン系
		Orichalcum = new Orichalcum().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "orichalcum")
				.setTextureName("mmau:orichalcum");
		GameRegistry.registerItem(Orichalcum, "orichalcum");
		final ToolMaterial ORICHALCUM = EnumHelper.addToolMaterial("ORICHALCUM", 5, 8192, 32F, 28F, 42)
				.setRepairItem(new ItemStack(Orichalcum));
		OrichalcumPickaxe = new BasePickaxe(ORICHALCUM, "orichalcum");
		OrichalcumSword = new BaseSword(ORICHALCUM, "orichalcum");
		OrichalcumAxe = new BaseAxe(ORICHALCUM, "orichalcum");
		OrichalcumShovel = new BaseShovel(ORICHALCUM, "orichalcum");
		OrichalcumHoe = new BaseHoe(ORICHALCUM, "orichalcum");
		final ArmorMaterial ORICHALCUMARMOR = EnumHelper.addArmorMaterial("ORICHALCUM", 256, new int[] { 5, 5, 5, 5 },
				50);
		OrichalcumHelmet = new BaseArmor(ORICHALCUMARMOR, 0, "orichalcum");
		OrichalcumChestplate = new BaseArmor(ORICHALCUMARMOR, 1, "orichalcum");
		OrichalcumLeggings = new BaseArmor(ORICHALCUMARMOR, 2, "orichalcum");
		OrichalcumBoots = new BaseArmor(ORICHALCUMARMOR, 3, "orichalcum");
		OrichalcumNugget = new OrichalcumNugget().setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_" + "orichalcum_nugget").setTextureName("mmau:orichalcum_nugget");
		GameRegistry.registerItem(OrichalcumNugget, "orichalcum_nugget");
		OrichalcumDust = new OrichalcumDust().setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_" + "orichalcum_dust").setTextureName("mmau:orichalcum_dust");
		GameRegistry.registerItem(OrichalcumDust, "orichalcum_dust");
		OrichalcumPlate = new Orichalcum().setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_" + "orichalcum_plate").setTextureName("mmau:orichalcum_plate");
		GameRegistry.registerItem(OrichalcumPlate, "orichalcum_plate");
		
		Silver = new Silver();
		final ToolMaterial SILVER =EnumHelper.addToolMaterial("SILVER", 1, 82, 15.0F, 1.0F, 30)
				.setRepairItem(new ItemStack(Silver));
		SilverPickaxe = new BasePickaxe(SILVER,"silver");
		SilverSword = new BaseSword(SILVER,"silver");
		SilverAxe = new BaseAxe(SILVER,"silver");
		SilverShovel = new BaseShovel(SILVER,"silver");
		SilverHoe = new BaseHoe(SILVER,"silver");
		final ArmorMaterial SILVERARMOR = EnumHelper.addArmorMaterial("SILVER", 20, new int[]{3,6,4,2}, 30);
		SilverHelmet = new BaseArmor(SILVERARMOR, 0, "silver");
		SilverChestplate = new BaseArmor(SILVERARMOR, 1, "silver");
		SilverLeggings = new BaseArmor(SILVERARMOR, 2, "silver");
		SilverBoots = new BaseArmor(SILVERARMOR, 3, "silver");
		SilverNugget = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"silver_nugget")
				.setTextureName("mmau:silver_nugget");
		GameRegistry.registerItem(SilverNugget, "silver_nugget");
		SilverDust = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"silver_dust")
				.setTextureName("mmau:silver_dust");
		GameRegistry.registerItem(SilverDust, "silver_dust");
		SilverPlate = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"silver_plate")
				.setTextureName("mmau:silver_plate");
		GameRegistry.registerItem(SilverPlate, "silver_plate");
		
		//プラチナ
		Platinum = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"platinum")
				.setTextureName("mmau:platinum");
		GameRegistry.registerItem(Platinum, "platinum");
		final ToolMaterial PLATINUM =EnumHelper.addToolMaterial("PLATINUM", 2, 230, 5.5F, 2.0F, 21)
				.setRepairItem(new ItemStack(Platinum));
		PlatinumPickaxe = new BasePickaxe(PLATINUM,"platinum");
		PlatinumSword = new BaseSword(PLATINUM,"platinum");
		PlatinumAxe = new BaseAxe(PLATINUM,"platinum");
		PlatinumShovel = new BaseShovel(PLATINUM,"platinum");
		PlatinumHoe = new BaseHoe(PLATINUM,"platinum");
		final ArmorMaterial PLATINUMARMOR = EnumHelper.addArmorMaterial("PLATINUM", 14, new int[]{2,6,5,2}, 17);
		PlatinumHelmet = new BaseArmor(PLATINUMARMOR, 0, "platinum");
		PlatinumChestplate = new BaseArmor(PLATINUMARMOR, 1, "platinum");
		PlatinumLeggings = new BaseArmor(PLATINUMARMOR, 2, "platinum");
		PlatinumBoots = new BaseArmor(PLATINUMARMOR, 3, "platinum");
		PlatinumNugget = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"platinum_nugget")
				.setTextureName("mmau:platinum_nugget");
		GameRegistry.registerItem(PlatinumNugget, "platinum_nugget");
		PlatinumDust = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"platinum_dust")
				.setTextureName("mmau:platinum_dust");
		GameRegistry.registerItem(PlatinumDust, "platinum_dust");
		PlatinumPlate = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"platinum_plate")
				.setTextureName("mmau:platinum_plate");
		GameRegistry.registerItem(PlatinumPlate, "platinum_plate");
		
		Steel = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"steel")
				.setTextureName("mmau:steel");
		GameRegistry.registerItem(Steel, "steel");
		final ToolMaterial STEEL =EnumHelper.addToolMaterial("STEEL", 3, 1500, 7.0F, 3F, 9)
				.setRepairItem(new ItemStack(Steel));
		SteelPickaxe = new BasePickaxe(STEEL,"steel");
		SteelSword = new BaseSword(STEEL,"steel");
		SteelAxe = new BaseAxe(STEEL,"steel");
		SteelShovel = new BaseShovel(STEEL,"steel");
		SteelHoe = new BaseHoe(STEEL,"steel");
		final ArmorMaterial STEELARMOR = EnumHelper.addArmorMaterial("STEEL", 32, new int[]{3,8,6,3}, 9);
		SteelHelmet = new BaseArmor(STEELARMOR, 0, "steel");
		SteelChestplate = new BaseArmor(STEELARMOR, 1, "steel");
		SteelLeggings = new BaseArmor(STEELARMOR, 2, "steel");
		SteelBoots = new BaseArmor(STEELARMOR, 3, "steel");
		SteelNugget = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"steel_nugget")
				.setTextureName("mmau:steel_nugget");
		GameRegistry.registerItem(SteelNugget, "steel_nugget");
		SteelDust = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"steel_dust")
				.setTextureName("mmau:steel_dust");
		GameRegistry.registerItem(SteelDust, "steel_dust");
		SteelPlate = new Item()
				.setCreativeTab(MMAU.MMAUTAB)
				.setUnlocalizedName("MMAU_"+"steel_plate")
				.setTextureName("mmau:steel_plate");
		GameRegistry.registerItem(SteelPlate, "steel_plate");
		
		// 銅系
		Copper = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "copper")
				.setTextureName("mmau:copper");
		GameRegistry.registerItem(Copper, "copper");
		CopperNugget = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "copper_nugget")
				.setTextureName("mmau:copper_nugget");
		GameRegistry.registerItem(CopperNugget, "copper_nugget");
		CopperDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "copper_dust")
				.setTextureName("mmau:copper_dust");
		GameRegistry.registerItem(CopperDust, "copper_dust");
		CopperPlate = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "copper_plate")
				.setTextureName("mmau:copper_plate");
		GameRegistry.registerItem(CopperPlate, "copper_plate");

		// 錫系
		Tin = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "tin").setTextureName("mmau:tin");
		GameRegistry.registerItem(Tin, "tin");
		TinNugget = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "tin_nugget")
				.setTextureName("mmau:tin_nugget");
		GameRegistry.registerItem(TinNugget, "tin_nugget");
		TinDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "tin_dust")
				.setTextureName("mmau:tin_dust");
		GameRegistry.registerItem(TinDust, "tin_dust");
		TinPlate = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "tin_plate")
				.setTextureName("mmau:tin_plate");
		GameRegistry.registerItem(TinPlate, "tin_plate");
		
		Brass = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "brass").setTextureName("mmau:brass");
		GameRegistry.registerItem(Brass, "brass");
		BrassNugget = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "brass_nugget")
				.setTextureName("mmau:brass_nugget");
		GameRegistry.registerItem(BrassNugget, "brass_nugget");
		BrassDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "brass_dust")
				.setTextureName("mmau:brass_dust");
		GameRegistry.registerItem(BrassDust, "brass_dust");
		BrassPlate = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "brass_plate")
				.setTextureName("mmau:brass_plate");
		GameRegistry.registerItem(BrassPlate, "brass_plate");
		
		Lead = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "lead").setTextureName("mmau:lead");
		GameRegistry.registerItem(Lead, "lead");
		LeadNugget = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "lead_nugget")
				.setTextureName("mmau:lead_nugget");
		GameRegistry.registerItem(LeadNugget, "lead_nugget");
		LeadDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "lead_dust")
				.setTextureName("mmau:lead_dust");
		GameRegistry.registerItem(LeadDust, "lead_dust");
		LeadPlate = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "lead_plate")
				.setTextureName("mmau:lead_plate");
		GameRegistry.registerItem(LeadPlate, "lead_plate");
		
		Zinc = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "zinc").setTextureName("mmau:zinc");
		GameRegistry.registerItem(Zinc, "zinc");
		ZincNugget = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "zinc_nugget")
				.setTextureName("mmau:zinc_nugget");
		GameRegistry.registerItem(ZincNugget, "zinc_nugget");
		ZincDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "zinc_dust")
				.setTextureName("mmau:zinc_dust");
		GameRegistry.registerItem(ZincDust, "zinc_dust");
		ZincPlate = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "zinc_plate")
				.setTextureName("mmau:zinc_plate");
		GameRegistry.registerItem(ZincPlate, "zinc_plate");

		// 鉄系
		IronNugget = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "iron_nugget")
				.setTextureName("mmau:iron_nugget");
		GameRegistry.registerItem(IronNugget, "iron_nugget");

		IronDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "iron_dust")
				.setTextureName("mmau:iron_dust");
		GameRegistry.registerItem(IronDust, "iron_dust");
		IronPlate = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "iron_plate")
				.setTextureName("mmau:iron_plate");
		GameRegistry.registerItem(IronPlate, "iron_plate");

		// 金系
		GoldDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "gold_dust")
				.setTextureName("mmau:gold_dust");
		GameRegistry.registerItem(GoldDust, "gold_dust");
		GoldPlate = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "gold_plate")
				.setTextureName("mmau:gold_plate");
		GameRegistry.registerItem(GoldPlate, "gold_plate");
		
		// その他
		CoalDust = new Item().setCreativeTab(MMAU.MMAUTAB).setUnlocalizedName("MMAU_" + "coal_dust")
				.setTextureName("mmau:coal_dust");
		GameRegistry.registerItem(CoalDust, "coal_dust");

		// 工具系
		IronMortar = new Mortar("iron", 127);
		
		
		ExplosionButton = new ExplosionButton();

	}

}
