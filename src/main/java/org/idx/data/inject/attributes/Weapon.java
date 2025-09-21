package org.idx.data.inject.attributes;

import org.idx.data.DataInjector;
import org.idx.enums.*;
import org.idx.items.AttributeItem;
import org.idx.items.components.impl.StatsComponent;
import org.idx.items.components.impl.TriggersComponent;

import java.util.Map;

public class Weapon extends DataInjector {

    public static void inject() {
        // Common
        {
            addItem(new AttributeItem("slash", "Slash", "wooden_sword", AttributeType.ATTRIBUTE)
                    .setDescription("A basic arcing slash.")
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new TriggersComponent(
                            Trigger.MELEE_ATTACK
                    ))
            );
            addItem(new AttributeItem("stab", "Stab", "iron_shovel", AttributeType.ATTRIBUTE)
                    .setDescription("A thin stab.")
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new TriggersComponent(
                            Trigger.MELEE_ATTACK
                    ))
            );
            addItem(new AttributeItem("blade", "Blade", "iron_sword", AttributeType.ATTRIBUTE)
                    .setDescription("A basic melee weapon style.")
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new TriggersComponent(
                            Trigger.MELEE_ATTACK
                    ))
            );
            addItem(new AttributeItem("heavy-melee", "Heavy Melee", "iron_axe", AttributeType.ATTRIBUTE)
                    .setDescription("A powerful but slower melee style.")
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new TriggersComponent(
                            Trigger.MELEE_ATTACK
                    ))
            );
            addItem(new AttributeItem("light-melee", "Light Melee", "shears", AttributeType.ATTRIBUTE)
                    .setDescription("A fast and light melee style.")
                    .setTarget(ItemType.MELEE_WEAPON)
                    .addComponent(new TriggersComponent(
                            Trigger.MELEE_ATTACK
                    ))
            );
        }

        // Uncommon
        {

        }

        // Rare
        {
            addItem(new AttributeItem("combo-slash", "Combo Slash", "golden_sword", AttributeType.ATTRIBUTE)
                .setDescription("A three swing combo.")
                .setRarity(Rarity.RARE)
                .setTarget(ItemType.MELEE_WEAPON)
                .addComponent(new TriggersComponent(
                    Trigger.MELEE_ATTACK
                ))
            );

            addItem(new AttributeItem("lunging-thrust", "Lunging Thrust", "iron_shovel", AttributeType.ATTRIBUTE)
                .setDescription("A powerful thrust that carries the user along with it.")
                .setRarity(Rarity.RARE)
                .setTarget(ItemType.MELEE_WEAPON)
                .addComponent(new TriggersComponent(
                    Trigger.MELEE_ATTACK
                ))
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

        addItem(new AttributeItem("two-handed", "Two Handed", "lever", AttributeType.CURSE)
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
            addItem(new AttributeItem("sharp", "Sharp", "wooden_sword", AttributeType.ENCHANTMENT)
                .setDescription("Increases the damage of melee weapons")
                .setLevel(1)
                .setTarget(ItemType.MELEE_WEAPON)
                .addComponent(new StatsComponent(Map.of(
                    Stat.DAMAGE, 15
                )))
            );

            addItem(new AttributeItem("bloodied", "Bloodied", "redstone", AttributeType.ENCHANTMENT)
                .setDescription("Gives weapons a chance to bloody attacked enemies.")
                .setLevel(5)
                .setTarget(ItemType.MELEE_WEAPON)
                .addComponent(new StatsComponent(Map.of(
                    Stat.BLOODY, 10
                )))
            );
        }

        // Uncommon
        {
            addItem(new AttributeItem("throwable", "Throwable", "snowball", AttributeType.ENCHANTMENT)
                .setDescription("Allows melee weapons to be thrown when dropped, dealing damage at a distance.")
                .setRarity(Rarity.UNCOMMON)
                .setLevel(3)
                .setTarget(ItemType.MELEE_WEAPON)
                .addComponent(new TriggersComponent(
                    Trigger.DROP
                ))
            );
        }

        // Rare
        {
            addItem(new AttributeItem("visceral", "Visceral", "mutton", AttributeType.ENCHANTMENT)
                .setDescription("Killing bloodied enemies makes them explode in gore, dealing damage and applying blood to nearby enemies.")
                .setRarity(Rarity.RARE)
                .setLevel(10)
                .setTarget(ItemType.WEAPON)
                .addComponent(new TriggersComponent(
                    Trigger.KILL
                ))
            );
        }

        // Epic
        {
            addItem(new AttributeItem("shurikens", "Shurikens", "nether_star", AttributeType.ENCHANTMENT)
                .setDescription("Allows melee weapons to throw 3 shurikens, which deal 0.4x damage each.")
                .setRarity(Rarity.EPIC)
                .setLevel(8)
                .setTarget(ItemType.MELEE_WEAPON)
                .addComponent(new TriggersComponent(
                    Trigger.USE 
                ))
            );
        }

        // Legendary
        {

        }

        // Mythic
        {

        }
    }

}
