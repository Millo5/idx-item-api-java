package org.idx.data;



import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.idx.items.Item;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles the saved data
 */
public class DataManager {

    private static final ObjectMapper mapper = new ObjectMapper();
    private final File file;

    private final ArrayList<Item> items = new ArrayList<>();


    public DataManager(String filename) {
        this.file = new File(filename);

        load();
    }

    //


    public Item getItem(String id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addItem(Item item) {
        if (getItem(item.getId()) != null) {
            System.out.println("Item with ID " + item.getId() + " already exists.");
            return;
        }
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    //
    public void save() {
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
