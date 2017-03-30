package com.sorasuke.MMAU;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.sorasuke.MMAU.blocks.*;
import com.sorasuke.MMAU.items.*;
import com.sorasuke.MMAU.items.upgrades.IUpgrade;
import com.sorasuke.MMAU.items.upgrades.UpgradeBase;
import com.sorasuke.MMAU.tileentities.TileEntityChickenBlock;
import com.sorasuke.MMAU.tileentities.TileEntityChickenHead;
import com.sorasuke.MMAU.tileentities.TileEntityGuidanceMarker;
import com.sorasuke.MMAU.tileentities.TileEntityQuarry;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by sora_suke on 2016/11/18.
 */
public class MMAURegistry {


    //クリエイティブタブ

    public static final CreativeTabs MMAUTab = new CreativeTabs("mmautab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {

            return MMAURegistry.Negi;
        }
    };

    public static final CreativeTabs MMAUToolsTab = new CreativeTabs("mmautoolstab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {

            return MMAURegistry.NegiPickaxe;
        }
    };

    public static final CreativeTabs MMAUUtilsTab = new CreativeTabs("mmauutilstab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {

            return Item.getItemFromBlock(MMAURegistry.ChickenBlock);
        }
    };


    //アイテム類

    //マテリアル

    //インゴット/ジェム系
    public static final Item Negi = new MMAUBaseItem("negi") {
        @SuppressWarnings({"unchecked", "rawtypes"})
        @Override
        @SideOnly(Side.CLIENT)
        public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean advanced) {
            list.add(ChatFormatting.GREEN + I18n.format("text.negi.tooltip", null));
        }
    }.setCreativeTab(MMAUTab).setFull3D();
    public static final Item Crystal = new MMAUBaseItem("crystal").setCreativeTab(MMAUTab);
    public static final Item Bronze = new MMAUBaseItem("bronze").setCreativeTab(MMAUTab);
    public static final Item Cobalt = new MMAUBaseItem("cobalt").setCreativeTab(MMAUTab);
    public static final Item Orichalcum = new MMAUBaseItem("orichalcum") {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    }.setCreativeTab(MMAUTab);
    public static final Item Silver = new MMAUBaseItem("silver") {
        @SuppressWarnings({"unchecked", "rawtypes"})
        @Override
        @SideOnly(Side.CLIENT)
        public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean advanced) {
            list.add(ChatFormatting.AQUA + I18n.format("text.silver.tooltip", null));
        }
    }.setCreativeTab(MMAUTab);
    public static final Item Platinum = new MMAUBaseItem("platinum").setCreativeTab(MMAUTab);
    public static final Item Steel = new MMAUBaseItem("steel").setCreativeTab(MMAUTab);
    public static final Item Copper = new MMAUBaseItem("copper").setCreativeTab(MMAUTab);
    public static final Item Tin = new MMAUBaseItem("tin").setCreativeTab(MMAUTab);
    public static final Item Brass = new MMAUBaseItem("brass").setCreativeTab(MMAUTab);
    public static final Item Lead = new MMAUBaseItem("lead").setCreativeTab(MMAUTab);
    public static final Item Zinc = new MMAUBaseItem("zinc").setCreativeTab(MMAUTab);

    //ナゲット
    public static final Item BronzeNugget = new MMAUBaseItem("bronze_nugget").setCreativeTab(MMAUTab);
    public static final Item CobaltNugget = new MMAUBaseItem("cobalt_nugget").setCreativeTab(MMAUTab);
    public static final Item OrichalcumNugget = new MMAUBaseItem("orichalcum_nugget") {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    }.setCreativeTab(MMAUTab);
    public static final Item SilverNugget = new MMAUBaseItem("silver_nugget").setCreativeTab(MMAUTab);
    public static final Item PlatinumNugget = new MMAUBaseItem("platinum_nugget").setCreativeTab(MMAUTab);
    public static final Item SteelNugget = new MMAUBaseItem("steel_nugget").setCreativeTab(MMAUTab);
    public static final Item CopperNugget = new MMAUBaseItem("copper_nugget").setCreativeTab(MMAUTab);
    public static final Item TinNugget = new MMAUBaseItem("tin_nugget").setCreativeTab(MMAUTab);
    public static final Item BrassNugget = new MMAUBaseItem("brass_nugget").setCreativeTab(MMAUTab);
    public static final Item LeadNugget = new MMAUBaseItem("lead_nugget").setCreativeTab(MMAUTab);
    public static final Item ZincNugget = new MMAUBaseItem("zinc_nugget").setCreativeTab(MMAUTab);
    public static final Item IronNugget = new MMAUBaseItem("iron_nugget").setCreativeTab(MMAUTab);

    //粉
    public static final Item BronzeDust = new MMAUBaseItem("bronze_dust").setCreativeTab(MMAUTab);
    public static final Item CobaltDust = new MMAUBaseItem("cobalt_dust").setCreativeTab(MMAUTab);
    public static final Item OrichalcumDust = new MMAUBaseItem("orichalcum_dust") {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    }.setCreativeTab(MMAUTab);
    public static final Item SilverDust = new MMAUBaseItem("silver_dust").setCreativeTab(MMAUTab);
    public static final Item PlatinumDust = new MMAUBaseItem("platinum_dust").setCreativeTab(MMAUTab);
    public static final Item SteelDust = new MMAUBaseItem("steel_dust").setCreativeTab(MMAUTab);
    public static final Item CopperDust = new MMAUBaseItem("copper_dust").setCreativeTab(MMAUTab);
    public static final Item TinDust = new MMAUBaseItem("tin_dust").setCreativeTab(MMAUTab);
    public static final Item BrassDust = new MMAUBaseItem("brass_dust").setCreativeTab(MMAUTab);
    public static final Item LeadDust = new MMAUBaseItem("lead_dust").setCreativeTab(MMAUTab);
    public static final Item ZincDust = new MMAUBaseItem("zinc_dust").setCreativeTab(MMAUTab);
    public static final Item IronDust = new MMAUBaseItem("iron_dust").setCreativeTab(MMAUTab);
    public static final Item GoldDust = new MMAUBaseItem("gold_dust").setCreativeTab(MMAUTab);
    public static final Item CoalDust = new MMAUBaseItem("coal_dust").setCreativeTab(MMAUTab);

    //板
    public static final Item BronzePlate = new MMAUBaseItem("bronze_plate").setCreativeTab(MMAUTab);
    public static final Item CobaltPlate = new MMAUBaseItem("cobalt_plate").setCreativeTab(MMAUTab);
    public static final Item OrichalcumPlate = new MMAUBaseItem("orichalcum_plate") {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    }.setCreativeTab(MMAUTab);
    public static final Item SilverPlate = new MMAUBaseItem("silver_plate").setCreativeTab(MMAUTab);
    public static final Item PlatinumPlate = new MMAUBaseItem("platinum_plate").setCreativeTab(MMAUTab);
    public static final Item SteelPlate = new MMAUBaseItem("steel_plate").setCreativeTab(MMAUTab);
    public static final Item CopperPlate = new MMAUBaseItem("copper_plate").setCreativeTab(MMAUTab);
    public static final Item TinPlate = new MMAUBaseItem("tin_plate").setCreativeTab(MMAUTab);
    public static final Item BrassPlate = new MMAUBaseItem("brass_plate").setCreativeTab(MMAUTab);
    public static final Item LeadPlate = new MMAUBaseItem("lead_plate").setCreativeTab(MMAUTab);
    public static final Item ZincPlate = new MMAUBaseItem("zinc_plate").setCreativeTab(MMAUTab);
    public static final Item IronPlate = new MMAUBaseItem("iron_plate").setCreativeTab(MMAUTab);
    public static final Item GoldPlate = new MMAUBaseItem("gold_plate").setCreativeTab(MMAUTab);
    //ツール系

    //ツールマテリアルの登録
    public static final ToolMaterial NEGI = EnumHelper.addToolMaterial("NEGI", 3, 1009, 10.0F, 4.0F, 10)
            .setRepairItem(new ItemStack(Negi));
    public static final ToolMaterial CRYSTAL = EnumHelper.addToolMaterial("CRYSTAL", 2, 250, 5F, 2F, 18)
            .setRepairItem(new ItemStack(Crystal));
    public static final ToolMaterial BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 230, 5.5F, 2F, 13)
            .setRepairItem(new ItemStack(Bronze));
    public static final ToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 3, 1500, 7.5F, 4.0F, 12)
            .setRepairItem(new ItemStack(Cobalt));
    public static final ToolMaterial ORICHALCUM = EnumHelper.addToolMaterial("ORICHALCUM", 5, 8192, 32F, 28F, 42)
            .setRepairItem(new ItemStack(Orichalcum));
    public static final ToolMaterial SILVER = EnumHelper.addToolMaterial("SILVER", 1, 82, 15.0F, 1.0F, 30)
            .setRepairItem(new ItemStack(Silver));
    public static final ToolMaterial PLATINUM = EnumHelper.addToolMaterial("PLATINUM", 2, 230, 5.5F, 2.0F, 21)
            .setRepairItem(new ItemStack(Platinum));
    public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 3, 1500, 7.0F, 3F, 9)
            .setRepairItem(new ItemStack(Steel));

    //アーマーマテリアル
    public static final ArmorMaterial NEGIARMOR = EnumHelper.addArmorMaterial
            ("Negi", MMAU.MODID + ":negi", 18, new int[]{5, 5, 5, 5}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3);
    public static final ArmorMaterial CRYSTALARMOR = EnumHelper.addArmorMaterial
            ("Crystal", MMAU.MODID + ":crystal", 18, new int[]{3, 5, 4, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
    public static final ArmorMaterial BRONZEARMOR = EnumHelper.addArmorMaterial
            ("Bronze", MMAU.MODID + ":bronze", 13, new int[]{2, 6, 5, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
    public static final ArmorMaterial COBALTARMOR = EnumHelper.addArmorMaterial
            ("Cobalt", MMAU.MODID + ":cobalt", 33, new int[]{3, 8, 6, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
    public static final ArmorMaterial ORICHALCUMARMOR = EnumHelper.addArmorMaterial
            ("Orichalcum", MMAU.MODID + ":orichalcum", 256, new int[]{5, 5, 5, 5}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5);
    public static final ArmorMaterial SILVERARMOR = EnumHelper.addArmorMaterial
            ("Silver", MMAU.MODID + ":silver", 20, new int[]{3, 6, 4, 2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
    public static final ArmorMaterial PLATINUMARMOR = EnumHelper.addArmorMaterial
            ("Platinum", MMAU.MODID + ":platinum", 14, new int[]{2, 6, 5, 2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
    public static final ArmorMaterial STEELARMOR = EnumHelper.addArmorMaterial
            ("Steel", MMAU.MODID + ":steel", 32, new int[]{3, 8, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);


    //ネギツール
    public static final Item NegiPickaxe = new MMAUBasePickaxe(NEGI, "negi");
    public static final Item NegiSword = new MMAUBaseSword(NEGI, "negi");
    public static final Item NegiAxe = new MMAUBaseAxe(NEGI, "negi");
    public static final Item NegiShovel = new MMAUBaseShovel(NEGI, "negi");
    public static final Item NegiHoe = new MMAUBaseHoe(NEGI, "negi");
    public static final Item NegiHelmet = new MMAUBaseArmor(NEGIARMOR, 0, "negi", Negi);
    public static final Item NegiChestplate = new MMAUBaseArmor(NEGIARMOR, 1, "negi", Negi);
    public static final Item NegiLeggings = new MMAUBaseArmor(NEGIARMOR, 2, "negi", Negi);
    public static final Item NegiBoots = new MMAUBaseArmor(NEGIARMOR, 3, "negi", Negi);

    //クリスタルツール
    public static final Item CrystalPickaxe = new MMAUBasePickaxe(CRYSTAL, "crystal");
    public static final Item CrystalSword = new MMAUBaseSword(CRYSTAL, "crystal");
    public static final Item CrystalAxe = new MMAUBaseAxe(CRYSTAL, "crystal");
    public static final Item CrystalShovel = new MMAUBaseShovel(CRYSTAL, "crystal");
    public static final Item CrystalHoe = new MMAUBaseHoe(CRYSTAL, "crystal");
    public static final Item CrystalHelmet = new MMAUBaseArmor(CRYSTALARMOR, 0, "crystal", Crystal);
    public static final Item CrystalChestplate = new MMAUBaseArmor(CRYSTALARMOR, 1, "crystal", Crystal);
    public static final Item CrystalLeggings = new MMAUBaseArmor(CRYSTALARMOR, 2, "crystal", Crystal);
    public static final Item CrystalBoots = new MMAUBaseArmor(CRYSTALARMOR, 3, "crystal", Crystal);

    //ブロンズツール
    public static final Item BronzePickaxe = new MMAUBasePickaxe(BRONZE, "bronze");
    public static final Item BronzeSword = new MMAUBaseSword(BRONZE, "bronze");
    public static final Item BronzeAxe = new MMAUBaseAxe(BRONZE, "bronze");
    public static final Item BronzeShovel = new MMAUBaseShovel(BRONZE, "bronze");
    public static final Item BronzeHoe = new MMAUBaseHoe(BRONZE, "bronze");
    public static final Item BronzeHelmet = new MMAUBaseArmor(BRONZEARMOR, 0, "bronze", Bronze);
    public static final Item BronzeChestplate = new MMAUBaseArmor(BRONZEARMOR, 1, "bronze", Bronze);
    public static final Item BronzeLeggings = new MMAUBaseArmor(BRONZEARMOR, 2, "bronze", Bronze);
    public static final Item BronzeBoots = new MMAUBaseArmor(BRONZEARMOR, 3, "bronze", Bronze);

    //コバルトツール
    public static final Item CobaltPickaxe = new MMAUBasePickaxe(COBALT, "cobalt");
    public static final Item CobaltSword = new MMAUBaseSword(COBALT, "cobalt");
    public static final Item CobaltAxe = new MMAUBaseAxe(COBALT, "cobalt");
    public static final Item CobaltShovel = new MMAUBaseShovel(COBALT, "cobalt");
    public static final Item CobaltHoe = new MMAUBaseHoe(COBALT, "cobalt");
    public static final Item CobaltHelmet = new MMAUBaseArmor(COBALTARMOR, 0, "cobalt", Cobalt);
    public static final Item CobaltChestplate = new MMAUBaseArmor(COBALTARMOR, 1, "cobalt", Cobalt);
    public static final Item CobaltLeggings = new MMAUBaseArmor(COBALTARMOR, 2, "cobalt", Cobalt);
    public static final Item CobaltBoots = new MMAUBaseArmor(COBALTARMOR, 3, "cobalt", Cobalt);

    //オリハルコンツール
    public static final Item OrichalcumPickaxe = new MMAUBasePickaxe(ORICHALCUM, "orichalcum") {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    };
    public static final Item OrichalcumSword = new MMAUBaseSword(ORICHALCUM, "orichalcum") {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    };
    public static final Item OrichalcumAxe = new MMAUBaseAxe(ORICHALCUM, "orichalcum") {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    };
    public static final Item OrichalcumShovel = new MMAUBaseShovel(ORICHALCUM, "orichalcum") {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    };
    public static final Item OrichalcumHoe = new MMAUBaseHoe(ORICHALCUM, "orichalcum") {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    };
    public static final Item OrichalcumHelmet = new MMAUBaseArmor(ORICHALCUMARMOR, 0, "orichalcum", Orichalcum) {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    };
    public static final Item OrichalcumChestplate = new MMAUBaseArmor(ORICHALCUMARMOR, 1, "orichalcum", Orichalcum) {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    };
    public static final Item OrichalcumLeggings = new MMAUBaseArmor(ORICHALCUMARMOR, 2, "orichalcum", Orichalcum) {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    };
    public static final Item OrichalcumBoots = new MMAUBaseArmor(ORICHALCUMARMOR, 3, "orichalcum", Orichalcum) {
        @Override
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack p_77636_1_) {
            return true;
        }
    };

    //銀ツール
    public static final Item SilverPickaxe = new MMAUBasePickaxe(SILVER, "silver");
    public static final Item SilverSword = new MMAUBaseSword(SILVER, "silver");
    public static final Item SilverAxe = new MMAUBaseAxe(SILVER, "silver");
    public static final Item SilverShovel = new MMAUBaseShovel(SILVER, "silver");
    public static final Item SilverHoe = new MMAUBaseHoe(SILVER, "silver");
    public static final Item SilverHelmet = new MMAUBaseArmor(SILVERARMOR, 0, "silver", Silver);
    public static final Item SilverChestplate = new MMAUBaseArmor(SILVERARMOR, 1, "silver", Silver);
    public static final Item SilverLeggings = new MMAUBaseArmor(SILVERARMOR, 2, "silver", Silver);
    public static final Item SilverBoots = new MMAUBaseArmor(SILVERARMOR, 3, "silver", Silver);

    //プラチナツール
    public static final Item PlatinumPickaxe = new MMAUBasePickaxe(PLATINUM, "platinum");
    public static final Item PlatinumSword = new MMAUBaseSword(PLATINUM, "platinum");
    public static final Item PlatinumAxe = new MMAUBaseAxe(PLATINUM, "platinum");
    public static final Item PlatinumShovel = new MMAUBaseShovel(PLATINUM, "platinum");
    public static final Item PlatinumHoe = new MMAUBaseHoe(PLATINUM, "platinum");
    public static final Item PlatinumHelmet = new MMAUBaseArmor(PLATINUMARMOR, 0, "platinum", Platinum);
    public static final Item PlatinumChestplate = new MMAUBaseArmor(PLATINUMARMOR, 1, "platinum", Platinum);
    public static final Item PlatinumLeggings = new MMAUBaseArmor(PLATINUMARMOR, 2, "platinum", Platinum);
    public static final Item PlatinumBoots = new MMAUBaseArmor(PLATINUMARMOR, 3, "platinum", Platinum);

    //鋼ツール
    public static final Item SteelPickaxe = new MMAUBasePickaxe(STEEL, "steel");
    public static final Item SteelSword = new MMAUBaseSword(STEEL, "steel");
    public static final Item SteelAxe = new MMAUBaseAxe(STEEL, "steel");
    public static final Item SteelShovel = new MMAUBaseShovel(STEEL, "steel");
    public static final Item SteelHoe = new MMAUBaseHoe(STEEL, "steel");
    public static final Item SteelHelmet = new MMAUBaseArmor(STEELARMOR, 0, "steel", Steel);
    public static final Item SteelChestplate = new MMAUBaseArmor(STEELARMOR, 1, "steel", Steel);
    public static final Item SteelLeggings = new MMAUBaseArmor(STEELARMOR, 2, "steel", Steel);
    public static final Item SteelBoots = new MMAUBaseArmor(STEELARMOR, 3, "steel", Steel);

    //工具
    public static final Item IronMortar = new MMAUBaseTool("iron", "mortar", 127);

    //便利アイテム
    public static final Item ExplosionButton = new ExplosionButton();

    public static final Item UpgradeBlank = new UpgradeBase("blank", 0);
    public static final Item UpgradeVoid = new UpgradeBase("void", 0);
    public static final Item UpgradeSpeed = new UpgradeBase("speed", 3);
    public static final Item UpgradeEnergy = new UpgradeBase("energy", 3);

    public static final ArmorMaterial SCP081Jp = EnumHelper.addArmorMaterial
            ("SCP081JP", MMAU.MODID + ":scp081jp", 32000, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
    public static final Item SCP081JP = new SCP081JP(SCP081Jp, 2, "scp081jp");


    //ブロック
    public static final Block NegiOre = new MMAUBaseGemOre("negi_ore", new ItemStack(Negi), 3).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block NegiBlock = new MMAUBaseBlock(Material.IRON, "negi_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block CrystalOre = new MMAUBaseGemOre("crystal_ore", new ItemStack(Crystal), 1).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block CrystalBlock = new MMAUBaseBlock(Material.GLASS, "crystal_block", "pickaxe", 1, SoundType.GLASS).setCreativeTab(MMAUTab).setHardness(0.5F).setResistance(0.8F);

    public static final Block BronzeBlock = new MMAUBaseBlock(Material.IRON, "bronze_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block CobaltOre = new MMAUBaseOre("cobalt_ore", 3).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block CobaltBlock = new MMAUBaseBlock(Material.IRON, "cobalt_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block CopperOre = new MMAUBaseOre("copper_ore", 1).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block CopperBlock = new MMAUBaseBlock(Material.IRON, "copper_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block TinOre = new MMAUBaseOre("tin_ore", 1).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block TinBlock = new MMAUBaseBlock(Material.IRON, "tin_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block OrichalcumOre = new MMAUBaseOre("orichalcum_ore", 3).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block OrichalcumBlock = new MMAUBaseBlock(Material.IRON, "orichalcum_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(600.0F);

    public static final Block SilverOre = new MMAUBaseOre("silver_ore", 2).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block SilverBlock = new MMAUBaseBlock(Material.IRON, "silver_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block PlatinumOre = new MMAUBaseOre("platinum_ore", 2).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block PlatinumBlock = new MMAUBaseBlock(Material.IRON, "platinum_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block SteelBlock = new MMAUBaseBlock(Material.IRON, "steel_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block BrassBlock = new MMAUBaseBlock(Material.IRON, "brass_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block LeadOre = new MMAUBaseOre("lead_ore", 1).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block LeadBlock = new MMAUBaseBlock(Material.IRON, "lead_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block ZincOre = new MMAUBaseOre("zinc_ore", 1).setCreativeTab(MMAUTab).setHardness(3.0F).setResistance(5.0F);
    public static final Block ZincBlock = new MMAUBaseBlock(Material.IRON, "zinc_block", "pickaxe", 1, SoundType.METAL).setCreativeTab(MMAUTab).setHardness(5.0F).setResistance(10.0F);

    public static final Block FeatherBlock = new MMAUBaseBlock(Material.CLOTH, "feather_block", SoundType.CLOTH).setCreativeTab(MMAUTab).setHardness(0.8F);

    public static final Block ChickenBlock = new ChickenBlock(Material.CLOTH, "chicken_block").setCreativeTab(MMAUUtilsTab).setHardness(1.0F).setResistance(1.0F);
    public static final Block ChickenHead = new ChickenHead(Material.CLOTH, "chicken_head").setCreativeTab(MMAUUtilsTab).setHardness(1.0F).setResistance(1.0F);

    public static final Block Quarry = new QuarryBlock(Material.IRON, "quarry").setCreativeTab(MMAUUtilsTab).setHardness(5.0F).setResistance(5.0F);
    public static final Block GuidanceMarker = new GuidanceMarker("guidance_marker");

    /**
     * IMMAUBaseItemを継承したアイテムを登録させる
     * いちいちアイテム名入れて書いてGameRegistry書くのめんどくさかったから作った
     * IMMAUBaseItemを継承させれば名前もまとめて扱える
     */
    public static void registerItem(Item mmauBaseItem) {
        registerI(mmauBaseItem, false);
    }

    public static void registerItem(Item mmauBaseItem, boolean isUseSpecialModel) {
        registerI(mmauBaseItem, isUseSpecialModel);
    }

    public static void registerI(Item mmauBaseItem, boolean isUseSpecialModel){
        if (mmauBaseItem instanceof IMMAUBaseItem) {
            GameRegistry.register(mmauBaseItem, ((IMMAUBaseItem) mmauBaseItem).getLocation());
            if(!isUseSpecialModel){

                MMAU.proxy.registerItemModel(mmauBaseItem);
            }
        } else {
            MMAULogger.error(mmauBaseItem.getUnlocalizedName() + " does not inherit IMMAUBaseItem!"); //たぶんこんなこと起きないだろうけど念のため
        }
    }

    /**
     * IMMAUBaseBlockを継承したアイテムを登録させる
     * いちいちブロック名入れて書いてGameRegistry書くのめんどくさかったから作った
     * IMMAUBaseBlockを継承させれば名前もまとめて扱える
     */
    public static void registerBlock(Block mmauBaseblock, boolean isUseSpecialModel) {
        registerB(mmauBaseblock, isUseSpecialModel);
    }

    public static void registerBlock(Block mmauBaseblock) {
        registerB(mmauBaseblock, false);
    }

    private static void registerB(Block mmauBaseblock, boolean isUseSpecialModel){
        if (mmauBaseblock instanceof IMMAUBaseBlock) {
            GameRegistry.register(mmauBaseblock, ((IMMAUBaseBlock) mmauBaseblock).getLocation());
            GameRegistry.register(((IMMAUBaseBlock) mmauBaseblock).getItemBlock(), ((IMMAUBaseBlock) mmauBaseblock).getLocation());
            if(!isUseSpecialModel){

                MMAU.proxy.registerItemBlockModel(mmauBaseblock);
            }
        } else {
            MMAULogger.error(mmauBaseblock.getUnlocalizedName() + " does not inherit IMMAUBaseBlock!"); //たぶんこんなこと起きないだろうけど念のため
        }
    }


    public static void registerMMAU() {

        //アイテムの登録

        //マテリアル

        //インゴット/ジェム系
        registerItem(Negi);
        registerItem(Crystal);
        registerItem(Bronze);
        registerItem(Cobalt);
        registerItem(Orichalcum);
        registerItem(Silver);
        registerItem(Platinum);
        registerItem(Steel);
        registerItem(Copper);
        registerItem(Tin);
        registerItem(Brass);
        registerItem(Lead);
        registerItem(Zinc);

        //ナゲット
        registerItem(BronzeNugget);
        registerItem(CobaltNugget);
        registerItem(OrichalcumNugget);
        registerItem(SilverNugget);
        registerItem(PlatinumNugget);
        registerItem(SteelNugget);
        registerItem(CopperNugget);
        registerItem(TinNugget);
        registerItem(BrassNugget);
        registerItem(LeadNugget);
        registerItem(ZincNugget);
        registerItem(IronNugget);

        //粉
        registerItem(BronzeDust);
        registerItem(CobaltDust);
        registerItem(OrichalcumDust);
        registerItem(SilverDust);
        registerItem(PlatinumDust);
        registerItem(SteelDust);
        registerItem(CopperDust);
        registerItem(TinDust);
        registerItem(BrassDust);
        registerItem(LeadDust);
        registerItem(ZincDust);
        registerItem(IronDust);
        registerItem(GoldDust);
        registerItem(CoalDust);

        //板
        registerItem(BronzePlate);
        registerItem(CobaltPlate);
        registerItem(OrichalcumPlate);
        registerItem(SilverPlate);
        registerItem(PlatinumPlate);
        registerItem(SteelPlate);
        registerItem(CopperPlate);
        registerItem(TinPlate);
        registerItem(BrassPlate);
        registerItem(LeadPlate);
        registerItem(ZincPlate);
        registerItem(IronPlate);
        registerItem(GoldPlate);

        //ツール系
        //ネギツール
        registerItem(NegiPickaxe);
        registerItem(NegiSword);
        registerItem(NegiAxe);
        registerItem(NegiShovel);
        registerItem(NegiHoe);
        registerItem(NegiHelmet);
        registerItem(NegiChestplate);
        registerItem(NegiLeggings);
        registerItem(NegiBoots);

        //クリスタルツール
        registerItem(CrystalPickaxe);
        registerItem(CrystalSword);
        registerItem(CrystalAxe);
        registerItem(CrystalShovel);
        registerItem(CrystalHoe);
        registerItem(CrystalHelmet);
        registerItem(CrystalChestplate);
        registerItem(CrystalLeggings);
        registerItem(CrystalBoots);

        //ブロンズツール
        registerItem(BronzePickaxe);
        registerItem(BronzeSword);
        registerItem(BronzeAxe);
        registerItem(BronzeShovel);
        registerItem(BronzeHoe);
        registerItem(BronzeHelmet);
        registerItem(BronzeChestplate);
        registerItem(BronzeLeggings);
        registerItem(BronzeBoots);

        //コバルトツール
        registerItem(CobaltPickaxe);
        registerItem(CobaltSword);
        registerItem(CobaltAxe);
        registerItem(CobaltShovel);
        registerItem(CobaltHoe);
        registerItem(CobaltHelmet);
        registerItem(CobaltChestplate);
        registerItem(CobaltLeggings);
        registerItem(CobaltBoots);

        //オリハルコンツール
        registerItem(OrichalcumPickaxe);
        registerItem(OrichalcumSword);
        registerItem(OrichalcumAxe);
        registerItem(OrichalcumShovel);
        registerItem(OrichalcumHoe);
        registerItem(OrichalcumHelmet);
        registerItem(OrichalcumChestplate);
        registerItem(OrichalcumLeggings);
        registerItem(OrichalcumBoots);

        //銀ツール
        registerItem(SilverPickaxe);
        registerItem(SilverSword);
        registerItem(SilverAxe);
        registerItem(SilverShovel);
        registerItem(SilverHoe);
        registerItem(SilverHelmet);
        registerItem(SilverChestplate);
        registerItem(SilverLeggings);
        registerItem(SilverBoots);

        //プラチナツール
        registerItem(PlatinumPickaxe);
        registerItem(PlatinumSword);
        registerItem(PlatinumAxe);
        registerItem(PlatinumShovel);
        registerItem(PlatinumHoe);
        registerItem(PlatinumHelmet);
        registerItem(PlatinumChestplate);
        registerItem(PlatinumLeggings);
        registerItem(PlatinumBoots);

        //鋼ツール
        registerItem(SteelPickaxe);
        registerItem(SteelSword);
        registerItem(SteelAxe);
        registerItem(SteelShovel);
        registerItem(SteelHoe);
        registerItem(SteelHelmet);
        registerItem(SteelChestplate);
        registerItem(SteelLeggings);
        registerItem(SteelBoots);

        registerItem(SCP081JP);

        //工具
        registerItem(IronMortar);

        //便利アイテム
        registerItem(ExplosionButton);

        registerItem(UpgradeBlank);
        registerItem(UpgradeVoid);
        registerItem(UpgradeSpeed);
        registerItem(UpgradeEnergy);


        //ブロック
        registerBlock(NegiOre);
        registerBlock(NegiBlock);

        registerBlock(CrystalOre);
        registerBlock(CrystalBlock);

        registerBlock(BronzeBlock);

        registerBlock(CobaltOre);
        registerBlock(CobaltBlock);

        registerBlock(CopperOre);
        registerBlock(CopperBlock);

        registerBlock(TinOre);
        registerBlock(TinBlock);

        registerBlock(OrichalcumOre);
        registerBlock(OrichalcumBlock);

        registerBlock(SilverOre);
        registerBlock(SilverBlock);

        registerBlock(PlatinumOre);
        registerBlock(PlatinumBlock);

        registerBlock(SteelBlock);

        registerBlock(BrassBlock);

        registerBlock(LeadOre);
        registerBlock(LeadBlock);

        registerBlock(ZincOre);
        registerBlock(ZincBlock);

        registerBlock(FeatherBlock);

        registerBlock(ChickenBlock);
        registerBlock(ChickenHead);

        registerBlock(Quarry);

        registerBlock(GuidanceMarker);


        GameRegistry.registerTileEntity(TileEntityChickenBlock.class, "ChickenBlock");
        GameRegistry.registerTileEntity(TileEntityChickenHead.class, "ChickenHead");
        GameRegistry.registerTileEntity(TileEntityQuarry.class, "Quarry");
        GameRegistry.registerTileEntity(TileEntityGuidanceMarker.class, "GuidanceMarker");


    }


}
