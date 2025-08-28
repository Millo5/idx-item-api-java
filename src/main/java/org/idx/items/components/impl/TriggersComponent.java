package org.idx.items.components.impl;


import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.enums.Trigger;
import org.idx.items.components.ItemComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TriggersComponent implements ItemComponent {

    List<Trigger> triggers;

    public TriggersComponent(Trigger... triggers) {
        this.triggers = List.of(triggers);
    }

    public TriggersComponent(List<Trigger> triggers) {
        this.triggers = List.copyOf(triggers);
    }

    public static ItemComponent fromJson(ObjectNode node) {
        if (node.has("triggers")) {
            List<Trigger> triggers = new ArrayList<>();
            node.get("triggers").forEach(e -> triggers.add(
                    Trigger.valueOf(e.asText().toUpperCase().replaceAll("-", "_")
            )));

            return new TriggersComponent(triggers);
        }
        return new TriggersComponent();
    }

    public List<Trigger> getTriggers() {
        return triggers;
    }

    @Override
    public Map<String, ?> jsonEntries() {
        return Map.of("triggers", triggers);
    }

    @Override
    public boolean hasData() {
        return !triggers.isEmpty();
    }
}
