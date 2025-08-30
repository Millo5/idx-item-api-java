package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.StatsComponent;

import java.util.Map;

public class Weapons {

    public static void melee() {

        // Common
        {
            Main.dataManager.addItem(new Item<>("wooden-shiv", "Wooden Shiv", "wooden_sword", ItemType.MELEE_WEAPON)
                .setDescription("A simple wooden blade, not particularly effective.")
                .addComponent(new StatsComponent(Map.of(
                    Stat.DAMAGE, 1,
                    Stat.WEAPON_ATTACK_SPEED, 3.1
                )))
                .addComponent(new AttributesComponent("sword-slash"))
            );
        }

        // Uncommon
        {
            Main.dataManager.addItem(new Item<>("wooden-spear", "Wooden Spear", "wooden_shovel", ItemType.MELEE_WEAPON)
                .setDescription("A blunt spear made of wood, most likely used for training.")
                .addComponent(new StatsComponent(Map.of(
                    Stat.DAMAGE, 1,
                    Stat.WEAPON_ATTACK_SPEED, 1.1,
                    Stat.WEAPON_RANGE, 5
                )))
                .addComponent(new AttributesComponent("melee-stab"))
            );
        }

        // Rare
        {
            Main.dataManager.addItem(new Item<>("polished-sword", "Polished Sword", "iron_sword", ItemType.MELEE_WEAPON)
                .setDescription("A sword polished to a mirror finish, reflecting the light beautifully.")
                .setRarity(Rarity.RARE)
                .addComponent(new StatsComponent(Map.of(
                    Stat.DAMAGE, 7.0,
                    Stat.WEAPON_ATTACK_SPEED, 1.6,
                    Stat.CRIT_CHANCE, 5.0
                )))
                .addComponent(new AttributesComponent("sharp", "sword-slash")
                    .setEnchantSlots(1)
                )
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

        // Developer
        {
            Main.dataManager.addItem(new Item<>("clydes-blade", "Clyde's Blade", "armor_stand", ItemType.MELEE_WEAPON)
                .setDescription("A blade that seems to have a mind of it's own. Can be quite dangerous.")
                .setRarity(Rarity.DEVELOPER)
                .addComponent(StatsComponent.builder()
                        .add(Stat.DAMAGE, 9.5)
                        .add(Stat.WEAPON_ATTACK_SPEED, 1.6)
                        .add(Stat.WEAPON_RANGE, 1)
                        .add(Stat.DEFENSE, 2)
                        .add(Stat.HEALTH, 2)
                        .add(Stat.MOVE_SPEED, 40)
                        .add(Stat.CRIT_CHANCE, 40)
                        .add(Stat.CRIT_DAMAGE, 50)
                        .add(Stat.KNOCKBACK, -40)
                        .add(Stat.LUCK, 225)
                        .add(Stat.RECURSION, 20)
                        .add(Stat.EVASION, 30)
                        .add(Stat.RANGE, 30)
                        .add(Stat.LIFESTEAL, 20)
                        .build())
                .addComponent(new AttributesComponent("sharp", "sword-slash", "two-handed")
                    .setEnchantSlots(3)
                )
            );
        }
    }


    public static void ranged() {

        // Common
        {
            Main.dataManager.addItem(new Item<>("simple-bow", "Simple Bow", "bow", ItemType.RANGED_WEAPON)
                .setDescription("A basic bow, not particularly powerful but gets the job done,")
                .addComponent(new StatsComponent(Map.of(
                    Stat.DAMAGE, 2,
                    Stat.WEAPON_ATTACK_SPEED, 1.5,
                    Stat.WEAPON_RANGE, 15
                )))
            );
        }

        // Uncommon
        {

        }

        // Rare
        {
            Main.dataManager.addItem(new Item<>("longbow", "Longbow", "bow", ItemType.RANGED_WEAPON)
                .setDescription("A large bow with increased range and damage")
                .setRarity(Rarity.RARE)
                .addComponent(new StatsComponent(Map.of(
                    Stat.DAMAGE, 4,
                    Stat.WEAPON_ATTACK_SPEED, 1.2,
                    Stat.WEAPON_RANGE, 25
                )))
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
}
