package org.idx.items.components.impl;


import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.components.ItemComponent;

import java.util.HashMap;
import java.util.Map;

public class StatsComponent implements ItemComponent {

    private final Map<Stat, Number> stats;

    public StatsComponent(Map<Stat, Number> stats) {
        this.stats = stats;
    }

    public Map<Stat, Number> getStats() {
        return stats;
    }

    @Override
    public int getMaxStackSize() {
        return 1; // Items with stats should not be stackable
    }

    public static ItemComponent fromJson(ObjectNode node) {
        if (node.has("stats")) {
            Map<Stat, Number> statsMap = new HashMap<>();
            node.get("stats").fields().forEachRemaining(entry -> {
                Stat stat = Stat.valueOf(entry.getKey().toUpperCase().replaceAll("-", "_"));
                Number value = entry.getValue().numberValue();
                statsMap.put(stat, value);
            });
            return new StatsComponent(statsMap);
        }
        return new StatsComponent(new HashMap<>()); // Return empty stats if not present
    }

    @Override
    public boolean hasData() {
        return stats != null && !stats.isEmpty();
    }

    @Override
    public Map<String, ?> jsonEntries() {
        return Map.of("stats", stats);
    }


    public static StatComponentBuilder builder() {
        return new StatComponentBuilder();
    }

    public static class StatComponentBuilder {
        private final HashMap<Stat, Number> statsMap = new HashMap<>();

        public StatComponentBuilder add(Stat stat, Number value) {
            statsMap.put(stat, value);
            return this;
        }

        public StatsComponent build() {
            return new StatsComponent(statsMap);
        }
    }


}
