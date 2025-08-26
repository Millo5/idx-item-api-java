package org.idx.items;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.items.components.impl.AttributeTypeComponent;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.EnchantmentComponent;
import org.idx.items.components.impl.StatsComponent;
import org.idx.items.components.impl.TriggersComponent;

import java.io.IOException;

public class ItemDeserializer extends StdDeserializer<Item> {

    protected ItemDeserializer() {
        super(Item.class);
    }

    @Override
    public Item deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        ObjectMapper mapper = (ObjectMapper) p.getCodec();
        ObjectNode node = mapper.readTree(p);

        // Required Fields
        String id = node.get("id").asText();
        String name = node.get("name").asText();
        String material = node.get("material").asText();
        String typeStr = node.get("type").asText();
        ItemType type = ItemType.valueOf(typeStr.toUpperCase().replaceAll("-", "_"));

        Item item = new Item(id, name, material, type);

        // Optional fields
        String description = node.has("description") ? node.get("description").asText() : null;
        String color = node.has("color") ? node.get("color").asText() : null;
        int modeldata = node.has("modeldata") ? node.get("modeldata").asInt(0) : 0;

        String rarityStr = node.has("rarity") ? node.get("rarity").asText() : null;
        int level = node.has("level") ? node.get("level").asInt(1) : 1;


        if (node.has("rarity")) item.setRarity(Rarity.valueOf(rarityStr.toUpperCase()));
        if (node.has("description")) item.setDescription(description);
        if (node.has("color")) item.setColor(color);
        if (node.has("modeldata")) item.setModelData(modeldata);
        if (node.has("level")) item.setLevel(level);

        if (node.has("components")) {
            ObjectNode componentsNode = (ObjectNode) node.get("components");

            AttributesComponent.fromJson(componentsNode).addIfValid(item);
            EnchantmentComponent.fromJson(componentsNode).addIfValid(item);
            StatsComponent.fromJson(componentsNode).addIfValid(item);
            TriggersComponent.fromJson(componentsNode).addIfValid(item);
            AttributeTypeComponent.fromJson(componentsNode).addIfValid(item);
        }


        return item;
    }
}
