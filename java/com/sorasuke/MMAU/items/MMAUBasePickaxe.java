package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;


public class MMAUBasePickaxe extends ItemPickaxe implements IMMAUBaseItem {

    private String name;
    private ResourceLocation location;

    /**
     * @param p_i45347_1_ ツールマテリアル
     * @param localname   マテリアル名
     */
    public MMAUBasePickaxe(ToolMaterial p_i45347_1_, String localname) {
        super(p_i45347_1_);
        /*
         * ツルハシのベースクラス 使い方 HogePickaxe = BasePickaxe(HOGETOOL,"hoge")
		 * 第一引数は素材、二は名前 ツール名+ツールの種類で登録される
		 */
        localname = this.name = localname + "_pickaxe";
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

    @Override
    public int getMaxMetadata() {
        return 0;
    }

    @Override
    public void setMaxMetadata(int i) {

    }
}
