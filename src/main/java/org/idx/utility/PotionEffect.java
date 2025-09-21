package org.idx.utility;

public class PotionEffect {

    private final String effect;
    private final int ticks;
    private final int amplifier;

    public PotionEffect(String effect, int ticks, int amplifier) {
        this.effect = effect;
        this.ticks = ticks;
        this.amplifier = amplifier;
    }

    public String getEffect() {
        return effect;
    }
    public int getTicks() {
        return ticks;
    }
    public int getAmplifier() {
        return amplifier;
    }

}
