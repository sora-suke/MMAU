package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemHoe;


public class MMAUBaseHoe extends ItemHoe implements IMMAUBaseItem{

	String name;

    /**
     *
     * @param p_i45343_1_ ツールマテリアル
     * @param localname マテリアル名
     */
	public MMAUBaseHoe(ToolMaterial p_i45343_1_, String localname) {
		super(p_i45343_1_);
		/*
		 * クワのベースクラス 使い方 HogeHoe = BaseHoe(HOGETOOL,"hoge") 第一引数は素材、二は名前
		 * ツール名+ツールの種類で登録される
		 */
        localname = this.name = localname + "_hoe";
		setCreativeTab(MMAU.MMAUTOOLSTAB);
		setUnlocalizedName("MMAU_" + localname);
		setTextureName("mmau:" + localname);

	}

    public String getName(){
        return this.name;
    }

}
