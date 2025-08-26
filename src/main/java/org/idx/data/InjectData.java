package org.idx.data;


import org.idx.Main;
import org.idx.enums.*;
import org.idx.items.AttributeItem;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.StatsComponent;
import org.idx.items.components.impl.TriggersComponent;

import java.util.Map;

public class InjectData {

    public static void injectData() {

        Item polishedSword = new Item("polished-sword", "Polished Sword", "iron_sword", ItemType.MELEE_WEAPON)
                .setDescription("A sword polished to a mirror finish, reflecting the light beautifully.")
                .setRarity(Rarity.UNCOMMON)
                .addComponent(new StatsComponent(Map.of(
                        Stat.DAMAGE, 7.0,
                        Stat.ATTACK_SPEED, 1.6,
                        Stat.CRIT_CHANCE, 5.0
                )))
                .addComponent(new AttributesComponent(
                        "sharp"
                ));

        // Attributes

        Item grapple = new AttributeItem("grapple", "Grapple", "lead", AttributeType.ATTRIBUTE)
                .setDescription("A grappling hook used to pull objects or climb.")
                .setRarity(Rarity.COMMON)
                .addComponent(new TriggersComponent(
                        Trigger.USE
                ));


        Main.dataManager.addItem(polishedSword);
        Main.dataManager.addItem(grapple);


        Main.dataManager.addItem(
                new Item<>("illusioners-hood", "Illusioner's Hood", "leather_helmet", ItemType.HELMET)
                        .setDescription("A hood worn by illusioners, it has a strange aura.")
                        .setRarity(Rarity.MYTHIC)
                        .setColor("#00a0a0")
                        .addComponent(new StatsComponent(Map.of(
                                Stat.DEFENSE, 8,
                                Stat.HEALTH, 4
                        )))
                        .addComponent(
                                new AttributesComponent("recursion")
                                        .setEnchantSlots(1)
                        )
                        .setLevel(5)
        );

        Main.dataManager.addItem(
                new Item<>("bone", "Bone", "bone", ItemType.MATERIAL)
                    .setDescription("A bone from a creature long gone, useful for crafting or trading.")
        );

        Main.dataManager.addItem(
                new AttributeItem("big", "Big", "snowball", AttributeType.ATTRIBUTE)
                        .setDescription("Increases the size of melee weapons.")
                        .setRarity(Rarity.UNCOMMON)
                        .addComponent(new StatsComponent(Map.of(
                                Stat.DAMAGE, 3.0,
                                Stat.RANGE, 5.0
                        )))
        );


        Main.dataManager.save();
    }

}
