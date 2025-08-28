package org.idx.items;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.items.components.ComponentContainer;
import org.idx.items.components.ItemComponent;

import java.util.*;

@SuppressWarnings("unchecked")
@JsonDeserialize(using = ItemDeserializer.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item<T extends Item<T>> {

    private String id;
    private String name;
    private String material;
    private ItemType type;

    private String description;
    private String color;
    private int modeldata;

    private Rarity rarity;
    private int level = 1;

    @JsonUnwrapped
    @JsonProperty("components")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private ComponentContainer componentContainer = new ComponentContainer();


    @JsonCreator
    public Item(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("material") String material,
            @JsonProperty("type") ItemType type
    ) {
        this.id = id;
        this.name = name;
        this.material = material;
        this.type = type;
        this.rarity = Rarity.COMMON; // Default rarity
    }



    /// Applications


    public boolean hasComponent(Class<? extends ItemComponent> componentClass) {
        for (ItemComponent component : componentContainer.all()) {
            if (componentClass.isInstance(component)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSingleComponent(Class<? extends ItemComponent> componentClass) {
        if (componentContainer.amount() != 1) {
            return false;
        }
        return componentContainer.getFirst().getClass().equals(componentClass);
    }


    // Setters
    public T addComponent(ItemComponent component) {
        componentContainer.add(component);
        return (T) this;
    }
    public T setDescription(String description) {
        this.description = description;
        return (T) this;
    }
    public T setMaterial(String material) {
        this.material = material;
        return (T) this;
    }
    public T setColor(String color) {
        this.color = color;
        return (T) this;
    }
    public T setModelData(int modeldata) {
        this.modeldata = modeldata;
        return (T) this;
    }
    public T setRarity(Rarity rarity) {
        this.rarity = rarity;
        return (T) this;
    }
    public T setLevel(int level) {
        this.level = level;
        return (T) this;
    }
    public T setId(String id) {
        this.id = id;
        return (T) this;
    }
    public T setName(String name) {
        this.name = name;
        return (T) this;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getMaterial() { return material; }
    public String getColor() { return color; }
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public boolean getStackable() {
        if (componentContainer.amount() == 0) return true;
        return componentContainer.all().stream().allMatch(ItemComponent::stackable);
    }
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public int getModelData() { return modeldata; }
    public ItemType getType() { return type; }
    @JsonIgnore
    public Rarity getRarity() { return rarity; }
    @JsonIgnore
    public int getLevel() { return level; }

    @JsonIgnore
    public ComponentContainer getComponentContainer() { return componentContainer; }
    @JsonIgnore
    public Collection<ItemComponent> getComponents() { return componentContainer.all(); }
    @JsonIgnore
    public <C extends ItemComponent> Optional<C> getComponent(Class<C> componentClass) {
        for (ItemComponent component : componentContainer.all()) {
            if (componentClass.isInstance(component)) {
                return Optional.of(componentClass.cast(component));
            }
        }
        return Optional.empty();
    }

    // Json Serialization Fields
    @JsonProperty("rarity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Rarity getRarityForSerialization() {
        return rarity == Rarity.COMMON ? null : rarity;
    }

    @JsonProperty("level")
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    public int getLevelForSerialization() {
        return level > 1 ? level : 0; // Only serialize if level is greater than 1
    }

    @JsonIgnore
    public void validate() {
        System.out.println("Validating item: " + id);

        for (ItemComponent component : componentContainer.all()) {

            try {
                component.validate();
            } catch (IllegalStateException e) {
                System.err.println("Validation error in item '" + id + "' for component " + component.getClass().getSimpleName() + ": " + e.getMessage());
            }

        }
    }
}
