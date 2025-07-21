package com.frozen.knockbackSMP;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.util.Vector;

public class KnockBackListener implements Listener {
    @EventHandler
    public void onPlayerHit(EntityDamageByEntityEvent event) {
        if (!(event.getEntity() instanceof Player)) return;
        Entity damager = event.getDamager();
        if (damager instanceof Projectile) {
            event.getEntity().setVelocity(event.getDamager().getVelocity().normalize().multiply(20).setY(0.5));
            return;
        }
        Vector knockback = event.getDamager().getLocation().getDirection().multiply(200);
        if (knockback.lengthSquared() < 0.1) {
            event.getEntity().setVelocity(event.getEntity().getLocation().toVector().subtract(damager.getLocation().toVector()).multiply(200).setY(0.5));
        }
    }
}
