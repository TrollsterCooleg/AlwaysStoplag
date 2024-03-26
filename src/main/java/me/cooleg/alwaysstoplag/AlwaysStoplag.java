package me.cooleg.alwaysstoplag;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AlwaysStoplag extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new YuckyListeners(), this);
    }

}
