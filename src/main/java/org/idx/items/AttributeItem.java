package org.idx.items;

import org.idx.enums.AttributeType;
import org.idx.enums.ItemType;
import org.idx.items.components.impl.AttributeTypeComponent;

public class AttributeItem extends Item<AttributeItem> {


    public AttributeItem(String id, String name, String material, AttributeType attributeType) {
        super(id, name, material, ItemType.ATTRIBUTE);
        addComponent(new AttributeTypeComponent(attributeType));
    }

}
