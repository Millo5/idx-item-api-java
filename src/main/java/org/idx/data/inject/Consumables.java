package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributesComponent;

public class Consumables {
    public static void consumables() {

        Main.dataManager.addItem(new Item<>("rope", "Rope", "lead", ItemType.CONSUMABLE)
                .setDescription("A long piece of rope, useful for climbing.")
                .addComponent(new AttributesComponent("grapple"))
        );
    }
}
