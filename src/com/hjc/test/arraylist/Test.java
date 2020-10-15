package com.hjc.test.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        System.out.printf("Before add: arrayList.size() = %d\n", arrayList.size());

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.printf("After add: arrayList.size() = %d\n", arrayList.size());
    }
}
