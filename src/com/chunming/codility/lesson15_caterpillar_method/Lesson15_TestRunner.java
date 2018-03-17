package com.chunming.codility.lesson15_caterpillar_method;

import com.chunming.Callback;
import com.chunming.TestCase;

public class Lesson15_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new AbsDistinct());
        TestCase.test(new CountDistinctSlices());
        TestCase.test(new CountTriangles());
        TestCase.test(new MinAbsSumOfTwo());
    }
}
