package org.idx.items.components.impl;

import java.util.Map;

import org.idx.enums.Stat;

public class StackableStatsComponent extends StatsComponent{

    public StackableStatsComponent(Map<Stat, Number> stats) {
        super(stats);
        
    }

    @Override
    public int getMaxStackSize() {
        return 64;
    }
}
