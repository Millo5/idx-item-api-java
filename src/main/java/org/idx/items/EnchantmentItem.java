package org.idx.items;

import org.idx.enums.ItemType;
import org.idx.items.components.impl.EnchantmentComponent;

public class EnchantmentItem extends Item<EnchantmentItem> {

    public EnchantmentItem(String id, String name, String material, String enchantment) {
        super(id, name, material, ItemType.ENCHANTMENT);
        addComponent(new EnchantmentComponent(enchantment));
    }

}
