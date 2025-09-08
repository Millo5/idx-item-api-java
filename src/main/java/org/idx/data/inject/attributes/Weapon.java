package org.idx.data.inject.attributes;

import org.idx.Main;
import org.idx.enums.*;
import org.idx.items.AttributeItem;
import org.idx.items.components.impl.StatsComponent;
import org.idx.items.components.impl.TriggersComponent;

import java.util.Map;

public class Weapon {

    public static void inject() {
        // Common
        {
            Main.dataManager.addItem(new AttributeItem("slash", "Slash", "iron_sword", AttributeType.ATTRIBUTE)
                    .setDescription("A basic arcing slash.")
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new TriggersComponent(
                            Trigger.MELEE_ATTACK
                    ))
            );
            Main.dataManager.addItem(new AttributeItem("stab", "Stab", "iron_shovel", AttributeType.ATTRIBUTE)
                    .setDescription("A thin stab.")
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new TriggersComponent(
                            Trigger.MELEE_ATTACK
                    ))
            );
            Main.dataManager.addItem(new AttributeItem("currency", "Currency", "gold_nugget", AttributeType.ATTRIBUTE)
                    .setDescription("Denotes an item as currency.")
                    .addComponent(new TriggersComponent(
                            Trigger.PICKUP))
            );
        }

        // Uncommon
        {

        }

        // Rare
        {
            Main.dataManager.addItem(new AttributeItem("combo-slash", "Combo Slash", "golden_sword", AttributeType.ATTRIBUTE)
                    .setDescription("A three swing combo.")
                    .setRarity(Rarity.RARE)
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new TriggersComponent(
                            Trigger.MELEE_ATTACK
                    ))
            );

            Main.dataManager.addItem(new AttributeItem("throwing", "Throwing", "snowball", AttributeType.ATTRIBUTE)
                    .setDescription("Allows melee weapons to be thrown, dealing damage and returning to the thrower")
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new TriggersComponent(
                            Trigger.DROP))
            );
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

        Main.dataManager.addItem(new AttributeItem("two-handed", "Two Handed", "lever", AttributeType.CURSE)
                .setDescription("Requires both hands to wield, remove offhand item to use")
                .setTarget(ItemType.WEAPON)
                .addComponent(new StatsComponent(Map.of(
                        Stat.TWO_HANDED_CURSE, 1
                )))
        );

    }

    public static void enchants() {
        // Common
        {
            Main.dataManager.addItem(new AttributeItem("sharp", "Sharp", "wooden_sword", AttributeType.ENCHANTMENT)
                    .setDescription("Increases the damage of melee weapons")
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DAMAGE, 1.5
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
