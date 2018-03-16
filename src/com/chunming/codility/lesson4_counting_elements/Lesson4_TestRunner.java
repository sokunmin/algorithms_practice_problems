package com.chunming.codility.lesson4_counting_elements;

import com.chunming.TestCase;
import com.chunming.Callback;

public class Lesson4_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new FrogRiverOne());
        TestCase.test(new MissingInteger());
        TestCase.test(new PermCheck());
        TestCase.test(new MaxCounters());
    }
}
