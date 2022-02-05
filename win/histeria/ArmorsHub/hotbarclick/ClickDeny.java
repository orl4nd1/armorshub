package win.histeria.ArmorsHub.hotbarclick;

import win.histeria.ArmorsHub.*;
import org.bukkit.event.inventory.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.inventory.*;
import org.bukkit.event.*;

public class ClickDeny implements Listener
{
    private Main plugin;
    private Main instance;
    String prefix;
    
    public ClickDeny() {
        this.plugin = (Main)Main.getPlugin((Class)Main.class);
        this.instance = Main.getInstance();
        this.prefix = "§8[§dArmorsHub§8] §7» ".replaceAll("\u00c2", "");
    }
    
    public Main getPlugin() {
        return this.plugin;
    }
    
    public void setInstance(final Main instance) {
        this.instance = instance;
    }
    
    public Main getInstance() {
        return this.instance;
    }
    
    @EventHandler
    public void playerClickInventoryEvent(final InventoryClickEvent event) {
        final Player player = (Player)event.getWhoClicked();
        final Location playerLocation = player.getLocation();
        final ItemStack itemClicked = event.getCurrentItem();
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.RED + "Red Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.RED + "You can't touch the red armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.RED + "Red Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.RED + "You can't touch the red armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.RED + "Red Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.RED + "You can't touch the red armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.DARK_BLUE + "Blue Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.DARK_BLUE + "You can't touch the blue armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.DARK_BLUE + "Blue Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.DARK_BLUE + "You can't touch the blue armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.DARK_BLUE + "Blue Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.DARK_BLUE + "You can't touch the blue armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.YELLOW + "Yellow Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.YELLOW + "You can't touch the yellow armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.YELLOW + "Yellow Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.YELLOW + "You can't touch the yellow armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.YELLOW + "Yellow Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.YELLOW + "You can't touch the yellow armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.DARK_GREEN + "Green Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.DARK_GREEN + "You can't touch the green armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.DARK_GREEN + "Green Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.DARK_GREEN + "You can't touch the green armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.DARK_GREEN + "Green Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.DARK_GREEN + "You can't touch the green armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.GREEN + "Lime Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.GREEN + "You can't touch the lime armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.GREEN + "Lime Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.GREEN + "You can't touch the lime armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.GREEN + "Lime Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.GREEN + "You can't touch the lime armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.DARK_PURPLE + "Purple Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.DARK_PURPLE + "You can't touch the purple armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.DARK_PURPLE + "Purple Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.DARK_PURPLE + "You can't touch the purple armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.DARK_PURPLE + "Purple Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.DARK_PURPLE + "You can't touch the purple armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.LIGHT_PURPLE + "Magenta Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.LIGHT_PURPLE + "You can't touch the magenta armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.LIGHT_PURPLE + "Magenta Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.LIGHT_PURPLE + "You can't touch the magenta armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.LIGHT_PURPLE + "Magenta Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.LIGHT_PURPLE + "You can't touch the magenta armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.LIGHT_PURPLE + "Pink Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.LIGHT_PURPLE + "You can't touch the pink armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.LIGHT_PURPLE + "Pink Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.LIGHT_PURPLE + "You can't touch the pink armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.LIGHT_PURPLE + "Pink Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.LIGHT_PURPLE + "You can't touch the pink armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.GOLD + "Orange Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.GOLD + "You can't touch the orange armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.GOLD + "Orange Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.GOLD + "You can't touch the orange armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.GOLD + "Orange Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.GOLD + "You can't touch the orange armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.AQUA + "Light Blue Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.AQUA + "You can't touch the light blue armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.AQUA + "Light Blue Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.AQUA + "You can't touch the light blue armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.AQUA + "Light Blue Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.AQUA + "You can't touch the light blue armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.WHITE + "White Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.WHITE + "You can't touch the white armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.WHITE + "White Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.WHITE + "You can't touch the white armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.WHITE + "White Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.WHITE + "You can't touch the white armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.BLACK + "Black Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.BLACK + "You can't touch the black armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.BLACK + "Black Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.BLACK + "You can't touch the black armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.BLACK + "Black Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.BLACK + "You can't touch the black armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.BLUE + "Cyan Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.BLUE + "You can't touch the cyan armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.BLUE + "Cyan Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.BLUE + "You can't touch the cyan armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.BLUE + "Cyan Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.BLUE + "You can't touch the cyan armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.GRAY + "Gray Chestplate")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.GRAY + "You can't touch the gray armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.GRAY + "Gray Leggings")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.GRAY + "You can't touch the gray armor!");
        }
        if (itemClicked.getItemMeta().getDisplayName().equals(this.prefix + ChatColor.GRAY + "Gray Boots")) {
            event.setCancelled(true);
            player.closeInventory();
            player.playSound(playerLocation, Sound.HORSE_ARMOR, 1.0f, 1.0f);
            player.sendMessage(this.prefix + ChatColor.GRAY + "You can't touch the gray armor!");
        }
    }
}
