package com.chunming.codility.lesson16_greedy_algorithms;

import com.chunming.Callback;
import com.chunming.TestCase;

public class Lesson16_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new MaxNonoverlappingSegments());
        TestCase.test(new TieRopes());
    }
}
