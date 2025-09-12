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
        }

        // Uncommon
        {

        }

        // Rare
        {
            Main.dataManager.addItem(new EnchantmentItem("aerodynamic-pommel", "Aerodynamic Pommel", "stone_button", "throwable")
                .setDescription("A melee weapon pommel designed to fly through the air with unmatched grace.")
                .setRarity(Rarity.RARE)
            );
        }

        // Epic
        {
            Main.dataManager.addItem(new EnchantmentItem("ninja-star-spirit", "Ninja Star Spirit", "nether_star", "shurikens")
                .setDescription("A ghostly apparition in the shape of a shuriken.")
                .setRarity(Rarity.EPIC)
                .setLevel(12)
            );
        }

        // Legendary
        {
            Main.dataManager.addItem(new EnchantmentItem("echoing-fragment", "Echoing Fragment", "echo_shard", "recursion")
                .setDescription("An otherworldly fragment that loudly resonates whenever struck.")
                .setRarity(Rarity.LEGENDARY)
                .setLevel(50)
            );
            Main.dataManager.addItem(new EnchantmentItem("tempest crystal", "Tempest Crystal", "blue_ice", "voltaic_aura")
                .setDescription("A magical crystal swirling with the fury of a thousand storms.")
                .setRarity(Rarity.LEGENDARY)
                .setLevel(35)
            );
        }

        // Mythic
        {
            
        }
    }
}
