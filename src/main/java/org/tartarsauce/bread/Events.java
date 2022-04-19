package org.tartarsauce.bread;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent e) {

        var lock = e.getEntity().getLocation();
        e.getEntity().getWorld().createExplosion(lock, 3.5f);
        e.getEntity().remove();

    }
}
