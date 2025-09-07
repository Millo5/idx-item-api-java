package org.idx.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Rarity {
    COMMON, WRETCHED("common"),
    UNCOMMON, STANDARD("uncommon"),
    RARE, REFINED("rare"),
    EPIC, EXALTED("epic"),
    LEGENDARY, FABLED("legendary"),
    MYTHIC, MYTHICAL("mythic"),
    DEVELOPER;


    private final String id;

    Rarity() {
        this.id = name().toLowerCase();
    }

    Rarity(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

    @JsonValue
    public String getValue() {
        return toString();
    }
}
