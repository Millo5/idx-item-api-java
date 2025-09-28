package org.idx.enums.lootpool;

import java.util.ArrayList;

public class LootPools {

    public static final LootPool SACK = new SingularLootPool("sack");
    public static final LootPool POT = new SingularLootPool("pot");

    public static final LootPool BASIC_CHEST = new LevelledLootPool("basic_chest");
    public static final LootPool LARGE_CHEST = new LevelledLootPool("large_chest");
    public static final LootPool SOUL_CHEST = new LevelledLootPool("soul_chest");


    private static ArrayList<LootPool> lootPools ;
    public static void register(LootPool pool) {
        if (lootPools == null) {
            lootPools = new ArrayList<>();
        }
        lootPools.add(pool);
    }
    public static ArrayList<LootPool> getLootPools() {
        return lootPools;
    }

}
