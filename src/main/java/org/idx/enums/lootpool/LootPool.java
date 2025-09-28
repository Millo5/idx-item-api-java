package org.idx.enums.lootpool;

import org.idx.items.ItemBase;

import java.util.ArrayList;
import java.util.HashMap;

public interface LootPool {


    void addItem(ItemBase<?> itemId);

    String getId();
    HashMap<String, Object> getItems();


}
