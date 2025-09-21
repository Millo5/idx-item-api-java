package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.Resource;
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
            Main.dataManager.addItem(new Item<>("old-wooden-sword", "Old Wooden Sword", "wooden_sword", ItemType.MELEE_WEAPON)
                .setDescription("A blunt wooden stick, used by students to train.")
                .setLevel(1)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 5,
                    Stat.STRAIN, 30
                )))
                .addComponent(new AttributesComponent("blade"))
            );

            Main.dataManager.addItem(new Item<>("wooden-sword", "Wooden Sword", "wooden_sword", ItemType.MELEE_WEAPON)
                .setDescription("A simple wooden blade, not particularly effective.")
                .setLevel(5)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 7,
                    Stat.STRAIN, 30
                )))
                .addComponent(new AttributesComponent("blade"))
            );

            Main.dataManager.addItem(new Item<>("polished-wooden-sword", "Polished Wooden Sword", "wooden_sword", ItemType.MELEE_WEAPON)
                .setDescription("A well crafted wooden sword, though seemingly more decorative than functional.")
                .setLevel(10)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 9,
                    Stat.STRAIN, 30
                )))
                .addComponent(new AttributesComponent("blade"))
            );

            Main.dataManager.addItem(new Item<>("sharpened-wooden-sword", "Sharpened Wooden Sword", "wooden_sword", ItemType.MELEE_WEAPON)
                .setDescription("A razor sharp sword of hardwood, designed for combative use.")
                .setLevel(15)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 12,
                    Stat.STRAIN, 30
                )))
                .addComponent(new AttributesComponent("blade"))
            );
        }

        // Uncommon
        {
            Main.dataManager.addItem(new Item<>("wooden-shiv", "Wooden Shiv", "wooden_sword", ItemType.MELEE_WEAPON)
                .setDescription("A short knife of wood, not particularly wounding but incredibly easy to wield.")
                .setRarity(Rarity.UNCOMMON)
                .setLevel(2)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 3,
                    Stat.STRAIN, 15
                )))
                .addComponent(new AttributesComponent("light-melee")
                    .setEnchantSlots(1)
                )
            );

            Main.dataManager.addItem(new Item<>("wooden-spear", "Wooden Spear", Resource.SPEAR, ItemType.MELEE_WEAPON)
                .setDescription("A blunt spear made of wood, most likely used for training.")
                .setRarity(Rarity.UNCOMMON)
                .setLevel(4)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 7,
                    Stat.STRAIN, 35,
                    Stat.WEAPON_RANGE, 2.5
                )))
                .addComponent(new AttributesComponent("stab")
                    .setEnchantSlots(1)
                )
            );
        }

        // Rare
        {
            Main.dataManager.addItem(new Item<>("throwing-axe", "Throwing Axe", "stone_axe", ItemType.MELEE_WEAPON)
                .setDescription("A balanced axe designed for throwing, can be retrieved after use.")
                .setRarity(Rarity.RARE)
                .setLevel(3)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 10,
                    Stat.STRAIN, 40,
                    Stat.CRIT_DAMAGE, 50.0
                )))
                .addComponent(new AttributesComponent("heavy-melee","throwable"))
            );

            Main.dataManager.addItem(new Item<>("travellers-blade", "Traveller's Blade", Resource.SWORD, ItemType.MELEE_WEAPON)
                .setDescription("The gold standard weapon for any new traveller looking to find their way within the dungeon.")
                .setRarity(Rarity.RARE)
                .setLevel(8)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 10,
                    Stat.STRAIN, 25,
                    Stat.CRIT_CHANCE, 20,
                    Stat.XP_BONUS, 10
                ))) 
                .addComponent(new AttributesComponent( "blade")
                    .setEnchantSlots(1)
                )
            );

            Main.dataManager.addItem(new Item<>("tarnished-golden-knife", "Tarnished Golden Knife", "golden_sword", ItemType.MELEE_WEAPON)
                .setDescription("A very old knife, plated in gold. Terrible quality, but with immense mystical potential.")
                .setRarity(Rarity.RARE)
                .setLevel(10)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 5,
                    Stat.STRAIN, 30
                )))
                .addComponent(new AttributesComponent("blade")
                    .setEnchantSlots(5)
                )
            );
        }

        // Epic
        {
            Main.dataManager.addItem(new Item<>("weighted-javelin", "Weighted Javelin", "iron_shovel", ItemType.MELEE_WEAPON)
                .setDescription("A javelin with a very heavy tip, which lurches the user forwards when used.")
                .setRarity(Rarity.EPIC)
                .setLevel(7)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 30,
                    Stat.STRAIN, 45,
                    Stat.MOVE_SPEED, 15,
                    Stat.EVASION, 5,
                    Stat.KNOCKBACK, 30,
                    Stat.WEAPON_RANGE, 1
                )))
                .addComponent(new AttributesComponent("lunging-thrust","two-handed")
                    .setEnchantSlots(1)
                )
            );

            Main.dataManager.addItem(new Item<>("granite-greatsword", "Granite Greatsword", "stone_sword", ItemType.MELEE_WEAPON)
                .setDescription("A giant hunk of heavy granite, tied haphazardly to a stick.")
                .setRarity(Rarity.RARE)
                .setLevel(8)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 25,
                    Stat.STRAIN, 40,
                    Stat.WEAPON_RANGE, 1.5,
                    Stat.CRIT_DAMAGE, 50,
                    Stat.KNOCKBACK, 50,
                    Stat.BLOODY, 50
                )))
                .addComponent(new AttributesComponent("heavy-melee","visceral"))
            );

        }

        // Legendary
        {
            Main.dataManager.addItem(new Item<>("bloodthirsty-cleaver", "Bloodthirsty Cleaver", Resource.BUTCHER_KNIFE, ItemType.MELEE_WEAPON)
                .setDescription("A bloodied cleaver that seems drawn to violence.")
                .setRarity(Rarity.LEGENDARY)
                .setLevel(9)
                .addComponent(new StatsComponent(Map.of(
                    Stat.WEAPON_DAMAGE, 5,
                    Stat.STRAIN, 15,
                    Stat.WEAPON_RANGE, -1.5,
                    Stat.MOVE_SPEED, 5,
                    Stat.CRIT_CHANCE, 25,
                    Stat.CRIT_DAMAGE, 25,
                    Stat.LEECHING, 5,
                    Stat.BLOODY, 5
                )))
                .addComponent(new AttributesComponent("light-melee"))
            );
        }

        // Mythic
        {
            
        }

        // Developer
        {
            Main.dataManager.addItem(new Item<>("clydes-blade", "Clyde's Blade", Resource.GREAT_SWORD, ItemType.MELEE_WEAPON)
                .setDescription("A blade that seems to have a mind of it's own. Can be quite dangerous.")
                .setRarity(Rarity.DEVELOPER)
                .addComponent(StatsComponent.builder()
                        .add(Stat.WEAPON_DAMAGE, 9.5)
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
                .addComponent(new AttributesComponent("sharp", "blade", "two-handed")
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
                    Stat.WEAPON_DAMAGE, 2,
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
                    Stat.WEAPON_DAMAGE, 4,
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
