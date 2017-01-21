package com.sorasuke.MMAU.items;

import com.sorasuke.MMAU.MMAU;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BaseArmor extends ItemArmor {

    static String ARMORTYPE[] = {"helmet", "chestplate", "leggings", "boots"};

    public BaseArmor(ArmorMaterial material, int type, String localname) {
        super(material, 0, type);
        /*鎧のベースクラス。
		 * 使い方
		 * このクラスをコピペして、新しいクラスを作る
		 * コピーしたのをpreInitや、そこで呼ばれるメソッドで使う
		 * 例:メソッド名はHogeArmorとする
		 * HogeHelmet = new HogeArmor(HOGEARMOR, 0, "hoge");
		 * ↑こんな感じ
		 * 第一引数はアーマーマテリアル、二は鎧の種類(0～3、頭～足)
		 * 三は鎧の内部名、それ+_+第二引数で指定した種類の名前が実際に設定される
		 * ここのMODだと、素材名+Armorの名前のクラスにしている
		 * ここは消しても問題ない
		 */
        localname = localname + "_" + ARMORTYPE[type];
        setCreativeTab(MMAU.MMAUTOOLSTAB);
        setUnlocalizedName("MMAU_" + localname);
        setTextureName("mmau:" + localname);

        GameRegistry.registerItem(this, localname);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.armorType == 2) {
            return "MMAU:textures/models/armor/hoge_layer_2.png";
        }
        return "MMAU:textures/models/armor/hoge_layer_1.png";
    }

}
