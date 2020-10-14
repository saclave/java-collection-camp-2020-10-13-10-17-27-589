package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
       int sum =  arrayList.stream().reduce(Integer::sum)
                .get();
        return (double) sum / arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream()
                .reduce(0, (max, current) -> current % 2 != 0 ? current : max);
    }
}
