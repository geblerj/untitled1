package com.james;

import java.util.Comparator;

public class SortByName implements Comparator<Veggie> {

    @Override
    public int compare(Veggie v1, Veggie v2) {
        return v1.name.compareTo(v2.name);
    }
}
