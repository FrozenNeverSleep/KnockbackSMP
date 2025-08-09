package com.frozen.knockbackSMP;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;

public class ChunkGenerationListener implements Listener {
    @EventHandler
    public void onChunkPopulate(ChunkPopulateEvent event) {
        Chunk chunk = event.getChunk();
        World world = chunk.getWorld();

//        for (int x = 0; x < 16; x++) {
//            for (int y = -64; y < world.getMaxHeight(); y++) {
//                for (int z = 0; z < 16; z++) {
//                    if ((x <= 14 && (x % 4 == 1 || x % 4 == 2)) || (z <= 14 && (z % 4 == 1 || z % 4 == 2))) {
//                        chunk.getBlock(x, y, z).setType(Material.AIR);
//                    }
//                }
//            }
//        }
        for (int x = 0; x<16; x++) {
            if (!(x <= 14 && (x % 4 == 1 || x % 4 == 2))) return;

        }
    }
}
