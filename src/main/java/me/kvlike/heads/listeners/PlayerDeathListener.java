package me.kvlike.heads.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e){

        if(e.getEntity().getKiller() instanceof Player) {

            ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);

            SkullMeta meta = (SkullMeta) head.getItemMeta();
            meta.setOwningPlayer(e.getEntity());
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Glowa gracza &c&l" + e.getEntity().getDisplayName()));

            head.setItemMeta(meta);

            e.getDrops().add(head);
        }

    }

}
