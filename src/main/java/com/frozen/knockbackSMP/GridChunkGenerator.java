package com.frozen.knockbackSMP;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;



public class GridChunkGenerator extends ChunkGenerator {
    public void deleteSlice(Chunk chunk, World world, int x, int z) {
        for (int y = -64; y<321; y++) {
            if (chunk.getBlock(x, y, z).getType() != Material.AIR) {
                chunk.getBlock(x, y, z).setType(Material.AIR);
            }
        }
    }
    public void populate(World world, Random random, Chunk chunk) {
        for (int x = 0; x<16; x++) {
            if (x <= 14 && (x % 4 == 1 || x % 4 == 2)) {
                for (int z = 0; z<16; z++) {
                    deleteSlice(chunk, world, x, z);
                    deleteSlice(chunk, world, z, x);
                }
            }
        }
    }

}
