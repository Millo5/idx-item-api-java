package org.idx.data.inject;

import java.util.Map;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.StackableStatsComponent;

public class Consumables {
    public static void consumables() {
        
        // Common
        {
            Main.dataManager.addItem(new Item<>("rope", "Rope", "lead", ItemType.CONSUMABLE)
                    .setDescription("A long piece of rope, useful for climbing.")
                    .addComponent(new AttributesComponent("grapple"))
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
