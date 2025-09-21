package org.idx.items;

import org.idx.enums.ItemType;
import org.idx.enums.Resource;

public class Item extends ItemBase<Item> {

    public Item(String id, String name, String material, ItemType type) {
        super(id, name, material, type);
    }

    public Item(String id, String name, Resource resource, ItemType type) {
        super(id, name, resource, type);
    }

}
