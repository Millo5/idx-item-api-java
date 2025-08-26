package org.idx.items.exceptions;

import org.idx.enums.ItemType;
import org.idx.items.components.ItemComponent;

public class ExpectedComponentException extends RuntimeException {

    public ExpectedComponentException(ItemType itemType, Class<? extends ItemComponent> component) {
        super(String.format("Expected component '%s' for item type '%s' but it was not found.",
                component.getSimpleName(), itemType));
    }

    public ExpectedComponentException(ItemType itemType, Class<? extends ItemComponent>... components) {
        super(String.format("Expected components '%s' for item type '%s' but they were not found.",
                String.join(", ", getComponentNames(components)), itemType));
    }

    private static String[] getComponentNames(Class<? extends ItemComponent>[] components) {
        String[] componentNames = new String[components.length];
        for (int i = 0; i < components.length; i++) {
            componentNames[i] = components[i].getSimpleName();
        }
        return componentNames;
    }

}
