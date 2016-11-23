package com.sorasuke.MMAU.gens;

import java.util.Random;

import com.sorasuke.MMAU.MMAURegistry;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class LeadOreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		//MystCraftの世界に生成されてなかったので変更
		//if (world.provider instanceof WorldProviderSurface) {
			genOre(world, random, chunkX << 4, chunkZ << 4);
		//}

	}

	private void genOre(World world, Random rnd, int x, int z) {

		for (int i = 0; i < 8; i++) {

			int genX = x + rnd.nextInt(16);
			int genZ = z + rnd.nextInt(16);
			int genY = 1 + rnd.nextInt(44);
			new WorldGenMinable(MMAURegistry.LeadOre, 0, 8, Blocks.stone).generate(world, rnd, genX, genY, genZ);

		}

	}

}
