package org.idx.data.inject;

import java.util.Map;

import org.idx.Main;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.components.impl.StatsComponent;


public class Unique {
    public static void unique() {

        // Common
        {
            
        }

        // Rare
        {

        }

        // Epic
        {

        }

        // Legendary
        {
            
        }

        // Mythic
        {
            
        }
    }

    public static void menu() {
        Main.dataManager.addItem(new Item<>("menu", "Menu", "knowledge_book", ItemType.MENU));
    }
}
