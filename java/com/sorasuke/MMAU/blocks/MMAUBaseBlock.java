package com.sorasuke.MMAU.blocks;

import com.sorasuke.MMAU.MMAU;
import com.sorasuke.MMAU.items.IMMAUBaseItem;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

/**
 * Created by sora_suke on 2016/11/20.
 * <p>
 * MMAURegistry.registerBlockで登録させるためのやつ
 * コンストラクタの引数に名前を入れればその名前のテクスチャと非翻訳名にまとめて指定される
 */
public class MMAUBaseBlock extends Block implements IMMAUBaseBlock {
    private String name;
    private ResourceLocation location;
    public ItemBlock itemBlock;

    public MMAUBaseBlock(Material material, String name, String harvestType, int harvestLevel, SoundType soundType) {
        super(material);
        this.name = name;
        setUnlocalizedName("MMAU_" + name);
        this.location = new ResourceLocation(MMAU.MODID, this.name);
        setHarvestLevel(harvestType, harvestLevel);
        this.itemBlock = new ItemBlock(this);
        setSoundType(soundType);
    }

    public MMAUBaseBlock(Material material, String name, SoundType soundType) {
        super(material);
        this.name = name;
        setUnlocalizedName("MMAU_" + name);
        this.location = new ResourceLocation(MMAU.MODID, this.name);
        this.itemBlock = new ItemBlock(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ResourceLocation getLocation() {
        return this.location;
    }

    @Override
    public ItemBlock getItemBlock() {
        return this.itemBlock;
    }
}
