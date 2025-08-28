package org.idx.data.inject;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.items.Item;

public class Material {
    public static void materials() {

        Main.dataManager.addItem(new Item<>("bone", "Bone", "bone", ItemType.MATERIAL)
                .setDescription("I used to be a femur."));
        Main.dataManager.addItem(new Item<>("rotten-flesh", "Rotten Flesh", "rotten_flesh", ItemType.MATERIAL)
                .setDescription("For some reason you feel like you used to eat this."));
        Main.dataManager.addItem(new Item<>("gunpowder", "Gunpowder", "gunpowder", ItemType.MATERIAL)
                .setDescription("Useful for creation of boom boom"));
        Main.dataManager.addItem(new Item<>("slime", "Slime", "slime_ball", ItemType.MATERIAL)
                .setDescription("Tastes like a booger"));
        Main.dataManager.addItem(new Item<>("spider-silk", "Spider Silk", "string", ItemType.MATERIAL)
                .setDescription("Stronger than steel!"));
    }
}
