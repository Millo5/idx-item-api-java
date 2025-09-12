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
                Main.dataManager.addItem(new Item<>("echoing-hood", "Echoing Hood", "leather_helmet", ItemType.HELMET)
                    .setDescription("A legendary relic of the deep dark, with the ability to echo it's wearer's actions.")
                    .setRarity(Rarity.LEGENDARY)
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
                    .setRarity(Rarity.LEGENDARY)
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

            // Mythic
            {
                
            }
        }

        // Chestplates
        {
            // Common
            {

            }

            // Uncommon
            {

            }

            // Rare
            {
                Main.dataManager.addItem(new Item<>("thornplate", "Thornplate", "leather_chestplate", ItemType.CHESTPLATE)
                    .setDescription("A tunic of moss and vines, stinging any who dare touch.")
                    .setRarity(Rarity.RARE)
                    .setLevel(4)
                    .setColor("#006600")
                    .addComponent(new StatsComponent(Map.of(
                        Stat.HEALTH, 6,
                        Stat.THORNS, 2
                    )))
                    .addComponent(new AttributesComponent("gourmand")
                        .setEnchantSlots(1)
                    )
                );
            }

            // Epic
            {

            }

            // Legendary
            {
                Main.dataManager.addItem(new Item<>("gourmands-bib", "Gourmand's Bib", "golden_chestplate", ItemType.CHESTPLATE)
                    .setDescription("An old bib that has born witness to countless numbers of incredible meals.")
                    .setRarity(Rarity.LEGENDARY)
                    .setLevel(8)
                    .addComponent(new StatsComponent(Map.of(
                        Stat.DEFENSE,  2,
                        Stat.HEALTH, 15,
                        Stat.ENDURANCE, 20
                    )))
                    .addComponent(new AttributesComponent("gourmand")
                        .setEnchantSlots(1)
                    )
                );
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

            // Uncommon
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

            // Uncommon
            {

            }

            // Rare
            {

            }

            // Epic
            {
                Main.dataManager.addItem(new Item<>("assassins-boots", "Assassin's Boots", "chainmail_boots", ItemType.BOOTS)
                    .setDescription("Boots worn by the legendary assassin, Shadow. Increases resilience and evasion.")
                    .setRarity(Rarity.EPIC)
                    .addComponent(new StatsComponent(Map.of(
                        Stat.DEFENSE, 8,
                        Stat.HEALTH, 4,
                        Stat.RESILIENCE, 15,
                        Stat.EVASION, 20
                    )))
                    .addComponent(new AttributesComponent()
                        .setEnchantSlots(1)
                    )
                    .setLevel(10)
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

    public static void sets() {
        // Leather
        {
            Main.dataManager.addItem(new Item<>(
                    "leather-hood", "Leather Hood", "leather_helmet", ItemType.HELMET)
                    .setDescription("Slightly lessens blows to the head. Slightly.")
                    .setLevel(1)
                    .setRarity(Rarity.COMMON)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.HEALTH, 1)))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(1))
            );

            Main.dataManager.addItem(new Item<>(
                    "leather-tunic", "Leather Tunic", "leather_chestplate", ItemType.CHESTPLATE)
                    .setDescription("Protect yourself with the power of cow skin.")
                    .setRarity(Rarity.COMMON)
                    .setLevel(1)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.HEALTH, 2)))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(1))
            );

            Main.dataManager.addItem(new Item<>(
                    "leather-pants", "Leather Pants", "leather_leggings", ItemType.LEGGINGS)
                    .setDescription("Incredibly suffocating.")
                    .setRarity(Rarity.COMMON)
                    .setLevel(1)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.HEALTH, 2)))
                    .addComponent(new AttributesComponent()
                            .setEnchantSlots(1))
            );

            Main.dataManager.addItem(new Item<>(
                    "leather-boots", "Leather Boots", "leather_boots", ItemType.BOOTS)
                    .setDescription("Ye olde Nikes.")
                    .setRarity(Rarity.COMMON)
                    .setLevel(1)
                    .addComponent(new StatsComponent(Map.of(
                            Stat.HEALTH, 1)))
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
