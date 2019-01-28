package fr.isolated.world;

import fr.isolated.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) {
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
     //   generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 18);
        //  generateOre(ModBlocks.TOPAZE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 8, 12, random.nextInt(4) + 1, 8);
        //   generateOre(ModBlocks.ONYX_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 10, random.nextInt(3) + 1, 6);

        generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 32 ,chunkZ * 32, 5, 10, random.nextInt(3) + 1, 2);
        generateOre(Blocks.EMERALD_ORE.getDefaultState(), world, random, chunkX * 64 ,chunkZ * 64, 5, 10, random.nextInt(9) + 1, 4);

        //   generateOre(ModBlocks.SAPPHIRE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 12, random.nextInt(3) + 1, 6);
    }



    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;
        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }
}
