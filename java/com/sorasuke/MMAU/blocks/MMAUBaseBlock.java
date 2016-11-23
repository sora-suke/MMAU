package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.items.IMMAUBaseItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by sora_suke on 2016/11/20.
 *
 * MMAURegistry.registerBlockで登録させるためのやつ
 * コンストラクタの引数に名前を入れればその名前のテクスチャと非翻訳名にまとめて指定される
 */
public class MMAUBaseBlock extends Block implements IMMAUBaseBlock{
    private String name;
    public MMAUBaseBlock(Material material, String name, String harvestType, int harvestLevel){
        super(material);
        this.name = name;
        setBlockName("MMAU_" + name);
        setBlockTextureName("mmau:" + name);
        setHarvestLevel(harvestType, harvestLevel);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
