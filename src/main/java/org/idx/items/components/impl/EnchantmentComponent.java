package org.idx.items.components.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.Main;
import org.idx.data.DataManager;
import org.idx.enums.ItemType;
import org.idx.items.Item;
import org.idx.items.components.ItemComponent;

import java.util.Map;
import java.util.Optional;

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
    public int getMaxStackSize() {
        return 1;
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
        Item<? extends Item<?>> enchantItem = Main.dataManager.getItem(enchantment);
        Optional<AttributeTypeComponent> optionalAttributeType = enchantItem.getComponent(AttributeTypeComponent.class);
        if (optionalAttributeType.isEmpty()) {
            System.out.println("Enchantment " + enchantment + " does not have an AttributeTypeComponent!");
            return Map.of("enchantment", enchantment);
        }
        ItemType target = optionalAttributeType.get().getTargetType();
        return Map.of("enchantment", enchantment,
                "attribute-target", target);
    }
}
