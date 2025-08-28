package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.items.Item;

public class Material {
    public static void materials() {

        Main.dataManager.addItem(new Item<>("bone", "Bone", "bone", ItemType.MATERIAL)
                .setDescription("A bone from a creature long gone, useful for crafting or trading."));

        Main.dataManager.addItem(new Item<>("rotten-flesh", "Rotten Flesh", "rotten_flesh", ItemType.MATERIAL)
                .setDescription("For some reason you feel like you used to eat this."));

    }
}
