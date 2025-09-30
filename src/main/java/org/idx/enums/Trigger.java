package org.idx.enums;

import com.fasterxml.jackson.annotation.JsonValue;

@SuppressWarnings("unused")
public enum Trigger {

    // Triggers when the player is hurt
    HURT(true),

    // Triggers when the player hits an entity
    HIT(true),
    KILL,
    // Triggers when the player uses an item
    USE,
    // Triggers when the player swings an item
    SWING,
    // Triggers when the player swaps hands
    SWAP,
    // Triggers after swinging a melee weapon
    MELEE_ATTACK,

    // Triggers on a loop
    PASSIVE(true),
    PASSIVE_SLOW(true),

    // Triggers when the player drops an item
    DROP,
    // Triggers when the player eats an item
    EAT,
    EAT_GLOBAL(true),
    // Triggers when the player picks up an item
    PICKUP,
    
    // Triggers when the player jumps on the ground 
    JUMP(true),
    // Triggers when the player jumps while in the air
    AIR_JUMP(true),
    // Triggers when the player sprints
    SPRINT(true),
    // Triggers when the player sneaks
    SNEAK(true),
    // Triggers when the player dashes
    DASH(true)
    ;





    // Used only internally, not added to the data file
    private final boolean global;

    Trigger() {
        this(false);
    }

    Trigger(boolean global) {
        this.global = global;
    }

    /**
     * Returns whether this trigger is global, meaning it applies to all items with this trigger type.
     *
     * @return true if the trigger is global, false otherwise
     */
    public boolean isGlobal() {
        return global;
    }


    @Override
    public String toString() {
        return name().toLowerCase().replace('_', '-');
    }

    @JsonValue
    public String getValue() {
        return toString();
    }

}
