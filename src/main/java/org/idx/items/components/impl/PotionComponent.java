package org.idx.items.components.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.idx.items.components.ItemComponent;
import org.idx.utility.PotionEffect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PotionComponent implements ItemComponent {

    ArrayList<PotionEffect> effects = new ArrayList<>();

    public PotionComponent(PotionEffect... effects) {
        this.effects = new ArrayList<>();
        Collections.addAll(this.effects, effects);
    }

    public void addEffect(String effect, int ticks, int amplifier) {
        this.effects.add(new PotionEffect(effect, ticks, amplifier));
    }

    public static PotionComponent fromJson(ObjectNode node) {
        PotionComponent component = new PotionComponent();
        if (node.has("effects")) {
            ObjectNode effectsNode = (ObjectNode) node.get("effects");
            effectsNode.fieldNames().forEachRemaining(effectName -> {
                ObjectNode effectDetails = (ObjectNode) effectsNode.get(effectName);
                int ticks = effectDetails.has("ticks") ? effectDetails.get("ticks").asInt() : 200;
                int amplifier = effectDetails.has("amplifier") ? effectDetails.get("amplifier").asInt() : 1;
                component.addEffect(effectName, ticks, amplifier);
            });
        }
        return component;
    }


    @Override
    public Map<String, ?> jsonEntries() {
        Map<String, Object> map = new HashMap<>();
        Map<String, Map<String, Integer>> effects = new HashMap<>();
        for (PotionEffect effect : this.effects) {
            Map<String, Integer> details = new HashMap<>();
            details.put("ticks", effect.getTicks());
            details.put("amplifier", effect.getAmplifier());
            effects.put(effect.getEffect(), details);
        }
        map.put("effects", effects);
        return map;
    }

    @Override
    public boolean hasData() {
        return !effects.isEmpty();
    }
}
