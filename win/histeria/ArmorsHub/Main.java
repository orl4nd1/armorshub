package win.histeria.ArmorsHub;

import org.bukkit.plugin.java.*;
import org.bukkit.event.*;
import org.bukkit.*;
import win.histeria.ArmorsHub.events.*;
import org.bukkit.plugin.*;
import win.histeria.ArmorsHub.hotbarclick.*;

public class Main extends JavaPlugin implements Listener
{
    private static Main instance;
    
    public static void setInstance(final Main instance) {
        Main.instance = instance;
    }
    
    public static Main getInstance() {
        return Main.instance;
    }
    
    public void onEnable() {
        Main.instance = this;
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "El plugin ArmorsHub se ha activado. Version: 1.1");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getPluginManager().registerEvents((Listener)new EventClass(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new ClickDeny(), (Plugin)this);
    }
    
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "El plugin ArmorsHub se ha desactivado.");
        Bukkit.getConsoleSender().sendMessage("");
    }
}
