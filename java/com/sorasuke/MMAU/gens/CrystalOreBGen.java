package com.sorasuke.MMAU.gens;

import java.util.Random;

import com.sorasuke.MMAU.MMAURegistry;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class CrystalOreBGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		//MystCraftの世界に生成されてなかったので変更
		//if (world.provider instanceof WorldProviderSurface) {
			genOre(world, random, chunkX << 4, chunkZ << 4);
		//}

	}

	private void genOre(World world, Random rnd, int x, int z) {

		int genR = new Random().nextInt(10);

		if (genR == 0) {
			int genX = x + rnd.nextInt(16);
			int genZ = z + rnd.nextInt(16);
			int genY = 1 + rnd.nextInt(29);
			new WorldGenMinable(MMAURegistry.CrystalBlock, 0, 35, Blocks.stone).generate(world, rnd, genX, genY, genZ);
		}

	}

}
