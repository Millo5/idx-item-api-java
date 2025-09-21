package org.idx.data.inject;

import java.util.Map;

import org.idx.Main;
import org.idx.data.DataInjector;
import org.idx.enums.Resource;
import org.idx.enums.ItemType;
import org.idx.enums.Rarity;
import org.idx.enums.Stat;
import org.idx.items.Item;
import org.idx.items.ItemBase;
import org.idx.items.components.impl.AttributesComponent;
import org.idx.items.components.impl.StatsComponent;


public class Unique extends DataInjector {
    public static void unique() {

        // Common
        {
            addItem(new Item("coin", "Coin", Resource.COIN, ItemType.UNIQUE)
                    .setDescription("A shiny gold coin, possibly of some value.")
                    .addComponent(new StatsComponent(Map.of(
                            Stat.MONEY, 1
                    )))
                    .addComponent(new AttributesComponent("currency")));
            addItem(new Item("big-coin", "Big Coin", Resource.BIG_COIN, ItemType.UNIQUE)
                    .setDescription("A large gold coin, definitely of some value.")
                    .addComponent(new StatsComponent(Map.of(
                            Stat.MONEY, 5
                    )))
                    .addComponent(new AttributesComponent("currency")));
            addItem(new Item("large-coin", "Large Coin", Resource.LARGE_COIN, ItemType.UNIQUE)
                    .setDescription("A massive gold coin, certainly of great value.")
                    .addComponent(new StatsComponent(Map.of(
                            Stat.MONEY, 20
                    )))
                    .addComponent(new AttributesComponent("currency")));
        }
        
        // Uncommon
        {

        }

        // Rare
        {

        }

        // Epic
        {
            addItem(new Item("restless-chain", "Restless Chain", Resource.RESTLESS_CHAIN, ItemType.UNIQUE)
                    .setDescription("A heavy chain that seems to writhe and move on its own, as if alive.")
                    .setRarity(Rarity.EPIC)
                    .addComponent(new AttributesComponent("hook"))
                    .addComponent(new StatsComponent(Map.of(
                            Stat.WEAPON_RANGE, 5
                    )))
            );
        }

        // Legendary
        {
            
        }

        // Mythic
        {
            
        }
    }

    public static void menu() {
        addItem(new Item("menu", "Menu", "knowledge_book", ItemType.MENU));
    }
}
