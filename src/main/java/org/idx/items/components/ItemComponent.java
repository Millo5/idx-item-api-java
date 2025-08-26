package org.idx.items.components;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.items.Item;
import org.idx.items.components.impl.EnchantmentComponent;
import org.idx.items.components.impl.TriggersComponent;

import java.util.Map;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type", // This will be used to determine the type of item when deserializing
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = EnchantmentComponent.class, name = "enchantment"),
        @JsonSubTypes.Type(value = TriggersComponent.class, name = "triggers")
})
public interface ItemComponent {

    Map<String,?> jsonEntries();

    default boolean stackable() {
        return true;
    }

    boolean valid();

    default void addIfValid(Item item) {
        if (valid()) {
            item.addComponent(this);
        }
    }

}
