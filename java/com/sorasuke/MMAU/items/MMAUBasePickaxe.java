package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;


public class MMAUBasePickaxe extends ItemPickaxe implements IMMAUBaseItem{

    String name;
    /**
     *
     * @param p_i45347_1_ ツールマテリアル
     * @param localname マテリアル名
     */
	public MMAUBasePickaxe(ToolMaterial p_i45347_1_, String localname) {
		super(p_i45347_1_);
		/*
		 * ツルハシのベースクラス 使い方 HogePickaxe = BasePickaxe(HOGETOOL,"hoge")
		 * 第一引数は素材、二は名前 ツール名+ツールの種類で登録される
		 */
        localname = this.name = localname + "_pickaxe";
		setCreativeTab(MMAU.MMAUTOOLSTAB);
		setUnlocalizedName("MMAU_" + localname);
		setTextureName("mmau:" + localname);


	}

    public String getName(){
        return this.name;
    }

}
