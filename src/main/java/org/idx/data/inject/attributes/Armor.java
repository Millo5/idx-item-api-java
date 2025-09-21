package org.idx.data.inject.attributes;

import org.idx.Main;
import org.idx.enums.*;
import org.idx.items.AttributeItem;
import org.idx.items.components.impl.StatsComponent;
import org.idx.items.components.impl.TriggersComponent;

import java.util.Map;

public class Armor {

    public static void inject() {

        // Common
        {
            Main.dataManager.addItem(new AttributeItem("polished", "Polished", "iron_chestplate", AttributeType.ENCHANTMENT)
                .setDescription("Increases the defense of armor")
                .setLevel(1)
                .setTarget(ItemType.ARMOR)
                .addComponent(new StatsComponent(Map.of(
                    Stat.DEFENSE, 1
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

    public static void curses() {
        // Common
        {

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

    public static void enchants() {
        // Common
        {

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
            Main.dataManager.addItem(new AttributeItem("recursion", "Recursion", "echo_shard", AttributeType.ENCHANTMENT)
                    .setDescription("A strange enchantment that allows the user to duplicate their actions")
                    .setRarity(Rarity.LEGENDARY)
                    .setTarget(ItemType.ARMOR)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.RECURSION, 25
                    )))
            );
            Main.dataManager.addItem(new AttributeItem("voltaic-aura", "Voltaic Aura", "light_blue_dye", AttributeType.ENCHANTMENT)
                    .setDescription("A powerful enchantment that creates an aura of damage around the user")
                    .setRarity(Rarity.LEGENDARY)
                    .setTarget(ItemType.HELMET)
                    .addComponent(new TriggersComponent(
                            Trigger.PASSIVE,
                            Trigger.PASSIVE_SLOW
                    ))
            );
            Main.dataManager.addItem(new AttributeItem("gourmand", "Gourmand", "cake", AttributeType.ENCHANTMENT)
                    .setDescription("A wondrous enchantment that heals surrounding allies when the user eats.")
                    .setRarity(Rarity.LEGENDARY)
                    .setTarget(ItemType.CHESTPLATE)
                    .addComponent(new TriggersComponent(
                            Trigger.EAT_GLOBAL
                    ))
            );
        }

        // Mythic
        {

        }
    }


}
