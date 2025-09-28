package org.idx.enums.lootpool;

import org.idx.items.ItemBase;

import java.util.ArrayList;
import java.util.HashMap;

public class SingularLootPool implements LootPool {
//
//    public static final LootPool SACK = new LootPool("sack");
//    public static final LootPool POT = new LootPool("pot");
//
//    public static final LevelledLootPool BASIC_CHEST = new LevelledLootPool("basic_chest");
//    public static final LevelledLootPool LARGE_CHEST = new LevelledLootPool("large_chest");
//    public static final LevelledLootPool SOUL_CHEST = new LevelledLootPool("soul_chest");


    private final String id;
    private final ArrayList<String> items = new ArrayList<>();

    SingularLootPool(String id) {
        this.id = id;
        LootPools.register(this);
    }

    public String getId() {
        return id;
    }

    @Override
    public void addItem(ItemBase<?> itemId) {
        items.add(itemId.getId());
    }

    @Override
    public HashMap<String, Object> getItems() {
        HashMap<String, Object> map = new HashMap<>();
        map.put(id, items);
        return map;
    }
}
