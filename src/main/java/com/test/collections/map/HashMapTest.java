package com.test.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map m1 = new HashMap();

        m1.put("zara", "8");
        m1.put("mahnaz", "32");
        m1.put("ayan", "12");
        m1.put("daisy", "14");
        m1.put("123", new HashMap<>());

        System.out.println();
        System.out.println("map elements");
        System.out.println(m1);
    }
}
