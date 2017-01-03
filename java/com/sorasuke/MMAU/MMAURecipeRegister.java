package com.sorasuke.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class MMAURecipeRegister {

    public static void registry(MMAU mod) {

        MMAULogger.log("Registry Recipes!");

        //ツールレシピの登録
        registerToolsRecipe("gemNegi", new ItemStack(MMAURegistry.NegiPickaxe), new ItemStack(MMAURegistry.NegiSword), new ItemStack(MMAURegistry.NegiAxe), new ItemStack(MMAURegistry.NegiShovel), new ItemStack(MMAURegistry.NegiHoe)
                , new ItemStack(MMAURegistry.NegiHelmet), new ItemStack(MMAURegistry.NegiChestplate), new ItemStack(MMAURegistry.NegiLeggings), new ItemStack(MMAURegistry.NegiBoots));

        registerToolsRecipe("gemCrystal", new ItemStack(MMAURegistry.CrystalPickaxe), new ItemStack(MMAURegistry.CrystalSword), new ItemStack(MMAURegistry.CrystalAxe), new ItemStack(MMAURegistry.CrystalShovel), new ItemStack(MMAURegistry.CrystalHoe)
                , new ItemStack(MMAURegistry.CrystalHelmet), new ItemStack(MMAURegistry.CrystalChestplate), new ItemStack(MMAURegistry.CrystalLeggings), new ItemStack(MMAURegistry.CrystalBoots));

        registerToolsRecipe("ingotBronze", new ItemStack(MMAURegistry.BronzePickaxe), new ItemStack(MMAURegistry.BronzeSword), new ItemStack(MMAURegistry.BronzeAxe), new ItemStack(MMAURegistry.BronzeShovel), new ItemStack(MMAURegistry.BronzeHoe)
                , new ItemStack(MMAURegistry.BronzeHelmet), new ItemStack(MMAURegistry.BronzeChestplate), new ItemStack(MMAURegistry.BronzeLeggings), new ItemStack(MMAURegistry.BronzeBoots));

        registerToolsRecipe("ingotCobalt", new ItemStack(MMAURegistry.CobaltPickaxe), new ItemStack(MMAURegistry.CobaltSword), new ItemStack(MMAURegistry.CobaltAxe), new ItemStack(MMAURegistry.CobaltShovel), new ItemStack(MMAURegistry.CobaltHoe)
                , new ItemStack(MMAURegistry.CobaltHelmet), new ItemStack(MMAURegistry.CobaltChestplate), new ItemStack(MMAURegistry.CobaltLeggings), new ItemStack(MMAURegistry.CobaltBoots));

        registerToolsRecipe("ingotOrichalcum", new ItemStack(MMAURegistry.OrichalcumPickaxe), new ItemStack(MMAURegistry.OrichalcumSword), new ItemStack(MMAURegistry.OrichalcumAxe), new ItemStack(MMAURegistry.OrichalcumShovel), new ItemStack(MMAURegistry.OrichalcumHoe)
                , new ItemStack(MMAURegistry.OrichalcumHelmet), new ItemStack(MMAURegistry.OrichalcumChestplate), new ItemStack(MMAURegistry.OrichalcumLeggings), new ItemStack(MMAURegistry.OrichalcumBoots));

        registerToolsRecipe("ingotSilver", new ItemStack(MMAURegistry.SilverPickaxe), new ItemStack(MMAURegistry.SilverSword), new ItemStack(MMAURegistry.SilverAxe), new ItemStack(MMAURegistry.SilverShovel), new ItemStack(MMAURegistry.SilverHoe)
                , new ItemStack(MMAURegistry.SilverHelmet), new ItemStack(MMAURegistry.SilverChestplate), new ItemStack(MMAURegistry.SilverLeggings), new ItemStack(MMAURegistry.SilverBoots));

        registerToolsRecipe("ingotPlatinum", new ItemStack(MMAURegistry.PlatinumPickaxe), new ItemStack(MMAURegistry.PlatinumSword), new ItemStack(MMAURegistry.PlatinumAxe), new ItemStack(MMAURegistry.PlatinumShovel), new ItemStack(MMAURegistry.PlatinumHoe)
                , new ItemStack(MMAURegistry.PlatinumHelmet), new ItemStack(MMAURegistry.PlatinumChestplate), new ItemStack(MMAURegistry.PlatinumLeggings), new ItemStack(MMAURegistry.PlatinumBoots));

        registerToolsRecipe("ingotSteel", new ItemStack(MMAURegistry.SteelPickaxe), new ItemStack(MMAURegistry.SteelSword), new ItemStack(MMAURegistry.SteelAxe), new ItemStack(MMAURegistry.SteelShovel), new ItemStack(MMAURegistry.SteelHoe)
                , new ItemStack(MMAURegistry.SteelHelmet), new ItemStack(MMAURegistry.SteelChestplate), new ItemStack(MMAURegistry.SteelLeggings), new ItemStack(MMAURegistry.SteelBoots));


        //マテリアルのレシピ
        /*テンプレ
        registerMaterialProcessingResipe("ingotNull", "oreNull", "nuggetNull", "dustNull", "blockNull"
            , new ItemStack(MMAURegistry.Null), new ItemStack(MMAURegistry.NullOre), new ItemStack(MMAURegistry.NullNugget), new ItemStack(MMAURegistry.NullDust), new ItemStack(MMAURegistry.NullBlock),0.7f);
        */
        registerMaterialProcessingResipe("gemNegi", "oreNegi", "", "", "blockNegi"
                , new ItemStack(MMAURegistry.Negi), new ItemStack(MMAURegistry.NegiOre), null, null, new ItemStack(MMAURegistry.NegiBlock), 0.7f);

        registerMaterialProcessingResipe("gemCrystal", "oreCrystal", "", "", "blockCrystal"
                , new ItemStack(MMAURegistry.Crystal), new ItemStack(MMAURegistry.CrystalOre), null, null, new ItemStack(MMAURegistry.CrystalBlock), 0.7f);

        registerMaterialProcessingResipe("ingotBronze", "", "nuggetBronze", "dustBronze", "blockBronze"
                , new ItemStack(MMAURegistry.Bronze), null, new ItemStack(MMAURegistry.BronzeNugget), new ItemStack(MMAURegistry.BronzeDust), new ItemStack(MMAURegistry.BronzeBlock), 0.7f);
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(new ItemStack(MMAURegistry.BronzeDust, 4, 0), "dustCopper", "dustCopper", "dustCopper", "dustTin"));

        registerMaterialProcessingResipe("ingotCobalt", "oreCobalt", "nuggetCobalt", "dustCobalt", "blockCobalt"
                , new ItemStack(MMAURegistry.Cobalt), new ItemStack(MMAURegistry.CobaltOre), new ItemStack(MMAURegistry.CobaltNugget), new ItemStack(MMAURegistry.CobaltDust), new ItemStack(MMAURegistry.CobaltBlock), 0.7f);

        registerMaterialProcessingResipe("ingotOrichalcum", "oreOrichalcum", "nuggetOrichalcum", "dustOrichalcum", "blockOrichalcum"
                , new ItemStack(MMAURegistry.Orichalcum), new ItemStack(MMAURegistry.OrichalcumOre), new ItemStack(MMAURegistry.OrichalcumNugget), new ItemStack(MMAURegistry.OrichalcumDust), new ItemStack(MMAURegistry.OrichalcumBlock), 0.7f);

        registerMaterialProcessingResipe("ingotSilver", "oreSilver", "nuggetSilver", "dustSilver", "blockSilver"
                , new ItemStack(MMAURegistry.Silver), new ItemStack(MMAURegistry.SilverOre), new ItemStack(MMAURegistry.SilverNugget), new ItemStack(MMAURegistry.SilverDust), new ItemStack(MMAURegistry.SilverBlock), 0.7f);

        registerMaterialProcessingResipe("ingotPlatinum", "orePlatinum", "nuggetPlatinum", "dustPlatinum", "blockPlatinum"
                , new ItemStack(MMAURegistry.Platinum), new ItemStack(MMAURegistry.PlatinumOre), new ItemStack(MMAURegistry.PlatinumNugget), new ItemStack(MMAURegistry.PlatinumDust), new ItemStack(MMAURegistry.PlatinumBlock), 0.7f);

        registerMaterialProcessingResipe("ingotSteel", "", "nuggetSteel", "dustSteel", "blockSteel"
                , new ItemStack(MMAURegistry.Steel), null, new ItemStack(MMAURegistry.SteelNugget), new ItemStack(MMAURegistry.SteelDust), new ItemStack(MMAURegistry.SteelBlock), 0.7f);
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(new ItemStack(MMAURegistry.SteelDust, 2, 0), "dustCoal", "dustIron"));

        registerMaterialProcessingResipe("ingotCopper", "oreCopper", "nuggetCopper", "dustCopper", "blockCopper"
                , new ItemStack(MMAURegistry.Copper), new ItemStack(MMAURegistry.CopperOre), new ItemStack(MMAURegistry.CopperNugget), new ItemStack(MMAURegistry.CopperDust), new ItemStack(MMAURegistry.CopperBlock), 0.7f);

        registerMaterialProcessingResipe("ingotTin", "oreTin", "nuggetTin", "dustTin", "blockTin"
                , new ItemStack(MMAURegistry.Tin), new ItemStack(MMAURegistry.TinOre), new ItemStack(MMAURegistry.TinNugget), new ItemStack(MMAURegistry.TinDust), new ItemStack(MMAURegistry.TinBlock), 0.7f);

        registerMaterialProcessingResipe("ingotBrass", "oreBrass", "nuggetBrass", "dustBrass", "blockBrass"
                , new ItemStack(MMAURegistry.Brass), null, new ItemStack(MMAURegistry.BrassNugget), new ItemStack(MMAURegistry.BrassDust), new ItemStack(MMAURegistry.BrassBlock), 0.7f);
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(new ItemStack(MMAURegistry.BrassDust, 3, 0), "dustCopper", "dustCopper", "dustZinc"));

        registerMaterialProcessingResipe("ingotLead", "oreLead", "nuggetLead", "dustLead", "blockLead"
                , new ItemStack(MMAURegistry.Lead), new ItemStack(MMAURegistry.LeadOre), new ItemStack(MMAURegistry.LeadNugget), new ItemStack(MMAURegistry.LeadDust), new ItemStack(MMAURegistry.LeadBlock), 0.7f);

        registerMaterialProcessingResipe("ingotZinc", "oreZinc", "nuggetZinc", "dustZinc", "blockZinc"
                , new ItemStack(MMAURegistry.Zinc), new ItemStack(MMAURegistry.ZincOre), new ItemStack(MMAURegistry.ZincNugget), new ItemStack(MMAURegistry.ZincDust), new ItemStack(MMAURegistry.ZincBlock), 0.7f);

        // 鉄系
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(new ItemStack(MMAURegistry.IronNugget, 9, 0), "ingotIron"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot, 1, 0),
                "III", "III", "III", 'I', "nuggetIron"));

        GameRegistry.addSmelting(MMAURegistry.IronDust, new ItemStack(Items.iron_ingot), 0.7f);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAURegistry.IronDust, 1, 0),
                "ingotIron", "craftingToolMotor"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAURegistry.IronDust, 2, 0),
                "oreIron", "craftingToolMotor"));

        // 金系
        GameRegistry.addSmelting(MMAURegistry.GoldDust, new ItemStack(Items.gold_ingot), 0.7f);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAURegistry.GoldDust, 1, 0),
                "ingotGold", "craftingToolMotor"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAURegistry.GoldDust, 2, 0),
                "oreGold", "craftingToolMotor"));

        // 石炭系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAURegistry.CoalDust, 1, 0),
                "coal", "craftingToolMotor"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAURegistry.CoalDust, 2, 0),
                "oreCoal", "craftingToolMotor"));

        // 工具系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAURegistry.IronMortar, 1, 0),
                "nuggetIron", new ItemStack(Items.bowl, 1, 0)

        ));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAURegistry.ExplosionButton, 1, 0),
                " B ", "ITI", 'I', "ingotIron", 'B', Blocks.stone_button, 'T', Blocks.tnt));

        GameRegistry.addRecipe(new ItemStack(MMAURegistry.FeatherBlock), "FFF", "FFF", "FFF", 'F', Items.feather);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAURegistry.ChickenBlock), "FHF", "DED", "FFF",
                'F', MMAURegistry.FeatherBlock, 'H', MMAURegistry.ChickenHead, 'D', "gemDiamond", 'E', Items.egg));

    }

    /**
     * ツールレシピをとまとめて登録するメソッド
     * 引数は見りゃわかるっしょ
     *
     * @param oreDict
     * @param pickaxe
     * @param sword
     * @param axe
     * @param shovel
     * @param hoe
     * @param helmet
     * @param chestPlate
     * @param leggings
     * @param boots
     */
    public static void registerToolsRecipe(String oreDict, ItemStack pickaxe, ItemStack sword, ItemStack axe, ItemStack shovel, ItemStack hoe, ItemStack helmet, ItemStack chestPlate, ItemStack leggings, ItemStack boots) {
        GameRegistry.addRecipe(new ShapedOreRecipe(pickaxe, "HHH", " S ", " S ", 'H', oreDict, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(sword, " H ", " H ", " S ", 'H', oreDict, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(axe, "HH ", "HS ", " S ", 'H', oreDict, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(shovel, " H ", " S ", " S ", 'H', oreDict, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(hoe, "HH ", " S ", " S ", 'H', oreDict, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(helmet, "HHH", "H H", 'H', oreDict));
        GameRegistry.addRecipe(new ShapedOreRecipe(chestPlate, "H H", "HHH", "HHH", 'H', oreDict));
        GameRegistry.addRecipe(new ShapedOreRecipe(leggings, "HHH", "H H", "H H", 'H', oreDict));
        GameRegistry.addRecipe(new ShapedOreRecipe(boots, "H H", "H H", 'H', oreDict));
    }

    /**
     * 上のやつの鉱石辞書じゃなくてアイテムスタック指定版
     * 使うかな?
     *
     * @param itemStack
     * @param pickaxe
     * @param sword
     * @param axe
     * @param shovel
     * @param hoe
     * @param helmet
     * @param chestPlate
     * @param leggings
     * @param boots
     */
    public static void registerToolsRecipe(ItemStack itemStack, ItemStack pickaxe, ItemStack sword, ItemStack axe, ItemStack shovel, ItemStack hoe, ItemStack helmet, ItemStack chestPlate, ItemStack leggings, ItemStack boots) {
        GameRegistry.addRecipe(new ShapedOreRecipe(pickaxe, "HHH", " S ", " S ", 'H', itemStack, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(sword, " H ", " H ", " S ", 'H', itemStack, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(axe, "HH ", "HS ", " S ", 'H', itemStack, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(shovel, " H ", " S ", " S ", 'H', itemStack, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(hoe, "HH ", " S ", " S ", 'H', itemStack, 'S', new ItemStack(Items.stick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(helmet, "HHH", "H H", 'H', itemStack));
        GameRegistry.addRecipe(new ShapedOreRecipe(chestPlate, "H H", "HHH", "HHH", 'H', itemStack));
        GameRegistry.addRecipe(new ShapedOreRecipe(leggings, "HHH", "H H", "H H", 'H', itemStack));
        GameRegistry.addRecipe(new ShapedOreRecipe(boots, "H H", "H H", 'H', itemStack));
    }

    /**
     * インゴットを精錬したり粉砕したり圧縮するレシピをまとめて登録する
     * 粉と鉱石はNullにすれば宝石系/合金って感じになる
     * 圧縮機とか粉砕機とか作ったとしたらそのレシピも追加するつもり
     *
     * @param ingotDict  ナントカDictは鉱石辞書名 素材
     * @param oreDict
     * @param nuggetDict
     * @param dustDict
     * @param blockDict
     * @param ingot      インゴットとかのItemStack 完成品 粉は2個にしておいてね
     * @param ore
     * @param dust
     * @param nugget
     * @param block
     * @param smeltExp   精錬時の経験値
     */
    public static void registerMaterialProcessingResipe(String ingotDict, String oreDict, String nuggetDict, String dustDict, String blockDict, ItemStack ingot, ItemStack ore, ItemStack nugget, ItemStack dust, ItemStack block, float smeltExp) {
        if (ore != null && dust != null) {//粉と鉱石が両方ある
            GameRegistry.addSmelting(ore, ingot, smeltExp);//鉱石からインゴット
            GameRegistry.addRecipe(new ShapelessOreRecipe(dust.splitStack(2), oreDict, "craftingToolMotor"));//鉱石から粉
            GameRegistry.addSmelting(dust, ingot, smeltExp);//粉からインゴット
            GameRegistry.addRecipe(new ShapelessOreRecipe(dust, ingotDict, "craftingToolMotor"));//インゴットから粉
        } else if (dust != null) {//粉しか無い
            GameRegistry.addRecipe(new ShapelessOreRecipe(dust, ingotDict, "craftingToolMotor"));//インゴットから粉
            GameRegistry.addSmelting(dust, ingot, smeltExp);//粉からインゴット
        } else if (ore != null) {//鉱石しかない
            GameRegistry.addSmelting(ore, ingot, smeltExp);//鉱石からインゴット
        }
        if (nugget != null) {
            GameRegistry.addRecipe(new ShapedOreRecipe(ingot, "HHH", "HHH", "HHH", 'H', nuggetDict));
            GameRegistry.addRecipe(new ShapelessOreRecipe(nugget.splitStack(9), ingotDict));
        }
        GameRegistry.addRecipe(new ShapelessOreRecipe(block, ingotDict, ingotDict, ingotDict, ingotDict, ingotDict, ingotDict, ingotDict, ingotDict, ingotDict));
        GameRegistry.addRecipe(new ShapelessOreRecipe(ingot.splitStack(9), blockDict));
    }


}
