package org.idx.data.inject.attributes;

import org.idx.data.DataInjector;
import org.idx.enums.AttributeType;
import org.idx.enums.Trigger;
import org.idx.items.AttributeItem;
import org.idx.items.components.impl.TriggersComponent;

public class Consumable extends DataInjector {

    public static void inject() {

        addItem(new AttributeItem("edible", "Edible", "cooked_beef", AttributeType.ATTRIBUTE)
                .setDescription("Causes the item to disappear when eaten.")
                .addComponent(new TriggersComponent(
                        Trigger.EAT
                ))
        );
        addItem(new AttributeItem("consumed", "Consumed", "structure_void", AttributeType.ATTRIBUTE)
        addItem(new AttributeItem("drinkable", "Drinkable", "potion", AttributeType.ATTRIBUTE)
                .setDescription("Causes the item to disappear when eaten, leaving a glass bottle.")
                .addComponent(new TriggersComponent(
                        Trigger.EAT
                ))
        );
        addItem(new AttributeItem("consumable", "Consumable", "structure_void", AttributeType.ATTRIBUTE)
                .setDescription("Causes the item to disappear when used.")
                .addComponent(new TriggersComponent(
                        Trigger.USE
                ))
        );
        addItem(new AttributeItem("heal", "Heal", "apple", AttributeType.ATTRIBUTE)
                .setDescription("Consuming this item heals the consumer.")
                .addComponent(new TriggersComponent(
                        Trigger.EAT
                ))
        );
        addItem(new AttributeItem("currency", "Currency", "gold_nugget", AttributeType.ATTRIBUTE)
                .setDescription("Denotes an item as currency.")
                .addComponent(new TriggersComponent(
                        Trigger.PICKUP))
        );
    }

}
