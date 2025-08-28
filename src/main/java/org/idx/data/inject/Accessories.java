package org.idx.data.inject;

import java.util.Map;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.components.impl.StatsComponent;

public class Accessories {
    public static void offhand() {

        Main.dataManager.addItem(new Item<>("wooden-targe", "Wooden Targe", "oak_slab", ItemType.OFFHAND)
            .setDescription("A small wooden shield.")
            .addComponent(new StatsComponent(Map.of(
                Stat.DEFENSE, 5
            )))
        );

    }

    public static void trinkets() {

    }
}
