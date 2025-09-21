package org.idx.data;

import org.idx.Main;
import org.idx.items.ItemBase;

public class DataInjector {

    public static void addItem(ItemBase<?> item) {
        Main.dataManager.addItem(item);
    }

}
