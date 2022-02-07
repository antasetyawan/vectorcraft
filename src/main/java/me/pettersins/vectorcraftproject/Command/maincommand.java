package me.pettersins.vectorcraftproject.Command;

import me.pettersins.vectorcraftproject.Vectorcraftproject;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class maincommand implements CommandExecutor {

    private Vectorcraftproject plugin;

    public maincommand(Vectorcraftproject plugin){
        this.plugin = plugin;

    }

    @Override
    public boolean onCommand(CommandSender sender,Command command, String label, String[] args) {
        return false;
    }
}
