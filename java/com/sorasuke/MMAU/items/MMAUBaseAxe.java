package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import com.sorasuke.MMAU.MMAURegistry;
import net.minecraft.item.ItemAxe;
import net.minecraft.util.ResourceLocation;

public class MMAUBaseAxe extends ItemAxe implements IMMAUBaseItem {

    private String name;
    private ResourceLocation location;


    /**
     * @param toolMaterial ツールマテリアル
     * @param localname    マテリアル名
     */
    public MMAUBaseAxe(ToolMaterial toolMaterial, String localname) {
        super(toolMaterial, toolMaterial.getDamageVsEntity(), -3.0F);
        /*
         * 斧のベースクラス 使い方 HogeAxe = BaseAxe(HOGETOOL,"hoge") 第一引数は素材、二は名前
		 * ツール名+ツールの種類で登録される
		 */
        localname = this.name = localname + "_axe";
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
