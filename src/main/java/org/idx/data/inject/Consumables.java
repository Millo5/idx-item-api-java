package org.idx.data.inject;

import java.util.Map;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.StackableStatsComponent;
import org.idx.items.components.impl.StatsComponent;

public class Consumables {
    public static void consumables() {
        
        // Common
        {
            Main.dataManager.addItem(new Item<>("rope", "Rope", "lead", ItemType.CONSUMABLE)
                .setDescription("A long piece of rope, useful for climbing.")
                .addComponent(new AttributesComponent("grapple", "consumable"))
            );
            Main.dataManager.addItem(new Item<>("apple", "Apple", "apple", ItemType.CONSUMABLE)
                .setDescription("One a day keeps the doctor away.")
                .addComponent(new AttributesComponent("heal", "consumable"))
                .addComponent(new StackableStatsComponent(Map.of(
                    Stat.HEALING, 2
                )))
            );
            Main.dataManager.addItem(new Item<>("small-health-potion", "Small Health Potion", "potion", ItemType.CONSUMABLE)
                .setDescription("Very potent, but not very large.")
                .setColor("#ff0000")
                .addComponent(new AttributesComponent("heal", "consumable"))
                .addComponent(new StackableStatsComponent(Map.of(
                    Stat.HEALING, 4
                )))
            );
        }

        // Rare
        {

        }

        // Epic
        {

        }

        // Legendary
        {
            
        }

        // Mythic
        {
            
        }
    }

    public static void arrows() {

        // Common
        {
            Main.dataManager.addItem(new Item<>("arrow", "Arrow", "arrow", ItemType.ARROW)
                .setDescription("A simple arrow, used for ranged weapons.")
                .addComponent(new StackableStatsComponent(Map.of(
                    Stat.DAMAGE, 1
                )))
            );
        }

        // Rare
        {

        }

        // Epic
        {

        }

        // Legendary
        {
            
        }

        // Mythic
        {
            
        }
    }
}
