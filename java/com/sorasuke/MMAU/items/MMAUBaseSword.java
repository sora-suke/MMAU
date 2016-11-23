package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;

public class MMAUBaseSword extends ItemSword implements IMMAUBaseItem{

	String name;

    /**
     *
     * @param p_i45356_1_ ツールマテリアル
     * @param localname マテリアル名
     */
	public MMAUBaseSword(ToolMaterial p_i45356_1_, String localname) {
		super(p_i45356_1_);
		/*
		 * 剣のベースクラス 使い方 HogeSword = BaseSword(HOGETOOL,"hoge") 第一引数は素材、二は名前
		 * ツール名+ツールの種類で登録される
		 */
        localname = this.name = localname + "_sword";
		setCreativeTab(MMAU.MMAUTOOLSTAB);
		setUnlocalizedName("MMAU_" + localname);
		setTextureName("mmau:" + localname);


	}

    public String getName(){
        return this.name;
    }

}
