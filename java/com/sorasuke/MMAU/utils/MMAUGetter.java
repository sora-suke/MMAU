package com.sorasuke.MMAU.utils;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * 色々取得するメソッドがある
 * Created by sora_suke on 2017/05/31.
 */
public class MMAUGetter {

    public static Block getBlock(World w, BlockPos p){
        return w.getBlockState(p).getBlock();
    }

}
