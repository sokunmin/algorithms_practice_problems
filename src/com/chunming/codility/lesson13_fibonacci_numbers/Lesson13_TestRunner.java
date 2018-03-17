package com.chunming.codility.lesson13_fibonacci_numbers;

import com.chunming.Callback;
import com.chunming.TestCase;

public class Lesson13_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new FibFrog());
        TestCase.test(new Ladder());
    }
}
