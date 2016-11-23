package com.sorasuke.MMAU.items;

/**
 * Created by sora_suke on 2016/11/19.
 *
 * これを継承させればMMAURegistry.registerItemでアイテム登録できる
 * いちいちアイテム名入れて書いてGameRegistry書くのめんどくさかったから作った
 * IMMAUBaseItemを継承させれば名前もまとめて扱える
 */
public interface IMMAUBaseItem {
    String name = "";
    String getName();
}
