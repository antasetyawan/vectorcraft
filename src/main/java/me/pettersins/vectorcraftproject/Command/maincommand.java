package me.pettersins.vectorcraftproject.Command;

import me.pettersins.vectorcraftproject.Vectorcraftproject;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class maincommand implements CommandExecutor {

    private Vectorcraftproject plugin;

    public maincommand(Vectorcraftproject plugin){
        this.plugin = plugin;
        plugin.getCommand("WOW").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender,Command command, String label, String[] args) {
        if(!(sender instanceof ConsoleCommandSender)){
            sender.sendMessage("only Console can execute the commands!");
            return true;
        }
        ConsoleCommandSender c = (ConsoleCommandSender) sender;




        return false;
    }
}
