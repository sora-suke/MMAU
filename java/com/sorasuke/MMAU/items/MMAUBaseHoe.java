package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;


public class MMAUBaseHoe extends ItemHoe implements IMMAUBaseItem {

    private String name;
    private ResourceLocation location;

    /**
     * @param p_i45343_1_ ツールマテリアル
     * @param localname   マテリアル名
     */
    public MMAUBaseHoe(ToolMaterial p_i45343_1_, String localname) {
        super(p_i45343_1_);
        /*
         * クワのベースクラス 使い方 HogeHoe = BaseHoe(HOGETOOL,"hoge") 第一引数は素材、二は名前
		 * ツール名+ツールの種類で登録される
		 */
        localname = this.name = localname + "_hoe";
        setCreativeTab(MMAURegistry.MMAUToolsTab);
        setUnlocalizedName("MMAU_" + localname);
        this.location = new ResourceLocation(MMAU.MODID, name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public ResourceLocation getLocation() {
        return this.location;
    }

}
