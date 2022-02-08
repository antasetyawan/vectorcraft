package me.pettersins.vectorcraftproject.Command;

import me.pettersins.vectorcraftproject.Vectorcraftproject;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class reload implements CommandExecutor {

    private Vectorcraftproject plugin;


    public reload(Vectorcraftproject plugin) {
        this.plugin = plugin;
        plugin.getCommand("petterreload").setExecutor(this);

    }

    @Override
    public boolean onCommand(CommandSender sender,Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            plugin.reloadConfig();
            sender.sendMessage("only Console can execute the commands!");
            return true;
        }
        Player c = (Player) sender;
        if (c.hasPermission("pettersins.use")){
            c.sendMessage("hi!");
        } else {
            c.sendMessage("you dont have permission");
        }



        return false;
    }
}
