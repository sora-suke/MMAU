package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class MMAUBaseSword extends ItemSword implements IMMAUBaseItem {

    private String name;
    private ResourceLocation location;

    /**
     * @param p_i45356_1_ ツールマテリアル
     * @param localname   マテリアル名
     */
    public MMAUBaseSword(ToolMaterial p_i45356_1_, String localname) {
        super(p_i45356_1_);
        /*
         * 剣のベースクラス 使い方 HogeSword = BaseSword(HOGETOOL,"hoge") 第一引数は素材、二は名前
		 * ツール名+ツールの種類で登録される
		 */
        localname = this.name = localname + "_sword";
        setCreativeTab(MMAURegistry.MMAUToolsTab);
        setUnlocalizedName("MMAU_" + localname);
        this.location = new ResourceLocation(MMAU.MODID, name);
    }

    public String getName() {
        return this.name;
    }

    public ResourceLocation getLocation() {
        return this.location;
    }

    @Override
    public int getMaxMetadata() {
        return 0;
    }

    @Override
    public void setMaxMetadata(int i) {

    }
}
