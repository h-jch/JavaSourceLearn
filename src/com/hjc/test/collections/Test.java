package com.hjc.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('t');
        list.add('a');
        list.add('n');
        list.add('k');
        list.add('s');
        System.out.println("Before rotate: " + list);
        Collections.rotate(list, 2);
        System.out.println("After rotate: " + list);
    }
}
