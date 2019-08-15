package com.test.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {

    public static void iteratorCase() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        iteratorCase();
    }

}
