package org.idx.data;

import org.idx.data.inject.*;

public class InjectData {

    public static void injectData() {
        Material.materials();

        Attributes.unique();
        Attributes.consumable();
        Attributes.weaponAttributes();
        Attributes.weaponCurses();
        Attributes.weaponEnchants();
        Attributes.armorAttributes();
        Attributes.armorEnchants();

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
