package org.idx.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AttributeType {

    ATTRIBUTE,
    ENCHANTMENT,
    CURSE;


    @JsonValue
    public String getName() {
        return name().toLowerCase();
    }

}
