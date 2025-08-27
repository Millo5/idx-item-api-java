package org.idx.data;

import org.idx.Main;
import org.idx.enums.*;
import org.idx.items.AttributeItem;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributeTypeComponent;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.StatsComponent;
import org.idx.items.components.impl.TriggersComponent;

import java.util.Map;

public class InjectData {

    public static void injectData() {

        // Materials

        Item bone = new Item<>("bone", "Bone", "bone", ItemType.MATERIAL)
                .setDescription("A bone from a creature long gone, useful for crafting or trading.");

        Item rottenFlesh = new Item<>("rotten-flesh", "Rotten Flesh", "rotten_flesh", ItemType.MATERIAL)
                .setDescription("For so me reason you feel like you used to eat this.");

        Main.dataManager.addItem(bone);

        Main.dataManager.addItem(rottenFlesh);

        // Melee Weapons

        Item polishedSword = new Item("polished-sword", "Polished Sword", "iron_sword", ItemType.MELEE_WEAPON)
                .setDescription("A sword polished to a mirror finish, reflecting the light beautifully.")
                .setRarity(Rarity.UNCOMMON)
                .addComponent(new StatsComponent(Map.of(
                        Stat.DAMAGE, 7.0,
                        Stat.ATTACK_SPEED, 1.6,
                        Stat.CRIT_CHANCE, 5.0)))
                .addComponent(new AttributesComponent(
                        "sharp"));

        Item clydesBlade = new Item("clydes-blade", "Clyde's Blade", "armor_stand", ItemType.MELEE_WEAPON)
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
                        .setEnchantSlots(3));

        Main.dataManager.addItem(polishedSword);

        Main.dataManager.addItem(clydesBlade);

        // Ranged Weapons

        Item longbow = new Item<>("longbow", "Longbow", "bow", ItemType.RANGED_WEAPON)
                .setDescription("A large bow with increased range and damage")
                .setRarity(Rarity.UNCOMMON)
                .addComponent(
                        new StatsComponent(Map.of(
                                Stat.DAMAGE, 4,
                                Stat.WEAPON_ATTACK_SPEED, 1.2,
                                Stat.WEAPON_RANGE, 25)));

        Main.dataManager.addItem(longbow);

        // Helmets

        Item illusionersHood = new Item<>("illusioners-hood", "Illusioner's Hood", "leather_helmet", ItemType.HELMET)
                .setDescription("A hood worn by illusioners, it has a strange aura.")
                .setRarity(Rarity.MYTHIC)
                .setColor("#00a0a0")
                .addComponent(new StatsComponent(Map.of(
                        Stat.DEFENSE, 8,
                        Stat.HEALTH, 4)))
                .addComponent(
                        new AttributesComponent("recursion")
                                .setEnchantSlots(1))
                .setLevel(5);

        Main.dataManager.addItem(illusionersHood);

        // Attributes

        Item grapple = new AttributeItem("grapple", "Grapple", "lead", AttributeType.ATTRIBUTE)
                .setDescription("A grappling hook used to pull objects or climb.")
                .setRarity(Rarity.COMMON)
                .addComponent(new TriggersComponent(
                        Trigger.USE));

        Item recursion = new AttributeItem("recursion", "Recursion", "echo-shard", AttributeType.ENCHANTMENT)
                .setDescription("A strange enchantment that allows the user to duplicate their actions")
                .setRarity(Rarity.MYTHIC);

        Main.dataManager.addItem(grapple);

        Main.dataManager.addItem(recursion);

        Main.dataManager.save();
    }
}
