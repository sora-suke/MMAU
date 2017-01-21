package com.sorasuke.MMAU;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class MMAUTab extends CreativeTabs {

    public MMAUTab(String label) {
        super(label);
        // TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
    }

    @Override
    public Item getTabIconItem() {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        return Item.getItemFromBlock(Blocks.diamond_block);
    }

}
