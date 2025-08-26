package org.idx.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import org.idx.items.Item;
import org.idx.items.components.impl.AttributeTypeComponent;
import org.idx.items.components.impl.EnchantmentComponent;
import org.idx.items.components.ItemComponent;
import org.idx.items.components.impl.TriggersComponent;
import org.idx.items.exceptions.ExpectedComponentException;
import org.idx.items.exceptions.UnexpectedComponentException;

import java.util.Collection;
import java.util.function.Predicate;

public enum ItemType {

    ATTRIBUTE((item) -> requireComponent(item, TriggersComponent.class) && requireComponent(item, AttributeTypeComponent.class)),

    MATERIAL,

    TRINKET,
    CONSUMABLE,
    OFFHAND,
    MELEE_WEAPON,
    RANGED_WEAPON,

    HELMET,
    CHESTPLATE,
    LEGGINGS,
    BOOTS,

    ENCHANTMENT((item) -> requireSingleComponent(item, EnchantmentComponent.class)),

    UNIQUE;


    Predicate<Item> isValidPredicate = (item) -> true;

    ItemType() {}

    ItemType(Predicate<Item> isValidPredicate) {
        this.isValidPredicate = isValidPredicate;
    }


    public boolean isValid(Item item) {
        if (item == null) return false;
        if (item.getType() != this) return false;

        return isValidPredicate.test(item);
    }


    private static boolean requireComponent(Item item, Class<? extends ItemComponent> componentClass) {
        if (!item.hasComponent(componentClass)) {
            throw new ExpectedComponentException(item.getType(), componentClass);
        }
        return true;
    }
    private static boolean requireSingleComponent(Item item, Class<? extends ItemComponent> componentClass) {
        if (!item.hasSingleComponent(componentClass)) {
            if (item.hasComponent(componentClass)) {
                Collection<ItemComponent> components = item.getComponents();
                components.removeIf(c -> c.getClass() != componentClass);

                throw new UnexpectedComponentException(item.getType(), components);
            }
            throw new ExpectedComponentException(item.getType(), componentClass);
        }
        return true;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase().replace('_', '-');
    }

    @JsonValue
    public String getValue() {
        return toString();
    }
}
