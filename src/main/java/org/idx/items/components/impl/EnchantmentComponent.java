package org.idx.items.components.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.items.ItemBase;
import org.idx.items.components.ItemComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EnchantmentComponent implements ItemComponent {

    private final String enchantment;
    private final ArrayList<String> requiredEnchantments = new ArrayList<>();
    private final ArrayList<String> incompatibleEnchantments = new ArrayList<>();

    public EnchantmentComponent(String enchantment) {
        this.enchantment = enchantment;
    }

    public static ItemComponent fromJson(ObjectNode node) {
        if (node.has("enchantment")) {
            String enchantment = node.get("enchantment").asText();
            EnchantmentComponent comp = new EnchantmentComponent(enchantment);
            if (node.has("required-enchantments")) {
                for (var req : node.get("required-enchantments")) {
                    comp.addRequiredEnchantment(req.asText());
                }
            }
            if (node.has("incompatible-enchantments")) {
                for (var inc : node.get("incompatible-enchantments")) {
                    comp.addIncompatibleEnchantment(inc.asText());
                }
            }
            return comp;
        }
        return new EnchantmentComponent(""); // Default to empty if not present
    }

    public String getEnchantment() {
        return enchantment;
    }

    public EnchantmentComponent addRequiredEnchantment(String enchantment) {
        requiredEnchantments.add(enchantment);
        return this;
    }
    public EnchantmentComponent addIncompatibleEnchantment(String enchantment) {
        incompatibleEnchantments.add(enchantment);
        return this;
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
        ItemBase<? extends ItemBase<?>> enchantItem = Main.dataManager.getItem(enchantment);
        Optional<AttributeTypeComponent> optionalAttributeType = enchantItem.getComponent(AttributeTypeComponent.class);
        if (optionalAttributeType.isEmpty()) {
            System.out.println("Enchantment " + enchantment + " does not have an AttributeTypeComponent!");
            return Map.of("enchantment", enchantment);
        }
        ItemType target = optionalAttributeType.get().getTargetType();

        HashMap<String, Object> map = new HashMap<>();
        map.put("enchantment", enchantment);
        if (target != null) map.put("attribute-target", target);
        if (!requiredEnchantments.isEmpty()) map.put("required-enchantments", requiredEnchantments);
        if (!incompatibleEnchantments.isEmpty()) map.put("incompatible-enchantments", incompatibleEnchantments);
        return map;
    }
}
