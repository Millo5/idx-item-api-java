package org.idx.items.components.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.items.components.ItemComponent;

import java.util.Map;

public class EnchantmentComponent implements ItemComponent {

    private final String enchantment;

    public EnchantmentComponent(String enchantment) {
        this.enchantment = enchantment;
    }

    public static ItemComponent fromJson(ObjectNode node) {
        if (node.has("enchantment")) {
            String enchantment = node.get("enchantment").asText();
            return new EnchantmentComponent(enchantment);
        }
        return new EnchantmentComponent(""); // Default to empty if not present
    }

    public String getEnchantment() {
        return enchantment;
    }

    @Override
    public boolean stackable() {
        return false;
    }

    @Override
    public boolean hasData() {
        return !enchantment.isEmpty();
    }

    @Override
    public String toString() {
        return "EnchantmentComponent{" +
                "enchantment='" + enchantment + '\'' +
                '}';
    }

    @Override
    public Map<String, ?> jsonEntries() {
        return Map.of("enchantment", enchantment);
    }
}
