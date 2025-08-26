package org.idx.items.components.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.enums.AttributeType;
import org.idx.items.components.ItemComponent;

import java.util.Map;

public class AttributeTypeComponent implements ItemComponent {

    private final AttributeType type;

    public AttributeTypeComponent(AttributeType type) {
        this.type = type;
    }

    public static ItemComponent fromJson(ObjectNode node) {
        if (node.has("attribute-type")) {
            String typeStr = node.get("attribute-type").asText();
            AttributeType type = AttributeType.valueOf(typeStr.toUpperCase());
            return new AttributeTypeComponent(type);
        }
        return new AttributeTypeComponent(null);
    }


    @Override
    public Map<String, ?> jsonEntries() {
        return Map.of("attribute-type", type);
    }

    @Override
    public boolean valid() {
        return type != null;
    }
}
