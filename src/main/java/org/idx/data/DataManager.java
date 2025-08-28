package org.idx.data;



import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.idx.items.AttributeItem;
import org.idx.items.Item;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handles the saved data
 */
public class DataManager {

    private static final ObjectMapper mapper = new ObjectMapper();
    private final File file;

    private final ArrayList<Item<?>> items = new ArrayList<>();

    private final HashMap<String, Item<?>> itemMap = new HashMap<>();
    private final HashMap<String, AttributeItem> attributeMap = new HashMap<>();


    public DataManager(String filename) {
        this.file = new File(filename);

        load();
    }

    //


    public Item<?> getItem(String id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Item<?> getItemItem(String id) {
        return getItemMap().get(id);
    }
    public AttributeItem getAttributeItem(String id) {
        return getAttributeMap().get(id);
    }

    public void addItem(Item<?> item) {
        if (getItem(item.getId()) != null) {
            System.out.println("Item with ID " + item.getId() + " already exists.");
            return;
        }
        items.add(item);
        if (item instanceof AttributeItem attributeItem) {
            attributeMap.put(attributeItem.getId(), attributeItem);
        } else {
            itemMap.put(item.getId(), item);
        }
    }

    public ArrayList<Item<?>> getItems() {
        return items;
    }

    public Map<String, Item<?>> getItemMap() {
        if (itemMap.isEmpty()) {
            for (Item<?> item : items) {
                if (!(item instanceof AttributeItem)) {
                    itemMap.put(item.getId(), item);
                }
            }
        }
        return itemMap;
    }

    public Map<String, AttributeItem> getAttributeMap() {
        if (attributeMap.isEmpty()) {
            for (Item<?> item : items) {
                if (item instanceof AttributeItem attributeItem) {
                    attributeMap.put(attributeItem.getId(), attributeItem);
                }
            }
        }
        return attributeMap;
    }

    public void validate() {
        items.forEach(Item::validate);
    }

    //
    public void save() {

        validate();

        try {
            ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter()
                    .with(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);

            writer.writeValue(file, items);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        if (!file.exists()) return;

        try {
            List<Item<?>> loaded = mapper.readValue(file, new TypeReference<>() {});
            items.clear();
            items.addAll(loaded);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
