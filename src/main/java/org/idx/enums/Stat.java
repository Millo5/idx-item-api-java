package org.idx.enums;

import com.fasterxml.jackson.annotation.JsonValue;


@SuppressWarnings("unused")
public enum Stat {

    //<editor-fold desc="Core Stats" defaultstate="collapsed">

    /** Maximum health of the player */
    HEALTH,
    /** Defense reduces incoming damage */
    DEFENSE,
    /** Chance to avoid incoming damage */
    EVASION,
    /** Resistance to knockback effects */
    KNOCKBACK_RESISTANCE,
    /** Damage dealt to attacker upon being hit */
    THORNS,

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
    /** Health gained on kill */
    LIFESTEAL,
    /** Chance to gain health on hit */
    LEECHING,
    /** Knockback multiplier */
    KNOCKBACK,

    /** Fatigue gained from actions */
    STRAIN,
    /** Fatigue recover rate % */
    RESILIENCE,
    /** Fatigue capacity, base 100 */
    ENDURANCE,

    /** Movement speed percentile increase */
    MOVE_SPEED,
    /** Player's luck, affects various random chances */
    LUCK,
    /** Size of the player model, affects hitbox */
    SCALE,

    /** A weapon's attacks per second */
    WEAPON_ATTACK_SPEED("weapon-attack-speed"),
    /** A weapon's range in blocks */
    WEAPON_RANGE("weapon-range"),

    //</editor-fold>

    //<editor-fold desc="Consumables" defaultstate="collapsed">

    /** The amount of healing an item with attribute "heal" provides on consume */
    HEALING,
    MONEY,

    //</editor-fold>

    //<editor-fold desc="Unique Stats" defaultstate="collapsed">

    /** Chance for an action to trigger twice */
    RECURSION,

    ///</editor-fold>

    //<editor-fold desc="Curses" defaultstate="collapsed">

    /** Requires two hands to use */
    TWO_HANDED_CURSE

    //</editor-fold>
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
