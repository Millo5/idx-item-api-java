package org.idx.items.exceptions;

import org.idx.enums.ItemType;
import org.idx.items.components.ItemComponent;

import java.util.Collection;

public class UnexpectedComponentException extends RuntimeException {

    public UnexpectedComponentException(ItemType itemType, ItemComponent component) {
        super("Unexpected component " + component.getClass().getSimpleName() + " for item type " + itemType);
    }

    public UnexpectedComponentException(ItemType itemType, Collection<ItemComponent> components) {
        super("Unexpected components " + String.join(", ",
            components.stream()
                .map(c -> c.getClass().getSimpleName())
                .toList()) + " for item type " + itemType);
    }

    public UnexpectedComponentException(ItemType itemType, ItemComponent... components) {
        super("Unexpected components " + String.join(", ",
            java.util.Arrays.stream(components)
                .map(c -> c.getClass().getSimpleName())
                .toList()) + " for item type " + itemType);
    }

}
