package com.sorasuke.MMAU.utils;

import com.sorasuke.MMAU.MMAULogger;
import net.minecraft.util.math.BlockPos;

/**
 * Created by sora_suke on 2017/07/22.
 */
public class MMAUUtils {

    /** 2つのBlockPosの差から2つの相対座標を作るよ
     *
     * @param f 比較元
     * @param t 比較対象
     * @return 比較後
     */
    public static BlockPos getRelativePos(BlockPos f, BlockPos t){
        //MMAULogger.log(t.toString());
        //MMAULogger.log(f.toString());
        return new BlockPos(t.getX() - f.getX(), t.getY() - f.getY(), t.getZ() - f.getZ());
    }

}
