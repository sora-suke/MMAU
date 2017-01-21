package com.sorasuke.MMAU;

import com.sorasuke.MMAU.blocks.MMAUBlocks;
import com.sorasuke.MMAU.items.MMAUItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void registry(MMAU mod) {


        //ネギツール系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.Negi, 9, 0),
                new Object[]{
                        "blockNegi"
                }));

        GameRegistry.addSmelting(MMAUBlocks.NegiOre, new ItemStack(MMAUItems.Negi), 1.0f);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUBlocks.NegiBlock, 1, 0),
                new Object[]{
                        "NNN",
                        "NNN",
                        "NNN",
                        Character.valueOf('N'), "gemNegi"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiAxe, 1, 0),
                new Object[]{
                        " N ",
                        "NAN",
                        " N ",
                        Character.valueOf('N'), "gemNegi",
                        Character.valueOf('A'), Items.diamond_axe
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiHoe, 1, 0),
                new Object[]{
                        " N ",
                        "NHN",
                        " N ",
                        Character.valueOf('N'), "gemNegi",
                        Character.valueOf('H'), Items.diamond_hoe
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiPickaxe, 1, 0),
                new Object[]{
                        " N ",
                        "NPN",
                        " N ",
                        Character.valueOf('N'), "gemNegi",
                        Character.valueOf('P'), Items.diamond_pickaxe
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiShovel, 1, 0),
                new Object[]{
                        " N ",
                        "NSN",
                        " N ",
                        Character.valueOf('N'), "gemNegi",
                        Character.valueOf('S'), Items.diamond_shovel
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiSword, 1, 0),
                new Object[]{
                        " N ",
                        "NSN",
                        " N ",
                        Character.valueOf('N'), "gemNegi",
                        Character.valueOf('S'), Items.diamond_sword
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiHelmet, 1, 0),
                new Object[]{
                        " N ",
                        "NHN",
                        " N ",
                        Character.valueOf('N'), "gemNegi",
                        Character.valueOf('H'), Items.diamond_helmet
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiChestplate, 1, 0),
                new Object[]{
                        " N ",
                        "NCN",
                        " N ",
                        Character.valueOf('N'), "gemNegi",
                        Character.valueOf('C'), Items.diamond_chestplate
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiLeggings, 1, 0),
                new Object[]{
                        " N ",
                        "NLN",
                        " N ",
                        Character.valueOf('N'), "gemNegi",
                        Character.valueOf('L'), Items.diamond_leggings
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.NegiBoots, 1, 0),
                new Object[]{
                        " N ",
                        "NBN",
                        " N ",
                        Character.valueOf('N'), "gemNegi",
                        Character.valueOf('B'), Items.diamond_boots
                }));


        //クリスタル系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.Crystal, 9, 0),
                new Object[]{
                        "blockCrystal"
                }));

        GameRegistry.addSmelting(MMAUBlocks.CrystalOre, new ItemStack(MMAUItems.Crystal), 0.7f);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUBlocks.CrystalBlock, 1, 0),
                new Object[]{
                        "CCC",
                        "CCC",
                        "CCC",
                        Character.valueOf('C'), "gemCrystal"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalAxe, 1, 0),
                new Object[]{
                        "CC",
                        "CS",
                        " S",
                        Character.valueOf('C'), "gemCrystal",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalAxe, 1, 0),
                new Object[]{
                        "CC",
                        "SC",
                        "S ",
                        Character.valueOf('C'), "gemCrystal",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalHoe, 1, 0),
                new Object[]{
                        "CC",
                        " S",
                        " S",
                        Character.valueOf('C'), "gemCrystal",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalHoe, 1, 0),
                new Object[]{
                        "CC",
                        "S ",
                        "S ",
                        Character.valueOf('C'), "gemCrystal",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalPickaxe, 1, 0),
                new Object[]{
                        "CCC",
                        " S ",
                        " S ",
                        Character.valueOf('C'), "gemCrystal",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalShovel, 1, 0),
                new Object[]{
                        "C",
                        "S",
                        "S",
                        Character.valueOf('C'), "gemCrystal",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalSword, 1, 0),
                new Object[]{
                        "C",
                        "C",
                        "S",
                        Character.valueOf('C'), "gemCrystal",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalHelmet, 1, 0),
                new Object[]{
                        "CCC",
                        "C C",
                        Character.valueOf('C'), "gemCrystal",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalChestplate, 1, 0),
                new Object[]{
                        "C C",
                        "CCC",
                        "CCC",
                        Character.valueOf('C'), "gemCrystal",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalLeggings, 1, 0),
                new Object[]{
                        "CCC",
                        "C C",
                        "C C",
                        Character.valueOf('C'), "gemCrystal",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CrystalBoots, 1, 0),
                new Object[]{
                        "C C",
                        "C C",
                        Character.valueOf('C'), "gemCrystal",
                }));


        //コバルト系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.Cobalt, 9, 0),
                new Object[]{
                        "blockCobalt"
                }));

        GameRegistry.addSmelting(MMAUBlocks.CobaltOre, new ItemStack(MMAUItems.Cobalt), 1.0f);

        GameRegistry.addSmelting(MMAUItems.CobaltDust, new ItemStack(MMAUItems.Cobalt), 1.0f);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUBlocks.CobaltBlock, 1, 0),
                new Object[]{
                        "CCC",
                        "CCC",
                        "CCC",
                        Character.valueOf('C'), "ingotCobalt"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.CobaltNugget, 9, 0),
                new Object[]{
                        "ingotCobalt"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.Cobalt, 1, 0),
                new Object[]{
                        "CCC",
                        "CCC",
                        "CCC",
                        Character.valueOf('C'), "nuggetCobalt"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.CobaltDust, 1, 0),
                new Object[]{
                        "ingotCobalt",
                        "mortarL1"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.CobaltDust, 2, 0),
                new Object[]{
                        "oreCobalt",
                        "mortarL1"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltAxe, 1, 0),
                new Object[]{
                        "CC",
                        "CS",
                        " S",
                        Character.valueOf('C'), "ingotCobalt",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltAxe, 1, 0),
                new Object[]{
                        "CC",
                        "SC",
                        "S ",
                        Character.valueOf('C'), "ingotCobalt",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltHoe, 1, 0),
                new Object[]{
                        "CC",
                        " S",
                        " S",
                        Character.valueOf('C'), "ingotCobalt",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltHoe, 1, 0),
                new Object[]{
                        "CC",
                        "S ",
                        "S ",
                        Character.valueOf('C'), "ingotCobalt",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltPickaxe, 1, 0),
                new Object[]{
                        "CCC",
                        " S ",
                        " S ",
                        Character.valueOf('C'), "ingotCobalt",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltShovel, 1, 0),
                new Object[]{
                        "C",
                        "S",
                        "S",
                        Character.valueOf('C'), "ingotCobalt",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltSword, 1, 0),
                new Object[]{
                        "C",
                        "C",
                        "S",
                        Character.valueOf('C'), "ingotCobalt",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltHelmet, 1, 0),
                new Object[]{
                        "CCC",
                        "C C",
                        Character.valueOf('C'), "ingotCobalt",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltChestplate, 1, 0),
                new Object[]{
                        "C C",
                        "CCC",
                        "CCC",
                        Character.valueOf('C'), "ingotCobalt",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltLeggings, 1, 0),
                new Object[]{
                        "CCC",
                        "C C",
                        "C C",
                        Character.valueOf('C'), "ingotCobalt",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.CobaltBoots, 1, 0),
                new Object[]{
                        "C C",
                        "C C",
                        Character.valueOf('C'), "ingotCobalt",
                }));


        //オリハルコン系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.Orichalcum, 9, 0),
                new Object[]{
                        "blockOrichalcum"
                }));

        GameRegistry.addSmelting(MMAUBlocks.OrichalcumOre, new ItemStack(MMAUItems.Orichalcum), 10.0f);

        GameRegistry.addSmelting(MMAUItems.OrichalcumDust, new ItemStack(MMAUItems.Orichalcum), 1.0f);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUBlocks.OrichalcumBlock, 1, 0),
                new Object[]{
                        "OOO",
                        "OOO",
                        "OOO",
                        Character.valueOf('O'), "ingotOrichalcum"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.OrichalcumNugget, 9, 0),
                new Object[]{
                        "ingotOrichalcum"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.Orichalcum, 1, 0),
                new Object[]{
                        "OOO",
                        "OOO",
                        "OOO",
                        Character.valueOf('O'), "nuggetOrichalcum"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.OrichalcumDust, 1, 0),
                new Object[]{
                        "ingotOrichalcum",
                        "mortarL1"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.OrichalcumDust, 2, 0),
                new Object[]{
                        "oreOrichalcum",
                        "mortarL1"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumAxe, 1, 0),
                new Object[]{
                        "OO",
                        "OS",
                        " S",
                        Character.valueOf('O'), "ingotOrichalcum",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumAxe, 1, 0),
                new Object[]{
                        "OO",
                        "SO",
                        "S ",
                        Character.valueOf('O'), "ingotOrichalcum",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumHoe, 1, 0),
                new Object[]{
                        "OO",
                        " S",
                        " S",
                        Character.valueOf('O'), "ingotOrichalcum",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumHoe, 1, 0),
                new Object[]{
                        "OO",
                        "S ",
                        "S ",
                        Character.valueOf('O'), "ingotOrichalcum",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumPickaxe, 1, 0),
                new Object[]{
                        "OOO",
                        " S ",
                        " S ",
                        Character.valueOf('O'), "ingotOrichalcum",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumShovel, 1, 0),
                new Object[]{
                        "O",
                        "S",
                        "S",
                        Character.valueOf('O'), "ingotOrichalcum",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumSword, 1, 0),
                new Object[]{
                        "O",
                        "O",
                        "S",
                        Character.valueOf('O'), "ingotOrichalcum",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumHelmet, 1, 0),
                new Object[]{
                        "OOO",
                        "O O",
                        Character.valueOf('O'), "ingotOrichalcum",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumChestplate, 1, 0),
                new Object[]{
                        "O O",
                        "OOO",
                        "OOO",
                        Character.valueOf('O'), "ingotOrichalcum",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumLeggings, 1, 0),
                new Object[]{
                        "OOO",
                        "O O",
                        "O O",
                        Character.valueOf('O'), "ingotOrichalcum",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.OrichalcumBoots, 1, 0),
                new Object[]{
                        "O O",
                        "O O",
                        Character.valueOf('O'), "ingotOrichalcum",
                }));


        //ブロンズ系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.Bronze, 9, 0),
                new Object[]{
                        "blockBronze"
                }));

        GameRegistry.addSmelting(MMAUItems.BronzeDust, new ItemStack(MMAUItems.Bronze), 0.7f);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUBlocks.BronzeBlock, 1, 0),
                new Object[]{
                        "CCC",
                        "CCC",
                        "CCC",
                        Character.valueOf('C'), "ingotBronze"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.BronzeNugget, 9, 0),
                new Object[]{
                        "ingotBronze"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.Bronze, 1, 0),
                new Object[]{
                        "BBB",
                        "BBB",
                        "BBB",
                        Character.valueOf('B'), "nuggetBronze"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.BronzeDust, 1, 0),
                new Object[]{
                        "ingotBronze",
                        "mortarL1"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.BronzeDust, 2, 0),
                new Object[]{
                        "oreBronze",
                        "mullerL1"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.BronzeDust, 4, 0),
                new Object[]{
                        "dustCopper", "dustCopper", "dustCopper",
                        "dustTin"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeAxe, 1, 0),
                new Object[]{
                        "BB",
                        "BS",
                        " S",
                        Character.valueOf('B'), "ingotBronze",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeAxe, 1, 0),
                new Object[]{
                        "BB",
                        "SB",
                        "S ",
                        Character.valueOf('B'), "ingotBronze",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeHoe, 1, 0),
                new Object[]{
                        "BB",
                        " S",
                        " S",
                        Character.valueOf('B'), "ingotBronze",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeHoe, 1, 0),
                new Object[]{
                        "BB",
                        "S ",
                        "S ",
                        Character.valueOf('B'), "ingotBronze",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzePickaxe, 1, 0),
                new Object[]{
                        "BBB",
                        " S ",
                        " S ",
                        Character.valueOf('B'), "ingotBronze",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeShovel, 1, 0),
                new Object[]{
                        "B",
                        "S",
                        "S",
                        Character.valueOf('B'), "ingotBronze",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeSword, 1, 0),
                new Object[]{
                        "B",
                        "B",
                        "S",
                        Character.valueOf('B'), "ingotBronze",
                        Character.valueOf('S'), "stickWood"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeHelmet, 1, 0),
                new Object[]{
                        "BBB",
                        "B B",
                        Character.valueOf('B'), "ingotBronze",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeChestplate, 1, 0),
                new Object[]{
                        "B B",
                        "BBB",
                        "BBB",
                        Character.valueOf('B'), "ingotBronze",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeLeggings, 1, 0),
                new Object[]{
                        "BBB",
                        "B B",
                        "B B",
                        Character.valueOf('B'), "ingotBronze",
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.BronzeBoots, 1, 0),
                new Object[]{
                        "B B",
                        "B B",
                        Character.valueOf('B'), "ingotBronze",
                }));


        //銅系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.Copper, 9, 0),
                new Object[]{
                        "blockCopper"
                }));


        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUBlocks.CopperBlock, 1, 0),
                new Object[]{
                        "CCC",
                        "CCC",
                        "CCC",
                        Character.valueOf('C'), "ingotCopper"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.CopperNugget, 9, 0),
                new Object[]{
                        "ingotCopper"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.Bronze, 1, 0),
                new Object[]{
                        "CCC",
                        "CCC",
                        "CCC",
                        Character.valueOf('C'), "nuggetCopper"
                }));

        GameRegistry.addSmelting(MMAUBlocks.CopperOre, new ItemStack(MMAUItems.Copper), 0.7f);

        GameRegistry.addSmelting(MMAUItems.CopperDust, new ItemStack(MMAUItems.Copper), 0.7f);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.CopperDust, 1, 0),
                new Object[]{
                        "ingotCopper",
                        "mortarL1"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.CopperDust, 2, 0),
                new Object[]{
                        "oreCopper",
                        "mortarL1"
                }));


        //錫系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.Tin, 9, 0),
                new Object[]{
                        "blockTin"
                }));


        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUBlocks.TinBlock, 1, 0),
                new Object[]{
                        "TTT",
                        "TTT",
                        "TTT",
                        Character.valueOf('T'), "ingotTin"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.TinNugget, 9, 0),
                new Object[]{
                        "ingotTin"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MMAUItems.Tin, 1, 0),
                new Object[]{
                        "TTT",
                        "TTT",
                        "TTT",
                        Character.valueOf('T'), "nuggetTin"
                }));

        GameRegistry.addSmelting(MMAUBlocks.TinOre, new ItemStack(MMAUItems.Tin), 0.7f);

        GameRegistry.addSmelting(MMAUItems.TinDust, new ItemStack(MMAUItems.Tin), 0.7f);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.TinDust, 1, 0),
                new Object[]{
                        "ingotTin",
                        "mortarL1"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.TinDust, 2, 0),
                new Object[]{
                        "oreTin",
                        "mortarL1"
                }));


        //鉄系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.IronNugget, 9, 0),
                new Object[]{
                        "ingotIron"
                }));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot, 1, 0),
                new Object[]{
                        "III",
                        "III",
                        "III",
                        Character.valueOf('I'), "nuggetIron"
                }));

        GameRegistry.addSmelting(MMAUItems.IronDust, new ItemStack(Items.iron_ingot), 0.7f);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.IronDust, 1, 0),
                new Object[]{
                        "ingotIron",
                        "mortarL1"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.IronDust, 2, 0),
                new Object[]{
                        "oreIron",
                        "mortarL1"
                }));


        //金系
        GameRegistry.addSmelting(MMAUItems.GoldDust, new ItemStack(Items.gold_ingot), 0.7f);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.GoldDust, 1, 0),
                new Object[]{
                        "ingotGold",
                        "mortarL1"
                }));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.GoldDust, 2, 0),
                new Object[]{
                        "oreGold",
                        "mortarL1"
                }));


        //工具系
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MMAUItems.IronMortar, 1, 0),
                new Object[]{
                        "nuggetIron",
                        new ItemStack(Items.bowl, 1, 0)
                }

        ));


    }


}
