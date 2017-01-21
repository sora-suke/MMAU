package com.sorasuke.MMAU.gens;

import java.util.Random;

import com.sorasuke.MMAU.blocks.MMAUBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OrichalcumOreGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
                         IChunkProvider chunkProvider) {
        if (world.provider instanceof WorldProviderSurface) {
            genOre(world, random, chunkX << 4, chunkZ << 4);
        }

    }

    private void genOre(World world, Random rnd, int x, int z) {

        int genX = x + rnd.nextInt(16);
        int genZ = z + rnd.nextInt(16);
        int genY = 1 + rnd.nextInt(9);
        new WorldGenMinable(MMAUBlocks.OrichalcumOre, 0, 1, Blocks.stone).generate(world, rnd, genX, genY, genZ);


    }

}
