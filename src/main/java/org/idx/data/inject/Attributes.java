package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.*;
import org.idx.items.AttributeItem;
import org.idx.items.components.impl.StatsComponent;
import org.idx.items.components.impl.TriggersComponent;

import java.util.Map;

public class Attributes {

    public static void unique() {

        Main.dataManager.addItem(new AttributeItem("grapple", "Grapple", "lead", AttributeType.ATTRIBUTE)
                .setDescription("A grappling hook used to pull objects or climb.")
                .setRarity(Rarity.COMMON)
                .addComponent(new TriggersComponent(
                        Trigger.USE)));

    }

    public static void weaponAttributes() {

    }

    public static void weaponEnchants() {

    }

    public static void armorAttributes() {

    }

    public static void armorEnchants() {

        Main.dataManager.addItem(new AttributeItem("recursion", "Recursion", "echo_shard", AttributeType.ENCHANTMENT)
                .setDescription("A strange enchantment that allows the user to duplicate their actions")
                .setRarity(Rarity.MYTHIC)
                .setTarget(ItemType.ARMOR)
                .addComponent(new StatsComponent(Map.of(
                        Stat.RECURSION, 0.25
                ))));

    }
}
