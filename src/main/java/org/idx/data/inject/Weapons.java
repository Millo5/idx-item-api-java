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

        Main.dataManager.addItem(new Item<>("polished-sword", "Polished Sword", "iron_sword", ItemType.MELEE_WEAPON)
                .setDescription("A sword polished to a mirror finish, reflecting the light beautifully.")
                .setRarity(Rarity.UNCOMMON)
                .addComponent(new StatsComponent(Map.of(
                        Stat.DAMAGE, 7.0,
                        Stat.ATTACK_SPEED, 1.6,
                        Stat.CRIT_CHANCE, 5.0)))
                .addComponent(new AttributesComponent(
                        "sharp", "sword-slash")));

        Main.dataManager.addItem(new Item<>("clydes-blade", "Clyde's Blade", "armor_stand", ItemType.MELEE_WEAPON)
                .setDescription("A blade that seems to have a mind of it's own. Can be quite dangerous.")
                .setRarity(Rarity.DEVELOPER)
                .addComponent(new StatsComponent(Map.of(
                        Stat.DAMAGE, 9.5,
                        Stat.WEAPON_ATTACK_SPEED, 1.6,
                        Stat.DEFENSE, 2,
                        Stat.HEALTH, 2,
                        Stat.MOVE_SPEED, 40,
                        Stat.CRIT_CHANCE, 40,
                        Stat.CRIT_DAMAGE, 50,
                        Stat.KNOCKBACK, -40,
                        Stat.LUCK, 0.2)))
                .addComponent(new AttributesComponent(
                        "sharp", "sword-slash", "two-handed")
                        .setEnchantSlots(3)));
        Main.dataManager.addItem(new Item<>("wooden-shiv", "Wooden Shiv", "wooden_sword", ItemType.MELEE_WEAPON)
            .setDescription("A simple wooden blade, not particularly effective.")
            .addComponent(new StatsComponent(Map.of(
                Stat.DAMAGE, 1,
                Stat.WEAPON_ATTACK_SPEED, 3.1
            )))
            .addComponent(new AttributesComponent("sword-slash"))
        );
    }


    public static void ranged() {

        Main.dataManager.addItem(new Item<>("simple-bow", "Simple Bow", "bow", ItemType.RANGED_WEAPON)
            .setDescription("A basic bow, not particularly powerful but gets the job done,")
            .addComponent(new StatsComponent(Map.of(
                Stat.DAMAGE, 2,
                Stat.WEAPON_ATTACK_SPEED, 1.5,
                Stat.WEAPON_RANGE, 15
            )))
        );
        Main.dataManager.addItem(new Item<>("longbow", "Longbow", "bow", ItemType.RANGED_WEAPON)
                .setDescription("A large bow with increased range and damage")
                .setRarity(Rarity.UNCOMMON)
                .addComponent(
                        new StatsComponent(Map.of(
                                Stat.DAMAGE, 4,
                                Stat.WEAPON_ATTACK_SPEED, 1.2,
                                Stat.WEAPON_RANGE, 25))));

    }
}
