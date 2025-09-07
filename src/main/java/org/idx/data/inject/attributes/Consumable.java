package org.idx.data.inject.attributes;

import org.idx.Main;
import org.idx.enums.AttributeType;
import org.idx.enums.Trigger;
import org.idx.items.AttributeItem;
import org.idx.items.components.impl.TriggersComponent;

public class Consumable {

    public static void inject() {

        Main.dataManager.addItem(new AttributeItem("consumable", "Consumable", "cooked_beef", AttributeType.ATTRIBUTE)
                .setDescription("Causes the item to disappear when eaten.")
                .addComponent(new TriggersComponent(
                        Trigger.EAT
                ))
        );
        Main.dataManager.addItem(new AttributeItem("consumed", "Consumed", "structure_void", AttributeType.ATTRIBUTE)
                .setDescription("Causes the item to disappear when used.")
                .addComponent(new TriggersComponent(
                        Trigger.USE
                ))
        );
        Main.dataManager.addItem(new AttributeItem("heal", "Heal", "apple", AttributeType.ATTRIBUTE)
                .setDescription("Consuming this item heals the consumer.")
                .addComponent(new TriggersComponent(
                        Trigger.EAT
                ))
        );

    }

}
