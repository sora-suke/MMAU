package com.sorasuke.MMAU.gens;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

/**
 * 鉱石生成
 * */
public class MMAUOreGen implements IWorldGenerator {

    private Block block;
    private int maxHeight;
    private int minHeight;
    private int value;
    private int veinSize;
    private boolean isRare;
    private boolean enabled;

    public MMAUOreGen(Block block, int maxHeight, int minHeight, int value, int veinSize, boolean isRare, boolean enabled) {
        this.block = block;
        this.maxHeight = maxHeight;
        this.minHeight = minHeight;
        this.value = value;
        this.veinSize = veinSize;
        this.isRare = isRare;
        this.enabled = enabled;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if(this.enabled) {
            if (this.isRare) {
                Random rnd = new Random();
                if (random.nextInt(this.value) == 0) {
                    genOre(world, random, chunkX << 4, chunkZ << 4);
                }
            } else {
                for (int i = 0; i < this.value; i++) {
                    genOre(world, random, chunkX << 4, chunkZ << 4);
                }
            }
        }
    }

    private void genOre(World world, Random rnd, int x, int z) {
        int genX = x + rnd.nextInt(16);
        int genZ = z + rnd.nextInt(16);
        int genY = this.minHeight + rnd.nextInt(this.maxHeight - this.minHeight);
        BlockPos pos = new BlockPos(genX, genY, genZ);
        new WorldGenMinable(this.block.getDefaultState(), this.veinSize).generate(world, rnd, pos);
    }
}
