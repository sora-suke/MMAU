package com.sorasuke.MMAU.utils;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by sora_suke on 2017/01/13.
 */
public class MMAUPlaySound {
    public static void playSound(World world, BlockPos blockPos, String soundName, SoundCategory soundCategory) {
        ResourceLocation location = new ResourceLocation(soundName);
        SoundEvent soundEvent = new SoundEvent(location);
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        world.playSound((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, soundEvent, soundCategory, 1.0F, world.rand.nextFloat() * 0.1F + 0.9F, false);

    }
}
