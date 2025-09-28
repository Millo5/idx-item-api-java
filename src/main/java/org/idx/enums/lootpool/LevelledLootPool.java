package org.idx.enums.lootpool;

import org.idx.items.ItemBase;

import java.util.ArrayList;
import java.util.HashMap;

public class LevelledLootPool implements LootPool {

    private static final int LEVEL_INTERVAL = 5;

    private final String id;
    private final HashMap<Integer, ArrayList<String>> items = new HashMap<>();

    LevelledLootPool(String id) {
        this.id = id;
        LootPools.register(this);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void addItem(ItemBase<?> itemId) {
        int level = itemId.getLevel();
        int levelKey = (level / LEVEL_INTERVAL) * LEVEL_INTERVAL;
        items.putIfAbsent(levelKey, new ArrayList<>());
        items.get(levelKey).add(itemId.getId());
    }

    @Override
    public HashMap<String, Object> getItems() {
        HashMap<String, Object> map = new HashMap<>();
        items.forEach((mapKey, itemList) -> map.put(id + "-" + mapKey, itemList));
        return map;
    }
}
