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

    }

}
