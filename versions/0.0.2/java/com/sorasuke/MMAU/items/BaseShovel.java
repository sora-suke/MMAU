package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSpade;

public class BaseShovel extends ItemSpade {

    public BaseShovel(ToolMaterial p_i45353_1_, String localname) {
        super(p_i45353_1_);
        /*シャベルのベースクラス
		 * 使い方
		 * HogeShovel = BaseShovel(HOGETOOL,"hoge")
		 * 第一引数は素材、二は名前
		 * ツール名+ツールの種類で登録される
		 */
        localname = localname + "_shovel";
        setCreativeTab(MMAU.MMAUTOOLSTAB);
        setUnlocalizedName("MMAU_" + localname);
        setTextureName("mmau:" + localname);

        GameRegistry.registerItem(this, localname);
    }

}
