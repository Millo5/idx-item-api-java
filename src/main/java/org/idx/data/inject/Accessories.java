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
import org.idx.items.components.impl.TriggersComponent;


public class Accessories extends DataInjector {
    public static void offhand() {

        // Common
        {
            addItem(new Item("wooden-targe", "Wooden Targe", Resource.WOODEN_TARGE, ItemType.OFFHAND)
                .setDescription("A small wooden shield.")
                .addComponent(new StatsComponent(Map.of(
                    Stat.DEFENSE, 1
                )))
            );
        }

        // Uncommon
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

    public static void trinkets() {

        // Common
        {

        }

        // Uncommon
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
            addItem(new Item("windstep-charm", "Windstep Charm", "feather", ItemType.TRINKET)
                .setDescription("A charm which briefly alters the wearer's density to be.")
                .setRarity(Rarity.MYTHIC)
                .addComponent(new AttributesComponent(
                    "windstep"
                ))
            );
        }

        // Mythic
        {
            addItem(new Item("infinite-leafed-clover", "Infinite Leafed Clover", Resource.INFINITE_LEAFED_CLOVER, ItemType.TRINKET)
                .setDescription("A mystical clover that seems to radiate good fortune.")
                .setRarity(Rarity.MYTHIC)
                .addComponent(new StatsComponent(Map.of(
                    Stat.LUCK, 57
                )))
            );
        }
    }
}
