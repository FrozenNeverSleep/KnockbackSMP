package com.frozen.knockbackSMP;

import org.bukkit.plugin.java.JavaPlugin;

public final class KnockbackSMP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // getServer().getPluginManager().registerEvents(new ChunkGenerationListener(), this);
        getServer().getPluginManager().registerEvents(new KnockBackListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
