package org.idx.data;

import org.idx.data.inject.*;

public class InjectData {

    public static void injectData() {
        Material.materials();

        org.idx.data.inject.attributes.Armor.inject();
        org.idx.data.inject.attributes.Armor.curses();
        org.idx.data.inject.attributes.Armor.enchants();

        org.idx.data.inject.attributes.Weapon.inject();
        org.idx.data.inject.attributes.Weapon.curses();
        org.idx.data.inject.attributes.Weapon.enchants();

        org.idx.data.inject.attributes.Consumable.inject();
        org.idx.data.inject.attributes.Unique.inject();

        Enchantments.enchantments();

        Weapons.melee();
        Weapons.ranged();

        Armor.unique();
        Armor.sets();

        Accessories.offhand();
        Accessories.trinkets();

        Consumables.consumables();
        Consumables.arrows();

        Unique.unique();
        Unique.menu();
    }
}
