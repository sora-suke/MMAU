package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class MMAUBaseShovel extends ItemSpade implements IMMAUBaseItem {

    private String name;
    private ResourceLocation location;

    /**
     * @param p_i45353_1_ ツールマテリアル
     * @param localname   マテリアル名
     */
    public MMAUBaseShovel(ToolMaterial p_i45353_1_, String localname) {
        super(p_i45353_1_);
        /*
		 * シャベルのベースクラス 使い方 HogeShovel = BaseShovel(HOGETOOL,"hoge") 第一引数は素材、二は名前
		 * ツール名+ツールの種類で登録される
		 */
        localname = this.name = localname + "_shovel";
        setCreativeTab(MMAURegistry.MMAUToolsTab);
        setUnlocalizedName("MMAU_" + localname);
        this.location = new ResourceLocation(MMAU.RL, name);

    }

    public String getName() {
        return this.name;
    }

    public ResourceLocation getLocation() {
        return this.location;
    }
}
