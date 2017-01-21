package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;

public class BaseSword extends ItemSword {

    public BaseSword(ToolMaterial p_i45356_1_, String localname) {
        super(p_i45356_1_);
        /*剣のベースクラス
		 * 使い方
		 * HogeSword = BaseSword(HOGETOOL,"hoge")
		 * 第一引数は素材、二は名前
		 * ツール名+ツールの種類で登録される
		 */
        localname = localname + "_sword";
        setCreativeTab(MMAU.MMAUTOOLSTAB);
        setUnlocalizedName("MMAU_" + localname);
        setTextureName("mmau:" + localname);

        GameRegistry.registerItem(this, localname);

    }

}
