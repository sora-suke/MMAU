package com.sorasuke.MMAU.blocks;

/**
 * Created by sora_suke on 2016/11/20.
 * <p>
 * これを継承させればMMAURegistry.registerBlockでアイテム登録できる
 * いちいちアイテム名入れて書いてGameRegistry書くのめんどくさかったから作った
 * IMMAUBaseBlockを継承させれば名前もまとめて扱える
 */
public interface IMMAUBaseBlock {
    String name = "";

    String getName();
}
