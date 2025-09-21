package org.idx.items.components.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.items.components.ItemComponent;

import java.util.HashMap;
import java.util.Map;

public class SetComponent implements ItemComponent {

    private final String setId;

    public SetComponent(String setId) {
        this.setId = setId;
    }

    public static ItemComponent fromJson(ObjectNode node) {
        if (node.has("set")) {
            String setId = node.get("set").asText();
            return new SetComponent(setId);
        }
        return new SetComponent(""); // Default to empty if not present
    }

    //

    public String getSetId() {
        return setId;
    }

    @Override
    public Map<String, ?> jsonEntries() {
        Map<String, Object> map = new HashMap<>();
        if (!setId.isEmpty()) map.put("set", setId);
        return map;
    }

    @Override
    public boolean hasData() {
        return !setId.isEmpty();
    }

}
