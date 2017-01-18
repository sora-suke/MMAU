package com.sorasuke.MMAU.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

/**
 * Created by sora_suke on 2016/11/20.
 * <p>
 * これを継承させればMMAURegistry.registerBlockでアイテム登録できる
 * いちいちアイテム名入れて書いてGameRegistry書くのめんどくさかったから作った
 * IMMAUBaseBlockを継承させれば名前もまとめて扱える
 */
public interface IMMAUBaseBlock {

    ItemBlock itemBlock = null;

    String getName();

    ResourceLocation getLocation();

    ItemBlock getItemBlock();
}
