package com.sorasuke.MMAU.tileentities;

import net.minecraft.tileentity.TileEntity;

/**
 * Created by sora_suke on 2016/12/22.
 */
public class TileEntityChickenHead extends TileEntity {
    public void updateEntity() {
        worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);//同期メソッド


    }
}
