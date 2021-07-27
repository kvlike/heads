package me.kvlike.heads;

import me.kvlike.heads.listeners.PlayerDeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Heads extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);

    }

}
