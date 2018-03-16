package com.chunming;

public class TestCase {

    public static <T extends Callback> void test(T t) {
        t.test();
    }
}
