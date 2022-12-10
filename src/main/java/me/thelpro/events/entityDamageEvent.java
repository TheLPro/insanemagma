package me.thelpro.events;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class entityDamageEvent implements Listener {

    @EventHandler
    public void entityDamageEvent(EntityDamageEvent e) {
        
        if (e.getEntity() instanceof LivingEntity) {
            LivingEntity entity = (LivingEntity) e.getEntity();
            if (e.getCause().equals(EntityDamageEvent.DamageCause.HOT_FLOOR)) {
                entity.damage(2);
            }
        }
    }

}
