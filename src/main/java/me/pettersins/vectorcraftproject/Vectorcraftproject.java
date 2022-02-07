package me.pettersins.vectorcraftproject;

import me.pettersins.vectorcraftproject.listener.joinleaves;
import org.bukkit.plugin.java.JavaPlugin;
import me.pettersins.vectorcraftproject.Command.maincommand;

public final class Vectorcraftproject extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new maincommand(this);
        new joinleaves(this);

        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
