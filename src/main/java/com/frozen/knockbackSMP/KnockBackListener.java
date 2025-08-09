package com.frozen.knockbackSMP;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class KnockBackListener implements Listener {

    private final JavaPlugin plugin; // store plugin reference

    public KnockBackListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void knockbackMultiplier(Player player, int multiplier) {
        double y = player.getVelocity().getY();
        player.setVelocity(player.getVelocity().multiply(multiplier).setY(y));
    }

    @EventHandler
    public void onPlayerHit(EntityDamageByEntityEvent event) {
        if (!(event.getEntity() instanceof Player damaged)) return;
        Bukkit.getScheduler().runTaskLater(plugin, () -> {
            knockbackMultiplier(damaged, 5); // Apply 5x knockback
        }, 0);
    }
}
