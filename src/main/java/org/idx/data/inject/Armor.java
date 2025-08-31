package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.SetComponent;
import org.idx.items.components.impl.StatsComponent;

import java.util.Map;

public class Armor {

    public static void unique() {

        // Helmets
        {
            // Common
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
                Main.dataManager.addItem(new Item<>("echoing-hood", "Echoing Hood", "leather_helmet", ItemType.HELMET)
                    .setDescription("A legendary relic of the deep dark, with the ability to echo it's wearer's actions.")
                    .setRarity(Rarity.MYTHIC)
                    .setColor("#012a39")
                    .addComponent(new StatsComponent(Map.of(
                        Stat.DEFENSE, 8,
                        Stat.HEALTH, 4
                    )))
                    .addComponent(new AttributesComponent("recursion")
                        .setEnchantSlots(1)
                    )
                    .setLevel(5)
                );
                Main.dataManager.addItem(new Item<>("voltaic-crown", "Voltaic Crown", "diamond_helmet", ItemType.HELMET)
                    .setDescription("A crown of crystal, brimming with electrical potential.")
                    .setRarity(Rarity.MYTHIC)
                    .addComponent(new StatsComponent(Map.of(
                        Stat.DEFENSE,  6,
                        Stat.DAMAGE, 5
                    )))
                    .addComponent(new AttributesComponent("voltaic-aura")
                        .setEnchantSlots(2)
                    )
                    .setLevel(10)
                );
            }
        }

        // Chestplates
        {
            // Common
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

        // Leggings
        {
            // Common
            {

            }

            // Rare
            {

            }

            // Epic
            {
                Main.dataManager.addItem(new Item<>("madam-8-legs", "Madam 8 Legs", "diamond_leggings", ItemType.LEGGINGS)
                    .setDescription("A pair of enchanted legs that greatly increase the speed of the wearer")
                    .setRarity(Rarity.EPIC)
                    .addComponent(new StatsComponent(Map.of(
                        Stat.DEFENSE, 10,
                        Stat.HEALTH, 5,
                        Stat.MOVE_SPEED, 25,
                        Stat.CRIT_CHANCE, 25,
                        Stat.ATTACK_SPEED, 25
                    )))
                );
            }

            // Legendary
            {

            }

            // Mythic
            {

            }
                
        }

        // Boots
        {
            // Common
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

        // Clyde's Lost Set
        {
            Main.dataManager.addItem(new Item<>(
                    "veil-of-clyde", "Veil of Clyde", "chainmail_helmet", ItemType.HELMET)
                    .setDescription("The lost helmet of the great adventurer, Clyde.")
                    .setRarity(Rarity.MYTHIC)
                    .addComponent(new SetComponent("clydes-lost-set"))
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DEFENSE, 10,
                            Stat.HEALTH, 5,
                            Stat.EVASION, 10,
                            Stat.CRIT_DAMAGE, 40
                    )))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(2))
            );
            Main.dataManager.addItem(new Item<>(
                    "clydes-carapace", "Clyde's Carapace", "chainmail_chestplate", ItemType.CHESTPLATE)
                    .setDescription("The lost chestplate of the great adventurer, Clyde.")
                    .setRarity(Rarity.MYTHIC)
                    .addComponent(new SetComponent("clydes-lost-set"))
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DEFENSE, 15,
                            Stat.HEALTH, 7,
                            Stat.EVASION, 10,
                            Stat.CRIT_DAMAGE, 40
                    )))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(2))
            );
            Main.dataManager.addItem(new Item<>(
                    "clydes-strides", "Clyde's Strides", "chainmail_leggings", ItemType.LEGGINGS)
                    .setDescription("The lost leggings of the great adventurer, Clyde.")
                    .setRarity(Rarity.MYTHIC)
                    .addComponent(new SetComponent("clydes-lost-set"))
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DEFENSE, 12,
                            Stat.HEALTH, 6,
                            Stat.EVASION, 10,
                            Stat.CRIT_DAMAGE, 40
                    )))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(2))
            );
            Main.dataManager.addItem(new Item<>(
                    "treads-of-clyde", "Treads of Clyde", "chainmail_boots", ItemType.BOOTS)
                    .setDescription("The lost boots of the great adventurer, Clyde.")
                    .setRarity(Rarity.MYTHIC)
                    .addComponent(new SetComponent("clydes-lost-set"))
                    .addComponent(new StatsComponent(Map.of(
                            Stat.DEFENSE, 8,
                            Stat.HEALTH, 4,
                            Stat.EVASION, 10,
                            Stat.CRIT_DAMAGE, 40
                    )))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(2))
            );
        }
    }

}
