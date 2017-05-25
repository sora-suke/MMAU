package com.sorasuke.MMAU.tileentities;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

import java.util.Random;

/**
 * Created by sora_suke on 2017/03/30.
 */
public class TileEntityGuidanceMarker extends TileEntity implements ITickable{
    public float rotationX = new Random().nextInt(359);
    public float rotationY = new Random().nextInt(359);
    public float rotationZ = new Random().nextInt(359);

    public float speedX = ( new Random().nextInt(20) * 0.01F ) - 0.1F;
    public float speedY = ( new Random().nextInt(20) * 0.01F ) - 0.1F;
    public float speedZ = ( new Random().nextInt(20) * 0.01F ) - 0.1F;

    @Override
    public void update() {
        rotationX += speedX;
        rotationY += speedY;
        rotationZ += speedZ;

        rotationX = rotationX >= 360 ? rotationX - 360 : rotationX;
        rotationY = rotationY >= 360 ? rotationY - 360 : rotationY;
        rotationZ = rotationZ >= 360 ? rotationZ - 360 : rotationZ;
    }
}
