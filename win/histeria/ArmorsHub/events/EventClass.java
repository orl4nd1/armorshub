package win.histeria.ArmorsHub.events;

import org.bukkit.event.player.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.inventory.*;
import org.bukkit.event.*;

public class EventClass implements Listener
{
    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        final Location playerLocation = player.getLocation();
        final PlayerInventory playerInventory = player.getInventory();
        final ItemStack pecherarojo = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecherarojometa = (LeatherArmorMeta)pecherarojo.getItemMeta();
        pecherarojometa.setDisplayName(ChatColor.RED + "Red Chestplate");
        pecherarojometa.setColor(Color.RED);
        pecherarojo.setItemMeta((ItemMeta)pecherarojometa);
        final ItemStack pecheraazul = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheraazulmeta = (LeatherArmorMeta)pecheraazul.getItemMeta();
        pecheraazulmeta.setDisplayName(ChatColor.DARK_BLUE + "Blue Chestplate");
        pecheraazulmeta.setColor(Color.BLUE);
        pecheraazul.setItemMeta((ItemMeta)pecheraazulmeta);
        final ItemStack pecheraamarillo = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheraamarillometa = (LeatherArmorMeta)pecheraamarillo.getItemMeta();
        pecheraamarillometa.setDisplayName(ChatColor.YELLOW + "Yellow Chestplate");
        pecheraamarillometa.setColor(Color.YELLOW);
        pecheraamarillo.setItemMeta((ItemMeta)pecheraamarillometa);
        final ItemStack pecheraverde = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheraverdemeta = (LeatherArmorMeta)pecheraverde.getItemMeta();
        pecheraverdemeta.setDisplayName(ChatColor.DARK_GREEN + "Green Chestplate");
        pecheraverdemeta.setColor(Color.GREEN);
        pecheraverde.setItemMeta((ItemMeta)pecheraverdemeta);
        final ItemStack pecheralima = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheralimameta = (LeatherArmorMeta)pecheralima.getItemMeta();
        pecheralimameta.setDisplayName(ChatColor.GREEN + "Lime Chestplate");
        pecheralimameta.setColor(Color.LIME);
        pecheralima.setItemMeta((ItemMeta)pecheralimameta);
        final ItemStack pecherapurpura = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecherapurpurameta = (LeatherArmorMeta)pecherapurpura.getItemMeta();
        pecherapurpurameta.setDisplayName(ChatColor.DARK_PURPLE + "Purple Chestplate");
        pecherapurpurameta.setColor(Color.PURPLE);
        pecherapurpura.setItemMeta((ItemMeta)pecherapurpurameta);
        final ItemStack pecheramagenta = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheramagentameta = (LeatherArmorMeta)pecheramagenta.getItemMeta();
        pecheramagentameta.setDisplayName(ChatColor.LIGHT_PURPLE + "Magenta Chestplate");
        pecheramagentameta.setColor(Color.MAROON);
        pecheramagenta.setItemMeta((ItemMeta)pecheramagentameta);
        final ItemStack pecherarosa = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecherarosameta = (LeatherArmorMeta)pecherarosa.getItemMeta();
        pecherarosameta.setDisplayName(ChatColor.LIGHT_PURPLE + "Pink Chestplate");
        pecherarosameta.setColor(Color.FUCHSIA);
        pecherarosa.setItemMeta((ItemMeta)pecherarosameta);
        final ItemStack pecheranaranja = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheranaranjameta = (LeatherArmorMeta)pecheranaranja.getItemMeta();
        pecheranaranjameta.setDisplayName(ChatColor.GOLD + "Orange Chestplate");
        pecheranaranjameta.setColor(Color.ORANGE);
        pecheranaranja.setItemMeta((ItemMeta)pecheranaranjameta);
        final ItemStack pecheraceleste = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheracelestemeta = (LeatherArmorMeta)pecheraceleste.getItemMeta();
        pecheracelestemeta.setDisplayName(ChatColor.AQUA + "Light Blue Chestplate");
        pecheracelestemeta.setColor(Color.AQUA);
        pecheraceleste.setItemMeta((ItemMeta)pecheracelestemeta);
        final ItemStack pecherablanco = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecherablancometa = (LeatherArmorMeta)pecherablanco.getItemMeta();
        pecherablancometa.setDisplayName(ChatColor.WHITE + "White Chestplate");
        pecherablancometa.setColor(Color.WHITE);
        pecherablanco.setItemMeta((ItemMeta)pecherablancometa);
        final ItemStack pecheranegro = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheranegrometa = (LeatherArmorMeta)pecheranegro.getItemMeta();
        pecheranegrometa.setDisplayName(ChatColor.BLACK + "Black Chestplate");
        pecheranegrometa.setColor(Color.BLACK);
        pecheranegro.setItemMeta((ItemMeta)pecheranegrometa);
        final ItemStack pecheracyan = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheracyanmeta = (LeatherArmorMeta)pecheracyan.getItemMeta();
        pecheracyanmeta.setDisplayName(ChatColor.BLUE + "Cyan Chestplate");
        pecheracyanmeta.setColor(Color.TEAL);
        pecheracyan.setItemMeta((ItemMeta)pecheracyanmeta);
        final ItemStack pecheragris = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        final LeatherArmorMeta pecheragrismeta = (LeatherArmorMeta)pecheragris.getItemMeta();
        pecheragrismeta.setDisplayName(ChatColor.GRAY + "Gray Chestplate");
        pecheragrismeta.setColor(Color.GRAY);
        pecheragris.setItemMeta((ItemMeta)pecheragrismeta);
        final ItemStack pantalonrojo = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonrojometa = (LeatherArmorMeta)pantalonrojo.getItemMeta();
        pantalonrojometa.setDisplayName(ChatColor.RED + "Red Leggings");
        pantalonrojometa.setColor(Color.RED);
        pantalonrojo.setItemMeta((ItemMeta)pantalonrojometa);
        final ItemStack pantalonazul = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonazulmeta = (LeatherArmorMeta)pantalonazul.getItemMeta();
        pantalonazulmeta.setDisplayName(ChatColor.DARK_BLUE + "Blue Leggings");
        pantalonazulmeta.setColor(Color.BLUE);
        pantalonazul.setItemMeta((ItemMeta)pantalonazulmeta);
        final ItemStack pantalonamarillo = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonamarillometa = (LeatherArmorMeta)pantalonamarillo.getItemMeta();
        pantalonamarillometa.setDisplayName(ChatColor.YELLOW + "Yellow Leggings");
        pantalonamarillometa.setColor(Color.YELLOW);
        pantalonamarillo.setItemMeta((ItemMeta)pantalonamarillometa);
        final ItemStack pantalonverde = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonverdemeta = (LeatherArmorMeta)pantalonverde.getItemMeta();
        pantalonverdemeta.setDisplayName(ChatColor.DARK_GREEN + "Green Leggings");
        pantalonverdemeta.setColor(Color.GREEN);
        pantalonverde.setItemMeta((ItemMeta)pantalonverdemeta);
        final ItemStack pantalonlima = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonlimameta = (LeatherArmorMeta)pantalonlima.getItemMeta();
        pantalonlimameta.setDisplayName(ChatColor.GREEN + "Lime Leggings");
        pantalonlimameta.setColor(Color.LIME);
        pantalonlima.setItemMeta((ItemMeta)pantalonlimameta);
        final ItemStack pantalonpurpura = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonpurpurameta = (LeatherArmorMeta)pantalonpurpura.getItemMeta();
        pantalonpurpurameta.setDisplayName(ChatColor.DARK_PURPLE + "Purple Leggings");
        pantalonpurpurameta.setColor(Color.PURPLE);
        pantalonpurpura.setItemMeta((ItemMeta)pantalonpurpurameta);
        final ItemStack pantalonmagenta = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonmagentameta = (LeatherArmorMeta)pantalonmagenta.getItemMeta();
        pantalonmagentameta.setDisplayName(ChatColor.LIGHT_PURPLE + "Magenta Leggings");
        pantalonmagentameta.setColor(Color.MAROON);
        pantalonmagenta.setItemMeta((ItemMeta)pantalonmagentameta);
        final ItemStack pantalonrosa = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonrosameta = (LeatherArmorMeta)pantalonrosa.getItemMeta();
        pantalonrosameta.setDisplayName(ChatColor.LIGHT_PURPLE + "Pink Leggings");
        pantalonrosameta.setColor(Color.FUCHSIA);
        pantalonrosa.setItemMeta((ItemMeta)pantalonrosameta);
        final ItemStack pantalonnaranja = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonnaranjameta = (LeatherArmorMeta)pantalonnaranja.getItemMeta();
        pantalonnaranjameta.setDisplayName(ChatColor.GOLD + "Orange Leggings");
        pantalonnaranjameta.setColor(Color.ORANGE);
        pantalonnaranja.setItemMeta((ItemMeta)pantalonnaranjameta);
        final ItemStack pantalonceleste = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantaloncelestemeta = (LeatherArmorMeta)pantalonceleste.getItemMeta();
        pantaloncelestemeta.setDisplayName(ChatColor.AQUA + "Light Blue Leggings");
        pantaloncelestemeta.setColor(Color.AQUA);
        pantalonceleste.setItemMeta((ItemMeta)pantaloncelestemeta);
        final ItemStack pantalonblanco = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonblancometa = (LeatherArmorMeta)pantalonblanco.getItemMeta();
        pantalonblancometa.setDisplayName(ChatColor.WHITE + "White Leggings");
        pantalonblancometa.setColor(Color.WHITE);
        pantalonblanco.setItemMeta((ItemMeta)pantalonblancometa);
        final ItemStack pantalonnegro = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalonnegrometa = (LeatherArmorMeta)pantalonnegro.getItemMeta();
        pantalonnegrometa.setDisplayName(ChatColor.BLACK + "Black Leggings");
        pantalonnegrometa.setColor(Color.BLACK);
        pantalonnegro.setItemMeta((ItemMeta)pantalonnegrometa);
        final ItemStack pantaloncyan = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantaloncyanmeta = (LeatherArmorMeta)pantaloncyan.getItemMeta();
        pantaloncyanmeta.setDisplayName(ChatColor.BLUE + "Cyan Leggings");
        pantaloncyanmeta.setColor(Color.TEAL);
        pantaloncyan.setItemMeta((ItemMeta)pantaloncyanmeta);
        final ItemStack pantalongris = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        final LeatherArmorMeta pantalongrismeta = (LeatherArmorMeta)pantalongris.getItemMeta();
        pantalongrismeta.setDisplayName(ChatColor.GRAY + "Gray Leggings");
        pantalongrismeta.setColor(Color.GRAY);
        pantalongris.setItemMeta((ItemMeta)pantalongrismeta);
        final ItemStack botasrojo = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasrojometa = (LeatherArmorMeta)botasrojo.getItemMeta();
        botasrojometa.setDisplayName(ChatColor.RED + "Red Boots");
        botasrojometa.setColor(Color.RED);
        botasrojo.setItemMeta((ItemMeta)botasrojometa);
        final ItemStack botasazul = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasazulmeta = (LeatherArmorMeta)botasazul.getItemMeta();
        botasazulmeta.setDisplayName(ChatColor.DARK_BLUE + "Blue Boots");
        botasazulmeta.setColor(Color.BLUE);
        botasazul.setItemMeta((ItemMeta)botasazulmeta);
        final ItemStack botasamarillo = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasamarillometa = (LeatherArmorMeta)botasamarillo.getItemMeta();
        botasamarillometa.setDisplayName(ChatColor.YELLOW + "Yellow Boots");
        botasamarillometa.setColor(Color.YELLOW);
        botasamarillo.setItemMeta((ItemMeta)botasamarillometa);
        final ItemStack botasverde = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasverdemeta = (LeatherArmorMeta)botasverde.getItemMeta();
        botasverdemeta.setDisplayName(ChatColor.DARK_GREEN + "Green Boots");
        botasverdemeta.setColor(Color.GREEN);
        botasverde.setItemMeta((ItemMeta)botasverdemeta);
        final ItemStack botaslima = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botaslimameta = (LeatherArmorMeta)botaslima.getItemMeta();
        botaslimameta.setDisplayName(ChatColor.GREEN + "Lime Boots");
        botaslimameta.setColor(Color.LIME);
        botaslima.setItemMeta((ItemMeta)botaslimameta);
        final ItemStack botaspurpura = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botaspurpurameta = (LeatherArmorMeta)botaspurpura.getItemMeta();
        botaspurpurameta.setDisplayName(ChatColor.DARK_PURPLE + "Purple Boots");
        botaspurpurameta.setColor(Color.PURPLE);
        botaspurpura.setItemMeta((ItemMeta)botaspurpurameta);
        final ItemStack botasmagenta = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasmagentameta = (LeatherArmorMeta)botasmagenta.getItemMeta();
        botasmagentameta.setDisplayName(ChatColor.LIGHT_PURPLE + "Magenta Boots");
        botasmagentameta.setColor(Color.MAROON);
        botasmagenta.setItemMeta((ItemMeta)botasmagentameta);
        final ItemStack botasrosa = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasrosameta = (LeatherArmorMeta)botasrosa.getItemMeta();
        botasrosameta.setDisplayName(ChatColor.LIGHT_PURPLE + "Pink Boots");
        botasrosameta.setColor(Color.FUCHSIA);
        botasrosa.setItemMeta((ItemMeta)botasrosameta);
        final ItemStack botasnaranja = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasnaranjameta = (LeatherArmorMeta)botasnaranja.getItemMeta();
        botasnaranjameta.setDisplayName(ChatColor.GOLD + "Orange Boots");
        botasnaranjameta.setColor(Color.ORANGE);
        botasnaranja.setItemMeta((ItemMeta)botasnaranjameta);
        final ItemStack botasceleste = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botascelestemeta = (LeatherArmorMeta)botasceleste.getItemMeta();
        botascelestemeta.setDisplayName(ChatColor.AQUA + "Light Blue Boots");
        botascelestemeta.setColor(Color.AQUA);
        botasceleste.setItemMeta((ItemMeta)botascelestemeta);
        final ItemStack botasblanco = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasblancometa = (LeatherArmorMeta)botasblanco.getItemMeta();
        botasblancometa.setDisplayName(ChatColor.WHITE + "White Boots");
        botasblancometa.setColor(Color.WHITE);
        botasblanco.setItemMeta((ItemMeta)botasblancometa);
        final ItemStack botasnegro = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasnegrometa = (LeatherArmorMeta)botasnegro.getItemMeta();
        botasnegrometa.setDisplayName(ChatColor.BLACK + "Black Boots");
        botasnegrometa.setColor(Color.BLACK);
        botasnegro.setItemMeta((ItemMeta)botasnegrometa);
        final ItemStack botascyan = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botascyanmeta = (LeatherArmorMeta)botascyan.getItemMeta();
        botascyanmeta.setDisplayName(ChatColor.BLUE + "Cyan Boots");
        botascyanmeta.setColor(Color.TEAL);
        botascyan.setItemMeta((ItemMeta)botascyanmeta);
        final ItemStack botasgris = new ItemStack(Material.LEATHER_BOOTS, 1);
        final LeatherArmorMeta botasgrismeta = (LeatherArmorMeta)botasgris.getItemMeta();
        botasgrismeta.setDisplayName(ChatColor.GRAY + "Gray Boots");
        botasgrismeta.setColor(Color.GRAY);
        botasgris.setItemMeta((ItemMeta)botasgrismeta);
        if (player.hasPermission("*") || player.isOp()) {
            playerInventory.setChestplate(pecherarojo);
            playerInventory.setLeggings(pantalonrojo);
            playerInventory.setBoots(botasrojo);
        }
        else if (player.hasPermission("armorshub.red")) {
            playerInventory.setChestplate(pecherarojo);
            playerInventory.setLeggings(pantalonrojo);
            playerInventory.setBoots(botasrojo);
        }
        else if (player.hasPermission("armorshub.blue")) {
            playerInventory.setChestplate(pecheraazul);
            playerInventory.setLeggings(pantalonazul);
            playerInventory.setBoots(botasazul);
        }
        else if (player.hasPermission("armorshub.yellow")) {
            playerInventory.setChestplate(pecheraamarillo);
            playerInventory.setLeggings(pantalonamarillo);
            playerInventory.setBoots(botasamarillo);
        }
        else if (player.hasPermission("armorshub.green")) {
            playerInventory.setChestplate(pecheraverde);
            playerInventory.setLeggings(pantalonverde);
            playerInventory.setBoots(botasverde);
        }
        else if (player.hasPermission("armorshub.lime")) {
            playerInventory.setChestplate(pecheralima);
            playerInventory.setLeggings(pantalonlima);
            playerInventory.setBoots(botaslima);
        }
        else if (player.hasPermission("armorshub.purple")) {
            playerInventory.setChestplate(pecherapurpura);
            playerInventory.setLeggings(pantalonpurpura);
            playerInventory.setBoots(botaspurpura);
        }
        else if (player.hasPermission("armorshub.magenta")) {
            playerInventory.setChestplate(pecheralima);
            playerInventory.setLeggings(pantalonlima);
            playerInventory.setBoots(botaslima);
        }
        else if (player.hasPermission("armorshub.pink")) {
            playerInventory.setChestplate(pecherarosa);
            playerInventory.setLeggings(pantalonrosa);
            playerInventory.setBoots(botasrosa);
        }
        else if (player.hasPermission("armorshub.orange")) {
            playerInventory.setChestplate(pecheranaranja);
            playerInventory.setLeggings(pantalonnaranja);
            playerInventory.setBoots(botasnaranja);
        }
        else if (player.hasPermission("armorshub.lightblue")) {
            playerInventory.setChestplate(pecheraceleste);
            playerInventory.setLeggings(pantalonceleste);
            playerInventory.setBoots(botasceleste);
        }
        else if (player.hasPermission("armorshub.white")) {
            playerInventory.setChestplate(pecherablanco);
            playerInventory.setLeggings(pantalonblanco);
            playerInventory.setBoots(botasblanco);
        }
        else if (player.hasPermission("armorshub.black")) {
            playerInventory.setChestplate(pecheranegro);
            playerInventory.setLeggings(pantalonnegro);
            playerInventory.setBoots(botasnegro);
        }
        else if (player.hasPermission("armorshub.cyan")) {
            playerInventory.setChestplate(pecheracyan);
            playerInventory.setLeggings(pantaloncyan);
            playerInventory.setBoots(botascyan);
        }
        else if (player.hasPermission("armorshub.gray")) {
            playerInventory.setChestplate(pecheragris);
            playerInventory.setLeggings(pantalongris);
            playerInventory.setBoots(botasgris);
        }
    }
}
