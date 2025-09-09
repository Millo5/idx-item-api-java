package org.idx.enums;

public enum Resource {

    GREAT_SWORD("angler_pottery_sherd", 1),
    SWORD("angler_pottery_sherd", 2),
    SPEAR("angler_pottery_sherd", 3),
    BUTCHER_KNIFE("angler_pottery_sherd", 4),
    WOODEN_TARGE("angler_pottery_sherd", 6),

    COIN("archer_pottery_sherd", 2),
    BIG_COIN("archer_pottery_sherd", 1),
    LARGE_COIN("archer_pottery_sherd", 3),
    INFINITE_LEAFED_CLOVER("archer_pottery_sherd", 5),
    BAT_WING("archer_pottery_sherd", 4),
    RESTLESS_CHAIN("archer_pottery_sherd", 6)

    ;



    private final String id;
    private final int modelData;

    Resource(String id, int modelData) {
        this.id = id;
        this.modelData = modelData;
    }

    public String getId() {
        return id;
    }

    public int getModelData() {
        return modelData;
    }
}
