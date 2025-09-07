package org.idx.data.inject.attributes;

import org.idx.Main;
import org.idx.enums.AttributeType;
import org.idx.enums.Rarity;
import org.idx.enums.Trigger;
import org.idx.items.AttributeItem;
import org.idx.items.components.impl.TriggersComponent;

public class Unique {

    public static void inject() {

        // Common
        {
            Main.dataManager.addItem(new AttributeItem("grapple", "Grapple", "lead", AttributeType.ATTRIBUTE)
                    .setDescription("Allows the user to pull themselves to elevated positions.")
                    .addComponent(new TriggersComponent(
                            Trigger.USE
                    ))
            );
        }

        // Uncommon
        {

        }

        // Rare
        {

        }

        // Epic
        {
            Main.dataManager.addItem(new AttributeItem("hook", "Hook", "chain", AttributeType.ATTRIBUTE)
                    .setDescription("Pull enemies toward you or yourself to terrain.")
                    .setRarity(Rarity.EPIC)
                    .addComponent(new TriggersComponent(
                            Trigger.SWING,
                            Trigger.SWAP
                    ))
            );
        }

        // Legendary
        {

        }

        // Mythic
        {

        }
    }

}
