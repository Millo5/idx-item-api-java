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
           
        }

        // Uncommon
        {

        }

        // Rare
        {

        }

        // Epic
        {

        }

        // Legendary
        {
            Main.dataManager.addItem(new EnchantmentItem("echoing-fragment", "Echoing Fragment", "echo_shard", "recursion")
                .setDescription("An echoing fragment that grants the Recursion enchantment.")
                .setRarity(Rarity.LEGENDARY)
            );
        }

        // Mythic
        {
            
        }
    }
}
