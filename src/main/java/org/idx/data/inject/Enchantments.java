package org.idx.data.inject;

import org.idx.data.DataInjector;
import org.idx.enums.Rarity;
import org.idx.items.EnchantmentItem;

public class Enchantments extends DataInjector {

    public static void enchantments() {
    
        // Common
        {
            addItem(new EnchantmentItem("old-whetstone", "Old Whetstone", "brick", "sharp")
                .setDescription("A very old whetstone, covered in the rust of hundreds of sharpened blades.")
            );

            addItem(new EnchantmentItem("armor-polish", "Armor Polish", "potion", "polished")
                .setDescription("A small bottle of polish, with a hint of defensively oriented mysticism.")
                .setColor("#aaffff")
            );
            addItem(new EnchantmentItem("vial-of-blood", "Vial of Blood", "potion", "bloodied")
                .setDescription("Seems to emanate pure violence.")
                .setColor("#aa0000")
            );
        }

        // Uncommon
        {
            addItem(new EnchantmentItem("aerodynamic-pommel", "Aerodynamic Pommel", "stone_button", "throwable")
                .setDescription("Its kinda just a rock with wings.")
                .setRarity(Rarity.UNCOMMON)
            );
        }

        // Rare
        {
            addItem(new EnchantmentItem("infected-spleen", "Infected Spleen", "beef", "visceral")
                .setDescription("Looks like its about to burst.")
                .setRarity(Rarity.RARE)
            );
        }

        // Epic
        {
            addItem(new EnchantmentItem("ninja-star-spirit", "Ninja Star Spirit", "nether_star", "shurikens")
                .setDescription("How does an inanimate object have a ghost???")
                .setRarity(Rarity.EPIC)
            );
        }

        // Legendary
        {
            addItem(new EnchantmentItem("echoing-fragment", "Echoing Fragment", "echo_shard", "recursion")
                .setDescription("An otherworldly fragment that loudly resonates whenever struck.")
                .setRarity(Rarity.LEGENDARY)
            );
            addItem(new EnchantmentItem("tempest-crystal", "Tempest Crystal", "blue_ice", "voltaic-aura")
                .setDescription("A magical crystal swirling with the fury of a thousand storms.")
                .setRarity(Rarity.LEGENDARY)
            );
            addItem(new EnchantmentItem("michelin-menu", "Michelin Menu", "map", "gourmand")
                .setDescription("Just looking at it makes me drool...")
                .setRarity(Rarity.LEGENDARY)
                .setColor("#ffbb00")
            );
        }

        // Mythic
        {
            
        }
    }
}
