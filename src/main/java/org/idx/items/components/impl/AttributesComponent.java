package org.idx.items.components.impl;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.Main;
import org.idx.items.AttributeItem;
import org.idx.items.ItemBase;
import org.idx.items.components.ItemComponent;

import java.util.*;

public class AttributesComponent implements ItemComponent {

    private final List<String> attributes;
    private int enchantSlots = 0;

    public AttributesComponent(String... attributes) {
        this(List.of(attributes));
    }

    public AttributesComponent(List<String> attributes) {
        this.attributes = attributes;
    }

    public static ItemComponent fromJson(ObjectNode node) {
        if (node.has("attributes")) {
            List<String> attributes = new ArrayList<>();
            ArrayNode attr = (ArrayNode) node.get("attributes");
            attr.forEach(e -> attributes.add(e.asText()));

            AttributesComponent component = new AttributesComponent(attributes);
            if (node.has("enchantSlots")) {
                component.setEnchantSlots(node.get("enchantSlots").asInt(0));
            }
            return component;
        }
        if (node.has("enchantSlots")) {
            int enchantSlots = node.get("enchantSlots").asInt(0);
            if (enchantSlots > 0) {
                return new AttributesComponent(List.of()).setEnchantSlots(enchantSlots);
            }
        }
        return new AttributesComponent();
    }

    public AttributesComponent setEnchantSlots(int enchantSlots) {
        this.enchantSlots = enchantSlots;
        return this;
    }

    //
    public List<String> getAttributes() {
        return attributes;
    }


    @Override
    public Map<String, ?> jsonEntries() {
        Map<String, Object> map = new HashMap<>();
        if (!attributes.isEmpty()) map.put("attributes", attributes);
        if (enchantSlots > 0) map.put("enchantSlots", enchantSlots);
        return map;
    }

    @Override
    public boolean hasData() {
        return !attributes.isEmpty() || enchantSlots > 0;
    }

    @Override
    public void validate() throws IllegalStateException {
        List<String> invalidAttributes = new ArrayList<>();
        for (String attr : attributes) {
            boolean found = false;
            for (ItemBase<?> item : Main.dataManager.getItems()) {
                if (item instanceof AttributeItem attributeItem) {
                    if (attributeItem.getId().equals(attr)) {
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                invalidAttributes.add(attr);
            }
        }
        if (!invalidAttributes.isEmpty()) {
            throw new IllegalStateException("Invalid attributes: " + String.join(", ", invalidAttributes));
        }

    }
}
