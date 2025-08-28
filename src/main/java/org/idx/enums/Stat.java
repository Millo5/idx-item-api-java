package org.idx.enums;

import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public enum Stat {

    /** Maximum health of the player */
    HEALTH,
    /** Defense reduces incoming damage */
    DEFENSE,
    /** Chance to avoid incoming damage */
    EVASION,

    /** Flat damage added to all attacks */
    DAMAGE,
    /** Attack speed percentile increase */
    ATTACK_SPEED,
    /** Weapon range percentile increase */
    RANGE,
    /** Chance to land a critical hit */
    CRIT_CHANCE,
    /** Critical hit damage multiplier */
    CRIT_DAMAGE,
    /** Chance to gain health on kill */
    LIFESTEAL,
    /** Bonus damage against bosses */
    KNOCKBACK,

    /** Movement speed percentile increase */
    MOVE_SPEED,
    /** Player's luck, affects various random chances */
    LUCK,

    /** A weapon's attacks per second */
    WEAPON_ATTACK_SPEED("weapon-attack-speed"),
    /** A weapon's range in blocks */
    WEAPON_RANGE("weapon-range"),

    /** Chance for an action to trigger twice */
    RECURSION


    ;


    private final String key;

    Stat() {
        this.key = name().toLowerCase().replaceAll("_", "-");
    }

    Stat(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }


    @JsonValue
    public String toJson() {
        return key;
    }
}
