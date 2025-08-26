package org.idx.items.components;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.*;

public class ComponentContainer {

    private final List<ItemComponent> components;

    public ComponentContainer() {
        this(List.of());
    }

    public ComponentContainer(List<ItemComponent> components) {
        this.components = new ArrayList<>(components);
    }

    @JsonValue
    public Map<String, Object> toJson() {
        System.out.print("Converting components to JSON: " + components);
        Map<String, Object> jsonMap = new HashMap<>();
        for (ItemComponent component : components) {
            jsonMap.putAll(component.jsonEntries());
        }
        return jsonMap;
    }

    public Collection<ItemComponent> all() {
        return Collections.unmodifiableCollection(components);
    }

    public int amount() {
        return components.size();
    }

    public ItemComponent getFirst() {
        return components.getFirst();
    }

    public void add(ItemComponent component) {
        if (component == null) {
            throw new IllegalArgumentException("Component cannot be null");
        }
        if (components.contains(component)) {
            throw new IllegalArgumentException("Component already exists in the container: " + component);
        }
        components.add(component);
    }
}
