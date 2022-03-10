package com.t1.task5_1;

import java.util.Comparator;

public class FioComparator implements Comparator<Buyer> {
    @Override
    public int compare(Buyer o1, Buyer o2) {
        return o1.getFIO().compareTo(o2.getFIO());
    }
}
