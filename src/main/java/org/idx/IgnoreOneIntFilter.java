package org.idx;

public class IgnoreOneIntFilter {

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Integer integer) && integer == 1;
    }

}
