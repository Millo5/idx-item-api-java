package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.*;
import org.idx.items.AttributeItem;
import org.idx.items.components.impl.StatsComponent;
import org.idx.items.components.impl.TriggersComponent;

import java.util.Map;

public class Attributes {

    public static void unique() {

        // Common
        {
            Main.dataManager.addItem(new AttributeItem("grapple", "Grapple", "lead", AttributeType.ATTRIBUTE)
                .setDescription("Allows the user to pull themselves to elevated positions.")
                .addComponent(new TriggersComponent(
                        Trigger.USE
                ))
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
            Main.dataManager.addItem(new AttributeItem("hook", "Hook", "chain", AttributeType.ATTRIBUTE)
                .setDescription("Pull enemies toward you or yourself to terrain.")
                .setRarity(Rarity.EPIC)
                .addComponent(new TriggersComponent(
                    Trigger.SWING,
                    Trigger.SWAP
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

    public static void consumable() {

        // Common
        {
            Main.dataManager.addItem(new AttributeItem("consumable", "Consumable", "cooked_beef", AttributeType.ATTRIBUTE)
                .setDescription("Causes the item to disappear when eaten.")
                .addComponent(new TriggersComponent(
                    Trigger.EAT
                ))
            );
            Main.dataManager.addItem(new AttributeItem("consumed", "Consumed", "structure_void", AttributeType.ATTRIBUTE)
                .setDescription("Causes the item to disappear when used.")
                .addComponent(new TriggersComponent(
                    Trigger.USE
                ))
            );
            Main.dataManager.addItem(new AttributeItem("heal", "Heal", "apple", AttributeType.ATTRIBUTE)
                .setDescription("Consuming this item heals the consumer.")
                .addComponent(new TriggersComponent(
                    Trigger.EAT
                ))
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

    public static void weaponAttributes() {

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

    public static void weaponCurses() {

        Main.dataManager.addItem(new AttributeItem("two-handed", "Two Handed", "lever", AttributeType.CURSE)
            .setDescription("Requires both hands to wield, remove offhand item to use")
            .setTarget(ItemType.WEAPON)
                .addComponent(new StatsComponent(Map.of(
                        Stat.TWO_HANDED_CURSE, 1
                )))
        );
    }

    public static void weaponEnchants() {

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

    public static void armorAttributes() {

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

    public static void armorCurses() {

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

    public static void armorEnchants() {

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
