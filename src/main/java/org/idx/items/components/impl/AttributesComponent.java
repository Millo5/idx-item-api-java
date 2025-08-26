package org.idx.items.components.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.items.Item;
import org.idx.items.components.ItemComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttributesComponent implements ItemComponent {

    private final List<String> attributes;
    private int enchantSlots = 0;

    public AttributesComponent(String... attributes) {
        this.attributes = List.of(attributes);
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
    public boolean valid() {
        return !attributes.isEmpty() || enchantSlots > 0;
    }
}
