package com.sorasuke.MMAU.items;

import net.minecraft.util.ResourceLocation;

/**
 * Created by sora_suke on 2016/11/19.
 * <p>
 * これを継承させればMMAURegistry.registerItemでアイテム登録できる
 * いちいちアイテム名入れて書いてGameRegistry書くのめんどくさかったから作った
 * IMMAUBaseItemを継承させれば名前もまとめて扱える
 */
public interface IMMAUBaseItem {

    /**
     * 登録時などに使う名前を返す
     * */
    String getName();

    /**
     * 登録時などに使うResourceLocationを返す
     * */
    ResourceLocation getLocation();

    /**
     * 最大サブアイテム数を取得する
     * ダメージ値ではない
     * @return
     */
    int getMaxMetadata();

    /**
     * 最大サブアイテム数を設定する
     * @param i
     */
    void setMaxMetadata(int i);
}
