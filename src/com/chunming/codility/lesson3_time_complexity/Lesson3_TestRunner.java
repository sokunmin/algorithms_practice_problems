package com.chunming.codility.lesson3_time_complexity;

import com.chunming.TestCase;
import com.chunming.Callback;

public class Lesson3_TestRunner implements Callback {
    @Override
    public void test() {
        TestCase.test(new TapeEquilibrium());
        TestCase.test(new FrogJmp());
        TestCase.test(new PermMissingElem());
    }
}
