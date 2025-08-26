package org.idx.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Rarity {
    COMMON,
    UNCOMMON,
    RARE,
    EPIC,
    LEGENDARY,
    MYTHIC,
    KIT,
    DEVELOPER;


    @Override
    public String toString() {
        return name().toLowerCase();
    }

    @JsonValue
    public String getValue() {
        return toString();
    }
}
