package org.idx.data;

import org.idx.data.inject.Accessories;
import org.idx.data.inject.Armor;
import org.idx.data.inject.Attributes;
import org.idx.data.inject.Consumables;
import org.idx.data.inject.Material;
import org.idx.data.inject.Weapons;

public class InjectData {

    public static void injectData() {
        Material.materials();

        Attributes.unique();
        Attributes.weaponAttributes();
        Attributes.weaponCurses();
        Attributes.weaponEnchants();
        Attributes.armorAttributes();
        Attributes.armorEnchants();

        Weapons.melee();
        Weapons.ranged();

        Armor.unique();
        Armor.sets();

        Accessories.offhand();
        Accessories.trinkets();

        Consumables.consumables();
        Consumables.arrows();
    }
}
