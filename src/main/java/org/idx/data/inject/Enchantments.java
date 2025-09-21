package org.idx.data.inject;

import java.util.Map;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.enums.Stat;
import org.idx.items.EnchantmentItem;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.StackableStatsComponent;

public class Enchantments {

    public static void enchantments() {
    
        // Common
        {
            Main.dataManager.addItem(new EnchantmentItem("old-whetstone", "Old Whetstone", "brick", "sharp")
                .setDescription("A very old whetstone, covered in the rust of hundreds of sharpened blades.")
            );

            Main.dataManager.addItem(new EnchantmentItem("armor-polish", "Armor Polish", "potion", "polished")
                .setDescription("A small bottle of polish, with a hint of defensively oriented mysticism.")
                .setColor("#aaffff")
            );
            Main.dataManager.addItem(new EnchantmentItem("vial-of-blood", "Vial of Blood", "potion", "bloodied")
                .setDescription("Seems to emanate pure violence.")
                .setColor("#aa0000")
            );
        }

        // Uncommon
        {
            Main.dataManager.addItem(new EnchantmentItem("aerodynamic-pommel", "Aerodynamic Pommel", "stone_button", "throwable")
                .setDescription("Its kinda just a rock with wings.")
                .setRarity(Rarity.UNCOMMON)
            );
        }

        // Rare
        {
            Main.dataManager.addItem(new EnchantmentItem("infected-spleen", "Infected Spleen", "beef", "visceral")
                .setDescription("Looks like its about to burst.")
                .setRarity(Rarity.RARE)
            );
        }

        // Epic
        {
            Main.dataManager.addItem(new EnchantmentItem("ninja-star-spirit", "Ninja Star Spirit", "nether_star", "shurikens")
                .setDescription("How does an inanimate object have a ghost???")
                .setRarity(Rarity.EPIC)
            );
        }

        // Legendary
        {
            Main.dataManager.addItem(new EnchantmentItem("echoing-fragment", "Echoing Fragment", "echo_shard", "recursion")
                .setDescription("An otherworldly fragment that loudly resonates whenever struck.")
                .setRarity(Rarity.LEGENDARY)
            );
            Main.dataManager.addItem(new EnchantmentItem("tempest-crystal", "Tempest Crystal", "blue_ice", "voltaic-aura")
                .setDescription("A magical crystal swirling with the fury of a thousand storms.")
                .setRarity(Rarity.LEGENDARY)
            );
            Main.dataManager.addItem(new EnchantmentItem("michelin-menu", "Michelin Menu", "map", "voltaic-aura")
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
