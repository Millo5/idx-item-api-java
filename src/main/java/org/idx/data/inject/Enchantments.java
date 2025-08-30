package org.idx.data.inject;

import org.idx.Main;
import org.idx.items.EnchantmentItem;

public class Enchantments {

    public static void enchantments() {
        Main.dataManager.addItem(new EnchantmentItem("echoing-fragment", "Echoing Fragment", "echo_shard", "recursion")
                .setDescription("An echoing fragment that grants the Recursion enchantment."));
    }

}
