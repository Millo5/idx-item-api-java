package org.idx.data.inject;

import java.util.Map;

import org.idx.Main;
import org.idx.data.DataInjector;
import org.idx.enums.ItemType;
import org.idx.enums.StackSize;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.ItemBase;
import org.idx.items.PotionItem;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.StackableStatsComponent;
import org.idx.utility.PotionEffect;

public class Consumables extends DataInjector {
    public static void consumables() {
        
        // Common
        {
            addItem(new Item("rope", "Rope", "lead", ItemType.CONSUMABLE)
                .setDescription("A long piece of rope, useful for climbing.")
                .addComponent(new AttributesComponent("grapple", "consumable"))
            );
            addItem(new Item("apple", "Apple", "apple", ItemType.CONSUMABLE)
                .setDescription("One a day keeps the doctor away.")
                .addComponent(new AttributesComponent("heal", "edible"))
                .addComponent(new StackableStatsComponent(Map.of(
                    Stat.HEALING, 2
                )))
            );
            addItem(new Item("small-health-potion", "Small Health Potion", "potion", ItemType.CONSUMABLE)
                .setDescription("Very potent, but not very large.")
                .setStackSize(StackSize.POTION)
                .setColor("#ff0000")
                .addComponent(new AttributesComponent("heal", "drinkable"))
                .addComponent(new StackableStatsComponent(Map.of(
                    Stat.HEALING, 4
                )))
            );
        }

        // Uncommon
        {
            addItem(new PotionItem("speed-potion", "Speed Potion", "potion",
                new PotionEffect("speed", 600, 1))
            );

            addItem(new PotionItem("strength-potion", "Strength Potion", "potion",
                new PotionEffect("strength", 600, 1))
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
            addItem(new Item("arrow", "Arrow", "arrow", ItemType.ARROW)
                .setDescription("A simple arrow, used for ranged weapons.")
                .addComponent(new StackableStatsComponent(Map.of(
                    Stat.DAMAGE, 1
                )))
            );
        }

        // Uncommon
        {

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
