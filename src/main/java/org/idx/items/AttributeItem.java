package org.idx.items;

import org.idx.enums.AttributeType;
import org.idx.enums.Resource;
import org.idx.enums.ItemType;
import org.idx.items.components.impl.AttributeTypeComponent;

public class AttributeItem extends ItemBase<AttributeItem> {

    public AttributeItem(String id, String name, String material, AttributeType attributeType) {
        super(id, name, material, ItemType.ATTRIBUTE);
        addComponent(new AttributeTypeComponent(attributeType));
    }

    public AttributeItem(String id, String name, Resource material, AttributeType attributeType) {
        super(id, name, material, ItemType.ATTRIBUTE);
        addComponent(new AttributeTypeComponent(attributeType));
    }

    public AttributeItem setTarget(ItemType targetItemType) {
        getComponent(AttributeTypeComponent.class).ifPresent(comp -> comp.setTarget(targetItemType));
        return this;
    }

}
