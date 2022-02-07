package me.pettersins.vectorcraftproject.listener;

import me.pettersins.vectorcraftproject.Vectorcraftproject;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinleaves implements Listener {

    private static Vectorcraftproject plugin;

    public joinleaves(Vectorcraftproject plugin){
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent c){
        Player p = c.getPlayer();

        if (!p.hasPlayedBefore()) {
            Bukkit.broadcastMessage(plugin.getConfig().getString("firstjoin").replace("<player>", p.getName()));
        }
        else {
            Bukkit.broadcastMessage(plugin.getConfig().getString("firstjoin").replace("<player>", p.getName()));

        }
    }

}
