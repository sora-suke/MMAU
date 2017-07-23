package com.sorasuke.MMAU.common;

import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;

/**
 * Created by sora_suke on 2016/12/22.
 * プロキシクラス
 */
public class MMAUProxy {
    /**
     * 特殊なレンダーの登録
     * */
    public void registerRender() {
    }

    /**
     * ブロックのモデルの登録
     * */
    public void registerItemBlockModel(Block b){

    }

    /**
     * アイテムのモデルの登録
     * */
    public void registerItemModel(Item i){

    }

    /**
     * 何かのアイテムで座標を登録した時に出すチャットメッセージ
     * @param p
     */
    public void chatCoordinateRegisterd(EntityPlayer p, BlockPos b, String s, boolean u){
    }

    public EntityPlayer getEntityPlayerInstance() {return null;}
}
