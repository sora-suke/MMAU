package com.sorasuke.MMAU.items;

import net.minecraft.item.Item;

/**
 * Created by sora_suke on 2016/11/19.
 * <p>
 * MMAURegistry.registerItemで登録させるためのやつ
 * コンストラクタの引数に名前を入れればその名前のテクスチャと非翻訳名にまとめて指定される
 */
public class MMAUBaseItem extends Item implements IMMAUBaseItem {
    String name;

    public MMAUBaseItem(String name) {
        this.name = name;
        setUnlocalizedName("MMAU_" + name);
        setTextureName("mmau:" + name);
    }

    public String getName() {
        return this.name;
    }
}
