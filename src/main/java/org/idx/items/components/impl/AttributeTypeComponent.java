package org.idx.items.components.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.enums.AttributeType;
import org.idx.enums.ItemType;
import org.idx.items.components.ItemComponent;

import java.util.HashMap;
import java.util.Map;

public class AttributeTypeComponent implements ItemComponent {

    private final AttributeType type;
    private ItemType targetType = null;

    public AttributeTypeComponent(AttributeType type) {
        this.type = type;
    }

    public static ItemComponent fromJson(ObjectNode node) {
        if (node.has("attribute-type")) {
            String typeStr = node.get("attribute-type").asText();
            AttributeType type = AttributeType.valueOf(typeStr.toUpperCase());
//            return new AttributeTypeComponent(type);
            AttributeTypeComponent component = new AttributeTypeComponent(type);

            if (node.has("attribute-target")) {
                String targetStr = node.get("attribute-target").asText();
                ItemType targetType = ItemType.valueOf(targetStr.toUpperCase());
                component.setTarget(targetType);
            }

        }
        return new AttributeTypeComponent(null);
    }

    public void setTarget(ItemType target) {
        targetType = target;
    }


    @Override
    public Map<String, ?> jsonEntries() {
        Map<String, Object> map = new HashMap<>();
        map.put("attribute-type", type);
        if (targetType != null) map.put("attribute-target", targetType);
        return map;
    }

    @Override
    public boolean hasData() {
        return type != null;
    }
}
