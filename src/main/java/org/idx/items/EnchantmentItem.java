package org.idx.items;

import org.idx.enums.ItemType;
import org.idx.items.components.impl.EnchantmentComponent;

import java.util.Optional;

public class EnchantmentItem extends ItemBase<EnchantmentItem> {

    public EnchantmentItem(String id, String name, String material, String enchantment) {
        super(id, name, material, ItemType.ENCHANTMENT);
        addComponent(new EnchantmentComponent(enchantment));
    }

    public EnchantmentItem addRequiredEnchantments(String... enchantments) {
        Optional<EnchantmentComponent> comp = getComponent(EnchantmentComponent.class);
        if (comp.isPresent()) {
            for (String enchantment : enchantments) {
                comp.get().addRequiredEnchantment(enchantment);
            }
        }
        return this;
    }

    public EnchantmentItem addIncompatibleEnchantments(String... enchantments) {
        Optional<EnchantmentComponent> comp = getComponent(EnchantmentComponent.class);
        if (comp.isPresent()) {
            for (String enchantment : enchantments) {
                comp.get().addIncompatibleEnchantment(enchantment);
            }
        }
        return this;
    }

}
