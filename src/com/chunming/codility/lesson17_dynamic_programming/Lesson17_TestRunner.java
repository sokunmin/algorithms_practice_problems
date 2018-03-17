package com.chunming.codility.lesson17_dynamic_programming;

import com.chunming.Callback;
import com.chunming.TestCase;

public class Lesson17_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new NumberSolitaire());
        TestCase.test(new MinAbsSum());
    }
}
