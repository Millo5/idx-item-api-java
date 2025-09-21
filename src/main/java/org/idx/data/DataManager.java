package org.idx.data;



import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.idx.items.AttributeItem;
import org.idx.items.ItemBase;

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

    private final ArrayList<ItemBase<?>> items = new ArrayList<>();

    private final HashMap<String, ItemBase<?>> itemMap = new HashMap<>();
    private final HashMap<String, AttributeItem> attributeMap = new HashMap<>();


    public DataManager(String filename) {
        this.file = new File(filename);

        load();
    }

    //


    public ItemBase<?> getItem(String id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public ItemBase<?> getItemItem(String id) {
        return getItemMap().get(id);
    }
    public AttributeItem getAttributeItem(String id) {
        return getAttributeMap().get(id);
    }

    public void addItem(ItemBase<?> item) {
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

    public ArrayList<ItemBase<?>> getItems() {
        return items;
    }

    public Map<String, ItemBase<?>> getItemMap() {
        if (itemMap.isEmpty()) {
            for (ItemBase<?> item : items) {
                if (!(item instanceof AttributeItem)) {
                    itemMap.put(item.getId(), item);
                }
            }
        }
        return itemMap;
    }

    public Map<String, AttributeItem> getAttributeMap() {
        if (attributeMap.isEmpty()) {
            for (ItemBase<?> item : items) {
                if (item instanceof AttributeItem attributeItem) {
                    attributeMap.put(attributeItem.getId(), attributeItem);
                }
            }
        }
        return attributeMap;
    }

    public void validate() {
        items.forEach(ItemBase::validate);
    }

    //
    public void save() {

        validate();

        try {
            ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter()
                    .with(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);

            HashMap<String, Object> root = new HashMap<>();
            root.put("items", itemMap.values());
            root.put("attributes", attributeMap.values());

            writer.writeValue(file, root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        if (!file.exists()) return;

        if (true) return; // Temporary disable loading

        try {
//            List<Item<?>> loaded = mapper.readValue(file, new TypeReference<>() {});

            Map<String, List<ItemBase<?>>> root = mapper.readValue(file, new TypeReference<>() {});
            List<ItemBase<?>> loadedItems = root.get("items");
            List<ItemBase<?>> loadedAttributes = root.get("attributes");

            if (loadedItems != null) {
                for (ItemBase<?> item : loadedItems) {
                    addItem(item);
                }
            }

            if (loadedAttributes != null) {
                for (ItemBase<?> item : loadedAttributes) {
                    if (item instanceof AttributeItem attributeItem) {
                        addItem(attributeItem);
                    } else {
                        System.out.println("Warning: Item in attributes list is not an AttributeItem: " + item.getId());
                    }
                }
            }

//            items.clear();
//            items.addAll(loaded);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
