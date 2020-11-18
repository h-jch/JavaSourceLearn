package com.hjc.test.string;

public class Test {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = new String("test");
        System.out.println(str1);
        System.out.println(str2);

        char[] value = new char[] {'a', 'b', 'c'};
        String str = new String(value);
        System.out.println(str);
        value[0] = 'd';
        System.out.println(str);
    }
}
