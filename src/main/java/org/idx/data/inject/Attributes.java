package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.*;
import org.idx.items.AttributeItem;
import org.idx.items.components.impl.AttributeTypeComponent;
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
        
        Main.dataManager.addItem(new AttributeItem("sword-slash", "Sword Slash", "iron-sword", AttributeType.ATTRIBUTE)
            .setDescription("A three swing combo.")
            .setTarget(ItemType.MELEE_WEAPON)
            .addComponent(new TriggersComponent(
                Trigger.SWING
            ))
        );
    }

    public static void weaponCurses() {

        Main.dataManager.addItem(new AttributeItem("two-handed", "Two Handed", "lever", AttributeType.CURSE)
            .setDescription("Requires both hands to wield, remove offhand item to use")
            .setTarget(ItemType.WEAPON)
        );
    }

    public static void weaponEnchants() {
        Main.dataManager.addItem(new AttributeItem("sharp", "Sharp", "wooden-sword", AttributeType.ENCHANTMENT)
            .setDescription("Increases the damage of melee weapons")
            .setTarget(ItemType.MELEE_WEAPON)
            .addComponent(new StatsComponent(Map.of(
                Stat.DAMAGE, 1.5
            )))
        );
    }

    public static void armorAttributes() {

        Main.dataManager.addItem(new AttributeItem("sharp", "Sharp", "wooden_sword", AttributeType.ENCHANTMENT));

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
