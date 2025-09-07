package org.idx.items.components;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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


    boolean hasData();

    default void validate() throws IllegalStateException {};

    default void addIfHasData(Item<?> item) {
        if (hasData()) {
            item.addComponent(this);
        }
    }

    default int getMaxStackSize() {
        return 64;
    }
}
