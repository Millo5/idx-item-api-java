package org.idx.items;

import org.idx.enums.ItemType;
import org.idx.items.components.impl.PotionComponent;
import org.idx.utility.PotionEffect;

public class PotionItem extends ItemBase<PotionItem> {

    public PotionItem(String id, String name, String material, PotionEffect... effects) {
        super(id, name, material, ItemType.POTION);
        addComponent(new PotionComponent(effects));
    }

}
