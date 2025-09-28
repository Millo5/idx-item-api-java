package org.idx.data;

import org.idx.Main;
import org.idx.enums.lootpool.LootPool;
import org.idx.enums.lootpool.LootPools;
import org.idx.enums.lootpool.SingularLootPool;
import org.idx.items.ItemBase;

public class DataInjector {

    public static void addItem(ItemBase<?> item) {
        Main.dataManager.addItem(item);
    }

    public static void addItem(ItemBase<?> item, LootPool pool) {
        Main.dataManager.addItem(item);
        pool.addItem(item);
    }

}
