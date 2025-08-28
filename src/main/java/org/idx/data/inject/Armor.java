package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.StatsComponent;

import java.util.Map;

public class Armor {

    public static void unique() {

        // Helmets
        {
            Main.dataManager.addItem(new Item<>("illusioners-hood", "Illusioner's Hood", "leather_helmet", ItemType.HELMET)
                    .setDescription("A hood worn by illusioners, it has a strange aura.")
                    .setRarity(Rarity.MYTHIC)
                    .setColor("#00a0a0")
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DEFENSE, 8,
                            Stat.HEALTH, 4)))
                    .addComponent(
                            new AttributesComponent("recursion")
                                    .setEnchantSlots(1))
                    .setLevel(5));
        }

        // Chestplates
        {
            
        }

        // Leggings
        {
            Main.dataManager.addItem(new Item<>("madam-8-legs", "Madam 8 Legs", "diamond_leggings", ItemType.LEGGINGS)
                .setDescription("A pair of enchanted legs that greatly increase the speed of the wearer")
                .setRarity(Rarity.EPIC)
                .addComponent(
                    new StatsComponent(Map.of(
                        Stat.DEFENSE, 10,
                        Stat.HEALTH, 5,
                        Stat.MOVE_SPEED, 25,
                        Stat.CRIT_CHANCE, 25,
                        Stat.ATTACK_SPEED, 25
                    ))
                )
            );
        }

        // Boots
        {

        }

    }

    public static void sets() {
        // Leather
        {
            Main.dataManager.addItem(new Item<>(
                    "leather-hood", "Leather Hood", "leather_helmet", ItemType.HELMET)
                    .setDescription("Slightly lessens blows to the head. Slightly.")
                    .setRarity(Rarity.COMMON)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DEFENSE, 2)))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(1))
            );

            Main.dataManager.addItem(new Item<>(
                    "leather-tunic", "Leather Tunic", "leather_chestplate", ItemType.CHESTPLATE)
                    .setDescription("Protect yourself with the power of cow skin.")
                    .setRarity(Rarity.COMMON)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DEFENSE, 3)))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(1))
            );

            Main.dataManager.addItem(new Item<>(
                    "leather-pants", "Leather Pants", "leather_leggings", ItemType.LEGGINGS)
                    .setDescription("Protect your legs with the power of cow skin.")
                    .setRarity(Rarity.COMMON)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DEFENSE, 3)))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(1))
            );

            Main.dataManager.addItem(new Item<>(
                    "leather-boots", "Leather Boots", "leather_boots", ItemType.BOOTS)
                    .setDescription("Protect your feet with the power of cow skin.")
                    .setRarity(Rarity.COMMON)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DEFENSE, 2)))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(1))
            );

        }
    }

}
