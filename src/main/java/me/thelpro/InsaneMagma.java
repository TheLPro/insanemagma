package me.thelpro;

import me.thelpro.events.entityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class InsaneMagma extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new entityDamageEvent(), this);

    }
}
