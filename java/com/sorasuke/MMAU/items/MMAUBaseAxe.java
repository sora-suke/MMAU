package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemAxe;

public class MMAUBaseAxe extends ItemAxe implements IMMAUBaseItem{

	String name;

    /**
     *
     * @param p_i45327_1_ ツールマテリアル
     * @param localname マテリアル名
     */
	public MMAUBaseAxe(ToolMaterial p_i45327_1_, String localname) {
		super(p_i45327_1_);
		/*
		 * 斧のベースクラス 使い方 HogeAxe = BaseAxe(HOGETOOL,"hoge") 第一引数は素材、二は名前
		 * ツール名+ツールの種類で登録される
		 */
        localname = this.name = localname + "_axe";
		setCreativeTab(MMAU.MMAUTOOLSTAB);
		setUnlocalizedName("MMAU_" + localname);
		setTextureName("mmau:" + localname);

	}

    public String getName(){
        return this.name;
    }

}
