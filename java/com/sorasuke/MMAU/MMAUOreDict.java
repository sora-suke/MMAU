package com.sorasuke.MMAU;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MMAUOreDict {

    public static void registry(MMAU mod) {
        /*
        registerMaterialsOreDictionary("null", new ItemStack(MMAURegistry.Null), new ItemStack(MMAURegistry.NullNugget), new ItemStack(MMAURegistry.NullDust)
             , new ItemStack(MMAURegistry.NullOre), new ItemStack(MMAURegistry.NullBlock), new ItemStack(MMAURegistry.NullPlate), 0);
         */
        registerMaterialsOreDictionary("Negi", new ItemStack(MMAURegistry.Negi), null, null
                , new ItemStack(MMAURegistry.NegiOre), new ItemStack(MMAURegistry.NegiBlock), null, 1);
        registerMaterialsOreDictionary("Crystal", new ItemStack(MMAURegistry.Crystal), null, null
                , new ItemStack(MMAURegistry.CrystalOre), new ItemStack(MMAURegistry.CrystalBlock), null, 1);
        registerMaterialsOreDictionary("Bronze", new ItemStack(MMAURegistry.Bronze), new ItemStack(MMAURegistry.BronzeNugget), new ItemStack(MMAURegistry.BronzeDust)
                , null, new ItemStack(MMAURegistry.BronzeBlock), new ItemStack(MMAURegistry.BronzePlate), 0);
        registerMaterialsOreDictionary("Cobalt", new ItemStack(MMAURegistry.Cobalt), new ItemStack(MMAURegistry.CobaltNugget), new ItemStack(MMAURegistry.CobaltDust)
                , new ItemStack(MMAURegistry.CobaltOre), new ItemStack(MMAURegistry.CobaltBlock), new ItemStack(MMAURegistry.CobaltPlate), 0);
        registerMaterialsOreDictionary("Orichalcum", new ItemStack(MMAURegistry.Orichalcum), new ItemStack(MMAURegistry.OrichalcumNugget), new ItemStack(MMAURegistry.OrichalcumDust)
                , new ItemStack(MMAURegistry.OrichalcumOre), new ItemStack(MMAURegistry.OrichalcumBlock), new ItemStack(MMAURegistry.OrichalcumPlate), 0);
        registerMaterialsOreDictionary("Copper", new ItemStack(MMAURegistry.Copper), new ItemStack(MMAURegistry.CopperNugget), new ItemStack(MMAURegistry.CopperDust)
                , new ItemStack(MMAURegistry.CopperOre), new ItemStack(MMAURegistry.CopperBlock), new ItemStack(MMAURegistry.CopperPlate), 0);
        registerMaterialsOreDictionary("Tin", new ItemStack(MMAURegistry.Tin), new ItemStack(MMAURegistry.TinNugget), new ItemStack(MMAURegistry.TinDust)
                , new ItemStack(MMAURegistry.TinOre), new ItemStack(MMAURegistry.TinBlock), new ItemStack(MMAURegistry.TinPlate), 0);
        registerMaterialsOreDictionary("Silver", new ItemStack(MMAURegistry.Silver), new ItemStack(MMAURegistry.SilverNugget), new ItemStack(MMAURegistry.SilverDust)
                , new ItemStack(MMAURegistry.SilverOre), new ItemStack(MMAURegistry.SilverBlock), new ItemStack(MMAURegistry.SilverPlate), 0);
        registerMaterialsOreDictionary("Platinum", new ItemStack(MMAURegistry.Platinum), new ItemStack(MMAURegistry.PlatinumNugget), new ItemStack(MMAURegistry.PlatinumDust)
                , new ItemStack(MMAURegistry.PlatinumOre), new ItemStack(MMAURegistry.PlatinumBlock), new ItemStack(MMAURegistry.PlatinumPlate), 0);
        registerMaterialsOreDictionary("Steel", new ItemStack(MMAURegistry.Steel), new ItemStack(MMAURegistry.SteelNugget), new ItemStack(MMAURegistry.SteelDust)
                , null, new ItemStack(MMAURegistry.SteelBlock), new ItemStack(MMAURegistry.SteelPlate), 0);
        registerMaterialsOreDictionary("Brass", new ItemStack(MMAURegistry.Brass), new ItemStack(MMAURegistry.BrassNugget), new ItemStack(MMAURegistry.BrassDust)
                , null, new ItemStack(MMAURegistry.BrassBlock), new ItemStack(MMAURegistry.BrassPlate), 0);
        registerMaterialsOreDictionary("Lead", new ItemStack(MMAURegistry.Lead), new ItemStack(MMAURegistry.LeadNugget), new ItemStack(MMAURegistry.LeadDust)
                , new ItemStack(MMAURegistry.LeadOre), new ItemStack(MMAURegistry.LeadBlock), new ItemStack(MMAURegistry.LeadPlate), 0);
        registerMaterialsOreDictionary("Zinc", new ItemStack(MMAURegistry.Zinc), new ItemStack(MMAURegistry.ZincNugget), new ItemStack(MMAURegistry.ZincDust)
                , new ItemStack(MMAURegistry.ZincOre), new ItemStack(MMAURegistry.ZincBlock), new ItemStack(MMAURegistry.ZincPlate), 0);

        OreDictionary.registerOre("nuggetIron", new ItemStack(MMAURegistry.IronNugget));
        OreDictionary.registerOre("dustIron", new ItemStack(MMAURegistry.IronDust));
        OreDictionary.registerOre("plateIron", new ItemStack(MMAURegistry.IronPlate));

        OreDictionary.registerOre("dustGold", new ItemStack(MMAURegistry.GoldDust));
        OreDictionary.registerOre("plateGold", new ItemStack(MMAURegistry.GoldPlate));

        OreDictionary.registerOre("dustCoal", new ItemStack(MMAURegistry.CoalDust));

        OreDictionary.registerOre("craftingToolMotor", new ItemStack(MMAURegistry.IronMortar, 1, 32767));


    }

    /**
     * マテリアルの鉱石辞書を一括で登録する
     * typeは､0でインゴット､1で宝石
     *
     * @param materialName
     * @param material
     * @param nugget
     * @param dust
     * @param ore
     * @param block
     * @param plate
     * @param type
     */
    public static void registerMaterialsOreDictionary(String materialName, ItemStack material, ItemStack nugget, ItemStack dust, ItemStack ore, ItemStack block, ItemStack plate, int type) {
        String[] materialType = {"ingot", "gem"};
        OreDictionary.registerOre(materialType[type] + materialName, material);
        if (nugget != null) {
            OreDictionary.registerOre("nugget" + materialName, nugget);
        }
        if (dust != null) {
            OreDictionary.registerOre("dust" + materialName, dust);
        }
        if (ore != null) {
            OreDictionary.registerOre("ore" + materialName, ore);
        }
        if (block != null) {
            OreDictionary.registerOre("block" + materialName, block);
        }
        if (plate != null) {
            OreDictionary.registerOre("plate" + materialName, plate);
        }
    }

}
