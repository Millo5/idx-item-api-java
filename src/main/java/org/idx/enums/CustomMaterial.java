package org.idx.enums;

public enum CustomMaterial {

    GREAT_SWORD("angler_pottery_sherd", 1),
    SWORD("angler_pottery_sherd", 2),
    SPEAR("angler_pottery_sherd", 3),
    BUTCHER_KNIFE("angler_pottery_sherd", 4),

    ;



    private final String id;
    private final int modelData;

    CustomMaterial(String id, int modelData) {
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
