package com.hjc.test.hashset;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        System.out.println("Before add: hashset's size = " + set1.size());
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(2);
        System.out.println("After add: hashset's size = " + set1.size());
        for (int num : set1) {
            System.out.println(num);
        }
        System.out.println(set1);
        Set<String> set2 = new HashSet<>();
        set2.add("abc");
        set2.add("bcd");
        set2.add("abc");
        for (String str : set2) {
            System.out.println(str);
        }
        System.out.println(set2);
    }
}
